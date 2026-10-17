package com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.top_item.TopItemOfferContentScreenContract$OfferContentPayload;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/credit_card_offer/CreditCardOfferFlowContract$CreditOfferConfig", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "RegularOffer", "PromoOffer", "Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_card_offer/CreditCardOfferFlowContract$CreditOfferConfig$PromoOffer;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_card_offer/CreditCardOfferFlowContract$CreditOfferConfig$RegularOffer;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardOfferFlowContract$CreditOfferConfig extends Parcelable, Serializable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_card_offer/CreditCardOfferFlowContract$CreditOfferConfig$PromoOffer;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_card_offer/CreditCardOfferFlowContract$CreditOfferConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PromoOffer implements CreditCardOfferFlowContract$CreditOfferConfig {

        @NotNull
        public static final Parcelable.Creator<PromoOffer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final nu3.i f67359a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PromoOffer((nu3.i) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PromoOffer[i];
            }
        }

        public PromoOffer(nu3.i creditCardPromoOffer) {
            Intrinsics.checkNotNullParameter(creditCardPromoOffer, "creditCardPromoOffer");
            this.f67359a = creditCardPromoOffer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PromoOffer) && Intrinsics.f(this.f67359a, ((PromoOffer) obj2).f67359a);
        }

        public final int hashCode() {
            return this.f67359a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67359a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_card_offer/CreditCardOfferFlowContract$CreditOfferConfig$RegularOffer;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/credit_card_offer/CreditCardOfferFlowContract$CreditOfferConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RegularOffer implements CreditCardOfferFlowContract$CreditOfferConfig {

        @NotNull
        public static final Parcelable.Creator<RegularOffer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TopItemOfferContentScreenContract$OfferContentPayload f67360a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RegularOffer(TopItemOfferContentScreenContract$OfferContentPayload.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RegularOffer[i];
            }
        }

        public RegularOffer(TopItemOfferContentScreenContract$OfferContentPayload offerContentPayload) {
            Intrinsics.checkNotNullParameter(offerContentPayload, "offerContentPayload");
            this.f67360a = offerContentPayload;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RegularOffer) && Intrinsics.f(this.f67360a, ((RegularOffer) obj2).f67360a);
        }

        public final int hashCode() {
            return this.f67360a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f67360a.writeToParcel(dest, i);
        }
    }
}
