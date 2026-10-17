package com.revolut.feature.credit.loan.impl.ui.rev10.repaymentbreakdown;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.loan.impl.mapper.LoanRepaymentBreakdownExplainerFactory$ExplainerDialog;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/rev10/repaymentbreakdown/LoanRepaymentBreakdownControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Picker", "ExplainerDialog", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repaymentbreakdown/LoanRepaymentBreakdownControllerContract$ModalStep$ExplainerDialog;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repaymentbreakdown/LoanRepaymentBreakdownControllerContract$ModalStep$Picker;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LoanRepaymentBreakdownControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/repaymentbreakdown/LoanRepaymentBreakdownControllerContract$ModalStep$ExplainerDialog;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repaymentbreakdown/LoanRepaymentBreakdownControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExplainerDialog implements LoanRepaymentBreakdownControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ExplainerDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LoanRepaymentBreakdownExplainerFactory$ExplainerDialog f70524a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExplainerDialog((LoanRepaymentBreakdownExplainerFactory$ExplainerDialog) parcel.readParcelable(ExplainerDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExplainerDialog[i];
            }
        }

        public ExplainerDialog(LoanRepaymentBreakdownExplainerFactory$ExplainerDialog parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            this.f70524a = parcel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ExplainerDialog) && Intrinsics.f(this.f70524a, ((ExplainerDialog) obj2).f70524a);
        }

        public final int hashCode() {
            return this.f70524a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f70524a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/repaymentbreakdown/LoanRepaymentBreakdownControllerContract$ModalStep$Picker;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repaymentbreakdown/LoanRepaymentBreakdownControllerContract$ModalStep;", "<init>", "()V", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Picker implements LoanRepaymentBreakdownControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Picker f70525a = new Picker();

        @NotNull
        public static final Parcelable.Creator<Picker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Picker.f70525a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Picker[i];
            }
        }

        private Picker() {
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
