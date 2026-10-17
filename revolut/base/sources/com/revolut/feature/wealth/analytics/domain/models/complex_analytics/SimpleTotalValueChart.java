package com.revolut.feature.wealth.analytics.domain.models.complex_analytics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/analytics/domain/models/complex_analytics/SimpleTotalValueChart;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SimpleTotalValueChart implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SimpleTotalValueChart> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f94997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f94998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f94999c;

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
                iA = org.bouncycastle.jcajce.provider.digest.a.a(SimpleTotalValueChartPoint.CREATOR, parcel, arrayList, iA, 1);
            }
            return new SimpleTotalValueChart(dateTime, dateTime2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SimpleTotalValueChart[i];
        }
    }

    public SimpleTotalValueChart(DateTime start, DateTime end2, List points) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        Intrinsics.checkNotNullParameter(points, "points");
        this.f94997a = start;
        this.f94998b = end2;
        this.f94999c = points;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SimpleTotalValueChart)) {
            return false;
        }
        SimpleTotalValueChart simpleTotalValueChart = (SimpleTotalValueChart) obj2;
        return Intrinsics.f(this.f94997a, simpleTotalValueChart.f94997a) && Intrinsics.f(this.f94998b, simpleTotalValueChart.f94998b) && Intrinsics.f(this.f94999c, simpleTotalValueChart.f94999c);
    }

    public final int hashCode() {
        return this.f94999c.hashCode() + b.f(this.f94998b, this.f94997a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f94997a);
        dest.writeSerializable(this.f94998b);
        Iterator itV = p.a.v(this.f94999c, dest);
        while (itV.hasNext()) {
            ((SimpleTotalValueChartPoint) itV.next()).writeToParcel(dest, i);
        }
    }
}
