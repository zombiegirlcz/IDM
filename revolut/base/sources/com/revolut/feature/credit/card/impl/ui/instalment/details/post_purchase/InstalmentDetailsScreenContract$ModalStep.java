package com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardDialogModel;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/credit/card/impl/ui/instalment/details/post_purchase/InstalmentDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Dialog", "RemainingPlan", "Cancel", "OverdueBalanceDialog", "Lcom/revolut/feature/credit/card/impl/ui/instalment/details/post_purchase/InstalmentDetailsScreenContract$ModalStep$Cancel;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/details/post_purchase/InstalmentDetailsScreenContract$ModalStep$Dialog;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/details/post_purchase/InstalmentDetailsScreenContract$ModalStep$OverdueBalanceDialog;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/details/post_purchase/InstalmentDetailsScreenContract$ModalStep$RemainingPlan;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class InstalmentDetailsScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/details/post_purchase/InstalmentDetailsScreenContract$ModalStep$Cancel;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/details/post_purchase/InstalmentDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Cancel extends InstalmentDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Cancel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InstalmentDetailsScreenContract$DomainState$CancellationModel f69371a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Cancel(InstalmentDetailsScreenContract$DomainState$CancellationModel.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cancel[i];
            }
        }

        public Cancel(InstalmentDetailsScreenContract$DomainState$CancellationModel cancellationModel) {
            Intrinsics.checkNotNullParameter(cancellationModel, "cancellationModel");
            this.f69371a = cancellationModel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Cancel) && Intrinsics.f(this.f69371a, ((Cancel) obj2).f69371a);
        }

        public final int hashCode() {
            return this.f69371a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f69371a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/details/post_purchase/InstalmentDetailsScreenContract$ModalStep$Dialog;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/details/post_purchase/InstalmentDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Dialog extends InstalmentDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Dialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditCardDialogModel f69372a;

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
            this.f69372a = dialog;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Dialog) && Intrinsics.f(this.f69372a, ((Dialog) obj2).f69372a);
        }

        public final int hashCode() {
            return this.f69372a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f69372a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/details/post_purchase/InstalmentDetailsScreenContract$ModalStep$OverdueBalanceDialog;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/details/post_purchase/InstalmentDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OverdueBalanceDialog extends InstalmentDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<OverdueBalanceDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f69373a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OverdueBalanceDialog((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OverdueBalanceDialog[i];
            }
        }

        public OverdueBalanceDialog(d overdueAmount) {
            Intrinsics.checkNotNullParameter(overdueAmount, "overdueAmount");
            this.f69373a = overdueAmount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OverdueBalanceDialog) && Intrinsics.f(this.f69373a, ((OverdueBalanceDialog) obj2).f69373a);
        }

        public final int hashCode() {
            return this.f69373a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f69373a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/details/post_purchase/InstalmentDetailsScreenContract$ModalStep$RemainingPlan;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/details/post_purchase/InstalmentDetailsScreenContract$ModalStep;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemainingPlan extends InstalmentDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RemainingPlan f69374a = new RemainingPlan();

        @NotNull
        public static final Parcelable.Creator<RemainingPlan> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RemainingPlan.f69374a;
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

    private InstalmentDetailsScreenContract$ModalStep() {
    }
}
