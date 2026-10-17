package m5e;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements cli.j, fsl.n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a5e.f f202908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s4e.d f202909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t4e.d f202910c;
    public final y4e.d d;
    public final h3h.d e;
    public final x4e.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z4e.d f202911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u4e.d f202912h;
    public final w4e.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e3h.c f202913j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f202914l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Data f202915m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Data f202916n;
    public final Data o;

    public static final class a {
        private a() {
        }
    }

    public h() {
        this(null, null, null, null, null, null, null, null, null, null, 32767);
    }

    public static h c(h hVar, a5e.f fVar, s4e.d dVar, t4e.d dVar2, y4e.d dVar3, h3h.d dVar4, x4e.d dVar5, z4e.d dVar6, u4e.d dVar7, w4e.b bVar, e3h.c cVar, List list, List list2, Data data, Data data2, Data data3, int i) {
        a5e.f underlyingAssetsState = (i & 1) != 0 ? hVar.f202908a : fVar;
        s4e.d aboutIssuerState = (i & 2) != 0 ? hVar.f202909b : dVar;
        t4e.d aboutNoteState = (i & 4) != 0 ? hVar.f202910c : dVar2;
        y4e.d payoutScenarioState = (i & 8) != 0 ? hVar.d : dVar3;
        h3h.d investmentsWidgetState = (i & 16) != 0 ? hVar.e : dVar4;
        x4e.d payoutChartState = (i & 32) != 0 ? hVar.f : dVar5;
        z4e.d performanceTracker = (i & 64) != 0 ? hVar.f202911g : dVar6;
        u4e.d annualReturnInsightsState = (i & 128) != 0 ? hVar.f202912h : dVar7;
        w4e.b noteStateWarningState = (i & 256) != 0 ? hVar.i : bVar;
        e3h.c cVar2 = (i & 512) != 0 ? hVar.f202913j : cVar;
        List list3 = (i & 1024) != 0 ? hVar.k : list;
        List corporateEventsItems = (i & 2048) != 0 ? hVar.f202914l : list2;
        Data data4 = (i & 4096) != 0 ? hVar.f202915m : data;
        Data data5 = (i & 8192) != 0 ? hVar.f202916n : data2;
        Data data6 = (i & 16384) != 0 ? hVar.o : data3;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(underlyingAssetsState, "underlyingAssetsState");
        Intrinsics.checkNotNullParameter(aboutIssuerState, "aboutIssuerState");
        Intrinsics.checkNotNullParameter(aboutNoteState, "aboutNoteState");
        Intrinsics.checkNotNullParameter(payoutScenarioState, "payoutScenarioState");
        Intrinsics.checkNotNullParameter(investmentsWidgetState, "investmentsWidgetState");
        Intrinsics.checkNotNullParameter(payoutChartState, "payoutChartState");
        Intrinsics.checkNotNullParameter(performanceTracker, "performanceTracker");
        Intrinsics.checkNotNullParameter(annualReturnInsightsState, "annualReturnInsightsState");
        Intrinsics.checkNotNullParameter(noteStateWarningState, "noteStateWarningState");
        Intrinsics.checkNotNullParameter(corporateEventsItems, "corporateEventsItems");
        return new h(underlyingAssetsState, aboutIssuerState, aboutNoteState, payoutScenarioState, investmentsWidgetState, payoutChartState, performanceTracker, annualReturnInsightsState, noteStateWarningState, cVar2, list3, corporateEventsItems, data4, data5, data6);
    }

    @Override // fsl.n
    public final Data J0() {
        return this.o;
    }

    @Override // fsl.n
    public final Data a() {
        return this.f202916n;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f202908a, hVar.f202908a) && Intrinsics.f(this.f202909b, hVar.f202909b) && Intrinsics.f(this.f202910c, hVar.f202910c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f202911g, hVar.f202911g) && Intrinsics.f(this.f202912h, hVar.f202912h) && Intrinsics.f(this.i, hVar.i) && Intrinsics.f(this.f202913j, hVar.f202913j) && Intrinsics.f(this.k, hVar.k) && Intrinsics.f(this.f202914l, hVar.f202914l) && Intrinsics.f(this.f202915m, hVar.f202915m) && Intrinsics.f(this.f202916n, hVar.f202916n) && Intrinsics.f(this.o, hVar.o);
    }

    public final int hashCode() {
        int iHashCode = (this.i.hashCode() + ((this.f202912h.hashCode() + ((this.f202911g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f202910c.hashCode() + ((this.f202909b.hashCode() + (this.f202908a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        e3h.c cVar = this.f202913j;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        List list = this.k;
        int iD = p.a.d((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f202914l);
        Data data = this.f202915m;
        int iHashCode3 = (iD + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.f202916n;
        int iHashCode4 = (iHashCode3 + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.o;
        return iHashCode4 + (data3 != null ? data3.hashCode() : 0);
    }

    public h(a5e.f underlyingAssetsState, s4e.d aboutIssuerState, t4e.d aboutNoteState, y4e.d payoutScenarioState, h3h.d investmentsWidgetState, x4e.d payoutChartState, z4e.d performanceTracker, u4e.d annualReturnInsightsState, w4e.b noteStateWarningState, e3h.c cVar, List list, List corporateEventsItems, Data data, Data data2, Data data3) {
        Intrinsics.checkNotNullParameter(underlyingAssetsState, "underlyingAssetsState");
        Intrinsics.checkNotNullParameter(aboutIssuerState, "aboutIssuerState");
        Intrinsics.checkNotNullParameter(aboutNoteState, "aboutNoteState");
        Intrinsics.checkNotNullParameter(payoutScenarioState, "payoutScenarioState");
        Intrinsics.checkNotNullParameter(investmentsWidgetState, "investmentsWidgetState");
        Intrinsics.checkNotNullParameter(payoutChartState, "payoutChartState");
        Intrinsics.checkNotNullParameter(performanceTracker, "performanceTracker");
        Intrinsics.checkNotNullParameter(annualReturnInsightsState, "annualReturnInsightsState");
        Intrinsics.checkNotNullParameter(noteStateWarningState, "noteStateWarningState");
        Intrinsics.checkNotNullParameter(corporateEventsItems, "corporateEventsItems");
        this.f202908a = underlyingAssetsState;
        this.f202909b = aboutIssuerState;
        this.f202910c = aboutNoteState;
        this.d = payoutScenarioState;
        this.e = investmentsWidgetState;
        this.f = payoutChartState;
        this.f202911g = performanceTracker;
        this.f202912h = annualReturnInsightsState;
        this.i = noteStateWarningState;
        this.f202913j = cVar;
        this.k = list;
        this.f202914l = corporateEventsItems;
        this.f202915m = data;
        this.f202916n = data2;
        this.o = data3;
    }

    public h(a5e.f fVar, s4e.d dVar, t4e.d dVar2, y4e.d dVar3, h3h.d dVar4, x4e.d dVar5, z4e.d dVar6, u4e.d dVar7, w4e.b bVar, e3h.c cVar, int i) {
        this((i & 1) != 0 ? new a5e.f(null, null) : fVar, (i & 2) != 0 ? new s4e.d(null) : dVar, (i & 4) != 0 ? new t4e.d(null, null) : dVar2, (i & 8) != 0 ? new y4e.d(null) : dVar3, (i & 16) != 0 ? new h3h.d(null) : dVar4, (i & 32) != 0 ? new x4e.d(null, null, null) : dVar5, (i & 64) != 0 ? new z4e.d(null) : dVar6, (i & 128) != 0 ? new u4e.d(null, null, null) : dVar7, (i & 256) != 0 ? new w4e.b(null, null) : bVar, (i & 512) != 0 ? null : cVar, null, f0.f322471a, null, null, null);
    }
}
