package com.revolut.feature.crypto.locked.balance.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.staking.api.model.StakingPocket;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/locked/balance/api/model/CryptoBalanceBreakdown;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_locked_balance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoBalanceBreakdown implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoBalanceBreakdown> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f70867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f70868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f70869c;
    public final d d;
    public final d e;
    public final StakingPocket f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoBalanceBreakdown((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (StakingPocket) parcel.readParcelable(CryptoBalanceBreakdown.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoBalanceBreakdown[i];
        }
    }

    public CryptoBalanceBreakdown(d totalBalance, d available, d dVar, d dVar2, d dVar3, StakingPocket stakingPocket) {
        Intrinsics.checkNotNullParameter(totalBalance, "totalBalance");
        Intrinsics.checkNotNullParameter(available, "available");
        this.f70867a = totalBalance;
        this.f70868b = available;
        this.f70869c = dVar;
        this.d = dVar2;
        this.e = dVar3;
        this.f = stakingPocket;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoBalanceBreakdown)) {
            return false;
        }
        CryptoBalanceBreakdown cryptoBalanceBreakdown = (CryptoBalanceBreakdown) obj2;
        return Intrinsics.f(this.f70867a, cryptoBalanceBreakdown.f70867a) && Intrinsics.f(this.f70868b, cryptoBalanceBreakdown.f70868b) && Intrinsics.f(this.f70869c, cryptoBalanceBreakdown.f70869c) && Intrinsics.f(this.d, cryptoBalanceBreakdown.d) && Intrinsics.f(this.e, cryptoBalanceBreakdown.e) && Intrinsics.f(this.f, cryptoBalanceBreakdown.f);
    }

    public final int hashCode() {
        int iC = v7.c(this.f70867a.hashCode() * 31, 31, this.f70868b);
        d dVar = this.f70869c;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.d;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        d dVar3 = this.e;
        int iHashCode3 = (iHashCode2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        StakingPocket stakingPocket = this.f;
        return iHashCode3 + (stakingPocket != null ? stakingPocket.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f70867a);
        dest.writeSerializable(this.f70868b);
        dest.writeSerializable(this.f70869c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeParcelable(this.f, i);
    }
}
