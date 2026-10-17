package com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.strategypicker;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/amount/strategypicker/StrategyPickerContract$RepaymentStrategyType", "Landroid/os/Parcelable;", "<init>", "()V", "AmountReduction", "TermReduction", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/amount/strategypicker/StrategyPickerContract$RepaymentStrategyType$AmountReduction;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/amount/strategypicker/StrategyPickerContract$RepaymentStrategyType$TermReduction;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class StrategyPickerContract$RepaymentStrategyType implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/amount/strategypicker/StrategyPickerContract$RepaymentStrategyType$AmountReduction;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/amount/strategypicker/StrategyPickerContract$RepaymentStrategyType;", "<init>", "()V", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AmountReduction extends StrategyPickerContract$RepaymentStrategyType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AmountReduction f70562a = new AmountReduction();

        @NotNull
        public static final Parcelable.Creator<AmountReduction> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AmountReduction.f70562a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AmountReduction[i];
            }
        }

        private AmountReduction() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/amount/strategypicker/StrategyPickerContract$RepaymentStrategyType$TermReduction;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/amount/strategypicker/StrategyPickerContract$RepaymentStrategyType;", "<init>", "()V", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TermReduction extends StrategyPickerContract$RepaymentStrategyType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TermReduction f70563a = new TermReduction();

        @NotNull
        public static final Parcelable.Creator<TermReduction> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TermReduction.f70563a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TermReduction[i];
            }
        }

        private TermReduction() {
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

    private StrategyPickerContract$RepaymentStrategyType() {
    }
}
