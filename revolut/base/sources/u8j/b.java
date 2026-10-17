package u8j;

import aw0.q0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.data.model.Data;
import h30.l;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f278223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f278224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IconNavBarMenuItem f278225c;
    public final xi0.b d;
    public final n9l.a e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f278226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f278227h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f278228j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f278229l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Data f278230m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f278231n;
    public final List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f278232p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Data f278233q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Data f278234r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final q0 f278235s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AnalyticsContext f278236t;
    public final Boolean u;
    public final Data v;

    public b(boolean z, xi0.b currency, IconNavBarMenuItem iconNavBarMenuItem, xi0.b bVar, n9l.a aVar, Clause clause, List chart, Data chartHeaderData, List investment, List airTipItems, List stats, List aboutItems, Data newsData, List alertsItems, List collectionsItems, List advancedChartItems, Data transactionsData, Data ordersData, q0 q0Var, AnalyticsContext analyticsContext, Boolean bool, Data data) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(chartHeaderData, "chartHeaderData");
        Intrinsics.checkNotNullParameter(investment, "investment");
        Intrinsics.checkNotNullParameter(airTipItems, "airTipItems");
        Intrinsics.checkNotNullParameter(stats, "stats");
        Intrinsics.checkNotNullParameter(aboutItems, "aboutItems");
        Intrinsics.checkNotNullParameter(newsData, "newsData");
        Intrinsics.checkNotNullParameter(alertsItems, "alertsItems");
        Intrinsics.checkNotNullParameter(collectionsItems, "collectionsItems");
        Intrinsics.checkNotNullParameter(advancedChartItems, "advancedChartItems");
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        Intrinsics.checkNotNullParameter(ordersData, "ordersData");
        this.f278223a = z;
        this.f278224b = currency;
        this.f278225c = iconNavBarMenuItem;
        this.d = bVar;
        this.e = aVar;
        this.f = clause;
        this.f278226g = chart;
        this.f278227h = chartHeaderData;
        this.i = investment;
        this.f278228j = airTipItems;
        this.k = stats;
        this.f278229l = aboutItems;
        this.f278230m = newsData;
        this.f278231n = alertsItems;
        this.o = collectionsItems;
        this.f278232p = advancedChartItems;
        this.f278233q = transactionsData;
        this.f278234r = ordersData;
        this.f278235s = q0Var;
        this.f278236t = analyticsContext;
        this.u = bool;
        this.v = data;
    }

    public static b a(b bVar, boolean z, xi0.b bVar2, n9l.a aVar, Clause clause, List list, Data data, List list2, List list3, List list4, List list5, Data data2, List list6, List list7, List list8, Data data3, Data data4, q0 q0Var, AnalyticsContext analyticsContext, Boolean bool, Data data5, int i) {
        IconNavBarMenuItem iconNavBarMenuItem;
        Data transactionsData;
        boolean z3 = (i & 1) != 0 ? bVar.f278223a : z;
        xi0.b currency = bVar.f278224b;
        IconNavBarMenuItem iconNavBarMenuItem2 = bVar.f278225c;
        xi0.b bVar3 = (i & 8) != 0 ? bVar.d : bVar2;
        n9l.a aVar2 = (i & 16) != 0 ? bVar.e : aVar;
        Clause clause2 = (i & 32) != 0 ? bVar.f : clause;
        List chart = (i & 64) != 0 ? bVar.f278226g : list;
        Data chartHeaderData = (i & 128) != 0 ? bVar.f278227h : data;
        List investment = (i & 256) != 0 ? bVar.i : list2;
        List airTipItems = (i & 512) != 0 ? bVar.f278228j : list3;
        List stats = (i & 1024) != 0 ? bVar.k : list4;
        List aboutItems = (i & 2048) != 0 ? bVar.f278229l : list5;
        Data newsData = (i & 4096) != 0 ? bVar.f278230m : data2;
        List alertsItems = (i & 8192) != 0 ? bVar.f278231n : list6;
        boolean z4 = z3;
        List collectionsItems = (i & 16384) != 0 ? bVar.o : list7;
        List advancedChartItems = (i & 32768) != 0 ? bVar.f278232p : list8;
        if ((i & 65536) != 0) {
            iconNavBarMenuItem = iconNavBarMenuItem2;
            transactionsData = bVar.f278233q;
        } else {
            iconNavBarMenuItem = iconNavBarMenuItem2;
            transactionsData = data3;
        }
        xi0.b bVar4 = bVar3;
        Data ordersData = (i & 131072) != 0 ? bVar.f278234r : data4;
        n9l.a aVar3 = aVar2;
        q0 q0Var2 = (i & 262144) != 0 ? bVar.f278235s : q0Var;
        AnalyticsContext analyticsContext2 = (i & 524288) != 0 ? bVar.f278236t : analyticsContext;
        Boolean bool2 = (i & PKIFailureInfo.badCertTemplate) != 0 ? bVar.u : bool;
        Data data6 = (i & PKIFailureInfo.badSenderNonce) != 0 ? bVar.v : data5;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(chartHeaderData, "chartHeaderData");
        Intrinsics.checkNotNullParameter(investment, "investment");
        Intrinsics.checkNotNullParameter(airTipItems, "airTipItems");
        Intrinsics.checkNotNullParameter(stats, "stats");
        Intrinsics.checkNotNullParameter(aboutItems, "aboutItems");
        Intrinsics.checkNotNullParameter(newsData, "newsData");
        Intrinsics.checkNotNullParameter(alertsItems, "alertsItems");
        Intrinsics.checkNotNullParameter(collectionsItems, "collectionsItems");
        Intrinsics.checkNotNullParameter(advancedChartItems, "advancedChartItems");
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        Intrinsics.checkNotNullParameter(ordersData, "ordersData");
        return new b(z4, currency, iconNavBarMenuItem, bVar4, aVar3, clause2, chart, chartHeaderData, investment, airTipItems, stats, aboutItems, newsData, alertsItems, collectionsItems, advancedChartItems, transactionsData, ordersData, q0Var2, analyticsContext2, bool2, data6);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f278223a == bVar.f278223a && Intrinsics.f(this.f278224b, bVar.f278224b) && Intrinsics.f(this.f278225c, bVar.f278225c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f278226g, bVar.f278226g) && Intrinsics.f(this.f278227h, bVar.f278227h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f278228j, bVar.f278228j) && Intrinsics.f(this.k, bVar.k) && Intrinsics.f(this.f278229l, bVar.f278229l) && Intrinsics.f(this.f278230m, bVar.f278230m) && Intrinsics.f(this.f278231n, bVar.f278231n) && Intrinsics.f(this.o, bVar.o) && Intrinsics.f(this.f278232p, bVar.f278232p) && Intrinsics.f(this.f278233q, bVar.f278233q) && Intrinsics.f(this.f278234r, bVar.f278234r) && Intrinsics.f(this.f278235s, bVar.f278235s) && Intrinsics.f(this.f278236t, bVar.f278236t) && Intrinsics.f(this.u, bVar.u) && Intrinsics.f(this.v, bVar.v);
    }

    public final int hashCode() {
        int iJ = l.j(this.f278224b, Boolean.hashCode(this.f278223a) * 31, 31);
        IconNavBarMenuItem iconNavBarMenuItem = this.f278225c;
        int iHashCode = (iJ + (iconNavBarMenuItem == null ? 0 : iconNavBarMenuItem.hashCode())) * 31;
        xi0.b bVar = this.d;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        n9l.a aVar = this.e;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Clause clause = this.f;
        int iC = kii.e.c(this.f278234r, kii.e.c(this.f278233q, p.a.d(p.a.d(p.a.d(kii.e.c(this.f278230m, p.a.d(p.a.d(p.a.d(p.a.d(kii.e.c(this.f278227h, p.a.d((iHashCode3 + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f278226g), 31), 31, this.i), 31, this.f278228j), 31, this.k), 31, this.f278229l), 31), 31, this.f278231n), 31, this.o), 31, this.f278232p), 31), 31);
        q0 q0Var = this.f278235s;
        int iHashCode4 = (iC + (q0Var == null ? 0 : q0Var.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.f278236t;
        int iA = (iHashCode4 + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31;
        Boolean bool = this.u;
        int iHashCode5 = (iA + (bool == null ? 0 : bool.hashCode())) * 31;
        Data data = this.v;
        return iHashCode5 + (data != null ? data.hashCode() : 0);
    }
}
