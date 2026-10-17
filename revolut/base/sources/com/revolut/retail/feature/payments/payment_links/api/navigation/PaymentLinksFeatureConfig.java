package com.revolut.retail.feature.payments.payment_links.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import hrf.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/payments/payment_links/api/navigation/PaymentLinksFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "CreatePaymentLink", "AcceptPaymentLink", "Lcom/revolut/retail/feature/payments/payment_links/api/navigation/PaymentLinksFeatureConfig$AcceptPaymentLink;", "Lcom/revolut/retail/feature/payments/payment_links/api/navigation/PaymentLinksFeatureConfig$CreatePaymentLink;", "feature_payments_payment_links_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PaymentLinksFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/payments/payment_links/api/navigation/PaymentLinksFeatureConfig$AcceptPaymentLink;", "Lcom/revolut/retail/feature/payments/payment_links/api/navigation/PaymentLinksFeatureConfig;", "<init>", "()V", "ByCode", "ById", "Lcom/revolut/retail/feature/payments/payment_links/api/navigation/PaymentLinksFeatureConfig$AcceptPaymentLink$ByCode;", "Lcom/revolut/retail/feature/payments/payment_links/api/navigation/PaymentLinksFeatureConfig$AcceptPaymentLink$ById;", "feature_payments_payment_links_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class AcceptPaymentLink extends PaymentLinksFeatureConfig {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/payment_links/api/navigation/PaymentLinksFeatureConfig$AcceptPaymentLink$ByCode;", "Lcom/revolut/retail/feature/payments/payment_links/api/navigation/PaymentLinksFeatureConfig$AcceptPaymentLink;", "", "toString", "()Ljava/lang/String;", "feature_payments_payment_links_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ByCode extends AcceptPaymentLink {

            @NotNull
            public static final Parcelable.Creator<ByCode> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f102169a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ByCode(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ByCode[i];
                }
            }

            public ByCode(String paymentLinkCode) {
                Intrinsics.checkNotNullParameter(paymentLinkCode, "paymentLinkCode");
                this.f102169a = paymentLinkCode;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof ByCode) && Intrinsics.f(this.f102169a, ((ByCode) obj2).f102169a);
            }

            public final int hashCode() {
                return this.f102169a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f102169a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/payment_links/api/navigation/PaymentLinksFeatureConfig$AcceptPaymentLink$ById;", "Lcom/revolut/retail/feature/payments/payment_links/api/navigation/PaymentLinksFeatureConfig$AcceptPaymentLink;", "", "toString", "()Ljava/lang/String;", "feature_payments_payment_links_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ById extends AcceptPaymentLink {

            @NotNull
            public static final Parcelable.Creator<ById> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f102170a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ById(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ById[i];
                }
            }

            public ById(String paymentLinkId) {
                Intrinsics.checkNotNullParameter(paymentLinkId, "paymentLinkId");
                this.f102170a = paymentLinkId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof ById) && Intrinsics.f(this.f102170a, ((ById) obj2).f102170a);
            }

            public final int hashCode() {
                return this.f102170a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f102170a);
            }
        }

        private AcceptPaymentLink() {
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/payment_links/api/navigation/PaymentLinksFeatureConfig$CreatePaymentLink;", "Lcom/revolut/retail/feature/payments/payment_links/api/navigation/PaymentLinksFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_payments_payment_links_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreatePaymentLink extends PaymentLinksFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<CreatePaymentLink> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f102171a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreatePaymentLink(f.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreatePaymentLink[i];
            }
        }

        public CreatePaymentLink(f direction) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.f102171a = direction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CreatePaymentLink) && this.f102171a == ((CreatePaymentLink) obj2).f102171a;
        }

        public final int hashCode() {
            return this.f102171a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102171a.name());
        }
    }

    private PaymentLinksFeatureConfig() {
    }
}
