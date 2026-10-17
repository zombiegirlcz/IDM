package com.revolut.feature.trading_orders.api.ui.widgets.free_trades_incentive;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading_orders/api/ui/widgets/free_trades_incentive/FreeTradesIncentiveContract$FreeTradesWidgetParcel", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreeTradesIncentiveContract$FreeTradesWidgetParcel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreeTradesIncentiveContract$FreeTradesWidgetParcel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreeTradesIncentiveContract$FreeTradesLimit f91769a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreeTradesIncentiveContract$FreeTradesWidgetParcel(FreeTradesIncentiveContract$FreeTradesLimit.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreeTradesIncentiveContract$FreeTradesWidgetParcel[i];
        }
    }

    public FreeTradesIncentiveContract$FreeTradesWidgetParcel(FreeTradesIncentiveContract$FreeTradesLimit freeTradesLimit) {
        Intrinsics.checkNotNullParameter(freeTradesLimit, "freeTradesLimit");
        this.f91769a = freeTradesLimit;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof FreeTradesIncentiveContract$FreeTradesWidgetParcel) && Intrinsics.f(this.f91769a, ((FreeTradesIncentiveContract$FreeTradesWidgetParcel) obj2).f91769a);
    }

    public final int hashCode() {
        return this.f91769a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f91769a.writeToParcel(dest, i);
    }
}
