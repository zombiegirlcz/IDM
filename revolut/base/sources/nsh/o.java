package nsh;

import androidx.collection.ArraySet;
import ard.c0;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.feature.widgets.impl.ui.flow.customisation.WidgetCustomisationFlow;
import com.revolut.feature.widgets.impl.ui.flow.customisation.WidgetCustomisationFlowContact$InputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import dsh.s;
import efm.r;
import ish.a0;
import ish.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import no.e0;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import tw0.l0;
import vkm.j2;
import vkm.q;
import vkm.q0;
import vkm.t0;
import vkm.v1;
import vkm.z1;
import yhm.m;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends ash.e implements ash.f {

    @NotNull
    private static final f Companion = new f();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ash.j f218887l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map f218888m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ash.i f218889n;
    public final a0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ish.h f218890p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Class f218891q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f218892r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final LinkedHashMap f218893s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f218894t;
    public volatile WidgetContext u;
    public final ArraySet v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j2 f218895w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z1 f218896x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a2 f218897y;

    public o(ash.j widgetsView, Map eventHandlers, ash.i widgetsInteractor, a0 widgetsUiInteractor, ish.h contentResolver, Class dependenciesClass, d widgetItemsDecorator) {
        Intrinsics.checkNotNullParameter(widgetsView, "widgetsView");
        Intrinsics.checkNotNullParameter(eventHandlers, "eventHandlers");
        Intrinsics.checkNotNullParameter(widgetsInteractor, "widgetsInteractor");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(dependenciesClass, "dependenciesClass");
        Intrinsics.checkNotNullParameter(widgetItemsDecorator, "widgetItemsDecorator");
        this.f218887l = widgetsView;
        this.f218888m = eventHandlers;
        this.f218889n = widgetsInteractor;
        this.o = widgetsUiInteractor;
        this.f218890p = contentResolver;
        this.f218891q = dependenciesClass;
        this.f218892r = widgetItemsDecorator;
        this.f218893s = new LinkedHashMap();
        this.v = new ArraySet(0, 1, null);
        this.f218895w = q.c(null);
        this.f218896x = ta6.a.a(0);
    }

    public static final void d3(o oVar, WidgetContext widgetContext, dsh.p pVar, dsh.j jVar) {
        ModalDestination.Style style;
        WidgetCustomisationFlow widgetCustomisationFlow = new WidgetCustomisationFlow(new WidgetCustomisationFlowContact$InputData(oVar.f218891q, widgetContext, pVar.f117336a, pVar.f117337b, pVar.f117338c));
        if (jVar == null || (style = jVar.f117328c) == null) {
            style = ModalDestination.Style.POPUP.f98311a;
        }
        yji.n.Q2(oVar, widgetCustomisationFlow, style, null, 2);
    }

    public static final WidgetContext e3(o oVar, BaseDraggableWidgetDelegate.a aVar) {
        BaseDraggableWidgetDelegate.Model model = aVar.f54989a;
        if (model != null && !model.getF55149l()) {
            return null;
        }
        Object obj2 = model != null ? model.f54988a : null;
        return oVar.g3(obj2 instanceof WidgetContext ? (WidgetContext) obj2 : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f3(nsh.o r12, com.revolut.feature.widgets.api.dependencies.WidgetContext r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nsh.o.f3(nsh.o, com.revolut.feature.widgets.api.dependencies.WidgetContext, gim.c):java.lang.Object");
    }

    @Override // yji.n
    public final void D2() {
        Iterator it8 = this.f218893s.values().iterator();
        while (it8.hasNext()) {
            ((csh.f) it8.next()).p(this);
        }
    }

    @Override // yji.n
    public final void E2() {
        Iterator it8 = this.f218893s.values().iterator();
        while (it8.hasNext()) {
            ((csh.f) it8.next()).a();
        }
    }

    @Override // yji.n
    public final void F2() {
        Iterator it8 = this.f218893s.values().iterator();
        while (it8.hasNext()) {
            ((csh.f) it8.next()).r();
        }
    }

    @Override // yji.n
    public final void H2() throws Throwable {
        r rVarEmpty;
        Iterator it8 = this.f218893s.values().iterator();
        while (it8.hasNext()) {
            ((csh.f) it8.next()).i();
        }
        ash.j jVar = this.f218887l;
        l0 p2 = jVar.getP();
        Continuation continuation = null;
        int i = 3;
        yji.n.l2(this, rd0.e.b(p2.g()), null, new i(this, null), 3);
        ArrayList arrayList = p2.f274840n;
        int i2 = 0;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                koi.k kVar = (koi.k) arrayList.get(i3);
                r map = kVar instanceof SmallActionButtonDelegate ? ((SmallActionButtonDelegate) kVar).f53336c.f121375b.map(new ts5.o(14, new tsk.j(19))) : null;
                if (map != null) {
                    arrayList2.add(map);
                }
            }
            rVarEmpty = r.merge(arrayList2);
            Intrinsics.checkNotNullExpressionValue(rVarEmpty, "merge(...)");
        } else {
            try {
                m.Companion companion = yhm.m.INSTANCE;
                throw new IllegalStateException("delegates are not initialised, probably setup method was not called");
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = yhm.m.INSTANCE;
                Throwable thA = yhm.m.a(yhm.o.a(th10));
                if (thA != null) {
                    hx7.e.n(thA);
                }
                rVarEmpty = r.empty();
                Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
            }
        }
        yji.n.l2(this, rd0.e.b(rVarEmpty), null, new j(this, continuation, i2), 3);
        int i5 = 1;
        yji.n.l2(this, rd0.e.b(p2.f274832a), null, new h(this, continuation, i5), 3);
        yji.n.l2(this, rd0.e.b(p2.f274833b), null, new h(this, continuation, 2), 3);
        a0 a0Var = this.o;
        yji.n.l2(this, a0Var.f168253b, null, new j(this, continuation, i5), 3);
        yji.n.l2(this, a0Var.f168254c, null, new n8a.r(this, continuation, 23), 3);
        if (this.f218894t) {
            yji.n.l2(this, rd0.e.b(jVar.t0()), null, new h(this, continuation, i2), 3);
        }
        yji.n.l2(this, q.q(new t0(q.Q(this.f218896x, new ns9.h(continuation, this, i5)), 1)), null, new h(this, continuation, i), 3);
        this.v.clear();
    }

    @Override // ash.e
    public final void Z2(WidgetContext widgetContext, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        a aVar = new a(widgetContext, widgetType, eVar);
        j2 j2Var = this.f218895w;
        j2Var.getClass();
        j2Var.g(null, aVar);
    }

    @Override // ash.e
    public final void b3(WidgetContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (((z) this.f218889n).k(context)) {
            return;
        }
        ViewController viewControllerO2 = o2(new esh.b(this.f218891q, context, esh.a.RETURN_IN_RESULT));
        e0 block = new e0(this, context, 12);
        Intrinsics.checkNotNullParameter(block, "block");
        viewControllerO2.H = block;
        yji.n.P2(this, viewControllerO2, ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a, null, 2);
    }

    @Override // ash.e
    public final c0 c3(WidgetContext widgetContext, s widgetItemsDecoration) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(widgetItemsDecoration, "widgetItemsDecoration");
        if (this.v.add(widgetContext.getContextKey())) {
            ((z) this.f218889n).j(widgetContext);
        }
        this.u = widgetContext;
        z zVar = (z) this.f218889n;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Continuation continuation = null;
        return new c0(new q0(new v1(new i4g.d(zVar, widgetContext, continuation, 8)), new j(this, continuation, 2), 1), this, widgetContext, widgetItemsDecoration, 16);
    }

    public final WidgetContext g3(WidgetContext widgetContext) {
        if (widgetContext == null) {
            r6.b.r("WidgetContext value is expected in ModelExt");
        }
        return widgetContext == null ? this.u : widgetContext;
    }
}
