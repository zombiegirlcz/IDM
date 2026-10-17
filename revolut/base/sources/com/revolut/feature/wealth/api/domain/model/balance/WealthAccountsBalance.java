package com.revolut.feature.wealth.api.domain.model.balance;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/balance/WealthAccountsBalance;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WealthAccountsBalance implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WealthAccountsBalance> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f95259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f95260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f95261c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WealthAccountsBalance((d) parcel.readSerializable(), (d) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WealthAccountsBalance[i];
        }
    }

    public WealthAccountsBalance(d totalBalance, d totalDelta, BigDecimal totalDeltaPercentage) {
        Intrinsics.checkNotNullParameter(totalBalance, "totalBalance");
        Intrinsics.checkNotNullParameter(totalDelta, "totalDelta");
        Intrinsics.checkNotNullParameter(totalDeltaPercentage, "totalDeltaPercentage");
        this.f95259a = totalBalance;
        this.f95260b = totalDelta;
        this.f95261c = totalDeltaPercentage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WealthAccountsBalance)) {
            return false;
        }
        WealthAccountsBalance wealthAccountsBalance = (WealthAccountsBalance) obj2;
        return Intrinsics.f(this.f95259a, wealthAccountsBalance.f95259a) && Intrinsics.f(this.f95260b, wealthAccountsBalance.f95260b) && Intrinsics.f(this.f95261c, wealthAccountsBalance.f95261c);
    }

    public final int hashCode() {
        return this.f95261c.hashCode() + v7.c(this.f95259a.hashCode() * 31, 31, this.f95260b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f95259a);
        dest.writeSerializable(this.f95260b);
        dest.writeSerializable(this.f95261c);
    }
}
