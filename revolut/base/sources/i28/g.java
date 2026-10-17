package i28;

import ahe.y0;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.wealth.resources.R$string;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import vkm.v1;
import zh9.u0;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements csh.e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f157896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n28.d f157897c;
    public final gte.a d;

    public g(ImmutableSet itemProviders, n28.d widgetAvailabilityProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(itemProviders, "itemProviders");
        Intrinsics.checkNotNullParameter(widgetAvailabilityProvider, "widgetAvailabilityProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f157896b = itemProviders;
        this.f157897c = widgetAvailabilityProvider;
        this.d = featureToggleInteractor;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // csh.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r4, kotlin.coroutines.Continuation r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof i28.b
            if (r4 == 0) goto L13
            r4 = r5
            i28.b r4 = (i28.b) r4
            int r0 = r4.f157889w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f157889w = r0
            goto L1a
        L13:
            i28.b r4 = new i28.b
            gim.c r5 = (gim.c) r5
            r4.<init>(r3, r5)
        L1a:
            java.lang.Object r5 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f157889w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r5)
            r4.f157889w = r2
            n28.d r5 = r3.f157897c
            java.lang.Object r5 = r5.f(r4)
            if (r5 != r0) goto L3f
            return r0
        L3f:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            r4 = r4 ^ r2
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i28.g.c(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        return RowsWidgetDelegate.Model.Companion.b(RowsWidgetDelegate.Model.INSTANCE, id10, new TextLocalisedClause(R$string.wealth_invest_widget_automations_header_title, null, null, 14), ((jte.d) this.d).c(FeatureWealthApi$Toggles.InvestFeaturesWidget.f95157c) ? 4 : 2, null, 24);
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        InvestWidgetContext investWidgetContext = (InvestWidgetContext) widgetContext;
        if (eVar == null) {
            dsh.e.Companion.getClass();
            eVar = dsh.d.a();
        }
        return q.x(g(investWidgetContext, str, str2, eVar), fVar);
    }

    @Override // csh.e
    public final /* bridge */ dsh.j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((InvestWidgetContext) widgetContext, str, eVar);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00db A[PHI: r1 r4 r9
      0x00db: PHI (r1v8 java.lang.String) = (r1v7 java.lang.String), (r1v10 java.lang.String), (r1v11 java.lang.String) binds: [B:42:0x00b2, B:52:0x00da, B:50:0x00d7] A[DONT_GENERATE, DONT_INLINE]
      0x00db: PHI (r4v3 com.revolut.feature.invest_feed.api.models.InvestWidgetContext) = 
      (r4v2 com.revolut.feature.invest_feed.api.models.InvestWidgetContext)
      (r4v5 com.revolut.feature.invest_feed.api.models.InvestWidgetContext)
      (r4v6 com.revolut.feature.invest_feed.api.models.InvestWidgetContext)
     binds: [B:42:0x00b2, B:52:0x00da, B:50:0x00d7] A[DONT_GENERATE, DONT_INLINE]
      0x00db: PHI (r9v1 boolean) = (r9v0 boolean), (r9v2 boolean), (r9v0 boolean) binds: [B:42:0x00b2, B:52:0x00da, B:50:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // csh.e
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.revolut.feature.invest_feed.api.models.InvestWidgetContext r14, java.lang.String r15, kotlin.coroutines.Continuation r16) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i28.g.e(com.revolut.feature.invest_feed.api.models.InvestWidgetContext, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // csh.e
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final Flow g(InvestWidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        List<j28.e> listP0 = d0.P0(this.f157896b, new e());
        ArrayList arrayList = new ArrayList(w.t(listP0, 10));
        for (j28.e eVar : listP0) {
            InvestWidgetContext investWidgetContext = widgetContext;
            arrayList.add(q.Q(new v1(new fc0.e(eVar, widgetContext, widgetType, (Continuation) null)), new y0(11, eVar, investWidgetContext, widgetType, config, (Continuation) null)));
            widgetContext = investWidgetContext;
        }
        return rd0.e.e(mo3.a.g(nim.a.v(u0.k(arrayList), new ho6.n(10, id10, this)), null, new hy2.b(27), 1), h0.f322473a, new f(this, id10, null));
    }
}
