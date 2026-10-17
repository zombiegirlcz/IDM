package com.revolut.feature.staking.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.staking.api.model.StakingModes;
import dj0.d;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/staking/api/model/StakingProduct;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_staking_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StakingProduct implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StakingProduct> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StakingInfo f88087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StakingModes f88088c;
    public final b d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StakingInterestRate f88089g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StakingProduct(parcel.readString(), StakingInfo.CREATOR.createFromParcel(parcel), StakingModes.CREATOR.createFromParcel(parcel), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StakingProduct[i];
        }
    }

    public StakingProduct(String id10, StakingInfo stakingInfo, StakingModes modes, b currency) {
        StakingInterestRate stakingInterestRate;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(stakingInfo, "stakingInfo");
        Intrinsics.checkNotNullParameter(modes, "modes");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f88086a = id10;
        this.f88087b = stakingInfo;
        this.f88088c = modes;
        this.d = currency;
        int i = stakingInfo.f88062c;
        List list = stakingInfo.f88066l;
        this.e = i > 0;
        this.f = list.isEmpty() || list.size() == 1;
        StakingTierRate stakingTierRate = (StakingTierRate) d0.o0(list);
        this.f88089g = (stakingTierRate == null || (stakingInterestRate = stakingTierRate.f88092c) == null) ? stakingInfo.f88060a : stakingInterestRate;
    }

    public final StakingInterestRate a(d money) {
        Object next;
        StakingInterestRate stakingInterestRate;
        Intrinsics.checkNotNullParameter(money, "money");
        StakingInfo stakingInfo = this.f88087b;
        Iterator it8 = stakingInfo.f88066l.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            StakingTierRate stakingTierRate = (StakingTierRate) next;
            d dVar = stakingTierRate.f88091b;
            d dVar2 = stakingTierRate.f88090a;
            if (dVar != null ? money.e(dVar2) && money.i(stakingTierRate.f88091b) : money.e(dVar2)) {
                break;
            }
        }
        StakingTierRate stakingTierRate2 = (StakingTierRate) next;
        return (stakingTierRate2 == null || (stakingInterestRate = stakingTierRate2.f88092c) == null) ? stakingInfo.f88060a : stakingInterestRate;
    }

    public final boolean b() {
        return this.f88088c.f88072b != null;
    }

    public final boolean c() {
        return this.f88088c.f88071a != null;
    }

    public final boolean d() {
        StakingModes.Auto auto = this.f88088c.f88072b;
        return pd.b.j(auto != null ? Boolean.valueOf(auto.d) : null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StakingProduct)) {
            return false;
        }
        StakingProduct stakingProduct = (StakingProduct) obj2;
        return Intrinsics.f(this.f88086a, stakingProduct.f88086a) && Intrinsics.f(this.f88087b, stakingProduct.f88087b) && Intrinsics.f(this.f88088c, stakingProduct.f88088c) && Intrinsics.f(this.d, stakingProduct.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f88088c.hashCode() + ((this.f88087b.hashCode() + (this.f88086a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88086a);
        this.f88087b.writeToParcel(dest, i);
        this.f88088c.writeToParcel(dest, i);
        dest.writeSerializable(this.d);
    }
}
