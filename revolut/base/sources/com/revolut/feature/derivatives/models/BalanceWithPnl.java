package com.revolut.feature.derivatives.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/derivatives/models/BalanceWithPnl;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_derivatives_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BalanceWithPnl implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f71894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f71895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f71896c;

    @NotNull
    public static final Parcelable.Creator<BalanceWithPnl> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BalanceWithPnl((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BalanceWithPnl[i];
        }
    }

    public BalanceWithPnl(d balance, d withdrawable, d pnl2) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(withdrawable, "withdrawable");
        Intrinsics.checkNotNullParameter(pnl2, "pnl");
        this.f71894a = balance;
        this.f71895b = withdrawable;
        this.f71896c = pnl2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BalanceWithPnl)) {
            return false;
        }
        BalanceWithPnl balanceWithPnl = (BalanceWithPnl) obj2;
        return Intrinsics.f(this.f71894a, balanceWithPnl.f71894a) && Intrinsics.f(this.f71895b, balanceWithPnl.f71895b) && Intrinsics.f(this.f71896c, balanceWithPnl.f71896c);
    }

    public final int hashCode() {
        return this.f71896c.hashCode() + v7.c(this.f71894a.hashCode() * 31, 31, this.f71895b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f71894a);
        dest.writeSerializable(this.f71895b);
        dest.writeSerializable(this.f71896c);
    }
}
