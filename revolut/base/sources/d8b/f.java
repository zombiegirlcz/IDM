package d8b;

import c6b.n;
import c6b.p;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.retail.cobranded_cards.api.widgets.CobrandsWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import d7j.o0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import vkm.q0;
import vkm.v1;
import vkm.y;
import y5b.i0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t5b.a f112194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q5b.c f112195c;

    public f(t5b.a cobrandsWidgetItemsProvider, q5b.c cobrandsProductAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(cobrandsWidgetItemsProvider, "cobrandsWidgetItemsProvider");
        Intrinsics.checkNotNullParameter(cobrandsProductAvailabilityInteractor, "cobrandsProductAvailabilityInteractor");
        this.f112194b = cobrandsWidgetItemsProvider;
        this.f112195c = cobrandsProductAvailabilityInteractor;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (!Intrinsics.f(str, "CobrandsSmall") && !Intrinsics.f(str, "CobrandsMedium")) {
            throw new IllegalStateException(j6.a.q("Unhandled widget type: ", str));
        }
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return ((p) this.f112195c).b((gim.c) continuation);
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String widgetId, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(widgetId, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        k kVar = (k) this.f112194b;
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return k.a(widgetType, new h(kVar, widgetId, 0), new h(kVar, widgetId, 1));
    }

    @Override // csh.e
    public final Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return ((p) this.f112195c).b(eVar);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return i(str, str2, fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        CobrandsWidgetContext widgetContext2 = (CobrandsWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return new v1(new e(this, widgetType, id10, null));
    }

    @Override // csh.e
    public final /* bridge */ dsh.j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((CobrandsWidgetContext) widgetContext, str, eVar);
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
            boolean r0 = r8 instanceof d8b.d
            if (r0 == 0) goto L13
            r0 = r8
            d8b.d r0 = (d8b.d) r0
            int r1 = r0.f112190y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f112190y = r1
            goto L18
        L13:
            d8b.d r0 = new d8b.d
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f112188w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f112190y
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
            goto L4e
        L3a:
            yhm.o.b(r8)
            r0.u = r6
            r0.v = r7
            r0.f112190y = r4
            q5b.c r8 = r5.f112195c
            c6b.p r8 = (c6b.p) r8
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L4e
            goto L67
        L4e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r2 = 0
            if (r8 == 0) goto L69
            vkm.y r6 = r5.j(r6, r7)
            r0.u = r2
            r0.v = r2
            r0.f112190y = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L68
        L67:
            return r1
        L68:
            return r6
        L69:
            com.revolut.feature.widgets.api.exception.WidgetNotAvailableException r6 = new com.revolut.feature.widgets.api.exception.WidgetNotAvailableException
            r7 = 3
            r6.<init>(r2, r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d8b.f.i(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    public final y j(String widgetId, String widgetType) {
        k kVar = (k) this.f112194b;
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        n nVar = kVar.f112205a;
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        i0 i0Var = nVar.f21770a;
        i0Var.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.e(q.H(new i(kVar, widgetId, widgetType, null), mo3.a.g(new q0(i0Var.d.b(Unit.f186387a, loadingStrategy), new btk.j(nVar, null, 26), 1), null, new o0(6), 1)), h0.f322473a, new j(kVar, widgetId, widgetType, null));
    }
}
