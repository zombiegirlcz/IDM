package eoi;

import com.revolut.kompot.view.RootFrameLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mmm.h0;
import zhm.d0;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127930a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f127931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f127932c;
    public final Object d;
    public final Object e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f127933g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f127934h;
    public Object i;

    public e(h frameStatsTracker, aoi.c performanceAnalyticsInteractor, u screenNameProvider, c sessionMetricsAggregator) {
        Intrinsics.checkNotNullParameter(frameStatsTracker, "frameStatsTracker");
        Intrinsics.checkNotNullParameter(performanceAnalyticsInteractor, "performanceAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(screenNameProvider, "screenNameProvider");
        Intrinsics.checkNotNullParameter(sessionMetricsAggregator, "sessionMetricsAggregator");
        this.d = frameStatsTracker;
        this.e = performanceAnalyticsInteractor;
        this.f = screenNameProvider;
        this.f127933g = sessionMetricsAggregator;
    }

    public void a(com.revolut.kompot.navigable.a aVar) {
        gli.a aVar2;
        aoi.h hVar;
        aoi.h hVar2;
        gli.a aVar3;
        String strJ;
        d listener = (d) this.i;
        if (listener != null && aVar != null) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (!(aVar instanceof qji.c)) {
                dok.k kVar = aVar.C;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(listener, "listener");
                RootFrameLayout rootFrameLayout = (RootFrameLayout) kVar.f116587c;
                if (rootFrameLayout != null) {
                    Intrinsics.checkNotNullParameter(listener, "listener");
                    List list = rootFrameLayout.f98456b;
                    if (list != null) {
                        for (int iJ = zhm.v.j(list); -1 < iJ; iJ--) {
                            if (Intrinsics.f((d) list.get(iJ), listener)) {
                                list.remove(iJ);
                            }
                        }
                    }
                }
            }
        }
        h hVar3 = (h) this.d;
        foi.c key = foi.c.SCREEN_LOADING;
        Intrinsics.checkNotNullParameter(key, "key");
        j jVar = ((k) hVar3).e;
        if (jVar != null) {
            jVar.e(key);
        }
        aoi.h hVar4 = (aoi.h) this.f127934h;
        if (hVar4 != null) {
            if (aVar == null || (aVar instanceof qji.c)) {
                aVar2 = null;
            } else {
                long j2 = 0;
                long j3 = 0;
                hli.j jVarA = null;
                for (com.revolut.kompot.navigable.a aVar4 = aVar.f98405m; aVar4 != null; aVar4 = aVar4.f98405m) {
                    gli.b bVar = aVar4.E;
                    gli.b bVar2 = aVar4.D;
                    if (bVar2.b() != null || bVar.b() != null) {
                        break;
                    }
                    j2 += bVar2.c().f144705a;
                    j3 += bVar.c().f144705a;
                    if (jVarA == null) {
                        jVarA = (hli.j) aVar4.C.d;
                    }
                    bVar2.d();
                    bVar.d();
                }
                gli.c cVarC = aVar.D.c();
                gli.c cVarC2 = aVar.E.c();
                if (jVarA == null) {
                    jVarA = (hli.j) aVar.C.d;
                }
                if (jVarA == null) {
                    hli.j.Companion.getClass();
                    jVarA = hli.i.a();
                }
                aVar2 = new gli.a(new gli.c(cVarC.f144705a + j2, cVarC.f144706b), jVarA.f153477b.c(), jVarA.f153476a.c(), jVarA.f153478c.c(), new gli.c(cVarC2.f144705a + j3, cVarC2.f144706b));
            }
            if (aVar2 != null) {
                gli.c cVar = aVar2.f144699a;
                Intrinsics.checkNotNullParameter(aVar2, "<this>");
                gli.c cVar2 = aVar2.e;
                gli.c cVar3 = aVar2.d;
                gli.c cVar4 = aVar2.f144701c;
                gli.c cVar5 = aVar2.f144700b;
                if (cVar.f144706b && cVar5.f144706b && cVar4.f144706b && cVar3.f144706b && cVar2.f144706b) {
                    long jA = aVar2.a();
                    long j5 = 1000000;
                    long j16 = cVar.f144705a / j5;
                    long j22 = cVar5.f144705a / j5;
                    long j42 = cVar4.f144705a / j5;
                    hVar2 = hVar4;
                    long j46 = cVar3.f144705a / j5;
                    aVar3 = aVar2;
                    long j47 = cVar2.f144705a / j5;
                    StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(jA, "{\"total_ms\":", ",\"cr\":");
                    sbV.append(j16);
                    sbV.append(",\"la\":");
                    sbV.append(j22);
                    sbV.append(",\"me\":");
                    sbV.append(j42);
                    sbV.append(",\"dr\":");
                    sbV.append(j46);
                    sbV.append(",\"bi\":");
                    strJ = a0.d.j(j47, "}", sbV);
                } else {
                    hVar2 = hVar4;
                    aVar3 = aVar2;
                    strJ = null;
                }
                if (strJ != null) {
                    hVar = hVar2;
                    hVar.a("first_data_frame_ui_processing_info", strJ);
                    a aVar5 = (a) this.f127933g;
                    long jA2 = aVar3.a();
                    ((c) aVar5).getClass();
                    c.f127924j++;
                    c.k += jA2;
                } else {
                    hVar = hVar2;
                }
            } else {
                hVar = hVar4;
            }
            hVar.stop();
        }
        this.f127931b = false;
        this.f127932c = false;
        this.f127934h = null;
        this.i = null;
    }

    public Long b() {
        return (Long) this.e;
    }

    public void c(Object screen) {
        u uVar = (u) this.f;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (this.f127931b && ((d) this.i) == null) {
            if (!(screen instanceof com.revolut.kompot.navigable.a)) {
                a(null);
                return;
            }
            if (this.f127932c) {
                aoi.h hVarE = ((aoi.c) this.e).e("SCREEN_FIRST_DATA_FRAME_UI_PROCESSING");
                hVarE.a("screenName", uVar.b(screen));
                hVarE.a("analyticsScreenName", uVar.a(screen));
                hVarE.start();
                this.f127934h = hVarE;
            }
            d listener = new d(this, screen);
            this.i = listener;
            com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) screen;
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (!(aVar instanceof qji.c)) {
                dok.k kVar = aVar.C;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(listener, "listener");
                RootFrameLayout rootFrameLayout = (RootFrameLayout) kVar.f116587c;
                if (rootFrameLayout != null) {
                    Intrinsics.checkNotNullParameter(listener, "listener");
                    List arrayList = rootFrameLayout.f98456b;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    if (rootFrameLayout.f98456b == null) {
                        rootFrameLayout.f98456b = arrayList;
                    } else if (arrayList.contains(listener)) {
                        return;
                    }
                    arrayList.add(listener);
                    return;
                }
            }
            a(null);
        }
    }

    public void d(foi.m visit) {
        Intrinsics.checkNotNullParameter(visit, "visit");
        if (visit.equals(foi.k.f137000a)) {
            foi.d state = foi.d.f136991a;
            this.f127931b = true;
            this.f127932c = true;
            k kVar = (k) ((h) this.d);
            Intrinsics.checkNotNullParameter(state, "state");
            j jVar = kVar.e;
            if (jVar != null) {
                jVar.d(state);
                return;
            }
            return;
        }
        if (!(visit instanceof foi.l)) {
            throw new NoWhenBranchMatchedException();
        }
        if (((foi.l) visit).f137001a) {
            foi.e state2 = foi.e.f136992a;
            this.f127931b = true;
            this.f127932c = false;
            k kVar2 = (k) ((h) this.d);
            Intrinsics.checkNotNullParameter(state2, "state");
            j jVar2 = kVar2.e;
            if (jVar2 != null) {
                jVar2.d(state2);
            }
        }
    }

    public void e(Object obj2) {
        a(obj2 instanceof com.revolut.kompot.navigable.a ? (com.revolut.kompot.navigable.a) obj2 : null);
    }

    public String toString() {
        switch (this.f127930a) {
            case 1:
                Map map = (Map) this.i;
                Long l2 = (Long) this.f127934h;
                Long l3 = (Long) this.f127933g;
                Long l4 = (Long) this.f;
                Long l5 = (Long) this.e;
                ArrayList arrayList = new ArrayList();
                if (this.f127931b) {
                    arrayList.add("isRegularFile");
                }
                if (this.f127932c) {
                    arrayList.add("isDirectory");
                }
                if (l5 != null) {
                    arrayList.add("byteCount=" + l5.longValue());
                }
                if (l4 != null) {
                    arrayList.add("createdAt=" + l4.longValue());
                }
                if (l3 != null) {
                    arrayList.add("lastModifiedAt=" + l3.longValue());
                }
                if (l2 != null) {
                    arrayList.add("lastAccessedAt=" + l2.longValue());
                }
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return d0.k0(arrayList, ", ", "FileMetadata(", ")", 0, null, 56);
            default:
                return super.toString();
        }
    }

    public e(boolean z, boolean z3, h0 h0Var, Long l2, Long l3, Long l4, Long l5, Map extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f127931b = z;
        this.f127932c = z3;
        this.d = h0Var;
        this.e = l2;
        this.f = l3;
        this.f127933g = l4;
        this.f127934h = l5;
        this.i = r0.u(extras);
    }

    public /* synthetic */ e(boolean z, boolean z3, h0 h0Var, Long l2, Long l3, Long l4, Long l5) {
        this(z, z3, h0Var, l2, l3, l4, l5, r0.g());
    }
}
