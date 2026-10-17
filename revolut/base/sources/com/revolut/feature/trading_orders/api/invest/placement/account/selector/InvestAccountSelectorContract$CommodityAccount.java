package com.revolut.feature.trading_orders.api.invest.placement.account.selector;

import android.os.Parcel;
import android.os.Parcelable;
import io3.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$CommodityAccount", "Lcom/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$Account;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestAccountSelectorContract$CommodityAccount implements InvestAccountSelectorContract$Account {

    @NotNull
    public static final Parcelable.Creator<InvestAccountSelectorContract$CommodityAccount> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f91703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f91704b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestAccountSelectorContract$CommodityAccount((d) parcel.readSerializable(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestAccountSelectorContract$CommodityAccount[i];
        }
    }

    public InvestAccountSelectorContract$CommodityAccount(d dVar, b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f91703a = currency;
        this.f91704b = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvestAccountSelectorContract$CommodityAccount)) {
            return false;
        }
        InvestAccountSelectorContract$CommodityAccount investAccountSelectorContract$CommodityAccount = (InvestAccountSelectorContract$CommodityAccount) obj2;
        return Intrinsics.f(this.f91703a, investAccountSelectorContract$CommodityAccount.f91703a) && Intrinsics.f(this.f91704b, investAccountSelectorContract$CommodityAccount.f91704b);
    }

    public final int hashCode() {
        int iHashCode = this.f91703a.hashCode() * 31;
        d dVar = this.f91704b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f91703a);
        dest.writeSerializable(this.f91704b);
    }
}
