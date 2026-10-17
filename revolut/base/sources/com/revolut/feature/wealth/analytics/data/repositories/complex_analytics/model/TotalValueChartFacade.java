package com.revolut.feature.wealth.analytics.data.repositories.complex_analytics.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/analytics/data/repositories/complex_analytics/model/TotalValueChartFacade;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TotalValueChartFacade implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TotalValueChartFacade> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f94985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f94986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f94987c;
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
                iA = org.bouncycastle.jcajce.provider.digest.a.a(TotalValueChartPointFacade.CREATOR, parcel, arrayList, iA, 1);
            }
            return new TotalValueChartFacade((d) parcel.readSerializable(), (d) parcel.readSerializable(), arrayList, dateTime, dateTime2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TotalValueChartFacade[i];
        }
    }

    public TotalValueChartFacade(d dVar, d dVar2, List points, DateTime start, DateTime end2) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        Intrinsics.checkNotNullParameter(points, "points");
        this.f94985a = start;
        this.f94986b = end2;
        this.f94987c = points;
        this.d = dVar;
        this.e = dVar2;
    }

    public static TotalValueChartFacade a(TotalValueChartFacade totalValueChartFacade, DateTime end2, ArrayList arrayList, d dVar, d dVar2, int i) {
        DateTime start = totalValueChartFacade.f94985a;
        if ((i & 2) != 0) {
            end2 = totalValueChartFacade.f94986b;
        }
        List points = (i & 4) != 0 ? totalValueChartFacade.f94987c : arrayList;
        totalValueChartFacade.getClass();
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        Intrinsics.checkNotNullParameter(points, "points");
        return new TotalValueChartFacade(dVar, dVar2, points, start, end2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TotalValueChartFacade)) {
            return false;
        }
        TotalValueChartFacade totalValueChartFacade = (TotalValueChartFacade) obj2;
        return Intrinsics.f(this.f94985a, totalValueChartFacade.f94985a) && Intrinsics.f(this.f94986b, totalValueChartFacade.f94986b) && Intrinsics.f(this.f94987c, totalValueChartFacade.f94987c) && Intrinsics.f(this.d, totalValueChartFacade.d) && Intrinsics.f(this.e, totalValueChartFacade.e);
    }

    public final int hashCode() {
        int iD = p.a.d(b.f(this.f94986b, this.f94985a.hashCode() * 31, 31), 31, this.f94987c);
        d dVar = this.d;
        int iHashCode = (iD + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.e;
        return iHashCode + (dVar2 != null ? dVar2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f94985a);
        dest.writeSerializable(this.f94986b);
        Iterator itV = p.a.v(this.f94987c, dest);
        while (itV.hasNext()) {
            ((TotalValueChartPointFacade) itV.next()).writeToParcel(dest, i);
        }
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
    }
}
