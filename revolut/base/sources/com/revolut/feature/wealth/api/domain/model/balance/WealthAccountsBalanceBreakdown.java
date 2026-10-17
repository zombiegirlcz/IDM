package com.revolut.feature.wealth.api.domain.model.balance;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/balance/WealthAccountsBalanceBreakdown;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WealthAccountsBalanceBreakdown implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WealthAccountsBalanceBreakdown> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthAccountsBalance f95262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WealthAccountsBalance f95263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WealthAccountsBalance f95264c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable.Creator<WealthAccountsBalance> creator = WealthAccountsBalance.CREATOR;
            return new WealthAccountsBalanceBreakdown(creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WealthAccountsBalanceBreakdown[i];
        }
    }

    public WealthAccountsBalanceBreakdown(WealthAccountsBalance total, WealthAccountsBalance custodian, WealthAccountsBalance joint) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(custodian, "custodian");
        Intrinsics.checkNotNullParameter(joint, "joint");
        this.f95262a = total;
        this.f95263b = custodian;
        this.f95264c = joint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WealthAccountsBalanceBreakdown)) {
            return false;
        }
        WealthAccountsBalanceBreakdown wealthAccountsBalanceBreakdown = (WealthAccountsBalanceBreakdown) obj2;
        return Intrinsics.f(this.f95262a, wealthAccountsBalanceBreakdown.f95262a) && Intrinsics.f(this.f95263b, wealthAccountsBalanceBreakdown.f95263b) && Intrinsics.f(this.f95264c, wealthAccountsBalanceBreakdown.f95264c);
    }

    public final int hashCode() {
        return this.f95264c.hashCode() + ((this.f95263b.hashCode() + (this.f95262a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f95262a.writeToParcel(dest, i);
        this.f95263b.writeToParcel(dest, i);
        this.f95264c.writeToParcel(dest, i);
    }
}
