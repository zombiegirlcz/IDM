package com.revolut.feature.wealth.models.margin;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import udh.a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/wealth/models/margin/WealthMarginStatus;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WealthMarginStatus implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f95673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f95674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f95675c;
    public final a d;
    public final WealthMarginBorrowingStatus e;

    @NotNull
    public static final Parcelable.Creator<WealthMarginStatus> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WealthMarginStatus((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : a.valueOf(parcel.readString()), parcel.readInt() != 0 ? WealthMarginBorrowingStatus.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WealthMarginStatus[i];
        }
    }

    public WealthMarginStatus(d buyingPower, d borrowingLimit, d equity, a aVar, WealthMarginBorrowingStatus wealthMarginBorrowingStatus) {
        Intrinsics.checkNotNullParameter(buyingPower, "buyingPower");
        Intrinsics.checkNotNullParameter(borrowingLimit, "borrowingLimit");
        Intrinsics.checkNotNullParameter(equity, "equity");
        this.f95673a = buyingPower;
        this.f95674b = borrowingLimit;
        this.f95675c = equity;
        this.d = aVar;
        this.e = wealthMarginBorrowingStatus;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WealthMarginStatus)) {
            return false;
        }
        WealthMarginStatus wealthMarginStatus = (WealthMarginStatus) obj2;
        return Intrinsics.f(this.f95673a, wealthMarginStatus.f95673a) && Intrinsics.f(this.f95674b, wealthMarginStatus.f95674b) && Intrinsics.f(this.f95675c, wealthMarginStatus.f95675c) && this.d == wealthMarginStatus.d && Intrinsics.f(this.e, wealthMarginStatus.e);
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(this.f95673a.hashCode() * 31, 31, this.f95674b), 31, this.f95675c);
        a aVar = this.d;
        int iHashCode = (iC + (aVar == null ? 0 : aVar.hashCode())) * 31;
        WealthMarginBorrowingStatus wealthMarginBorrowingStatus = this.e;
        return iHashCode + (wealthMarginBorrowingStatus != null ? wealthMarginBorrowingStatus.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f95673a);
        dest.writeSerializable(this.f95674b);
        dest.writeSerializable(this.f95675c);
        a aVar = this.d;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        WealthMarginBorrowingStatus wealthMarginBorrowingStatus = this.e;
        if (wealthMarginBorrowingStatus == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            wealthMarginBorrowingStatus.writeToParcel(dest, i);
        }
    }
}
