package x28;

import com.revolut.core.ui_kit.delegates.widgets.AvatarGridWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.invest_feed.api.widget.InvestFeedWidgetApi$FeatureToggles$PopularFirstBuysFeedWidgetRevamp;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.wealth.resources.R$string;
import dsh.r;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import vkm.v1;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9h.c f302527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9h.f f302528c;
    public final n28.d d;
    public final gte.a e;

    public j(v9h.c mapper, v9h.f presentationModel, n28.d widgetAvailabilityProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(widgetAvailabilityProvider, "widgetAvailabilityProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f302527b = mapper;
        this.f302528c = presentationModel;
        this.d = widgetAvailabilityProvider;
        this.e = featureToggleInteractor;
    }

    @Override // csh.e
    public final List a(String widgetType, dsh.e inputConfig) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        if (!((jte.d) this.e).c(InvestFeedWidgetApi$FeatureToggles$PopularFirstBuysFeedWidgetRevamp.f76454c)) {
            return f0.f322471a;
        }
        r.a aVar = r.Companion;
        return u.c(r.a.a(aVar, inputConfig, null, String.valueOf(r.a.c(aVar, inputConfig)), 6));
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
    public final java.lang.Object c(java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r5 = r6 instanceof x28.d
            if (r5 == 0) goto L13
            r5 = r6
            x28.d r5 = (x28.d) r5
            int r0 = r5.f302517w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.f302517w = r0
            goto L1a
        L13:
            x28.d r5 = new x28.d
            gim.c r6 = (gim.c) r6
            r5.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r5.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f302517w
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L38
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            yhm.o.b(r6)
            return r6
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            yhm.o.b(r6)
            goto L46
        L38:
            yhm.o.b(r6)
            r5.f302517w = r3
            n28.d r6 = r4.d
            java.lang.Object r6 = r6.e(r5)
            if (r6 != r0) goto L46
            goto L63
        L46:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L65
            v9h.f r6 = r4.f302528c
            kotlinx.coroutines.flow.Flow r6 = r6.a()
            vy5.d0 r1 = new vy5.d0
            r3 = 14
            r1.<init>(r6, r3)
            r5.f302517w = r2
            java.lang.Object r5 = vkm.q.x(r1, r5)
            if (r5 != r0) goto L64
        L63:
            return r0
        L64:
            return r5
        L65:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x28.j.c(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        boolean zC = ((jte.d) this.e).c(InvestFeedWidgetApi$FeatureToggles$PopularFirstBuysFeedWidgetRevamp.f76454c);
        u0h.a aVar = u0h.a.f276198a;
        Object type = zC ? new u0h.b(r.a.c(r.Companion, eVar)) : aVar;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        if (type.equals(aVar)) {
            return AvatarGridWidgetDelegate.Model.Companion.c(AvatarGridWidgetDelegate.Model.INSTANCE, id10, new TextLocalisedClause(R$string.wealth_invest_widget_popular_first_buys_widget_title, null, null, 14), null);
        }
        if (type instanceof u0h.b) {
            return RowsWidgetDelegate.Model.Companion.b(RowsWidgetDelegate.Model.INSTANCE, id10, new TextLocalisedClause(R$string.wealth_invest_widget_popular_first_buys_widget_title, null, null, 14), ((u0h.b) type).f276199a, null, 24);
        }
        throw new NoWhenBranchMatchedException();
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

    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // csh.e
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.feature.invest_feed.api.models.InvestWidgetContext r7, java.lang.String r8, java.lang.String r9, dsh.e r10, kotlin.coroutines.Continuation r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof x28.a
            if (r0 == 0) goto L13
            r0 = r11
            x28.a r0 = (x28.a) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L1a
        L13:
            x28.a r0 = new x28.a
            gim.c r11 = (gim.c) r11
            r0.<init>(r6, r11)
        L1a:
            java.lang.Object r11 = r0.B
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.D
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L4d
            if (r2 == r3) goto L3b
            if (r2 != r4) goto L33
            dsh.e r7 = r0.f302513w
            java.lang.String r8 = r0.v
            java.lang.String r9 = r0.u
            yhm.o.b(r11)
            goto L9e
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            java.lang.String r9 = r0.A
            java.lang.String r8 = r0.z
            com.revolut.feature.invest_feed.api.models.InvestWidgetContext r7 = r0.f302515y
            x28.j r10 = r0.f302514x
            dsh.e r2 = r0.f302513w
            java.lang.String r3 = r0.v
            java.lang.String r5 = r0.u
            yhm.o.b(r11)
            goto L72
        L4d:
            yhm.o.b(r11)
            if (r10 != 0) goto L75
            r0.u = r8
            r0.v = r9
            r0.f302513w = r10
            r0.f302514x = r6
            r0.f302515y = r7
            r0.z = r8
            r0.A = r9
            r0.D = r3
            dsh.d r11 = dsh.e.Companion
            r11.getClass()
            dsh.e r11 = dsh.d.a()
            if (r11 != r1) goto L6e
            goto L9a
        L6e:
            r5 = r8
            r3 = r9
            r2 = r10
            r10 = r6
        L72:
            dsh.e r11 = (dsh.e) r11
            goto L7a
        L75:
            r5 = r8
            r3 = r9
            r11 = r10
            r2 = r11
            r10 = r6
        L7a:
            kotlinx.coroutines.flow.Flow r7 = r10.g(r7, r8, r9, r11)
            x28.b r8 = new x28.b
            r9 = 0
            r8.<init>(r4, r9)
            r0.u = r5
            r0.v = r3
            r0.f302513w = r2
            r0.f302514x = r9
            r0.f302515y = r9
            r0.z = r9
            r0.A = r9
            r0.D = r4
            java.lang.Object r11 = vkm.q.A(r7, r8, r0)
            if (r11 != r1) goto L9b
        L9a:
            return r1
        L9b:
            r7 = r2
            r8 = r3
            r9 = r5
        L9e:
            com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate$Model r11 = (com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model) r11
            if (r11 != 0) goto La7
            com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate$Model r7 = r6.d(r9, r8, r7)
            return r7
        La7:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: x28.j.f(com.revolut.feature.invest_feed.api.models.InvestWidgetContext, java.lang.String, java.lang.String, dsh.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // csh.e
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final Flow g(InvestWidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        Continuation continuation = null;
        return q.Q(new v1(new wih.c(this, continuation, 21)), new e(continuation, this, id10, config, 0));
    }
}
