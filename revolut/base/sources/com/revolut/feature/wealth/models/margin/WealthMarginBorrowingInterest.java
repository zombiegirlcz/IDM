package com.revolut.feature.wealth.models.margin;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.math.BigDecimal;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/wealth/models/margin/WealthMarginBorrowingInterest;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WealthMarginBorrowingInterest implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f95667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f95668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f95669c;
    public final LocalDate d;

    @NotNull
    public static final Parcelable.Creator<WealthMarginBorrowingInterest> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WealthMarginBorrowingInterest((BigDecimal) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WealthMarginBorrowingInterest[i];
        }
    }

    public WealthMarginBorrowingInterest(BigDecimal yearlyInterestRate, d overnightFee, d monthlyAccruedFees, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(yearlyInterestRate, "yearlyInterestRate");
        Intrinsics.checkNotNullParameter(overnightFee, "overnightFee");
        Intrinsics.checkNotNullParameter(monthlyAccruedFees, "monthlyAccruedFees");
        this.f95667a = yearlyInterestRate;
        this.f95668b = overnightFee;
        this.f95669c = monthlyAccruedFees;
        this.d = localDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WealthMarginBorrowingInterest)) {
            return false;
        }
        WealthMarginBorrowingInterest wealthMarginBorrowingInterest = (WealthMarginBorrowingInterest) obj2;
        return Intrinsics.f(this.f95667a, wealthMarginBorrowingInterest.f95667a) && Intrinsics.f(this.f95668b, wealthMarginBorrowingInterest.f95668b) && Intrinsics.f(this.f95669c, wealthMarginBorrowingInterest.f95669c) && Intrinsics.f(this.d, wealthMarginBorrowingInterest.d);
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(this.f95667a.hashCode() * 31, 31, this.f95668b), 31, this.f95669c);
        LocalDate localDate = this.d;
        return iC + (localDate == null ? 0 : localDate.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f95667a);
        dest.writeSerializable(this.f95668b);
        dest.writeSerializable(this.f95669c);
        dest.writeSerializable(this.d);
    }
}
