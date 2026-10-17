package k1c;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.api.widget.rim.RevPointsRimWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import cxe.u;
import dsh.j;
import dsh.r;
import j2c.o;
import jxb.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nyb.k;
import nyb.k0;
import vkm.q;
import vkm.v1;
import w4l.i;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f180206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f180207c;

    public b(k0 revPointsRimWidgetAvailabilityInteractor, g revPointsRimWidgetItemsProvider) {
        Intrinsics.checkNotNullParameter(revPointsRimWidgetAvailabilityInteractor, "revPointsRimWidgetAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsRimWidgetItemsProvider, "revPointsRimWidgetItemsProvider");
        this.f180206b = revPointsRimWidgetAvailabilityInteractor;
        this.f180207c = revPointsRimWidgetItemsProvider;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (!Intrinsics.f(str, "RevPointsRimMedium")) {
            throw new IllegalArgumentException(j6.a.q("Not supported widget type: ", str));
        }
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return Boolean.valueOf(((nyb.b) this.f180206b.f220805a).f());
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(id10, "id");
        RowsWidgetDelegate.Model.Companion companion = RowsWidgetDelegate.Model.INSTANCE;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.rev_points_challenge_v3_widget_title, null, null, 14);
        r.Companion.getClass();
        return RowsWidgetDelegate.Model.Companion.b(companion, id10, textLocalisedClause, 2, null, 24);
    }

    @Override // csh.e
    public final Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return this.f180206b.a((RevPointsRimWidgetContext) widgetContext, eVar);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return i((RevPointsRimWidgetContext) widgetContext, str, str2, fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        RevPointsRimWidgetContext widgetContext2 = (RevPointsRimWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return mo3.a.g(q.Q(new v1(new fc0.e(this, widgetType, widgetContext2, (Continuation) null)), new a67.c((Continuation) null, this, id10, widgetContext2, 25)), null, new jul.c(28), 1);
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((RevPointsRimWidgetContext) widgetContext, str, eVar);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(com.revolut.feature.rev_points.api.widget.rim.RevPointsRimWidgetContext r9, java.lang.String r10, java.lang.String r11, gim.c r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof k1c.a
            if (r0 == 0) goto L13
            r0 = r12
            k1c.a r0 = (k1c.a) r0
            int r1 = r0.f180205y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f180205y = r1
            goto L18
        L13:
            k1c.a r0 = new k1c.a
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.f180203w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f180205y
            r3 = 2
            r4 = 3
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3e
            if (r2 == r3) goto L36
            if (r2 != r4) goto L2e
            yhm.o.b(r12)
            return r12
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            java.lang.String r9 = r0.v
            com.revolut.feature.rev_points.api.widget.rim.RevPointsRimWidgetContext r10 = r0.u
            yhm.o.b(r12)
            goto L70
        L3e:
            java.lang.String r10 = r0.v
            com.revolut.feature.rev_points.api.widget.rim.RevPointsRimWidgetContext r9 = r0.u
            yhm.o.b(r12)
            goto L56
        L46:
            yhm.o.b(r12)
            r0.u = r9
            r0.v = r10
            r0.f180205y = r5
            java.lang.Object r12 = r8.c(r11, r0)
            if (r12 != r1) goto L56
            goto L93
        L56:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r11 = r12.booleanValue()
            if (r11 == 0) goto L95
            r0.u = r9
            r0.v = r10
            r0.f180205y = r3
            nyb.k0 r11 = r8.f180206b
            java.lang.Object r12 = r11.a(r9, r0)
            if (r12 != r1) goto L6d
            goto L93
        L6d:
            r7 = r10
            r10 = r9
            r9 = r7
        L70:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r11 = r12.booleanValue()
            if (r11 == 0) goto L95
            cxe.u r9 = r8.j(r9, r10)
            jul.c r10 = new jul.c
            r11 = 29
            r10.<init>(r11)
            jhi.b r9 = mo3.a.g(r9, r6, r10, r5)
            r0.u = r6
            r0.v = r6
            r0.f180205y = r4
            java.lang.Object r9 = vkm.q.x(r9, r0)
            if (r9 != r1) goto L94
        L93:
            return r1
        L94:
            return r9
        L95:
            com.revolut.feature.widgets.api.exception.WidgetNotAvailableException r9 = new com.revolut.feature.widgets.api.exception.WidgetNotAvailableException
            r9.<init>(r6, r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k1c.b.i(com.revolut.feature.rev_points.api.widget.rim.RevPointsRimWidgetContext, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    public final u j(String id10, RevPointsRimWidgetContext widgetContext) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        g gVar = this.f180207c;
        k kVar = gVar.f180212a;
        i loadingStrategy = i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l lVar = (l) kVar.f220804a;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.y(nim.a.v(rd0.e.b(lVar.f179130l.e(Unit.f186387a, loadingStrategy)), new o(gVar, 20, widgetContext, id10)), new jb8.a(17, id10, gVar));
    }
}
