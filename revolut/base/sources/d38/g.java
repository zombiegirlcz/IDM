package d38;

import cie.l1;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import com.revolut.feature.widgets.api.R$string;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import dsh.r;
import hbh.o;
import ip0.v7;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import n1j.t;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import zhm.u;
import zhm.v;
import zhm.y0;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements csh.e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f110934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1h.d f110935c;
    public final n28.d d;

    public g(o investTransactionsWidgetProvider, h1h.d mapper, n28.d widgetAvailabilityProvider) {
        Intrinsics.checkNotNullParameter(investTransactionsWidgetProvider, "investTransactionsWidgetProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(widgetAvailabilityProvider, "widgetAvailabilityProvider");
        this.f110934b = investTransactionsWidgetProvider;
        this.f110935c = mapper;
        this.d = widgetAvailabilityProvider;
    }

    @Override // csh.e
    public final List a(String widgetType, dsh.e inputConfig) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        r.a aVar = r.Companion;
        List listK = v.k(new dsh.a(new TextLocalisedClause(R$string.widgets_popup_show_up_to_option_one, null, null, 14), "1"), new dsh.a(new TextLocalisedClause(R$string.widgets_popup_show_up_to_option_two, null, null, 14), "2"), new dsh.a(new TextLocalisedClause(R$string.widgets_popup_show_up_to_option_three, null, null, 14), "3"), new dsh.a(new TextLocalisedClause(R$string.widgets_popup_show_up_to_option_five, null, null, 14), "5"));
        aVar.getClass();
        return u.c(r.a.a(aVar, inputConfig, listK, String.valueOf(r.a.b(inputConfig, 2)), 2));
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
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        RowsWidgetDelegate.Model.Companion companion = RowsWidgetDelegate.Model.INSTANCE;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_transactions_widget_header_title, null, null, 14);
        r.Companion.getClass();
        return RowsWidgetDelegate.Model.Companion.b(companion, id10, textLocalisedClause, r.a.b(eVar, 2), null, 24);
    }

    @Override // csh.e
    public final Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return this.d.a(new t(4), eVar);
    }

    @Override // csh.e
    public final /* bridge */ dsh.j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((InvestWidgetContext) widgetContext, str, eVar);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077 A[RETURN] */
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
            boolean r0 = r10 instanceof d38.c
            if (r0 == 0) goto L13
            r0 = r10
            d38.c r0 = (d38.c) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L1a
        L13:
            d38.c r0 = new d38.c
            gim.c r10 = (gim.c) r10
            r0.<init>(r5, r10)
        L1a:
            java.lang.Object r10 = r0.f110926y
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
            java.lang.String r8 = r0.f110925x
            java.lang.String r7 = r0.f110924w
            com.revolut.feature.invest_feed.api.models.InvestWidgetContext r6 = r0.v
            d38.g r9 = r0.u
            yhm.o.b(r10)
            goto L5c
        L40:
            yhm.o.b(r10)
            if (r9 != 0) goto L5f
            r0.u = r5
            r0.v = r6
            r0.f110924w = r7
            r0.f110925x = r8
            r0.A = r4
            dsh.d r9 = dsh.e.Companion
            r9.getClass()
            dsh.e r10 = dsh.d.a()
            if (r10 != r1) goto L5b
            goto L76
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
            r7 = 0
            r0.u = r7
            r0.v = r7
            r0.f110924w = r7
            r0.f110925x = r7
            r0.A = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L77
        L76:
            return r1
        L77:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d38.g.f(com.revolut.feature.invest_feed.api.models.InvestWidgetContext, java.lang.String, java.lang.String, dsh.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // csh.e
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final Flow g(InvestWidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        r.Companion.getClass();
        int iB = r.a.b(config, 2);
        InvestTransactionsFilter.INSTANCE.getClass();
        InvestTransactionsFilter.InvestTransactionsFilterImpl investTransactionsFilterImpl = InvestTransactionsFilter.Companion.f105346b;
        return rd0.e.d(new f(q.q(mo3.a.h(v7.y("TransactionsWidgetContentProvider", "widgetModelFlow", this.f110934b.b(investTransactionsFilterImpl, w4l.i.f294643c)), new l1(19), new czh.a(13), 2)), iB, this, id10, investTransactionsFilterImpl), y0.b(new Pair("TransactionsWidgetContentProvider", "widgetModelFlow")));
    }
}
