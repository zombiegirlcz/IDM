package s9h;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth.api.ui.delegates.mosttraded.widget.MostTradedFeedWidgetContext;
import com.revolut.feature.widgets.api.R$string;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.youTransactor.uCube.rpc.Constants;
import dsh.j;
import dsh.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wr5.b f261192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q9h.c f261193c;
    public final q9h.a d;

    public h(us5.a availabilityProvider, wr5.b widgetConfigProvider, q9h.c presentationModel, q9h.a mapper) {
        Intrinsics.checkNotNullParameter(availabilityProvider, "availabilityProvider");
        Intrinsics.checkNotNullParameter(widgetConfigProvider, "widgetConfigProvider");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f261192b = widgetConfigProvider;
        this.f261193c = presentationModel;
        this.d = mapper;
    }

    @Override // csh.e
    public final List a(String widgetType, dsh.e inputConfig) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        r.a aVar = r.Companion;
        List listK = v.k(new dsh.a(new TextLocalisedClause(R$string.widgets_popup_show_up_to_option_one, null, null, 14), "1"), new dsh.a(new TextLocalisedClause(R$string.widgets_popup_show_up_to_option_two, null, null, 14), "2"), new dsh.a(new TextLocalisedClause(R$string.widgets_popup_show_up_to_option_three, null, null, 14), "3"), new dsh.a(new TextLocalisedClause(R$string.widgets_popup_show_up_to_option_five, null, null, 14), "5"), new dsh.a(new TextLocalisedClause(R$string.widgets_popup_show_up_to_option_ten, null, null, 14), "10"));
        aVar.getClass();
        return u.c(r.a.a(aVar, inputConfig, listK, String.valueOf(r.a.b(inputConfig, 2)), 2));
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
            boolean r5 = r6 instanceof s9h.f
            if (r5 == 0) goto L13
            r5 = r6
            s9h.f r5 = (s9h.f) r5
            int r0 = r5.f261188w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.f261188w = r0
            goto L1a
        L13:
            s9h.f r5 = new s9h.f
            gim.c r6 = (gim.c) r6
            r5.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r5.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f261188w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            go.g r1 = new go.g
            r3 = 2
            r1.<init>(r6, r3)
            r5.f261188w = r2
            java.lang.Object r6 = vkm.q.z(r1, r5)
            if (r6 != r0) goto L45
            return r0
        L45:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L4e
            boolean r5 = r6.booleanValue()
            goto L4f
        L4e:
            r5 = 0
        L4f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s9h.h.c(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        RowsWidgetDelegate.Model.Companion companion = RowsWidgetDelegate.Model.INSTANCE;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_most_traded_crypto_title, null, null, 14);
        r.Companion.getClass();
        return RowsWidgetDelegate.Model.Companion.b(companion, id10, textLocalisedClause, r.a.b(eVar, 3), null, 24);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return j(str, str2, eVar, fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        MostTradedFeedWidgetContext widgetContext2 = (MostTradedFeedWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        r.Companion.getClass();
        return q.Q(new go.g(Boolean.TRUE, 2), new ou6.q(null, this, id10, widgetType, config, r.a.b(config, 2)));
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((MostTradedFeedWidgetContext) widgetContext, str, eVar);
        return null;
    }

    public final ErrorWidgetDelegate.Model i(String str) {
        return new ErrorWidgetDelegate.Model(str, null, new TextLocalisedClause(com.revolut.feature.crypto_feed.dependencies.R$string.crypto_home_feed_widget_mosttraded_error_title, null, null, 14), new TextLocalisedClause(com.revolut.kompot.common.R$string.common_offline_state_action, null, null, 14), op0.q.MEDIUM, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r13, java.lang.String r14, dsh.e r15, gim.c r16) {
        /*
            r12 = this;
            r0 = r16
            boolean r1 = r0 instanceof s9h.e
            if (r1 == 0) goto L16
            r1 = r0
            s9h.e r1 = (s9h.e) r1
            int r3 = r1.z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r1.z = r3
        L14:
            r8 = r1
            goto L1c
        L16:
            s9h.e r1 = new s9h.e
            r1.<init>(r12, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r8.f261186x
            fim.a r9 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.z
            r10 = 2
            r3 = 1
            if (r1 == 0) goto L44
            if (r1 == r3) goto L36
            if (r1 != r10) goto L2e
            yhm.o.b(r0)
            return r0
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L36:
            dsh.e r1 = r8.f261185w
            java.lang.String r3 = r8.v
            java.lang.String r4 = r8.u
            yhm.o.b(r0)
            r5 = r4
            r4 = r3
            r3 = r5
            r5 = r1
            goto L5d
        L44:
            yhm.o.b(r0)
            r8.u = r13
            r8.v = r14
            r8.f261185w = r15
            r8.z = r3
            q0h.g r3 = new q0h.g
            q0h.e r5 = q0h.e.CRYPTO
            r3.<init>(r5)
            if (r3 != r9) goto L59
            goto L85
        L59:
            r4 = r14
            r5 = r15
            r0 = r3
            r3 = r13
        L5d:
            r6 = r0
            q0h.i r6 = (q0h.i) r6
            q9h.c r0 = r12.f261193c
            efm.r r0 = r0.a(r6)
            vkm.d r0 = rd0.e.b(r0)
            r1 = 3
            r11 = 0
            jhi.b r1 = mo3.a.g(r0, r11, r11, r1)
            c2d.g r0 = new c2d.g
            r7 = 3
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.u = r11
            r8.v = r11
            r8.f261185w = r11
            r8.z = r10
            java.lang.Object r0 = vkm.q.x(r0, r8)
            if (r0 != r9) goto L86
        L85:
            return r9
        L86:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s9h.h.j(java.lang.String, java.lang.String, dsh.e, gim.c):java.lang.Object");
    }
}
