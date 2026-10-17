package m39;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.lifestyle_feed.api.R$string;
import com.revolut.feature.lifestyle_feed.api.models.LifestyleWidgetContext;
import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.tracking.v3.RevPointsGenericWidgetContext;
import dsh.j;
import dsh.r;
import eub.i;
import fub.k;
import grl.t9;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nyb.m0;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vkm.q;
import vkm.v1;
import vkm.y;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements csh.e {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eub.a f202303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m0 f202304c;
    public final k d;
    public final nhf.a e;
    public final i f;

    public f(eub.a revPointsAvailabilityInteractor, m0 revPointsTransactionsInteractor, k revPointsTransactionItemsMapper, nhf.a unitedWalletInteractor, i revPointsOptInInInteractor) {
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsTransactionsInteractor, "revPointsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(revPointsTransactionItemsMapper, "revPointsTransactionItemsMapper");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(revPointsOptInInInteractor, "revPointsOptInInInteractor");
        this.f202303b = revPointsAvailabilityInteractor;
        this.f202304c = revPointsTransactionsInteractor;
        this.d = revPointsTransactionItemsMapper;
        this.e = unitedWalletInteractor;
        this.f = revPointsOptInInInteractor;
    }

    @Override // csh.e
    public final List a(String widgetType, dsh.e inputConfig) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        return u.c(r.a.a(r.Companion, inputConfig, null, "1", 6));
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return Boolean.valueOf(((nyb.b) this.f202303b).f());
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        w0 w0VarE = kii.e.e(RevPointsGenericWidgetContext.newBuilder(), t9.LOADING, AnalyticsContext.INSTANCE);
        RowsWidgetDelegate.Model.Companion companion = RowsWidgetDelegate.Model.INSTANCE;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.lifestyle_widgets_transactions_title, null, null, 14);
        r.Companion.getClass();
        return RowsWidgetDelegate.Model.Companion.b(companion, id10, textLocalisedClause, 2, new AnalyticsContext(w0VarE), 8);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return i(eVar);
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return q.x(j(str, eVar), fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        LifestyleWidgetContext widgetContext2 = (LifestyleWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return new v1(new e(this, widgetType, id10, config, null));
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((LifestyleWidgetContext) widgetContext, str, eVar);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof m39.c
            if (r0 == 0) goto L13
            r0 = r5
            m39.c r0 = (m39.c) r0
            int r1 = r0.f202299w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f202299w = r1
            goto L18
        L13:
            m39.c r0 = new m39.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f202299w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            eub.i r5 = r4.f
            efm.d0 r5 = eub.i.b(r5)
            r0.f202299w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            m1c.r0 r5 = (m1c.r0) r5
            m1c.x0 r5 = r5.f201447a
            m1c.x0 r0 = m1c.x0.OPTED_IN
            if (r5 != r0) goto L4a
            goto L4b
        L4a:
            r3 = 0
        L4b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m39.f.i(gim.c):java.lang.Object");
    }

    public final y j(String str, dsh.e eVar) {
        r.Companion.getClass();
        efm.r map = w.l(m70.a.g(this.f202304c.c(new RevPointsTransactionPageParams(r.a.b(eVar, 1), null, null, null, null, null, null, null, null, 510)), null, new lxi.g(23), 1), ((njf.j) this.e).f()).map(new m30.b(7, new lul.d(this, str, 18)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.d(new y(new d(this, null), rd0.e.b(map)), h0.f322473a);
    }
}
