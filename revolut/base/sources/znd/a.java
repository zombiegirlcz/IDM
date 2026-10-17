package znd;

import com.revolut.data.model.Data;
import com.revolut.feature.spending_analytics.api.models.GroupingExtraData;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f323707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yld.c f323708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final amd.i f323709c;
    public final Set d;
    public final DateTime e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f323710g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f323711h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f323712j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f323713l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f323714m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Set f323715n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Set f323716p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Map f323717q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f323718r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final fnd.a f323719s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AnalyticsSpendingPeriod$Interval f323720t;
    public final k71.q u;
    public final GroupingExtraData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Set f323721w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final rnd.h f323722x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final rnd.g f323723y;
    public final boolean z;

    public a(Data data, yld.c analyticsChartStyle, amd.i filter, Set availableFilters, DateTime dateTime, c cVar, int i, boolean z, boolean z3, boolean z4, boolean z6, int i2, boolean z11, Set set, String str, Set set2, Map map, String str2, fnd.a aVar, AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval, k71.q qVar, GroupingExtraData groupingExtraData, Set smallCategoryIds, rnd.h hVar, rnd.g gVar, boolean z12) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(analyticsChartStyle, "analyticsChartStyle");
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(availableFilters, "availableFilters");
        Intrinsics.checkNotNullParameter(groupingExtraData, "groupingExtraData");
        Intrinsics.checkNotNullParameter(smallCategoryIds, "smallCategoryIds");
        this.f323707a = data;
        this.f323708b = analyticsChartStyle;
        this.f323709c = filter;
        this.d = availableFilters;
        this.e = dateTime;
        this.f = cVar;
        this.f323710g = i;
        this.f323711h = z;
        this.i = z3;
        this.f323712j = z4;
        this.k = z6;
        this.f323713l = i2;
        this.f323714m = z11;
        this.f323715n = set;
        this.o = str;
        this.f323716p = set2;
        this.f323717q = map;
        this.f323718r = str2;
        this.f323719s = aVar;
        this.f323720t = analyticsSpendingPeriod$Interval;
        this.u = qVar;
        this.v = groupingExtraData;
        this.f323721w = smallCategoryIds;
        this.f323722x = hVar;
        this.f323723y = gVar;
        this.z = z12;
    }

    public static a a(a aVar, Data data, yld.c cVar, amd.i iVar, Set set, DateTime dateTime, c cVar2, int i, boolean z, boolean z3, boolean z4, boolean z6, int i2, boolean z11, Set set2, String str, Set set3, Map map, String str2, fnd.a aVar2, AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval, k71.q qVar, GroupingExtraData groupingExtraData, HashSet hashSet, rnd.h hVar, rnd.g gVar, boolean z12, int i3) {
        Data data2 = (i3 & 1) != 0 ? aVar.f323707a : data;
        yld.c analyticsChartStyle = (i3 & 2) != 0 ? aVar.f323708b : cVar;
        amd.i filter = (i3 & 4) != 0 ? aVar.f323709c : iVar;
        Set availableFilters = (i3 & 8) != 0 ? aVar.d : set;
        DateTime dateTime2 = (i3 & 16) != 0 ? aVar.e : dateTime;
        c cVar3 = (i3 & 32) != 0 ? aVar.f : cVar2;
        int i5 = (i3 & 64) != 0 ? aVar.f323710g : i;
        boolean z29 = (i3 & 128) != 0 ? aVar.f323711h : z;
        boolean z31 = (i3 & 256) != 0 ? aVar.i : z3;
        boolean z41 = (i3 & 512) != 0 ? aVar.f323712j : z4;
        boolean z49 = (i3 & 1024) != 0 ? aVar.k : z6;
        int i6 = (i3 & 2048) != 0 ? aVar.f323713l : i2;
        boolean z54 = (i3 & 4096) != 0 ? aVar.f323714m : z11;
        Set set4 = (i3 & 8192) != 0 ? aVar.f323715n : set2;
        DateTime dateTime3 = dateTime2;
        String str3 = (i3 & 16384) != 0 ? aVar.o : str;
        Set set5 = (i3 & 32768) != 0 ? aVar.f323716p : set3;
        Map map2 = (i3 & 65536) != 0 ? aVar.f323717q : map;
        String str4 = (i3 & 131072) != 0 ? aVar.f323718r : str2;
        fnd.a aVar3 = (i3 & 262144) != 0 ? aVar.f323719s : aVar2;
        AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval2 = (i3 & 524288) != 0 ? aVar.f323720t : analyticsSpendingPeriod$Interval;
        k71.q qVar2 = (i3 & PKIFailureInfo.badCertTemplate) != 0 ? aVar.u : qVar;
        GroupingExtraData groupingExtraData2 = (i3 & PKIFailureInfo.badSenderNonce) != 0 ? aVar.v : groupingExtraData;
        String str5 = str3;
        Set smallCategoryIds = (i3 & 4194304) != 0 ? aVar.f323721w : hashSet;
        c cVar4 = cVar3;
        rnd.h hVar2 = (i3 & 8388608) != 0 ? aVar.f323722x : hVar;
        rnd.g gVar2 = (i3 & 16777216) != 0 ? aVar.f323723y : gVar;
        boolean z74 = (i3 & 33554432) != 0 ? aVar.z : z12;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(data2, "data");
        Intrinsics.checkNotNullParameter(analyticsChartStyle, "analyticsChartStyle");
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(availableFilters, "availableFilters");
        Intrinsics.checkNotNullParameter(groupingExtraData2, "groupingExtraData");
        Intrinsics.checkNotNullParameter(smallCategoryIds, "smallCategoryIds");
        return new a(data2, analyticsChartStyle, filter, availableFilters, dateTime3, cVar4, i5, z29, z31, z41, z49, i6, z54, set4, str5, set5, map2, str4, aVar3, analyticsSpendingPeriod$Interval2, qVar2, groupingExtraData2, smallCategoryIds, hVar2, gVar2, z74);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f323707a, aVar.f323707a) && this.f323708b == aVar.f323708b && this.f323709c == aVar.f323709c && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && this.f323710g == aVar.f323710g && this.f323711h == aVar.f323711h && this.i == aVar.i && this.f323712j == aVar.f323712j && this.k == aVar.k && this.f323713l == aVar.f323713l && this.f323714m == aVar.f323714m && Intrinsics.f(this.f323715n, aVar.f323715n) && Intrinsics.f(this.o, aVar.o) && Intrinsics.f(this.f323716p, aVar.f323716p) && Intrinsics.f(this.f323717q, aVar.f323717q) && Intrinsics.f(this.f323718r, aVar.f323718r) && this.f323719s == aVar.f323719s && Intrinsics.f(this.f323720t, aVar.f323720t) && Intrinsics.f(this.u, aVar.u) && Intrinsics.f(this.v, aVar.v) && Intrinsics.f(this.f323721w, aVar.f323721w) && Intrinsics.f(this.f323722x, aVar.f323722x) && Intrinsics.f(this.f323723y, aVar.f323723y) && this.z == aVar.z;
    }

    public final int hashCode() {
        int iF = p.a.f((this.f323709c.hashCode() + ((this.f323708b.hashCode() + (this.f323707a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        DateTime dateTime = this.e;
        int iHashCode = (iF + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        c cVar = this.f;
        int iC = j6.a.c(j6.a.b(this.f323713l, j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.b(this.f323710g, (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31, 31), 31, this.f323711h), 31, this.i), 31, this.f323712j), 31, this.k), 31), 31, this.f323714m);
        Set set = this.f323715n;
        int iHashCode2 = (iC + (set == null ? 0 : set.hashCode())) * 31;
        String str = this.o;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Set set2 = this.f323716p;
        int iHashCode4 = (iHashCode3 + (set2 == null ? 0 : set2.hashCode())) * 31;
        Map map = this.f323717q;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.f323718r;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        fnd.a aVar = this.f323719s;
        int iHashCode7 = (iHashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = this.f323720t;
        int iHashCode8 = (iHashCode7 + (analyticsSpendingPeriod$Interval == null ? 0 : analyticsSpendingPeriod$Interval.hashCode())) * 31;
        k71.q qVar = this.u;
        int iF2 = p.a.f((this.v.hashCode() + ((iHashCode8 + (qVar == null ? 0 : qVar.hashCode())) * 31)) * 31, 31, this.f323721w);
        rnd.h hVar = this.f323722x;
        int iHashCode9 = (iF2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        rnd.g gVar = this.f323723y;
        return Boolean.hashCode(this.z) + ((iHashCode9 + (gVar != null ? gVar.hashCode() : 0)) * 31);
    }
}
