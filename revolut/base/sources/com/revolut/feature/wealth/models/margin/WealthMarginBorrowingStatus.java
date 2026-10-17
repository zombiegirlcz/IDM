package com.revolut.feature.wealth.models.margin;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import udh.c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/wealth/models/margin/WealthMarginBorrowingStatus;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WealthMarginBorrowingStatus implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f95670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f95671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f95672c;
    public final d d;
    public final d e;

    @NotNull
    public static final Parcelable.Creator<WealthMarginBorrowingStatus> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WealthMarginBorrowingStatus(c.valueOf(parcel.readString()), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WealthMarginBorrowingStatus[i];
        }
    }

    public WealthMarginBorrowingStatus(c status, d borrowedFunds, d requiredMinimum, d dVar, d dVar2) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(borrowedFunds, "borrowedFunds");
        Intrinsics.checkNotNullParameter(requiredMinimum, "requiredMinimum");
        this.f95670a = status;
        this.f95671b = borrowedFunds;
        this.f95672c = requiredMinimum;
        this.d = dVar;
        this.e = dVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WealthMarginBorrowingStatus)) {
            return false;
        }
        WealthMarginBorrowingStatus wealthMarginBorrowingStatus = (WealthMarginBorrowingStatus) obj2;
        return this.f95670a == wealthMarginBorrowingStatus.f95670a && Intrinsics.f(this.f95671b, wealthMarginBorrowingStatus.f95671b) && Intrinsics.f(this.f95672c, wealthMarginBorrowingStatus.f95672c) && Intrinsics.f(this.d, wealthMarginBorrowingStatus.d) && Intrinsics.f(this.e, wealthMarginBorrowingStatus.e);
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(this.f95670a.hashCode() * 31, 31, this.f95671b), 31, this.f95672c);
        d dVar = this.d;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.e;
        return iHashCode + (dVar2 != null ? dVar2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f95670a.name());
        dest.writeSerializable(this.f95671b);
        dest.writeSerializable(this.f95672c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
    }
}
