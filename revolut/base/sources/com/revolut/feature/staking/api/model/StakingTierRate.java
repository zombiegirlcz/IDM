package com.revolut.feature.staking.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/staking/api/model/StakingTierRate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_staking_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StakingTierRate implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StakingTierRate> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f88090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f88091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StakingInterestRate f88092c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StakingTierRate((d) parcel.readSerializable(), (d) parcel.readSerializable(), StakingInterestRate.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StakingTierRate[i];
        }
    }

    public StakingTierRate(d from, d dVar, StakingInterestRate interestRate) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(interestRate, "interestRate");
        this.f88090a = from;
        this.f88091b = dVar;
        this.f88092c = interestRate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StakingTierRate)) {
            return false;
        }
        StakingTierRate stakingTierRate = (StakingTierRate) obj2;
        return Intrinsics.f(this.f88090a, stakingTierRate.f88090a) && Intrinsics.f(this.f88091b, stakingTierRate.f88091b) && Intrinsics.f(this.f88092c, stakingTierRate.f88092c);
    }

    public final int hashCode() {
        int iHashCode = this.f88090a.hashCode() * 31;
        d dVar = this.f88091b;
        return this.f88092c.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f88090a);
        dest.writeSerializable(this.f88091b);
        this.f88092c.writeToParcel(dest, i);
    }
}
