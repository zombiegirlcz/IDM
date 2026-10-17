package com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/refinancing_offer/RefinancingOfferFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CreditToRefinanceSelection", "LoanDurationSetup", "FinalOffer", "Lcom/revolut/feature/credit/application/plugins/impl/ui/refinancing_offer/RefinancingOfferFlowContract$Step$CreditToRefinanceSelection;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/refinancing_offer/RefinancingOfferFlowContract$Step$FinalOffer;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/refinancing_offer/RefinancingOfferFlowContract$Step$LoanDurationSetup;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RefinancingOfferFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/refinancing_offer/RefinancingOfferFlowContract$Step$FinalOffer;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/refinancing_offer/RefinancingOfferFlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FinalOffer extends RefinancingOfferFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FinalOffer f68287a = new FinalOffer();

        @NotNull
        public static final Parcelable.Creator<FinalOffer> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FinalOffer.f68287a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FinalOffer[i];
            }
        }

        private FinalOffer() {
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

    private RefinancingOfferFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/refinancing_offer/RefinancingOfferFlowContract$Step$CreditToRefinanceSelection;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/refinancing_offer/RefinancingOfferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreditToRefinanceSelection extends RefinancingOfferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CreditToRefinanceSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f68286a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreditToRefinanceSelection(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditToRefinanceSelection[i];
            }
        }

        public CreditToRefinanceSelection(boolean z) {
            this.f68286a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CreditToRefinanceSelection) && this.f68286a == ((CreditToRefinanceSelection) obj2).f68286a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f68286a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f68286a ? 1 : 0);
        }

        public CreditToRefinanceSelection() {
            this(false);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/refinancing_offer/RefinancingOfferFlowContract$Step$LoanDurationSetup;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/refinancing_offer/RefinancingOfferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoanDurationSetup extends RefinancingOfferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LoanDurationSetup> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f68288a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LoanDurationSetup(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoanDurationSetup[i];
            }
        }

        public LoanDurationSetup(boolean z) {
            this.f68288a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LoanDurationSetup) && this.f68288a == ((LoanDurationSetup) obj2).f68288a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f68288a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f68288a ? 1 : 0);
        }

        public LoanDurationSetup() {
            this(false);
        }
    }
}
