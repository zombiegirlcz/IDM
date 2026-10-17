package com.revolut.feature.staking.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pyd.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/staking/api/model/StakingPocket;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_staking_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StakingPocket implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StakingPocket> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StakingProduct f88082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f88083c;
    public final d d;
    public final d e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f88084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f88085h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StakingPocket(parcel.readString(), StakingProduct.CREATOR.createFromParcel(parcel), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StakingPocket[i];
        }
    }

    public StakingPocket(String id10, StakingProduct product, d stakingBalance, d fiatBalance, d unstakingLockedBalance, d unstakingLockedFiatBalance) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(stakingBalance, "stakingBalance");
        Intrinsics.checkNotNullParameter(fiatBalance, "fiatBalance");
        Intrinsics.checkNotNullParameter(unstakingLockedBalance, "unstakingLockedBalance");
        Intrinsics.checkNotNullParameter(unstakingLockedFiatBalance, "unstakingLockedFiatBalance");
        this.f88081a = id10;
        this.f88082b = product;
        this.f88083c = stakingBalance;
        this.d = fiatBalance;
        this.e = unstakingLockedBalance;
        this.f = unstakingLockedFiatBalance;
        this.f88084g = c.O(stakingBalance, unstakingLockedBalance);
        this.f88085h = c.O(fiatBalance, unstakingLockedFiatBalance);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StakingPocket)) {
            return false;
        }
        StakingPocket stakingPocket = (StakingPocket) obj2;
        return Intrinsics.f(this.f88081a, stakingPocket.f88081a) && Intrinsics.f(this.f88082b, stakingPocket.f88082b) && Intrinsics.f(this.f88083c, stakingPocket.f88083c) && Intrinsics.f(this.d, stakingPocket.d) && Intrinsics.f(this.e, stakingPocket.e) && Intrinsics.f(this.f, stakingPocket.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + v7.c(v7.c(v7.c((this.f88082b.hashCode() + (this.f88081a.hashCode() * 31)) * 31, 31, this.f88083c), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88081a);
        this.f88082b.writeToParcel(dest, i);
        dest.writeSerializable(this.f88083c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
    }
}
