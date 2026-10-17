package com.revolut.feature.crypto.withdraw.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import hx7.l;
import ip0.v7;
import ko5.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/api/models/CryptoWithdrawLimits;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoWithdrawLimits implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoWithdrawLimits> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f71092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f71093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f71094c;
    public final d d;
    public final o e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f71095g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoWithdrawLimits((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : o.valueOf(parcel.readString()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoWithdrawLimits[i];
        }
    }

    public CryptoWithdrawLimits(d dailyWithdrawalLimit, d dailyWithdrawalUsage, d monthlyWithdrawalLimit, d monthlyWithdrawalUsage, o oVar, Long l2, d dVar) {
        Intrinsics.checkNotNullParameter(dailyWithdrawalLimit, "dailyWithdrawalLimit");
        Intrinsics.checkNotNullParameter(dailyWithdrawalUsage, "dailyWithdrawalUsage");
        Intrinsics.checkNotNullParameter(monthlyWithdrawalLimit, "monthlyWithdrawalLimit");
        Intrinsics.checkNotNullParameter(monthlyWithdrawalUsage, "monthlyWithdrawalUsage");
        this.f71092a = dailyWithdrawalLimit;
        this.f71093b = dailyWithdrawalUsage;
        this.f71094c = monthlyWithdrawalLimit;
        this.d = monthlyWithdrawalUsage;
        this.e = oVar;
        this.f = l2;
        this.f71095g = dVar;
    }

    public final UsageLimit a() {
        d dVar = this.f71094c;
        d dVar2 = this.d;
        d dVarT = l.t(dVar, dVar2);
        d dVar3 = this.f71092a;
        d dVar4 = this.f71093b;
        return dVarT.compareTo(l.t(dVar3, dVar4)) < 0 ? new UsageLimit(dVar2, dVar) : new UsageLimit(dVar4, dVar3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoWithdrawLimits)) {
            return false;
        }
        CryptoWithdrawLimits cryptoWithdrawLimits = (CryptoWithdrawLimits) obj2;
        return Intrinsics.f(this.f71092a, cryptoWithdrawLimits.f71092a) && Intrinsics.f(this.f71093b, cryptoWithdrawLimits.f71093b) && Intrinsics.f(this.f71094c, cryptoWithdrawLimits.f71094c) && Intrinsics.f(this.d, cryptoWithdrawLimits.d) && this.e == cryptoWithdrawLimits.e && Intrinsics.f(this.f, cryptoWithdrawLimits.f) && Intrinsics.f(this.f71095g, cryptoWithdrawLimits.f71095g);
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(v7.c(this.f71092a.hashCode() * 31, 31, this.f71093b), 31, this.f71094c), 31, this.d);
        o oVar = this.e;
        int iHashCode = (iC + (oVar == null ? 0 : oVar.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        d dVar = this.f71095g;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f71092a);
        dest.writeSerializable(this.f71093b);
        dest.writeSerializable(this.f71094c);
        dest.writeSerializable(this.d);
        o oVar = this.e;
        if (oVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(oVar.name());
        }
        Long l2 = this.f;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
        dest.writeSerializable(this.f71095g);
    }
}
