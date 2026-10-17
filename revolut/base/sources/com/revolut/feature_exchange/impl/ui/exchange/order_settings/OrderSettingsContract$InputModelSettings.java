package com.revolut.feature_exchange.impl.ui.exchange.order_settings;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_exchange/impl/ui/exchange/order_settings/OrderSettingsContract$InputModelSettings", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrderSettingsContract$InputModelSettings implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OrderSettingsContract$InputModelSettings> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f96910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f96911b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderSettingsContract$InputModelSettings(parcel.readInt(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OrderSettingsContract$InputModelSettings[i];
        }
    }

    public OrderSettingsContract$InputModelSettings(int i, b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f96910a = currency;
        this.f96911b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OrderSettingsContract$InputModelSettings)) {
            return false;
        }
        OrderSettingsContract$InputModelSettings orderSettingsContract$InputModelSettings = (OrderSettingsContract$InputModelSettings) obj2;
        return Intrinsics.f(this.f96910a, orderSettingsContract$InputModelSettings.f96910a) && this.f96911b == orderSettingsContract$InputModelSettings.f96911b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f96911b) + (this.f96910a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f96910a);
        dest.writeInt(this.f96911b);
    }
}
