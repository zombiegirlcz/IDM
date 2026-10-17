package cdh;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.widgets.AvatarGridWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.feature.wealth.api.widget.WealthWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import op0.c2;
import vkm.q;
import vkm.v1;
import xzg.n0;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0h.f f23258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b9k.f f23259c;
    public final c d;
    public final n e;

    public j(w0h.f widgetDataProvider, b9k.f topMoversPresentationModel, c topMoversWidgetContentMapper, n topMoversWidgetSelectionCache) {
        Intrinsics.checkNotNullParameter(widgetDataProvider, "widgetDataProvider");
        Intrinsics.checkNotNullParameter(topMoversPresentationModel, "topMoversPresentationModel");
        Intrinsics.checkNotNullParameter(topMoversWidgetContentMapper, "topMoversWidgetContentMapper");
        Intrinsics.checkNotNullParameter(topMoversWidgetSelectionCache, "topMoversWidgetSelectionCache");
        this.f23258b = widgetDataProvider;
        this.f23259c = topMoversPresentationModel;
        this.d = topMoversWidgetContentMapper;
        this.e = topMoversWidgetSelectionCache;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return this.f23258b.d((gim.c) continuation);
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return j(id10, widgetType, null);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final /* bridge */ dsh.j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((WealthWidgetContext) widgetContext, str, eVar);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // csh.e
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.feature.wealth.api.widget.WealthWidgetContext r6, java.lang.String r7, java.lang.String r8, dsh.e r9, gim.c r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof cdh.d
            if (r0 == 0) goto L13
            r0 = r10
            cdh.d r0 = (cdh.d) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            cdh.d r0 = new cdh.d
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.f23246y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L3e
            if (r2 == r3) goto L32
            if (r2 != r4) goto L2a
            yhm.o.b(r10)
            return r10
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r8 = r0.f23245x
            java.lang.String r7 = r0.f23244w
            com.revolut.feature.wealth.api.widget.WealthWidgetContext r6 = r0.v
            cdh.j r9 = r0.u
            yhm.o.b(r10)
            goto L5a
        L3e:
            yhm.o.b(r10)
            if (r9 != 0) goto L5d
            r0.u = r5
            r0.v = r6
            r0.f23244w = r7
            r0.f23245x = r8
            r0.A = r3
            dsh.d r9 = dsh.e.Companion
            r9.getClass()
            dsh.e r10 = dsh.d.a()
            if (r10 != r1) goto L59
            goto L79
        L59:
            r9 = r5
        L5a:
            dsh.e r10 = (dsh.e) r10
            goto L5f
        L5d:
            r10 = r9
            r9 = r5
        L5f:
            wkm.l r6 = r9.g(r6, r7, r8, r10)
            cdh.e r7 = new cdh.e
            r8 = 0
            r7.<init>(r4, r8)
            r0.u = r8
            r0.v = r8
            r0.f23244w = r8
            r0.f23245x = r8
            r0.A = r4
            java.lang.Object r6 = vkm.q.y(r6, r7, r0)
            if (r6 != r1) goto L7a
        L79:
            return r1
        L7a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cdh.j.f(com.revolut.feature.wealth.api.widget.WealthWidgetContext, java.lang.String, java.lang.String, dsh.e, gim.c):java.lang.Object");
    }

    public final AvatarGridWidgetDelegate.Model j(String str, String str2, n0 filter) {
        if (!Intrinsics.f(str2, "TopMoversLarge") && !Intrinsics.f(str2, "TopMoversDynamic")) {
            throw new IllegalArgumentException(j6.a.q("Invalid widgetType: ", str2));
        }
        AvatarGridWidgetDelegate.Model.Companion companion = AvatarGridWidgetDelegate.Model.INSTANCE;
        TextLocalisedClause textLocalisedClauseE = this.f23258b.e();
        String str3 = null;
        List listK = v.k(new FixedTabs.Item("top_movers.tab_top_gainers", new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (AnalyticsContext) null, 12), new FixedTabs.Item("top_movers.tab_top_losers", new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (AnalyticsContext) null, 12));
        if (filter != null) {
            Intrinsics.checkNotNullParameter(filter, "filter");
            str3 = b.f23242a[filter.ordinal()] == 1 ? "top_movers.tab_top_losers" : "top_movers.tab_top_gainers";
        }
        return AvatarGridWidgetDelegate.Model.Companion.c(companion, str, textLocalisedClauseE, new c2(listK, str3));
    }

    @Override // csh.e
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final wkm.l g(WealthWidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        Continuation continuation = null;
        return q.Q(new v1(new c34.d(this, continuation, 13)), new f(continuation, this, id10, widgetType, 0));
    }
}
