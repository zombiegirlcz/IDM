package com.revolut.feature.wealth.analytics.domain.models.complex_analytics;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/analytics/domain/models/complex_analytics/PerformanceChartPoint;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PerformanceChartPoint implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PerformanceChartPoint> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f94994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f94995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f94996c;
    public final Float d;
    public final d e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PerformanceChartPoint((DateTime) parcel.readSerializable(), parcel.readFloat(), parcel.readFloat(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PerformanceChartPoint[i];
        }
    }

    public PerformanceChartPoint(DateTime timestamp, float f, float f4, Float f5, d pnl2) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(pnl2, "pnl");
        this.f94994a = timestamp;
        this.f94995b = f;
        this.f94996c = f4;
        this.d = f5;
        this.e = pnl2;
        Intrinsics.checkNotNullExpressionValue(Instant.ofEpochMilli(timestamp.getMillis()), "ofEpochMilli(...)");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PerformanceChartPoint)) {
            return false;
        }
        PerformanceChartPoint performanceChartPoint = (PerformanceChartPoint) obj2;
        return Intrinsics.f(this.f94994a, performanceChartPoint.f94994a) && Float.compare(this.f94995b, performanceChartPoint.f94995b) == 0 && Float.compare(this.f94996c, performanceChartPoint.f94996c) == 0 && Intrinsics.f(this.d, performanceChartPoint.d) && Intrinsics.f(this.e, performanceChartPoint.e);
    }

    public final int hashCode() {
        int iB = b.b(this.f94996c, b.b(this.f94995b, this.f94994a.hashCode() * 31, 31), 31);
        Float f = this.d;
        return this.e.hashCode() + ((iB + (f == null ? 0 : f.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f94994a);
        dest.writeFloat(this.f94995b);
        dest.writeFloat(this.f94996c);
        Float f = this.d;
        if (f == null) {
            dest.writeInt(0);
        } else {
            r6.b.p(dest, 1, f);
        }
        dest.writeSerializable(this.e);
    }
}
