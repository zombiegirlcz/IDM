package com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_exchange/impl/ui/takeprofit_stopsell/chart_limit/ChartLimitPickerControllerContract$Limit", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChartLimitPickerControllerContract$Limit implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ChartLimitPickerControllerContract$Limit> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f96988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f96989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f96990c;
    public final float d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChartLimitPickerControllerContract$Limit(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChartLimitPickerControllerContract$Limit[i];
        }
    }

    public ChartLimitPickerControllerContract$Limit(float f, float f4, float f5, boolean z) {
        this.f96988a = z;
        this.f96989b = f;
        this.f96990c = f4;
        this.d = f5;
    }

    public static ChartLimitPickerControllerContract$Limit a(ChartLimitPickerControllerContract$Limit chartLimitPickerControllerContract$Limit, boolean z, float f, int i) {
        if ((i & 1) != 0) {
            z = chartLimitPickerControllerContract$Limit.f96988a;
        }
        if ((i & 2) != 0) {
            f = chartLimitPickerControllerContract$Limit.f96989b;
        }
        float f4 = chartLimitPickerControllerContract$Limit.f96990c;
        float f5 = chartLimitPickerControllerContract$Limit.d;
        chartLimitPickerControllerContract$Limit.getClass();
        return new ChartLimitPickerControllerContract$Limit(f, f4, f5, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChartLimitPickerControllerContract$Limit)) {
            return false;
        }
        ChartLimitPickerControllerContract$Limit chartLimitPickerControllerContract$Limit = (ChartLimitPickerControllerContract$Limit) obj2;
        return this.f96988a == chartLimitPickerControllerContract$Limit.f96988a && Float.compare(this.f96989b, chartLimitPickerControllerContract$Limit.f96989b) == 0 && Float.compare(this.f96990c, chartLimitPickerControllerContract$Limit.f96990c) == 0 && Float.compare(this.d, chartLimitPickerControllerContract$Limit.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + m72.b.b(this.f96990c, m72.b.b(this.f96989b, Boolean.hashCode(this.f96988a) * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f96988a ? 1 : 0);
        dest.writeFloat(this.f96989b);
        dest.writeFloat(this.f96990c);
        dest.writeFloat(this.d);
    }
}
