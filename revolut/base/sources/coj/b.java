package coj;

import akg.n;
import ba4.x;
import c1g.o;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.feature.widgets.api.exception.WidgetNotAvailableException;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.api.widgets.EsimWidgetContext;
import dej.d4;
import dfj.f5;
import dfj.m;
import dsh.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nfj.w2;
import pej.a;
import vkm.y;
import w4l.i;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oej.a f25556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hej.a f25557c;
    public final cej.a d;

    public b(oej.a esimCoreInteractor, hej.a esimWidgetItemsProvider, cej.a esimFeatureAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(esimCoreInteractor, "esimCoreInteractor");
        Intrinsics.checkNotNullParameter(esimWidgetItemsProvider, "esimWidgetItemsProvider");
        Intrinsics.checkNotNullParameter(esimFeatureAvailabilityInteractor, "esimFeatureAvailabilityInteractor");
        this.f25556b = esimCoreInteractor;
        this.f25557c = esimWidgetItemsProvider;
        this.d = esimFeatureAvailabilityInteractor;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (!Intrinsics.f(str, "EsimHomeSmall") && !Intrinsics.f(str, "EsimHomeMedium")) {
            throw new IllegalStateException(j6.a.q("Unsupported widget type: ", str));
        }
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return Boolean.valueOf(((oej.b) this.f25556b).a().equals(a.C1306a.f235381a) && ((efj.c) this.d).a());
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String widgetId, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(widgetId, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        ioj.b bVar = (ioj.b) this.f25557c;
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        foj.d dVar = Intrinsics.f(widgetType, "EsimHomeMedium") ? bVar.f163338b : Intrinsics.f(widgetType, "EsimHomeSmall") ? bVar.f163337a : null;
        if (dVar != null) {
            return dVar.d(widgetId);
        }
        throw new WidgetNotAvailableException(j6.a.q("Unsupported widget type: ", widgetType), 2);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return i(str, str2, fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        EsimWidgetContext widgetContext2 = (EsimWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return mo3.a.g(boh.f.e(((efj.c) this.d).b(), new o(this, 18, id10, widgetType)), null, new clk.b(13), 1);
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((EsimWidgetContext) widgetContext, str, eVar);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r6, java.lang.String r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof coj.a
            if (r0 == 0) goto L13
            r0 = r8
            coj.a r0 = (coj.a) r0
            int r1 = r0.f25555y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25555y = r1
            goto L18
        L13:
            coj.a r0 = new coj.a
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f25553w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f25555y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r7 = r0.v
            java.lang.String r6 = r0.u
            yhm.o.b(r8)
            goto L4a
        L3a:
            yhm.o.b(r8)
            r0.u = r6
            r0.v = r7
            r0.f25555y = r4
            java.lang.Object r8 = r5.c(r7, r0)
            if (r8 != r1) goto L4a
            goto L6e
        L4a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L70
            kotlinx.coroutines.flow.Flow r6 = r5.j(r6, r7)
            clk.b r7 = new clk.b
            r8 = 14
            r7.<init>(r8)
            r8 = 0
            jhi.b r6 = mo3.a.g(r6, r8, r7, r4)
            r0.u = r8
            r0.v = r8
            r0.f25555y = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L6f
        L6e:
            return r1
        L6f:
            return r6
        L70:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Widget is unavailable"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: coj.b.i(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    public final Flow j(String widgetId, String widgetType) {
        Flow flowX;
        ioj.b bVar = (ioj.b) this.f25557c;
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Object obj2 = Intrinsics.f(widgetType, "EsimHomeMedium") ? bVar.f163338b : Intrinsics.f(widgetType, "EsimHomeSmall") ? bVar.f163337a : null;
        if (obj2 == null) {
            return ta6.a.j(new WidgetNotAvailableException(j6.a.q("Unsupported widget type: ", widgetType), 2));
        }
        f5 f5Var = bVar.d;
        d4 type = d4.HOME_SCREEN;
        f5Var.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        i loadingStrategy = i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        w2 w2Var = (w2) f5Var.f113970a;
        w2Var.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        vkm.d dVarB = w2Var.d.b(type, loadingStrategy);
        y yVarB = bVar.f163339c.b(i.f294643c);
        m mVar = (m) bVar.e;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        boolean zC = ((jte.d) mVar.f114035b).c(EsimApi$Toggles.EsimConnectEligibility.f100171c);
        eej.a aVar = eej.a.f125211a;
        if (zC) {
            nfj.j jVar = mVar.f114034a;
            jVar.getClass();
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            flowX = hb9.b.x(jVar.f214965c.b(Unit.f186387a, loadingStrategy), aVar);
        } else {
            flowX = new go.g(new Data(aVar, null, false, 6, null), 2);
        }
        n nVarV = nim.a.v(u0.i(dVarB, yVarB, flowX), new ijg.c(obj2, widgetId, 22));
        i1d.b block = new i1d.b(obj2, widgetId, 27);
        Intrinsics.checkNotNullParameter(nVarV, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return new x(nVarV, block, 7);
    }
}
