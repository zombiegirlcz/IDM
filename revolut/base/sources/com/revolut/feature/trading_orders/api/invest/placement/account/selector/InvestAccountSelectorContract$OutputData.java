package com.revolut.feature.trading_orders.api.invest.placement.account.selector;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/trading_orders/api/invest/placement/account/selector/InvestAccountSelectorContract$OutputData", "Laii/r;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestAccountSelectorContract$OutputData implements r, Parcelable {

    @NotNull
    public static final Parcelable.Creator<InvestAccountSelectorContract$OutputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestAccountSelectorContract$Account f91715a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestAccountSelectorContract$OutputData((InvestAccountSelectorContract$Account) parcel.readParcelable(InvestAccountSelectorContract$OutputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestAccountSelectorContract$OutputData[i];
        }
    }

    public InvestAccountSelectorContract$OutputData(InvestAccountSelectorContract$Account account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f91715a = account;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof InvestAccountSelectorContract$OutputData) && Intrinsics.f(this.f91715a, ((InvestAccountSelectorContract$OutputData) obj2).f91715a);
    }

    public final int hashCode() {
        return this.f91715a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f91715a, i);
    }
}
