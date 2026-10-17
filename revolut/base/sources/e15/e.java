package e15;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TileLoadingWidgetDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.credit.health.api.widget.CreditHealthWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.j;
import e07.k;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import vkm.y;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r05.e f121882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r05.g f121883c;

    public e(r05.e creditScoreEntryPointInteractor, r05.g creditScoreInteractor, g mapper) {
        Intrinsics.checkNotNullParameter(creditScoreEntryPointInteractor, "creditScoreEntryPointInteractor");
        Intrinsics.checkNotNullParameter(creditScoreInteractor, "creditScoreInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f121882b = creditScoreEntryPointInteractor;
        this.f121883c = creditScoreInteractor;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String widgetId, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(widgetId, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        return new TileLoadingWidgetDelegate.Model(4, new TextClause("RevScore", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), widgetId);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return i(eVar);
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return q.x(j(str), fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        CreditHealthWidgetContext widgetContext2 = (CreditHealthWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return j(id10);
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((CreditHealthWidgetContext) widgetContext, str, eVar);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof e15.b
            if (r0 == 0) goto L13
            r0 = r8
            e15.b r0 = (e15.b) r0
            int r1 = r0.f121878w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f121878w = r1
            goto L18
        L13:
            e15.b r0 = new e15.b
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f121878w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L5b
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            yhm.o.b(r8)
            r05.e r8 = r7.f121882b
            wkm.l r8 = r8.a()
            e07.k r2 = new e07.k
            r4 = 8
            r2.<init>(r4)
            r4 = 0
            jhi.b r8 = mo3.a.g(r8, r4, r2, r3)
            c9k.k r2 = new c9k.k
            r5 = 3
            r6 = 18
            r2.<init>(r5, r6, r4)
            zhm.h0 r4 = zhm.h0.f322473a
            vkm.y r8 = rd0.e.e(r8, r4, r2)
            r0.f121878w = r3
            java.lang.Object r8 = vkm.q.x(r8, r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            g05.d r8 = (g05.d) r8
            boolean r8 = r8 instanceof g05.a
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e15.e.i(gim.c):java.lang.Object");
    }

    public final y j(String str) {
        return rd0.e.e(new ahd.y(mo3.a.g(r05.g.a(this.f121883c), null, new k(7), 1), this, str, 20), h0.f322473a, new d(this, str, null));
    }
}
