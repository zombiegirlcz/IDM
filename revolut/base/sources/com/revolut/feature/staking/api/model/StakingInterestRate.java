package com.revolut.feature.staking.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import h30.l;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;
import yhm.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/staking/api/model/StakingInterestRate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_staking_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class StakingInterestRate implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StakingInterestRate> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f88069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f88070c;
    public final vtd.a d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StakingInterestRate(parcel.readString(), (BigDecimal) parcel.readSerializable(), (b) parcel.readSerializable(), vtd.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StakingInterestRate[i];
        }
    }

    public StakingInterestRate(String productId, BigDecimal rate, b currency, vtd.a type) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f88068a = productId;
        this.f88069b = rate;
        this.f88070c = currency;
        this.d = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StakingInterestRate)) {
            return false;
        }
        StakingInterestRate stakingInterestRate = (StakingInterestRate) obj2;
        return Intrinsics.f(this.f88068a, stakingInterestRate.f88068a) && Intrinsics.f(this.f88069b, stakingInterestRate.f88069b) && Intrinsics.f(this.f88070c, stakingInterestRate.f88070c) && this.d == stakingInterestRate.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + l.j(this.f88070c, t61.a.d(this.f88069b, this.f88068a.hashCode() * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88068a);
        dest.writeSerializable(this.f88069b);
        dest.writeSerializable(this.f88070c);
        dest.writeString(this.d.name());
    }
}
