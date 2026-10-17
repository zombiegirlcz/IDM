package m28;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.wealth.resources.R$string;
import dsh.j;
import ip0.c2;
import jlh.w;
import koe.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import tzg.m;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements csh.e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nih.a f201726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f201727c;
    public final m d;

    public e(nih.a commoditiesInteractor, g commoditiesWidgetMapper, m wealthAccountsInteractor) {
        Intrinsics.checkNotNullParameter(commoditiesInteractor, "commoditiesInteractor");
        Intrinsics.checkNotNullParameter(commoditiesWidgetMapper, "commoditiesWidgetMapper");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        this.f201726b = commoditiesInteractor;
        this.f201727c = commoditiesWidgetMapper;
        this.d = wealthAccountsInteractor;
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return j((gim.c) continuation);
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        ((h) this.f201727c).getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        return ContactsWidgetDelegate.Model.Companion.b(ContactsWidgetDelegate.Model.INSTANCE, id10, new TextLocalisedClause(R$string.wealth_invest_widget_commodities_header_title, null, null, 14), c2.CIRCLE);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
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
            boolean r0 = r11 instanceof m28.b
            if (r0 == 0) goto L13
            r0 = r11
            m28.b r0 = (m28.b) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L1a
        L13:
            m28.b r0 = new m28.b
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
            dsh.e r7 = r0.f201722w
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
            com.revolut.feature.invest_feed.api.models.InvestWidgetContext r7 = r0.f201724y
            m28.e r10 = r0.f201723x
            dsh.e r2 = r0.f201722w
            java.lang.String r3 = r0.v
            java.lang.String r5 = r0.u
            yhm.o.b(r11)
            goto L72
        L4d:
            yhm.o.b(r11)
            if (r10 != 0) goto L75
            r0.u = r8
            r0.v = r9
            r0.f201722w = r10
            r0.f201723x = r6
            r0.f201724y = r7
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
            m28.c r8 = new m28.c
            r9 = 0
            r8.<init>(r4, r9)
            r0.u = r5
            r0.v = r3
            r0.f201722w = r2
            r0.f201723x = r9
            r0.f201724y = r9
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
        throw new UnsupportedOperationException("Method not decompiled: m28.e.f(com.revolut.feature.invest_feed.api.models.InvestWidgetContext, java.lang.String, java.lang.String, dsh.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof m28.d
            if (r0 == 0) goto L13
            r0 = r6
            m28.d r0 = (m28.d) r0
            int r1 = r0.f201725w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f201725w = r1
            goto L18
        L13:
            m28.d r0 = new m28.d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f201725w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            tzg.m r6 = r5.d
            x8h.v0 r6 = (x8h.v0) r6
            vkm.d r6 = r6.f()
            r2 = 3
            r4 = 0
            jhi.b r6 = mo3.a.g(r6, r4, r4, r2)
            r0.f201725w = r3
            java.lang.Object r6 = vkm.q.z(r6, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            com.revolut.feature.wealth.api.domain.model.WealthAccount$Commodities r6 = (com.revolut.feature.wealth.api.domain.model.WealthAccount.Commodities) r6
            r0 = 0
            if (r6 == 0) goto L55
            boolean r6 = r6.available()
            if (r6 != r3) goto L55
            goto L56
        L55:
            r3 = r0
        L56:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m28.e.j(gim.c):java.lang.Object");
    }

    @Override // csh.e
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final Flow g(InvestWidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return mo3.a.f(zi0.c.w(rd0.e.b(((w) this.f201726b).a(null))), new kp0.m(this, id10, 9), new y(this, id10, 27), new lxi.g(15));
    }
}
