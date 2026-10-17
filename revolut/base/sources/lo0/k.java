package lo0;

import android.app.Dialog;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.revolut.analytics.tracking.ObfuscatedValueException;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.internal.views.TrackableEditText;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.CustomTrackableComponent;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import ho.e0;
import ho.t;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.d0;
import no.a1;
import no.e1;
import no.v2;
import no.y0;
import no.y1;
import no.z0;
import uo.d1;
import uo.o0;
import uo.q;
import uo.q0;
import uo.u;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class k implements py0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uo.b f197344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gpk.c f197345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f197346c;
    public final mo.c d;
    public final uo.l e;
    public final a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q0 f197347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f197348h;
    public final q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f197349j;
    public final d1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u f197350l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o f197351m;

    public k(uo.b activeScreenHolder, uo.j analyticsMetadataMapper, gpk.c coroutineScopeProvider, e0 disabledTrackingChecker, mo.c ownerProvider, uo.l productMapper, a resourceIdParser, q0 screenNameFinder, f searchEventHandler, q sectionFinder, t tracker, d1 viewAdapterDetailsFinder, u widgetFinder, o windowEventHandler) {
        Intrinsics.checkNotNullParameter(activeScreenHolder, "activeScreenHolder");
        Intrinsics.checkNotNullParameter(analyticsMetadataMapper, "analyticsMetadataMapper");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        Intrinsics.checkNotNullParameter(disabledTrackingChecker, "disabledTrackingChecker");
        Intrinsics.checkNotNullParameter(ownerProvider, "ownerProvider");
        Intrinsics.checkNotNullParameter(productMapper, "productMapper");
        Intrinsics.checkNotNullParameter(resourceIdParser, "resourceIdParser");
        Intrinsics.checkNotNullParameter(screenNameFinder, "screenNameFinder");
        Intrinsics.checkNotNullParameter(searchEventHandler, "searchEventHandler");
        Intrinsics.checkNotNullParameter(sectionFinder, "sectionFinder");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(viewAdapterDetailsFinder, "viewAdapterDetailsFinder");
        Intrinsics.checkNotNullParameter(widgetFinder, "widgetFinder");
        Intrinsics.checkNotNullParameter(windowEventHandler, "windowEventHandler");
        this.f197344a = activeScreenHolder;
        this.f197345b = coroutineScopeProvider;
        this.f197346c = disabledTrackingChecker;
        this.d = ownerProvider;
        this.e = productMapper;
        this.f = resourceIdParser;
        this.f197347g = screenNameFinder;
        this.f197348h = searchEventHandler;
        this.i = sectionFinder;
        this.f197349j = tracker;
        this.k = viewAdapterDetailsFinder;
        this.f197350l = widgetFinder;
        this.f197351m = windowEventHandler;
    }

    public static String k(TrackableItem trackableItem) {
        String name;
        if (trackableItem instanceof CustomTrackableComponent) {
            name = ((CustomTrackableComponent) trackableItem).f59775b.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        } else {
            name = trackableItem.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        }
        Regex regex = e1.f217762a;
        String strB0 = d0.B0(CoreConstants.DOLLAR, name, name);
        return e1.a(d0.g0(d0.g0(d0.g0(d0.w0(CoreConstants.DOT, strB0, strB0), "View"), "Layout"), "Delegate"));
    }

    public static void l(String str, boolean z, Object obj2) {
        ObfuscatedValueException.INSTANCE.getClass();
        if (ObfuscatedValueException.Companion.a(str)) {
            ObfuscatedValueException obfuscatedValueException = new ObfuscatedValueException("Obfuscated value: " + str + ", res=" + z + ", screen=" + (obj2 != null ? obj2.getClass().getCanonicalName() : null));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "UsersActionsHandler", null, obfuscatedValueException, h0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0161  */
    @Override // py0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r20, com.revolut.core.ui_kit_core.actionshandler.TrackableItem r21, py0.d r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lo0.k.a(android.view.View, com.revolut.core.ui_kit_core.actionshandler.TrackableItem, py0.d):void");
    }

    @Override // py0.f
    public final void b(View view, String contentHash) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(contentHash, "contentHash");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(contentHash, "contentHash");
        o oVar = this.f197351m;
        Object objA = oVar.a(view);
        if (objA == null) {
            return;
        }
        c cVar = (c) oVar.f197360j.get(objA);
        if (cVar == null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "WindowEventHandler", v0.a.g(objA, "Screen disappeared but no page state found for "), null, h0Var);
            return;
        }
        Intrinsics.checkNotNullParameter(contentHash, "contentHash");
        if (Intrinsics.f(cVar.f197329a, contentHash)) {
            b bVar = cVar.f197330b;
            b bVar2 = b.DETACHED;
            if (bVar == bVar2) {
                return;
            }
            cVar.f197330b = bVar2;
            ((y1) oVar.f197358g).b(objA);
        }
    }

    @Override // py0.f
    public final void c(Dialog dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        a1.Companion.getClass();
        y0 screen = new y0(z0.a(dialog));
        uo.b bVar = this.f197351m.f197355a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(screen, "screen");
        bVar.d(new uo.a(bVar, screen));
    }

    @Override // py0.f
    public final void d(View view, Clause clause, String windowTitleFallback, Object obj2, Object obj3) throws Throwable {
        Intrinsics.checkNotNullParameter(view, "rootView");
        Intrinsics.checkNotNullParameter(windowTitleFallback, "windowTitleFallback");
        Intrinsics.checkNotNullParameter(view, "rootView");
        Intrinsics.checkNotNullParameter(windowTitleFallback, "windowTitleFallback");
        a1.Companion.getClass();
        Intrinsics.checkNotNullParameter(view, "view");
        this.f197351m.b(new a1(String.valueOf(System.identityHashCode(view)), view, null), clause, windowTitleFallback, obj2, obj3);
    }

    @Override // py0.f
    public final void e(TrackableEditText view, String query) throws Throwable {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(query, "query");
        f fVar = this.f197348h;
        q0 q0Var = fVar.e;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(query, "query");
        if (fVar.f197335b.a(view)) {
            return;
        }
        Object objD = q0Var.d(view);
        if (objD == null) {
            objD = view.getContext();
        }
        Object obj2 = objD;
        AnalyticsProduct analyticsProductE = ((uo.o) fVar.d).e(obj2, null);
        Intrinsics.h(obj2);
        skm.e0.C(fVar.f197334a.c(), null, null, new e(fVar, obj2, q0Var.e(obj2), query, analyticsProductE, null), 3);
    }

    @Override // py0.f
    public final void f(CustomTrackableComponent item, py0.d dVar, Clause clause, String windowType) {
        String str;
        String strA;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(windowType, "windowType");
        String strJ = j(dVar);
        if (strJ == null) {
            strJ = null;
        }
        String strK = strJ == null ? k(item) : strJ;
        Object objC = this.f197344a.c();
        l(strK, strJ != null, objC);
        AnalyticsProduct analyticsProductE = ((uo.o) this.e).e(objC, null);
        o0 o0VarE = objC != null ? this.f197347g.e(objC) : null;
        a aVar = this.f;
        if (o0VarE != null && (strA = o0VarE.f281497b) != null) {
            str = strA;
        } else if (clause != null) {
            String strA2 = aVar.a(clause, false);
            str = strA2;
        } else {
            str = null;
        }
        if (o0VarE == null || (strA = o0VarE.f281496a) == null) {
            strA = clause != null ? aVar.a(clause, true) : null;
            if (strA == null) {
                strA = e1.a(windowType);
            }
        }
        skm.e0.C(this.f197345b.c(), null, null, new j(objC, null, item, this, strK, strA, null, analyticsProductE, null, str, null), 3);
    }

    @Override // py0.f
    public final void g(Dialog dialog, Clause clause, String windowTitleFallback, Object obj2, Object obj3) throws Throwable {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(windowTitleFallback, "windowTitleFallback");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(windowTitleFallback, "windowTitleFallback");
        a1.Companion.getClass();
        this.f197351m.b(z0.a(dialog), clause, windowTitleFallback, obj2, obj3);
    }

    @Override // py0.f
    public final void h(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "rootView");
        a1.Companion.getClass();
        Intrinsics.checkNotNullParameter(view, "view");
        y0 screen = new y0(new a1(String.valueOf(System.identityHashCode(view)), view, null));
        uo.b bVar = this.f197351m.f197355a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(screen, "screen");
        bVar.d(new uo.a(bVar, screen));
    }

    @Override // py0.f
    public final void i(View view, String contentHash) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(contentHash, "contentHash");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(contentHash, "contentHash");
        o oVar = this.f197351m;
        Object objA = oVar.a(view);
        if (objA == null) {
            return;
        }
        WeakHashMap weakHashMap = oVar.f197360j;
        Object cVar = weakHashMap.get(objA);
        if (cVar == null) {
            cVar = new c();
            weakHashMap.put(objA, cVar);
        }
        c cVar2 = (c) cVar;
        Intrinsics.checkNotNullParameter(contentHash, "contentHash");
        if (Intrinsics.f(cVar2.f197329a, contentHash) && cVar2.f197330b == b.ATTACHED) {
            return;
        }
        cVar2.f197329a = contentHash;
        cVar2.f197330b = b.ATTACHED;
        ((y1) oVar.f197358g).a(objA, v2.TRACK_REPEATED_ATTACHMENT);
    }

    public final String j(py0.d dVar) {
        boolean z = dVar instanceof py0.c;
        a aVar = this.f;
        if (z) {
            return aVar.a(((py0.c) dVar).f240642a, true);
        }
        if (dVar instanceof py0.b) {
            return aVar.b(((py0.b) dVar).f240641a);
        }
        if (dVar instanceof py0.a) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
