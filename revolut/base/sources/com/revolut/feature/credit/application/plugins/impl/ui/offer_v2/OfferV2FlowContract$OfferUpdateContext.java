package com.revolut.feature.credit.application.plugins.impl.ui.offer_v2;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$OfferUpdateContext", "Landroid/os/Parcelable;", "Calculator", "LoanOffer", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$OfferUpdateContext$Calculator;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$OfferUpdateContext$LoanOffer;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OfferV2FlowContract$OfferUpdateContext extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$OfferUpdateContext$Calculator;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$OfferUpdateContext;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Calculator implements OfferV2FlowContract$OfferUpdateContext {

        @NotNull
        public static final Parcelable.Creator<Calculator> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f68096a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Calculator(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Calculator[i];
            }
        }

        public Calculator() {
            this(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Calculator) && Intrinsics.f(this.f68096a, ((Calculator) obj2).f68096a);
        }

        public final int hashCode() {
            String str = this.f68096a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f68096a);
        }

        public Calculator(String str) {
            this.f68096a = str;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$OfferUpdateContext$LoanOffer;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/offer_v2/OfferV2FlowContract$OfferUpdateContext;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LoanOffer implements OfferV2FlowContract$OfferUpdateContext {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LoanOffer f68097a = new LoanOffer();

        @NotNull
        public static final Parcelable.Creator<LoanOffer> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LoanOffer.f68097a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoanOffer[i];
            }
        }

        private LoanOffer() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
