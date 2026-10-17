package avk;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements cli.j, fsl.n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n2h.f f10103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f10104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e3h.c f10105c;
    public final List d;
    public final Data e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f10106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f10107h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f10108j;
    public final atk.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h3h.d f10109l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Data f10110m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final jtk.i f10111n;
    public final Data o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f10112p;

    public m(n2h.f actionsPanelState, List alertsWidgetItems, e3h.c historicalChartState, List list, Data data, List instrumentBioItems, Data data2, Data data3, Data data4, List list2, atk.d investmentNoticeWidgetState, h3h.d investmentsWidgetState, Data data5, jtk.i iVar, Data data6, List list3) {
        Intrinsics.checkNotNullParameter(actionsPanelState, "actionsPanelState");
        Intrinsics.checkNotNullParameter(alertsWidgetItems, "alertsWidgetItems");
        Intrinsics.checkNotNullParameter(historicalChartState, "historicalChartState");
        Intrinsics.checkNotNullParameter(instrumentBioItems, "instrumentBioItems");
        Intrinsics.checkNotNullParameter(investmentNoticeWidgetState, "investmentNoticeWidgetState");
        Intrinsics.checkNotNullParameter(investmentsWidgetState, "investmentsWidgetState");
        this.f10103a = actionsPanelState;
        this.f10104b = alertsWidgetItems;
        this.f10105c = historicalChartState;
        this.d = list;
        this.e = data;
        this.f = instrumentBioItems;
        this.f10106g = data2;
        this.f10107h = data3;
        this.i = data4;
        this.f10108j = list2;
        this.k = investmentNoticeWidgetState;
        this.f10109l = investmentsWidgetState;
        this.f10110m = data5;
        this.f10111n = iVar;
        this.o = data6;
        this.f10112p = list3;
    }

    public static m c(m mVar, n2h.f fVar, List list, e3h.c cVar, List list2, Data data, List list3, Data data2, Data data3, Data data4, List list4, atk.d dVar, h3h.d dVar2, Data data5, jtk.i iVar, Data data6, List list5, int i) {
        n2h.f actionsPanelState = (i & 1) != 0 ? mVar.f10103a : fVar;
        List alertsWidgetItems = (i & 2) != 0 ? mVar.f10104b : list;
        e3h.c historicalChartState = (i & 4) != 0 ? mVar.f10105c : cVar;
        List list6 = (i & 8) != 0 ? mVar.d : list2;
        Data data7 = (i & 16) != 0 ? mVar.e : data;
        List instrumentBioItems = (i & 32) != 0 ? mVar.f : list3;
        Data data8 = (i & 64) != 0 ? mVar.f10106g : data2;
        Data data9 = (i & 128) != 0 ? mVar.f10107h : data3;
        Data data10 = (i & 256) != 0 ? mVar.i : data4;
        List list7 = (i & 512) != 0 ? mVar.f10108j : list4;
        atk.d investmentNoticeWidgetState = (i & 1024) != 0 ? mVar.k : dVar;
        h3h.d investmentsWidgetState = (i & 2048) != 0 ? mVar.f10109l : dVar2;
        Data data11 = (i & 4096) != 0 ? mVar.f10110m : data5;
        jtk.i iVar2 = (i & 8192) != 0 ? mVar.f10111n : iVar;
        List list8 = list6;
        Data data12 = (i & 16384) != 0 ? mVar.o : data6;
        List list9 = (i & 32768) != 0 ? mVar.f10112p : list5;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(actionsPanelState, "actionsPanelState");
        Intrinsics.checkNotNullParameter(alertsWidgetItems, "alertsWidgetItems");
        Intrinsics.checkNotNullParameter(historicalChartState, "historicalChartState");
        Intrinsics.checkNotNullParameter(instrumentBioItems, "instrumentBioItems");
        Intrinsics.checkNotNullParameter(investmentNoticeWidgetState, "investmentNoticeWidgetState");
        Intrinsics.checkNotNullParameter(investmentsWidgetState, "investmentsWidgetState");
        return new m(actionsPanelState, alertsWidgetItems, historicalChartState, list8, data7, instrumentBioItems, data8, data9, data10, list7, investmentNoticeWidgetState, investmentsWidgetState, data11, iVar2, data12, list9);
    }

    @Override // fsl.n
    public final Data J0() {
        return this.i;
    }

    @Override // fsl.n
    public final Data a() {
        return this.f10107h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f10103a, mVar.f10103a) && Intrinsics.f(this.f10104b, mVar.f10104b) && Intrinsics.f(this.f10105c, mVar.f10105c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f10106g, mVar.f10106g) && Intrinsics.f(this.f10107h, mVar.f10107h) && Intrinsics.f(this.i, mVar.i) && Intrinsics.f(this.f10108j, mVar.f10108j) && Intrinsics.f(this.k, mVar.k) && Intrinsics.f(this.f10109l, mVar.f10109l) && Intrinsics.f(this.f10110m, mVar.f10110m) && Intrinsics.f(this.f10111n, mVar.f10111n) && Intrinsics.f(this.o, mVar.o) && Intrinsics.f(this.f10112p, mVar.f10112p);
    }

    public final int hashCode() {
        int iHashCode = (this.f10105c.hashCode() + p.a.d(this.f10103a.f211545a.hashCode() * 31, 31, this.f10104b)) * 31;
        List list = this.d;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Data data = this.e;
        int iD = p.a.d((iHashCode2 + (data == null ? 0 : data.hashCode())) * 31, 31, this.f);
        Data data2 = this.f10106g;
        int iHashCode3 = (iD + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.f10107h;
        int iHashCode4 = (iHashCode3 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.i;
        int iHashCode5 = (iHashCode4 + (data4 == null ? 0 : data4.hashCode())) * 31;
        List list2 = this.f10108j;
        int iHashCode6 = (this.f10109l.hashCode() + kii.e.c(this.k.f9085a, (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31, 31)) * 31;
        Data data5 = this.f10110m;
        int iHashCode7 = (iHashCode6 + (data5 == null ? 0 : data5.hashCode())) * 31;
        jtk.i iVar = this.f10111n;
        int iHashCode8 = (iHashCode7 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        Data data6 = this.o;
        int iHashCode9 = (iHashCode8 + (data6 == null ? 0 : data6.hashCode())) * 31;
        List list3 = this.f10112p;
        return iHashCode9 + (list3 != null ? list3.hashCode() : 0);
    }
}
