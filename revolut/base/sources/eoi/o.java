package eoi;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import com.revolut.performance_analytics_ui.R$id;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import no.d2;
import org.jetbrains.annotations.NotNull;
import uo.q0;
import yp0.c0;
import yp0.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class o extends fsi.c {
    public foi.o A;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Activity f127956h;
    public final aoi.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final poi.b f127957j;
    public final c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u f127958l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d2 f127959m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f127960n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public WeakReference f127961p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p f127962q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public aoi.h f127963r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public aoi.h f127964s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f127965t;
    public uo.b u;
    public q0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b0 f127966w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public k f127967x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final foi.b f127968y;
    public e z;

    @NotNull
    public static final m Companion = new m();
    public static final Lazy B = yhm.j.b(new af0.a(9));

    public o(Activity activity, aoi.c performanceAnalyticsInteractor, poi.b analyticsApi, d2 screenPerformanceTracker) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(performanceAnalyticsInteractor, "performanceAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(screenPerformanceTracker, "screenPerformanceTracker");
        u screenNameProvider = new u(analyticsApi.j());
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(performanceAnalyticsInteractor, "performanceAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        c sessionMetricsAggregator = c.f127919a;
        Intrinsics.checkNotNullParameter(sessionMetricsAggregator, "sessionMetricsAggregator");
        Intrinsics.checkNotNullParameter(screenNameProvider, "screenNameProvider");
        Intrinsics.checkNotNullParameter(screenPerformanceTracker, "screenPerformanceTracker");
        super(new fsi.b("SHIMMER_ANALYTICS_DELEGATE_ID"));
        this.f127956h = activity;
        this.i = performanceAnalyticsInteractor;
        this.f127957j = analyticsApi;
        this.k = sessionMetricsAggregator;
        this.f127958l = screenNameProvider;
        this.f127959m = screenPerformanceTracker;
        int i = R$id.internal_activity_screen_visit_history;
        d0 d0Var = d0.f315718a;
        c0 c0VarA = d0.a(activity);
        Object objA = c0VarA.a(i);
        if (objA == null) {
            objA = new foi.b();
            c0VarA.b(i, objA);
        }
        this.f127968y = (foi.b) objA;
    }

    public final h N() {
        k kVar = this.f127967x;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.r("frameRateTracker");
        throw null;
    }

    public final void O() {
        if (m.a(Companion)) {
            String str = "onCurrentScreenStopped: currentState=" + this.f127962q;
        }
        e eVar = this.z;
        if (eVar == null) {
            Intrinsics.r("firstDataFrameTracker");
            throw null;
        }
        WeakReference weakReference = this.f127961p;
        eVar.e(weakReference != null ? weakReference.get() : null);
        foi.o oVar = this.A;
        if (oVar == null) {
            Intrinsics.r("scrollFramesStateContributor");
            throw null;
        }
        oVar.a();
        p pVar = this.f127962q;
        int i = pVar == null ? -1 : n.f127955a[pVar.ordinal()];
        if (i != -1) {
            if (i == 1) {
                R();
            } else if (i == 2) {
                Q();
            } else if (i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.f127962q = null;
        this.f127961p = null;
        this.f127963r = null;
        this.f127964s = null;
    }

    public final void Q() {
        aoi.h hVar = this.f127964s;
        if (hVar == null) {
            return;
        }
        this.f127964s = null;
        if (m.a(Companion)) {
            String str = "stop empty trace: screen=" + hVar.getAttribute("screenName");
        }
        hVar.stop();
        if (hVar.getDuration() >= 0) {
            long duration = hVar.getDuration();
            this.k.getClass();
            c.f127923h++;
            c.i += duration;
        }
    }

    public final void R() {
        aoi.h hVar = this.f127963r;
        if (hVar == null) {
            return;
        }
        this.f127963r = null;
        if (m.a(Companion)) {
            String str = "stop shimmer trace: screen=" + hVar.getAttribute("screenName");
        }
        hVar.stop();
        if (hVar.getDuration() >= 0) {
            long duration = hVar.getDuration();
            this.k.getClass();
            c.d++;
            c.e += duration;
        }
    }

    public final void V() {
        if (!this.f127965t) {
            if (m.a(Companion)) {
                String str = "traversal: skipped – activity[" + this.f127956h + "] not resumed";
                return;
            }
            return;
        }
        if (this.o) {
            if (m.a(Companion)) {
                return;
            } else {
                return;
            }
        }
        this.o = true;
        m mVar = Companion;
        if (m.a(mVar)) {
            long jNanoTime = System.nanoTime();
            W();
            long jNanoTime2 = System.nanoTime() - jNanoTime;
            if (m.a(mVar)) {
                String str2 = "traverseViews in  " + (jNanoTime2 / 1000000.0f) + " ms";
            }
        } else {
            W();
        }
        this.o = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017c, code lost:
    
        if ((r2 instanceof com.revolut.kompot.navigable.a) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x017e, code lost:
    
        r4 = (com.revolut.kompot.navigable.a) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0182, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0183, code lost:
    
        if (r4 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0185, code lost:
    
        r3.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0188, code lost:
    
        r3 = r15.z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x018a, code lost:
    
        if (r3 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x018c, code lost:
    
        r3.c(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x018f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0190, code lost:
    
        kotlin.jvm.internal.Intrinsics.r("firstDataFrameTracker");
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0193, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0196, code lost:
    
        if ((r2 instanceof com.revolut.kompot.navigable.a) == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0198, code lost:
    
        r4 = (com.revolut.kompot.navigable.a) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x019c, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x019d, code lost:
    
        if (r4 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x019f, code lost:
    
        r3.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01a2, code lost:
    
        r3 = r15.z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01a4, code lost:
    
        if (r3 == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01a6, code lost:
    
        r3.c(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01a9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01aa, code lost:
    
        kotlin.jvm.internal.Intrinsics.r("firstDataFrameTracker");
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01ad, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01ae, code lost:
    
        r1 = r4.e("SCREEN_INITIAL_LOADING");
        r1.a("screenName", r13);
        r1.a("analyticsScreenName", r12.a(r2));
        r1.start();
        r15.f127964s = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01c3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01c4, code lost:
    
        r1 = r4.e("FULL_SCREEN_SHIMMER_VISIBLE");
        r1.a("screenName", r13);
        r1.a("analyticsScreenName", r12.a(r2));
        r1.start();
        r15.f127963r = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01d9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01da, code lost:
    
        kotlin.jvm.internal.Intrinsics.r("scrollFramesStateContributor");
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01df, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01e0, code lost:
    
        kotlin.jvm.internal.Intrinsics.r("screenNameFinder");
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01e3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
    
        if (r4 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0089, code lost:
    
        if (eoi.m.a(eoi.o.Companion) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008e, code lost:
    
        X(null, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0092, code lost:
    
        r2 = r15.v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0094, code lost:
    
        if (r2 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0096, code lost:
    
        r2 = r2.d(r4.a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009e, code lost:
    
        if (r2 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a6, code lost:
    
        if (eoi.m.a(eoi.o.Companion) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ab, code lost:
    
        X(null, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ae, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00af, code lost:
    
        X(r2, r3);
        r3 = r15.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b4, code lost:
    
        if (r3 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b6, code lost:
    
        r3.b(r4.a());
        r3 = r4.b();
        r4 = eoi.n.f127955a;
        r3 = r4[r3.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cd, code lost:
    
        if (r3 == 1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cf, code lost:
    
        if (r3 == 2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d1, code lost:
    
        if (r3 == 3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d3, code lost:
    
        if (r3 != 4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d5, code lost:
    
        r3 = r15.f127962q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d9, code lost:
    
        if (r3 != eoi.p.FULL_DATA) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00dc, code lost:
    
        r3 = eoi.p.DATA;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e4, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e5, code lost:
    
        r3 = eoi.p.FULL_DATA;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e8, code lost:
    
        r3 = r15.f127962q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ec, code lost:
    
        if (r3 != eoi.p.ALL_SHIMMERS) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ef, code lost:
    
        r3 = eoi.p.EMPTY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f2, code lost:
    
        r3 = r15.f127962q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f6, code lost:
    
        if (r3 != eoi.p.EMPTY) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f9, code lost:
    
        r3 = eoi.p.ALL_SHIMMERS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fb, code lost:
    
        r10 = eoi.o.Companion;
        r11 = eoi.m.a(r10);
        r12 = r15.f127958l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0103, code lost:
    
        if (r11 == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0105, code lost:
    
        r0 = "traversal: screen=" + r12.b(r2) + ", state=" + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0120, code lost:
    
        r11 = r15.f127962q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0122, code lost:
    
        if (r3 == r11) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0124, code lost:
    
        r15.f127962q = r3;
        r13 = r12.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x012e, code lost:
    
        if (eoi.m.a(r10) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0130, code lost:
    
        r0 = "state has changed: screen=" + r13 + ", " + r11 + " -> " + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0151, code lost:
    
        if (r11 != eoi.p.ALL_SHIMMERS) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0153, code lost:
    
        R();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0159, code lost:
    
        if (r11 != eoi.p.EMPTY) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x015b, code lost:
    
        Q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x015e, code lost:
    
        if (r3 != null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0161, code lost:
    
        r6 = r4[r3.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0167, code lost:
    
        r4 = r15.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x016d, code lost:
    
        if (r6 == 1) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016f, code lost:
    
        if (r6 == 2) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0171, code lost:
    
        r3 = r15.f127959m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0175, code lost:
    
        if (r6 == 3) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0177, code lost:
    
        if (r6 == 4) goto L99;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W() {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eoi.o.W():void");
    }

    public final void X(Object obj2, Object obj3) {
        if (obj2 != null) {
            WeakReference weakReference = this.f127961p;
            if (obj2 == (weakReference != null ? weakReference.get() : null)) {
                ((k) N()).b(obj3);
                return;
            }
        }
        O();
        ((k) N()).b(obj3);
        if (obj2 != null) {
            this.f127961p = new WeakReference(obj2);
            foi.m mVarA = this.f127968y.a(obj2);
            e eVar = this.z;
            if (eVar != null) {
                eVar.d(mVarA);
            } else {
                Intrinsics.r("firstDataFrameTracker");
                throw null;
            }
        }
    }

    @Override // fsi.a
    public final void onCreate(Bundle bundle) {
        b0 b0Var = new b0(new androidx.lifecycle.b(this, 14));
        Intrinsics.checkNotNullParameter(b0Var, "<set-?>");
        this.f127966w = b0Var;
        k kVar = new k(this.f127956h, this.i, this.k, this.f127958l);
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        this.f127967x = kVar;
    }

    @Override // fsi.c, fsi.a
    public final void onDestroy() {
        super.onDestroy();
        if (this.f127960n) {
            O();
        }
    }

    @Override // fsi.c, fsi.a
    public final void onPause() {
        super.onPause();
        if (this.f127960n) {
            if (m.a(Companion)) {
                String str = "Activity[" + this.f127956h + "] pause";
            }
            this.f127965t = false;
            O();
            ((k) N()).a(false);
        }
    }

    @Override // fsi.a
    public final void onResume() {
        if (this.f127960n) {
            if (m.a(Companion)) {
                String str = "Activity[" + this.f127956h + "] resume";
            }
            this.f127965t = true;
            ((k) N()).a(true);
            V();
        }
    }

    @Override // fsi.a
    public final void onStart() {
        View viewFindViewById;
        if (this.f127960n) {
            return;
        }
        aoi.c cVar = this.i;
        if (!cVar.enabled() || (viewFindViewById = this.f127956h.findViewById(R.id.content)) == null) {
            return;
        }
        poi.b bVar = this.f127957j;
        this.u = bVar.b();
        this.v = bVar.j();
        this.z = new e(N(), cVar, this.f127958l, this.k);
        this.A = new foi.o(N());
        this.f127960n = true;
        ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: eoi.l
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    this.f127954a.V();
                }
            });
        }
    }
}
