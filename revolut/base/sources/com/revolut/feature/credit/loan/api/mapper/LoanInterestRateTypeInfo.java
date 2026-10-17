package com.revolut.feature.credit.loan.api.mapper;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/loan/api/mapper/LoanInterestRateTypeInfo;", "Landroid/os/Parcelable;", "TemporaryFixed", "Variable", "Lcom/revolut/feature/credit/loan/api/mapper/LoanInterestRateTypeInfo$TemporaryFixed;", "Lcom/revolut/feature/credit/loan/api/mapper/LoanInterestRateTypeInfo$Variable;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LoanInterestRateTypeInfo extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/mapper/LoanInterestRateTypeInfo$TemporaryFixed;", "Lcom/revolut/feature/credit/loan/api/mapper/LoanInterestRateTypeInfo;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TemporaryFixed implements LoanInterestRateTypeInfo {

        @NotNull
        public static final Parcelable.Creator<TemporaryFixed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f70071a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TemporaryFixed(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TemporaryFixed[i];
            }
        }

        public TemporaryFixed(int i) {
            this.f70071a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TemporaryFixed) && this.f70071a == ((TemporaryFixed) obj2).f70071a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f70071a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f70071a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/api/mapper/LoanInterestRateTypeInfo$Variable;", "Lcom/revolut/feature/credit/loan/api/mapper/LoanInterestRateTypeInfo;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Variable implements LoanInterestRateTypeInfo {

        @NotNull
        public static final Parcelable.Creator<Variable> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f70072a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Variable(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Variable[i];
            }
        }

        public Variable(int i) {
            this.f70072a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Variable) && this.f70072a == ((Variable) obj2).f70072a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f70072a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f70072a);
        }
    }
}
