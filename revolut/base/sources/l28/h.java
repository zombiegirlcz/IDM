package l28;

import c2d.m0;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.wealth.resources.R$string;
import dsh.r;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import x8h.m;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements csh.e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n28.d f191710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f191711c;
    public final ugl.c d;
    public final m e;

    public h(n28.d availabilityProvider, j collectionsWidgetMapper, ugl.c screenerRedesignedInteractor, m etpProductAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(availabilityProvider, "availabilityProvider");
        Intrinsics.checkNotNullParameter(collectionsWidgetMapper, "collectionsWidgetMapper");
        Intrinsics.checkNotNullParameter(screenerRedesignedInteractor, "screenerRedesignedInteractor");
        Intrinsics.checkNotNullParameter(etpProductAvailabilityInteractor, "etpProductAvailabilityInteractor");
        this.f191710b = availabilityProvider;
        this.f191711c = collectionsWidgetMapper;
        this.d = screenerRedesignedInteractor;
        this.e = etpProductAvailabilityInteractor;
    }

    @Override // csh.e
    public final List a(String widgetType, dsh.e inputConfig) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        r.a aVar = r.Companion;
        aVar.getClass();
        return u.c(r.a.a(aVar, inputConfig, null, String.valueOf(r.a.b(inputConfig, 2)), 6));
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return this.f191710b.c((gim.c) continuation);
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return RowsWidgetDelegate.Model.Companion.b(RowsWidgetDelegate.Model.INSTANCE, id10, new TextLocalisedClause(R$string.wealth_invest_widget_collections_header_title, null, null, 14), 2, null, 24);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final /* bridge */ dsh.j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((InvestWidgetContext) widgetContext, str, eVar);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // csh.e
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.feature.invest_feed.api.models.InvestWidgetContext r6, java.lang.String r7, java.lang.String r8, dsh.e r9, kotlin.coroutines.Continuation r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof l28.c
            if (r0 == 0) goto L13
            r0 = r10
            l28.c r0 = (l28.c) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L1a
        L13:
            l28.c r0 = new l28.c
            gim.c r10 = (gim.c) r10
            r0.<init>(r5, r10)
        L1a:
            java.lang.Object r10 = r0.f191703y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r10)
            return r10
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.String r8 = r0.f191702x
            java.lang.String r7 = r0.f191701w
            com.revolut.feature.invest_feed.api.models.InvestWidgetContext r6 = r0.v
            l28.h r9 = r0.u
            yhm.o.b(r10)
            goto L5c
        L40:
            yhm.o.b(r10)
            if (r9 != 0) goto L5f
            r0.u = r5
            r0.v = r6
            r0.f191701w = r7
            r0.f191702x = r8
            r0.A = r4
            dsh.d r9 = dsh.e.Companion
            r9.getClass()
            dsh.e r10 = dsh.d.a()
            if (r10 != r1) goto L5b
            goto L7f
        L5b:
            r9 = r5
        L5c:
            dsh.e r10 = (dsh.e) r10
            goto L61
        L5f:
            r10 = r9
            r9 = r5
        L61:
            kotlinx.coroutines.flow.Flow r6 = r9.g(r6, r7, r8, r10)
            kkf.r6 r7 = new kkf.r6
            c2d.m0 r6 = (c2d.m0) r6
            r8 = 11
            r7.<init>(r6, r8)
            r6 = 0
            r0.u = r6
            r0.v = r6
            r0.f191701w = r6
            r0.f191702x = r6
            r0.A = r3
            java.lang.Object r6 = vkm.q.x(r7, r0)
            if (r6 != r1) goto L80
        L7f:
            return r1
        L80:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l28.h.f(com.revolut.feature.invest_feed.api.models.InvestWidgetContext, java.lang.String, java.lang.String, dsh.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // csh.e
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final Flow g(InvestWidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        r.Companion.getClass();
        return new m0(u0.m(((yhl.f) this.d).c(w4l.h.f294642c), nim.a.A(this.e.b(), new l0g.a(25))), this, id10, r.a.b(config, 2), 3);
    }
}
