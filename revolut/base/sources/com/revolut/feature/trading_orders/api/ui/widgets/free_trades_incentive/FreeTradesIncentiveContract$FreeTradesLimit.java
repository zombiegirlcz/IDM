package com.revolut.feature.trading_orders.api.ui.widgets.free_trades_incentive;

import android.os.Parcel;
import android.os.Parcelable;
import hha.d;
import java.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading_orders/api/ui/widgets/free_trades_incentive/FreeTradesIncentiveContract$FreeTradesLimit", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreeTradesIncentiveContract$FreeTradesLimit implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreeTradesIncentiveContract$FreeTradesLimit> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f91766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f91767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f91768c;
    public final ZonedDateTime d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreeTradesIncentiveContract$FreeTradesLimit((d) parcel.readSerializable(), parcel.readInt(), parcel.readInt(), (ZonedDateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreeTradesIncentiveContract$FreeTradesLimit[i];
        }
    }

    public FreeTradesIncentiveContract$FreeTradesLimit(d pricingPlan, int i, int i2, ZonedDateTime limitEndDateTime) {
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        Intrinsics.checkNotNullParameter(limitEndDateTime, "limitEndDateTime");
        this.f91766a = pricingPlan;
        this.f91767b = i;
        this.f91768c = i2;
        this.d = limitEndDateTime;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreeTradesIncentiveContract$FreeTradesLimit)) {
            return false;
        }
        FreeTradesIncentiveContract$FreeTradesLimit freeTradesIncentiveContract$FreeTradesLimit = (FreeTradesIncentiveContract$FreeTradesLimit) obj2;
        return Intrinsics.f(this.f91766a, freeTradesIncentiveContract$FreeTradesLimit.f91766a) && this.f91767b == freeTradesIncentiveContract$FreeTradesLimit.f91767b && this.f91768c == freeTradesIncentiveContract$FreeTradesLimit.f91768c && Intrinsics.f(this.d, freeTradesIncentiveContract$FreeTradesLimit.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.b(this.f91768c, j6.a.b(this.f91767b, this.f91766a.hashCode() * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f91766a);
        dest.writeInt(this.f91767b);
        dest.writeInt(this.f91768c);
        dest.writeSerializable(this.d);
    }
}
