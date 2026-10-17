package s28;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.NewsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.invest.smart_notifications.api.InvestSmartNotificationsApi$Toggles$InvestSmartNotifications;
import com.revolut.feature.invest.smart_notifications.api.InvestSmartNotificationsApi$Toggles$InvestSmartNotificationsSettings;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.widgets.api.R$string;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import dsh.r;
import f28.b0;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import qtb.o;
import vkm.q;
import wkm.l;
import ybl.k;
import zhm.h0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements csh.e {

    @NotNull
    public static final d Companion = new d();
    public static final Set f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q18.c f259266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1k.b f259267c;
    public final n28.d d;
    public final f e;

    static {
        tdh.a[] elements = {tdh.a.PORTFOLIO, tdh.a.WATCHLIST};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f = kotlin.collections.d.y0(elements);
    }

    public h(q18.c feedItemMapper, a1k.b wealthNewsMapper, n28.d widgetAvailabilityProvider, f newsDomainProvider) {
        Intrinsics.checkNotNullParameter(feedItemMapper, "feedItemMapper");
        Intrinsics.checkNotNullParameter(wealthNewsMapper, "wealthNewsMapper");
        Intrinsics.checkNotNullParameter(widgetAvailabilityProvider, "widgetAvailabilityProvider");
        Intrinsics.checkNotNullParameter(newsDomainProvider, "newsDomainProvider");
        this.f259266b = feedItemMapper;
        this.f259267c = wealthNewsMapper;
        this.d = widgetAvailabilityProvider;
        this.e = newsDomainProvider;
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
        dsh.f fVar = new dsh.f();
        r.Companion.getClass();
        fVar.a("itemsCountLimit", "2");
        return new dsh.e(fVar);
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return Intrinsics.f(str, "NewsDynamic") ? this.d.e((gim.c) continuation) : Boolean.FALSE;
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        NewsWidgetDelegate.Model.Companion companion = NewsWidgetDelegate.Model.INSTANCE;
        TextLocalisedClause textLocalisedClause = ifk.b.n(this.e.f259261b, InvestSmartNotificationsApi$Toggles$InvestSmartNotifications.f76416c, InvestSmartNotificationsApi$Toggles$InvestSmartNotificationsSettings.f76418c) ? new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_widget_feed_header_title, null, null, 14) : new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_widget_news_header_title, null, null, 14);
        r.Companion.getClass();
        return NewsWidgetDelegate.Model.Companion.b(companion, id10, textLocalisedClause, r.a.b(eVar, 2));
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

    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072 A[RETURN] */
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
            boolean r0 = r10 instanceof s28.g
            if (r0 == 0) goto L13
            r0 = r10
            s28.g r0 = (s28.g) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L1a
        L13:
            s28.g r0 = new s28.g
            gim.c r10 = (gim.c) r10
            r0.<init>(r5, r10)
        L1a:
            java.lang.Object r10 = r0.f259265y
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
            java.lang.String r8 = r0.f259264x
            java.lang.String r7 = r0.f259263w
            com.revolut.feature.invest_feed.api.models.InvestWidgetContext r6 = r0.v
            s28.h r9 = r0.u
            yhm.o.b(r10)
            goto L57
        L40:
            yhm.o.b(r10)
            if (r9 != 0) goto L5a
            r0.u = r5
            r0.v = r6
            r0.f259263w = r7
            r0.f259264x = r8
            r0.A = r4
            java.lang.Object r10 = r5.b(r8, r0)
            if (r10 != r1) goto L56
            goto L71
        L56:
            r9 = r5
        L57:
            dsh.e r10 = (dsh.e) r10
            goto L5c
        L5a:
            r10 = r9
            r9 = r5
        L5c:
            kotlinx.coroutines.flow.Flow r6 = r9.g(r6, r7, r8, r10)
            r7 = 0
            r0.u = r7
            r0.v = r7
            r0.f259263w = r7
            r0.f259264x = r7
            r0.A = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L72
        L71:
            return r1
        L72:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s28.h.f(com.revolut.feature.invest_feed.api.models.InvestWidgetContext, java.lang.String, java.lang.String, dsh.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // csh.e
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final Flow g(InvestWidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        l lVarC;
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        r.Companion.getClass();
        int i = 2;
        int iB = r.a.b(config, 2);
        f fVar = this.e;
        int i2 = 1;
        if (ifk.b.n(fVar.f259261b, InvestSmartNotificationsApi$Toggles$InvestSmartNotifications.f76416c, InvestSmartNotificationsApi$Toggles$InvestSmartNotificationsSettings.f76418c)) {
            k kVar = fVar.d;
            TradingAccountType[] elements = {TradingAccountType.Gia.f105270a, TradingAccountType.Taa.f105275a};
            Intrinsics.checkNotNullParameter(elements, "elements");
            Continuation continuation = null;
            lVarC = q.Q(rd0.e.e(q.q(mo3.a.g(zi0.c.w(k.f(kVar, kotlin.collections.d.y0(elements), 6)), null, new s20.c(i), 1)), h0.f322473a, new o(3, 15, continuation)), new l27.g(iB, i2, fVar, continuation));
        } else {
            lVarC = fVar.c(iB);
        }
        return mo3.a.f(zi0.c.w(rd0.e.n(lVarC, h0.f322473a)), new b0(id10, 19), new f0c.b(id10, this, iB, i), new s20.c(i2));
    }
}
