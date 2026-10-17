package com.revolut.feature.credit.card.impl.ui.statement_financing.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardDialogModel;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/credit/card/impl/ui/statement_financing/details/CreditCardStatementFinancingDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "TotalEffectiveCost", "FinancingInterestRate", "Dialog", "Cancel", "RemainingPlan", "Lcom/revolut/feature/credit/card/impl/ui/statement_financing/details/CreditCardStatementFinancingDetailsScreenContract$ModalStep$Cancel;", "Lcom/revolut/feature/credit/card/impl/ui/statement_financing/details/CreditCardStatementFinancingDetailsScreenContract$ModalStep$Dialog;", "Lcom/revolut/feature/credit/card/impl/ui/statement_financing/details/CreditCardStatementFinancingDetailsScreenContract$ModalStep$FinancingInterestRate;", "Lcom/revolut/feature/credit/card/impl/ui/statement_financing/details/CreditCardStatementFinancingDetailsScreenContract$ModalStep$RemainingPlan;", "Lcom/revolut/feature/credit/card/impl/ui/statement_financing/details/CreditCardStatementFinancingDetailsScreenContract$ModalStep$TotalEffectiveCost;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditCardStatementFinancingDetailsScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement_financing/details/CreditCardStatementFinancingDetailsScreenContract$ModalStep$Cancel;", "Lcom/revolut/feature/credit/card/impl/ui/statement_financing/details/CreditCardStatementFinancingDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Cancel extends CreditCardStatementFinancingDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Cancel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditCardStatementFinancingDetailsScreenContract$CancellationModel f69749a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Cancel(CreditCardStatementFinancingDetailsScreenContract$CancellationModel.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cancel[i];
            }
        }

        public Cancel(CreditCardStatementFinancingDetailsScreenContract$CancellationModel cancellationModel) {
            Intrinsics.checkNotNullParameter(cancellationModel, "cancellationModel");
            this.f69749a = cancellationModel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Cancel) && Intrinsics.f(this.f69749a, ((Cancel) obj2).f69749a);
        }

        public final int hashCode() {
            return this.f69749a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f69749a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement_financing/details/CreditCardStatementFinancingDetailsScreenContract$ModalStep$Dialog;", "Lcom/revolut/feature/credit/card/impl/ui/statement_financing/details/CreditCardStatementFinancingDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Dialog extends CreditCardStatementFinancingDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Dialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditCardDialogModel f69750a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Dialog((CreditCardDialogModel) parcel.readParcelable(Dialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Dialog[i];
            }
        }

        public Dialog(CreditCardDialogModel dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            this.f69750a = dialog;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Dialog) && Intrinsics.f(this.f69750a, ((Dialog) obj2).f69750a);
        }

        public final int hashCode() {
            return this.f69750a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f69750a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement_financing/details/CreditCardStatementFinancingDetailsScreenContract$ModalStep$FinancingInterestRate;", "Lcom/revolut/feature/credit/card/impl/ui/statement_financing/details/CreditCardStatementFinancingDetailsScreenContract$ModalStep;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FinancingInterestRate extends CreditCardStatementFinancingDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FinancingInterestRate f69751a = new FinancingInterestRate();

        @NotNull
        public static final Parcelable.Creator<FinancingInterestRate> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FinancingInterestRate.f69751a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FinancingInterestRate[i];
            }
        }

        private FinancingInterestRate() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement_financing/details/CreditCardStatementFinancingDetailsScreenContract$ModalStep$RemainingPlan;", "Lcom/revolut/feature/credit/card/impl/ui/statement_financing/details/CreditCardStatementFinancingDetailsScreenContract$ModalStep;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemainingPlan extends CreditCardStatementFinancingDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RemainingPlan f69752a = new RemainingPlan();

        @NotNull
        public static final Parcelable.Creator<RemainingPlan> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RemainingPlan.f69752a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RemainingPlan[i];
            }
        }

        private RemainingPlan() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement_financing/details/CreditCardStatementFinancingDetailsScreenContract$ModalStep$TotalEffectiveCost;", "Lcom/revolut/feature/credit/card/impl/ui/statement_financing/details/CreditCardStatementFinancingDetailsScreenContract$ModalStep;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TotalEffectiveCost extends CreditCardStatementFinancingDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TotalEffectiveCost f69753a = new TotalEffectiveCost();

        @NotNull
        public static final Parcelable.Creator<TotalEffectiveCost> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TotalEffectiveCost.f69753a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TotalEffectiveCost[i];
            }
        }

        private TotalEffectiveCost() {
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

    private CreditCardStatementFinancingDetailsScreenContract$ModalStep() {
    }
}
