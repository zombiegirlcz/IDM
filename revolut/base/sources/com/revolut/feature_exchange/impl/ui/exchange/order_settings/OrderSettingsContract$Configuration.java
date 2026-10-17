package com.revolut.feature_exchange.impl.ui.exchange.order_settings;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_exchange/impl/ui/exchange/order_settings/OrderSettingsContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrderSettingsContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OrderSettingsContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f96908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f96909b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderSettingsContract$Configuration(parcel.readDouble(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OrderSettingsContract$Configuration[i];
        }
    }

    public OrderSettingsContract$Configuration(double d, int i) {
        this.f96908a = d;
        this.f96909b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OrderSettingsContract$Configuration)) {
            return false;
        }
        OrderSettingsContract$Configuration orderSettingsContract$Configuration = (OrderSettingsContract$Configuration) obj2;
        return Double.compare(this.f96908a, orderSettingsContract$Configuration.f96908a) == 0 && this.f96909b == orderSettingsContract$Configuration.f96909b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f96909b) + (Double.hashCode(this.f96908a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeDouble(this.f96908a);
        dest.writeInt(this.f96909b);
    }
}
