package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$OfferUpdateContext", "Landroid/os/Parcelable;", "CommittedOffer", "Calculator", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$OfferUpdateContext$Calculator;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$OfferUpdateContext$CommittedOffer;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MortgageOfferFlowContract$OfferUpdateContext extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$OfferUpdateContext$Calculator;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$OfferUpdateContext;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Calculator implements MortgageOfferFlowContract$OfferUpdateContext {

        @NotNull
        public static final Parcelable.Creator<Calculator> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f67971a;

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

        public Calculator(String screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            this.f67971a = screenId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Calculator) && Intrinsics.f(this.f67971a, ((Calculator) obj2).f67971a);
        }

        public final int hashCode() {
            return this.f67971a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f67971a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$OfferUpdateContext$CommittedOffer;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_offer/MortgageOfferFlowContract$OfferUpdateContext;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CommittedOffer implements MortgageOfferFlowContract$OfferUpdateContext {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CommittedOffer f67972a = new CommittedOffer();

        @NotNull
        public static final Parcelable.Creator<CommittedOffer> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CommittedOffer.f67972a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CommittedOffer[i];
            }
        }

        private CommittedOffer() {
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
