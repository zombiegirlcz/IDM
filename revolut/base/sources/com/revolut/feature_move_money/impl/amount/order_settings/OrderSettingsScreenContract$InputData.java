package com.revolut.feature_move_money.impl.amount.order_settings;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v6i.g;
import v6i.k;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_move_money/impl/amount/order_settings/OrderSettingsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrderSettingsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<OrderSettingsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f97305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f97306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f97307c;
    public final b d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderSettingsScreenContract$InputData(g.valueOf(parcel.readString()), k.valueOf(parcel.readString()), (b) parcel.readSerializable(), (b) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OrderSettingsScreenContract$InputData[i];
        }
    }

    public OrderSettingsScreenContract$InputData(g mode, k type, b baseCurrency, b counterCurrency, String prefilledRate) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(counterCurrency, "counterCurrency");
        Intrinsics.checkNotNullParameter(prefilledRate, "prefilledRate");
        this.f97305a = mode;
        this.f97306b = type;
        this.f97307c = baseCurrency;
        this.d = counterCurrency;
        this.e = prefilledRate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OrderSettingsScreenContract$InputData)) {
            return false;
        }
        OrderSettingsScreenContract$InputData orderSettingsScreenContract$InputData = (OrderSettingsScreenContract$InputData) obj2;
        return this.f97305a == orderSettingsScreenContract$InputData.f97305a && this.f97306b == orderSettingsScreenContract$InputData.f97306b && Intrinsics.f(this.f97307c, orderSettingsScreenContract$InputData.f97307c) && Intrinsics.f(this.d, orderSettingsScreenContract$InputData.d) && Intrinsics.f(this.e, orderSettingsScreenContract$InputData.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + l.j(this.d, l.j(this.f97307c, (this.f97306b.hashCode() + (this.f97305a.hashCode() * 31)) * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97305a.name());
        dest.writeString(this.f97306b.name());
        dest.writeSerializable(this.f97307c);
        dest.writeSerializable(this.d);
        dest.writeString(this.e);
    }
}
