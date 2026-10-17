package com.revolut.feature.wealth.analytics.domain.models.complex_analytics;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/analytics/domain/models/complex_analytics/TotalValueChartPoint;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TotalValueChartPoint implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TotalValueChartPoint> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f95005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f95006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f95007c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TotalValueChartPoint((d) parcel.readSerializable(), (d) parcel.readSerializable(), (DateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TotalValueChartPoint[i];
        }
    }

    public TotalValueChartPoint(d amount, d cumulativeNetTopUp, DateTime timestamp) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(cumulativeNetTopUp, "cumulativeNetTopUp");
        this.f95005a = timestamp;
        this.f95006b = amount;
        this.f95007c = cumulativeNetTopUp;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TotalValueChartPoint)) {
            return false;
        }
        TotalValueChartPoint totalValueChartPoint = (TotalValueChartPoint) obj2;
        return Intrinsics.f(this.f95005a, totalValueChartPoint.f95005a) && Intrinsics.f(this.f95006b, totalValueChartPoint.f95006b) && Intrinsics.f(this.f95007c, totalValueChartPoint.f95007c);
    }

    public final int hashCode() {
        return this.f95007c.hashCode() + v7.c(this.f95005a.hashCode() * 31, 31, this.f95006b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f95005a);
        dest.writeSerializable(this.f95006b);
        dest.writeSerializable(this.f95007c);
    }
}
