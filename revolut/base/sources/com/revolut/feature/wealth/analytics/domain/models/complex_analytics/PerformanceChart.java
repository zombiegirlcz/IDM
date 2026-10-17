package com.revolut.feature.wealth.analytics.domain.models.complex_analytics;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/analytics/domain/models/complex_analytics/PerformanceChart;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PerformanceChart implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PerformanceChart> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f94991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f94992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f94993c;
    public final DateTime d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            DateTime dateTime = (DateTime) parcel.readSerializable();
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(PerformanceChartPoint.CREATOR, parcel, arrayList, iA, 1);
            }
            return new PerformanceChart(dateTime, dateTime2, arrayList, (DateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PerformanceChart[i];
        }
    }

    public PerformanceChart(DateTime start, DateTime end2, List points, DateTime lastModified) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(lastModified, "lastModified");
        this.f94991a = start;
        this.f94992b = end2;
        this.f94993c = points;
        this.d = lastModified;
        Intrinsics.checkNotNullExpressionValue(Instant.ofEpochMilli(start.getMillis()), "ofEpochMilli(...)");
        Intrinsics.checkNotNullExpressionValue(Instant.ofEpochMilli(end2.getMillis()), "ofEpochMilli(...)");
    }

    public static PerformanceChart a(PerformanceChart performanceChart, DateTime end2, ArrayList arrayList, DateTime lastModified, int i) {
        DateTime start = performanceChart.f94991a;
        if ((i & 2) != 0) {
            end2 = performanceChart.f94992b;
        }
        List points = arrayList;
        if ((i & 4) != 0) {
            points = performanceChart.f94993c;
        }
        performanceChart.getClass();
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(lastModified, "lastModified");
        return new PerformanceChart(start, end2, points, lastModified);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PerformanceChart)) {
            return false;
        }
        PerformanceChart performanceChart = (PerformanceChart) obj2;
        return Intrinsics.f(this.f94991a, performanceChart.f94991a) && Intrinsics.f(this.f94992b, performanceChart.f94992b) && Intrinsics.f(this.f94993c, performanceChart.f94993c) && Intrinsics.f(this.d, performanceChart.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(b.f(this.f94992b, this.f94991a.hashCode() * 31, 31), 31, this.f94993c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f94991a);
        dest.writeSerializable(this.f94992b);
        Iterator itV = p.a.v(this.f94993c, dest);
        while (itV.hasNext()) {
            ((PerformanceChartPoint) itV.next()).writeToParcel(dest, i);
        }
        dest.writeSerializable(this.d);
    }
}
