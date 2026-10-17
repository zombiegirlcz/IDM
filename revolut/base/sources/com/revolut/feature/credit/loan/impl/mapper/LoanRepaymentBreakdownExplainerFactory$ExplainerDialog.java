package com.revolut.feature.credit.loan.impl.mapper;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/loan/impl/mapper/LoanRepaymentBreakdownExplainerFactory$ExplainerDialog", "Landroid/os/Parcelable;", "BreakageFee", "EarlyRepaymentAmount", "Lcom/revolut/feature/credit/loan/impl/mapper/LoanRepaymentBreakdownExplainerFactory$ExplainerDialog$BreakageFee;", "Lcom/revolut/feature/credit/loan/impl/mapper/LoanRepaymentBreakdownExplainerFactory$ExplainerDialog$EarlyRepaymentAmount;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LoanRepaymentBreakdownExplainerFactory$ExplainerDialog extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/mapper/LoanRepaymentBreakdownExplainerFactory$ExplainerDialog$BreakageFee;", "Lcom/revolut/feature/credit/loan/impl/mapper/LoanRepaymentBreakdownExplainerFactory$ExplainerDialog;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BreakageFee implements LoanRepaymentBreakdownExplainerFactory$ExplainerDialog {

        @NotNull
        public static final Parcelable.Creator<BreakageFee> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f70311a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BreakageFee((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BreakageFee[i];
            }
        }

        public BreakageFee(d dVar) {
            this.f70311a = dVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BreakageFee) && Intrinsics.f(this.f70311a, ((BreakageFee) obj2).f70311a);
        }

        public final int hashCode() {
            d dVar = this.f70311a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f70311a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/mapper/LoanRepaymentBreakdownExplainerFactory$ExplainerDialog$EarlyRepaymentAmount;", "Lcom/revolut/feature/credit/loan/impl/mapper/LoanRepaymentBreakdownExplainerFactory$ExplainerDialog;", "<init>", "()V", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EarlyRepaymentAmount implements LoanRepaymentBreakdownExplainerFactory$ExplainerDialog {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EarlyRepaymentAmount f70312a = new EarlyRepaymentAmount();

        @NotNull
        public static final Parcelable.Creator<EarlyRepaymentAmount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EarlyRepaymentAmount.f70312a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EarlyRepaymentAmount[i];
            }
        }

        private EarlyRepaymentAmount() {
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
