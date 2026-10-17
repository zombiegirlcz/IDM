package t28;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.g3;
import com.revolut.core.ui_kit.delegates.widgets.i3;
import com.revolut.core.ui_kit.delegates.widgets.j3;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import hd.r;
import ish.a0;
import k7i.i;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import pfm.m;
import sgm.e3;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f267455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f267456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final csh.f f267457c;
    public final Class d;

    public f(r factory, ln.a navigationCommandsDispatcher, a0 widgetsUiInteractor, a38.a aVar) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        i router = new i((e3) factory.f151366c, navigationCommandsDispatcher);
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        this.f267455a = router;
        this.f267456b = widgetsUiInteractor;
        this.f267457c = aVar;
        this.d = InvestWidgetContext.class;
    }

    @Override // csh.f
    public final Class j() {
        return this.d;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        efm.b bVarW;
        InvestWidgetContext widgetContext2 = (InvestWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof i3;
        i iVar = this.f267455a;
        m mVar = m.f235744a;
        aVar = null;
        aVar = null;
        s0h.a aVar = null;
        if (z) {
            Object obj2 = ((i3) event).f55382c.u;
            v28.d dVar = obj2 instanceof v28.d ? (v28.d) obj2 : null;
            if (dVar != null) {
                return iVar.q(dVar.f285682b);
            }
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        if (event instanceof com.revolut.core.ui_kit.delegates.widgets.e) {
            Object obj3 = ((com.revolut.core.ui_kit.delegates.widgets.e) event).f55333c.f53167l;
            j1h.a aVar2 = obj3 instanceof j1h.a ? (j1h.a) obj3 : null;
            if (aVar2 != null) {
                return iVar.q(aVar2.f170462a);
            }
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        if (event instanceof com.revolut.core.ui_kit.delegates.widgets.i) {
            BaseDraggableWidgetDelegate.Model model = ((com.revolut.core.ui_kit.delegates.widgets.i) event).f55375c;
            if (model instanceof GridWidgetDelegate.Model) {
                Object f = ((GridWidgetDelegate.Model) model).getF55191g();
                if (f instanceof s0h.a) {
                    aVar = (s0h.a) f;
                }
            } else if (model instanceof RowsWidgetDelegate.Model) {
                Object obj4 = ((RowsWidgetDelegate.Model) model).f55231n;
                if (obj4 instanceof s0h.a) {
                    aVar = (s0h.a) obj4;
                }
            }
            if (aVar != null) {
                return iVar.r(aVar);
            }
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        if (event instanceof g3) {
            Object obj5 = ((g3) event).f55360c;
            s0h.a aVar3 = obj5 instanceof s0h.a ? (s0h.a) obj5 : null;
            if (aVar3 != null) {
                return iVar.r(aVar3);
            }
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        if (event instanceof q0) {
            return new h(new r2d.e(this, 7, event, widgetContext2), 2);
        }
        if (!(event instanceof j3)) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        csh.f fVar = this.f267457c;
        if (fVar != null && (bVarW = fVar.w(widgetContext2, event)) != null) {
            return bVarW;
        }
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }
}
