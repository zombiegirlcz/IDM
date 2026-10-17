package com.revolut.feature.wealth.analytics.domain.models.complex_analytics;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/analytics/domain/models/complex_analytics/TotalValueChart;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TotalValueChart implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TotalValueChart> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f95002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f95003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f95004c;
    public final d d;
    public final d e;

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
                iA = org.bouncycastle.jcajce.provider.digest.a.a(TotalValueChartPoint.CREATOR, parcel, arrayList, iA, 1);
            }
            return new TotalValueChart((d) parcel.readSerializable(), (d) parcel.readSerializable(), arrayList, dateTime, dateTime2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TotalValueChart[i];
        }
    }

    public TotalValueChart(d netTopUp, d totalReturn, List points, DateTime start, DateTime end2) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(netTopUp, "netTopUp");
        Intrinsics.checkNotNullParameter(totalReturn, "totalReturn");
        this.f95002a = start;
        this.f95003b = end2;
        this.f95004c = points;
        this.d = netTopUp;
        this.e = totalReturn;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TotalValueChart)) {
            return false;
        }
        TotalValueChart totalValueChart = (TotalValueChart) obj2;
        return Intrinsics.f(this.f95002a, totalValueChart.f95002a) && Intrinsics.f(this.f95003b, totalValueChart.f95003b) && Intrinsics.f(this.f95004c, totalValueChart.f95004c) && Intrinsics.f(this.d, totalValueChart.d) && Intrinsics.f(this.e, totalValueChart.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + v7.c(p.a.d(b.f(this.f95003b, this.f95002a.hashCode() * 31, 31), 31, this.f95004c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f95002a);
        dest.writeSerializable(this.f95003b);
        Iterator itV = p.a.v(this.f95004c, dest);
        while (itV.hasNext()) {
            ((TotalValueChartPoint) itV.next()).writeToParcel(dest, i);
        }
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
    }
}
