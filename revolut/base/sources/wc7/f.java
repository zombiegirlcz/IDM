package wc7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.insurance_home.api.widget.models.InsuranceWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.j;
import e7l.g;
import ip0.c2;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kw7.h;
import vkm.q;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iw7.b f296356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f296357c;

    public f(iw7.b widgetInteractor, b itemMapper) {
        Intrinsics.checkNotNullParameter(widgetInteractor, "widgetInteractor");
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        this.f296356b = widgetInteractor;
        this.f296357c = itemMapper;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return i((gim.c) continuation);
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return ContactsWidgetDelegate.Model.Companion.b(ContactsWidgetDelegate.Model.INSTANCE, id10, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), c2.CIRCLE);
    }

    @Override // csh.e
    public final Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return i(eVar);
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        InsuranceWidgetContext insuranceWidgetContext = (InsuranceWidgetContext) widgetContext;
        if (eVar == null) {
            dsh.e.Companion.getClass();
            eVar = dsh.d.a();
        }
        return q.x(g(insuranceWidgetContext, str, str2, eVar), fVar);
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((InsuranceWidgetContext) widgetContext, str, eVar);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof wc7.c
            if (r0 == 0) goto L13
            r0 = r6
            wc7.c r0 = (wc7.c) r0
            int r1 = r0.f296351w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f296351w = r1
            goto L18
        L13:
            wc7.c r0 = new wc7.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f296351w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L6b
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            iw7.b r6 = r5.f296356b
            kw7.h r6 = (kw7.h) r6
            fk3.a r6 = r6.f190304a
            w4l.j r2 = w4l.j.f294644c
            ik3.c r6 = (ik3.c) r6
            e7l.g$a r4 = e7l.g.a.f123406a
            efm.r r6 = r6.l(r4, r2)
            vkm.d r6 = rd0.e.b(r6)
            kvg.j r2 = new kvg.j
            r4 = 12
            r2.<init>(r4)
            akg.n r6 = nim.a.v(r6, r2)
            w6h.f r2 = new w6h.f
            r4 = 28
            r2.<init>(r4)
            cxe.u r6 = nim.a.y(r6, r2)
            r2 = 3
            r4 = 0
            jhi.b r6 = mo3.a.g(r6, r4, r4, r2)
            r0.f296351w = r3
            java.lang.Object r6 = vkm.q.z(r6, r0)
            if (r6 != r1) goto L6b
            return r1
        L6b:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L74
            boolean r6 = r6.booleanValue()
            goto L75
        L74:
            r6 = 0
        L75:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wc7.f.i(gim.c):java.lang.Object");
    }

    @Override // csh.e
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final e g(InsuranceWidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        h hVar = (h) this.f296356b;
        fk3.a aVar = hVar.f190304a;
        return new e(boh.f.e(nim.a.v(rd0.e.b(((ik3.c) aVar).l(g.a.f123406a, w4l.j.f294644c)), new kvg.j(12)), new kv7.g(hVar, 6)), 0, this, id10);
    }
}
