package com.revolut.feature.staking.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vtd.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/staking/api/model/StakingInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_staking_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StakingInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StakingInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StakingInterestRate f88060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f88062c;
    public final int d;
    public final d e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f88063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f88064h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f88065j;
    public final b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f88066l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f88067m;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            StakingInterestRate stakingInterestRateCreateFromParcel = StakingInterestRate.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            d dVar = (d) parcel.readSerializable();
            d dVar2 = (d) parcel.readSerializable();
            d dVar3 = (d) parcel.readSerializable();
            d dVar4 = (d) parcel.readSerializable();
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            b bVarValueOf = b.valueOf(parcel.readString());
            int i5 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i5);
            int iA = 0;
            while (true) {
                z = z3;
                if (iA == i5) {
                    break;
                }
                iA = org.bouncycastle.jcajce.provider.digest.a.a(StakingTierRate.CREATOR, parcel, arrayList, iA, 1);
                z3 = z;
            }
            return new StakingInfo(stakingInterestRateCreateFromParcel, i, i2, i3, dVar, dVar2, dVar3, dVar4, z, z4, bVarValueOf, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StakingInfo[i];
        }
    }

    public StakingInfo(StakingInterestRate interestRate, int i, int i2, int i3, d minimumTopUpAmount, d minimumStakingAmount, d minimumWithdrawAmount, d maximumStakingAmount, boolean z, boolean z3, b mode, List tiers, boolean z4) {
        Intrinsics.checkNotNullParameter(interestRate, "interestRate");
        Intrinsics.checkNotNullParameter(minimumTopUpAmount, "minimumTopUpAmount");
        Intrinsics.checkNotNullParameter(minimumStakingAmount, "minimumStakingAmount");
        Intrinsics.checkNotNullParameter(minimumWithdrawAmount, "minimumWithdrawAmount");
        Intrinsics.checkNotNullParameter(maximumStakingAmount, "maximumStakingAmount");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(tiers, "tiers");
        this.f88060a = interestRate;
        this.f88061b = i;
        this.f88062c = i2;
        this.d = i3;
        this.e = minimumTopUpAmount;
        this.f = minimumStakingAmount;
        this.f88063g = minimumWithdrawAmount;
        this.f88064h = maximumStakingAmount;
        this.i = z;
        this.f88065j = z3;
        this.k = mode;
        this.f88066l = tiers;
        this.f88067m = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StakingInfo)) {
            return false;
        }
        StakingInfo stakingInfo = (StakingInfo) obj2;
        return Intrinsics.f(this.f88060a, stakingInfo.f88060a) && this.f88061b == stakingInfo.f88061b && this.f88062c == stakingInfo.f88062c && this.d == stakingInfo.d && Intrinsics.f(this.e, stakingInfo.e) && Intrinsics.f(this.f, stakingInfo.f) && Intrinsics.f(this.f88063g, stakingInfo.f88063g) && Intrinsics.f(this.f88064h, stakingInfo.f88064h) && this.i == stakingInfo.i && this.f88065j == stakingInfo.f88065j && this.k == stakingInfo.k && Intrinsics.f(this.f88066l, stakingInfo.f88066l) && this.f88067m == stakingInfo.f88067m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f88067m) + p.a.d((this.k.hashCode() + j6.a.c(j6.a.c(v7.c(v7.c(v7.c(v7.c(j6.a.b(this.d, j6.a.b(this.f88062c, j6.a.b(this.f88061b, this.f88060a.hashCode() * 31, 31), 31), 31), 31, this.e), 31, this.f), 31, this.f88063g), 31, this.f88064h), 31, this.i), 31, this.f88065j)) * 31, 31, this.f88066l);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f88060a.writeToParcel(dest, i);
        dest.writeInt(this.f88061b);
        dest.writeInt(this.f88062c);
        dest.writeInt(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f88063g);
        dest.writeSerializable(this.f88064h);
        dest.writeInt(this.i ? 1 : 0);
        dest.writeInt(this.f88065j ? 1 : 0);
        dest.writeString(this.k.name());
        Iterator itV = p.a.v(this.f88066l, dest);
        while (itV.hasNext()) {
            ((StakingTierRate) itV.next()).writeToParcel(dest, i);
        }
        dest.writeInt(this.f88067m ? 1 : 0);
    }
}
