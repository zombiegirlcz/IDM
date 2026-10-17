package mae;

import android.os.Parcelable;
import aw0.k7;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.InactiveCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.pay_later.api.R$string;
import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mx0.i1;
import org.jetbrains.annotations.NotNull;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements a9e.d, a9e.h, a9e.a {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final DateTimeFormatter f204013l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f204014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.a f204015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j9l.a f204016c;
    public final l80.e d;
    public final t70.b e;
    public final jla.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nm1.b f204017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f204018h;
    public final k i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r f204019j;
    public final g1i.c k;

    static {
        m70.a.a(t0.f186434a);
        f204013l = DateTimeFormat.forPattern("dd MMMM");
    }

    public o(h subscriptionsAppMapper, f01.a uiKitResources, j9l.a moneyCalculator, l80.e dateProvider, t70.b currenciesLocalization, jla.h productCatalogueInteractor, nm1.b boletoFinderItemsProvider, m subscriptionsIconMapper, k subscriptionsBadgeMapper, r subscriptionsTextMapper, g1i.c subscriptionPaymentFromMapper) {
        Intrinsics.checkNotNullParameter(subscriptionsAppMapper, "subscriptionsAppMapper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(boletoFinderItemsProvider, "boletoFinderItemsProvider");
        Intrinsics.checkNotNullParameter(subscriptionsIconMapper, "subscriptionsIconMapper");
        Intrinsics.checkNotNullParameter(subscriptionsBadgeMapper, "subscriptionsBadgeMapper");
        Intrinsics.checkNotNullParameter(subscriptionsTextMapper, "subscriptionsTextMapper");
        Intrinsics.checkNotNullParameter(subscriptionPaymentFromMapper, "subscriptionPaymentFromMapper");
        this.f204014a = subscriptionsAppMapper;
        this.f204015b = uiKitResources;
        this.f204016c = moneyCalculator;
        this.d = dateProvider;
        this.e = currenciesLocalization;
        this.f = productCatalogueInteractor;
        this.f204017g = boletoFinderItemsProvider;
        this.f204018h = subscriptionsIconMapper;
        this.i = subscriptionsBadgeMapper;
        this.f204019j = subscriptionsTextMapper;
        this.k = subscriptionPaymentFromMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0314 A[PHI: r10
      0x0314: PHI (r10v28 ??) = (r10v41 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), (r10v0 ??), (r10v38 ??) binds: [B:155:0x02e2, B:157:0x02ec, B:160:0x02f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009f A[PHI: r18 r39
      0x009f: PHI (r18v7 boolean) = (r18v4 boolean), (r18v4 boolean), (r18v8 boolean) binds: [B:86:0x016a, B:83:0x0155, B:46:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r39v7 l80.f) = (r39v4 l80.f), (r39v4 l80.f), (r39v8 l80.f) binds: [B:86:0x016a, B:83:0x0155, B:46:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0175  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v28, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r5v71, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.core.ui_kit.delegates.RowDelegate.Model f(mae.o r33, com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra r34, boolean r35, boolean r36, boolean r37, java.util.List r38, com.revolut.core.ui_kit_core.displayers.image.Image r39, boolean r40, java.lang.Integer r41, java.util.Map r42, com.revolut.core.ui_kit.models.Clause r43, k71.q r44, int r45) {
        /*
            Method dump skipped, instruction units count: 1660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mae.o.f(mae.o, com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra, boolean, boolean, boolean, java.util.List, com.revolut.core.ui_kit_core.displayers.image.Image, boolean, java.lang.Integer, java.util.Map, com.revolut.core.ui_kit.models.Clause, k71.q, int):com.revolut.core.ui_kit.delegates.RowDelegate$Model");
    }

    public static TextLocalisedClause j(RecurringPaymentWithExtra recurringPaymentWithExtra) {
        if (!ofm.q.D(recurringPaymentWithExtra.getF81653a())) {
            return null;
        }
        tua.d dVarM = qua.u.M(recurringPaymentWithExtra.getF81653a());
        return new TextLocalisedClause(R$string.pay_later_repayments_number_of_count, v.k(Integer.valueOf(dVarM.d + 1), Integer.valueOf(dVarM.e)), null, 12);
    }

    public static ListSubheaderDelegate.Model k(o oVar, String str, Clause clause, MoneyClause moneyClause, boolean z, boolean z3, int i) {
        boolean z4 = false;
        boolean z6 = (i & 32) != 0 ? false : z3;
        oVar.getClass();
        return new ListSubheaderDelegate.Model(str, (Image) null, clause, (Image) null, (Clause) moneyClause, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(z4, z6, z4, 1), false, false, (Object) null, (Parcelable) null, z ? R$attr.uikit_dp16 : R$attr.uikit_dp32, R$attr.uikit_dp16, 0, 0, 53162);
    }

    public final dj0.d g(List subscriptions, List rates, xi0.b baseCurrency) {
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(rates, "rates");
        List list = subscriptions;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(qua.u.f(((RecurringPaymentWithExtra) it8.next()).getF81653a()));
        }
        dj0.d dVarA = this.f204016c.a(baseCurrency, arrayList, rates);
        return dVarA == null ? new dj0.d(0L, baseCurrency) : dVarA;
    }

    public final Image h(qua.p recurringPayment, Map contactsWithPaidPlan) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        Intrinsics.checkNotNullParameter(contactsWithPaidPlan, "contactsWithPaidPlan");
        return this.f204018h.c(recurringPayment, f0.f322471a, contactsWithPaidPlan);
    }

    public final String i(RecurringPaymentWithExtra.General subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        qua.p pVar = subscription.f81652a;
        this.f204014a.getClass();
        return h.b(pVar, this.f204015b, this.e);
    }

    public final ArrayList l(List list, List list2, Map map, k71.q qVar) {
        List list3 = list;
        ArrayList arrayList = new ArrayList(w.t(list3, 10));
        Iterator it8 = list3.iterator();
        while (it8.hasNext()) {
            arrayList.add(f(this, (RecurringPaymentWithExtra) it8.next(), false, false, false, list2, null, false, null, map, null, qVar, 1518));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public final List m(List subscriptionsExtra, a9e.g headerConfig, List vaults, List inactiveRecurringPayments, List pendingRecurringPayments, Map map, k71.q transactionsExtraData) {
        m mVar;
        RowDelegate.Model.b.c cVar;
        t70.b bVar;
        f01.a aVar;
        h hVar;
        Map contactsWithPaidPlan = map;
        Intrinsics.checkNotNullParameter(subscriptionsExtra, "subscriptionsExtra");
        Intrinsics.checkNotNullParameter(headerConfig, "headerConfig");
        Intrinsics.checkNotNullParameter(vaults, "vaults");
        Intrinsics.checkNotNullParameter(inactiveRecurringPayments, "inactiveRecurringPayments");
        Intrinsics.checkNotNullParameter(pendingRecurringPayments, "pendingRecurringPayments");
        Intrinsics.checkNotNullParameter(contactsWithPaidPlan, "contactsWithPaidPlan");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        boolean z = this.f.d("revolut_card.subscriptions", null) == bla.c.ENABLED;
        if ((subscriptionsExtra.isEmpty() && inactiveRecurringPayments.isEmpty() && pendingRecurringPayments.isEmpty()) || !z) {
            return null;
        }
        ArrayList arrayListL = l(subscriptionsExtra, vaults, contactsWithPaidPlan, transactionsExtraData);
        List list = inactiveRecurringPayments;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (true) {
            boolean zHasNext = it8.hasNext();
            mVar = this.f204018h;
            cVar = RowDelegate.Model.b.c.f53268a;
            bVar = this.e;
            aVar = this.f204015b;
            hVar = this.f204014a;
            if (!zHasNext) {
                break;
            }
            RecurringPaymentWithExtra recurringPaymentWithExtra = (RecurringPaymentWithExtra) it8.next();
            String str = recurringPaymentWithExtra.getF81653a().f249314a.f160150a;
            Iterator it9 = it8;
            RowDelegate.Model.MainImage.Avatar avatar = new RowDelegate.Model.MainImage.Avatar(mVar.a(recurringPaymentWithExtra.getF81653a(), f0.f322471a, new InactiveCircleBadge(dw0.a.Paused), contactsWithPaidPlan), (i1) null, 6);
            qua.p f81653a = recurringPaymentWithExtra.getF81653a();
            qua.p f81653a2 = recurringPaymentWithExtra.getF81653a();
            hVar.getClass();
            arrayList.add(new RowDelegate.Model(str, avatar, new TextClause(jli.g.b(h.b(f81653a2, aVar, bVar)), (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122), null, 0, new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.schedule_payments_standing_order_inactive_subtitle, null, null, 14), null, null, 0, new RowDelegate.Model.c.b(r.a(recurringPaymentWithExtra, true, false, Integer.valueOf(R$attr.uikit_colorGreyTone50)), j(recurringPaymentWithExtra), null, false, 124), false, null, false, cVar, null, null, null, null, null, f81653a, null, 0, 0, 0, 0, 532659160));
            it8 = it9;
        }
        List list2 = pendingRecurringPayments;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        Iterator it10 = list2.iterator();
        while (it10.hasNext()) {
            RecurringPaymentWithExtra recurringPaymentWithExtra2 = (RecurringPaymentWithExtra) it10.next();
            String str2 = recurringPaymentWithExtra2.getF81653a().f249314a.f160150a;
            Iterator it11 = it10;
            RowDelegate.Model.MainImage.Avatar avatar2 = new RowDelegate.Model.MainImage.Avatar(mVar.a(recurringPaymentWithExtra2.getF81653a(), f0.f322471a, new InactiveCircleBadge(dw0.a.Pending), contactsWithPaidPlan), (i1) null, 6);
            qua.p f81653a3 = recurringPaymentWithExtra2.getF81653a();
            qua.p f81653a4 = recurringPaymentWithExtra2.getF81653a();
            hVar.getClass();
            arrayList2.add(new RowDelegate.Model(str2, avatar2, new TextClause(jli.g.b(h.b(f81653a4, aVar, bVar)), (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122), null, 0, new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.recurring_list_pending, null, null, 14), null, null, 0, new RowDelegate.Model.c.b(r.a(recurringPaymentWithExtra2, true, false, Integer.valueOf(R$attr.uikit_colorGreyTone50)), j(recurringPaymentWithExtra2), null, false, 124), false, null, false, cVar, null, null, null, null, null, f81653a3, null, 0, 0, 0, 0, 532659160));
            it10 = it11;
            contactsWithPaidPlan = map;
        }
        if (!(headerConfig instanceof a9e.f)) {
            if (!headerConfig.equals(a9e.e.f2426a)) {
                throw new NoWhenBranchMatchedException();
            }
            List listO = i2b.a.o(i2b.a.o(arrayListL, arrayList), arrayList2);
            yp0.b.k(listO, R$attr.uikit_dp16, R$attr.uikit_dp0, 0, 0, 28);
            return listO;
        }
        a9e.f fVar = (a9e.f) headerConfig;
        dj0.d dVarG = g(subscriptionsExtra, fVar.e, fVar.f2428b);
        ListSubheaderDelegate.Model modelK = k(this, fVar.f2427a, fVar.f2429c, fVar.f ? new MoneyClause(dVarG, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null, fVar.d, fVar.f2430g, 16);
        List listO2 = i2b.a.o(i2b.a.o(arrayListL, arrayList), arrayList2);
        int i = R$attr.uikit_dp0;
        yp0.b.k(listO2, i, i, 0, 0, 28);
        return i2b.a.q(modelK, listO2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List n(java.util.List r24) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mae.o.n(java.util.List):java.util.List");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    public final List o(String actionListId, ArrayList subscriptions, List list, xi0.b baseCurrency, List rates, boolean z, boolean z3, Map map, k71.q qVar) {
        MoneyClause moneyClause;
        Intrinsics.checkNotNullParameter(actionListId, "actionListId");
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        List vaults = list;
        Intrinsics.checkNotNullParameter(vaults, "vaults");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Map contactsWithPaidPlan = map;
        Intrinsics.checkNotNullParameter(contactsWithPaidPlan, "contactsWithPaidPlan");
        k71.q transactionsExtraData = qVar;
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        int i = 14;
        Object obj2 = null;
        if (subscriptions.isEmpty()) {
            if (!z3) {
                return null;
            }
            ActionWidgetDelegate.Model model = new ActionWidgetDelegate.Model("ACTION_WIDGET_LIST_ID", new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.payments_transfers_scheduled_flow_new_widget_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.payments_transfers_scheduled_flow_new_widget_description, null, null, 14), new com.revolut.core.ui_kit.delegates.m(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D268", null, null, null, 30), (LayeredImage) null, (ProgressStyle) null, 6), new ActionWidgetDelegate.Model.b.a(null), new com.revolut.core.ui_kit.delegates.i(14, new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.payments_transfers_scheduled_flow_new_widget_action, null, null, 14), null, false), null, null, null, false, 8128);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            return zhm.u.c(model);
        }
        o oVar = this;
        if (z) {
            dj0.d dVarG = oVar.g(subscriptions, rates, baseCurrency);
            if (subscriptions.isEmpty()) {
                dVarG = dVarG.l();
                moneyClause = new MoneyClause(dVarG, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), null, null, 12);
            } else {
                Iterator it8 = subscriptions.iterator();
                while (it8.hasNext()) {
                    if (ofm.q.E(((RecurringPaymentWithExtra) it8.next()).getF81653a())) {
                        break;
                    }
                }
                dVarG = dVarG.l();
                moneyClause = new MoneyClause(dVarG, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), null, null, 12);
            }
        } else {
            moneyClause = null;
        }
        ArrayList arrayList = new ArrayList(w.t(subscriptions, 10));
        for (Iterator it9 = subscriptions.iterator(); it9.hasNext(); it9 = it9) {
            arrayList.add(f(oVar, (RecurringPaymentWithExtra) it9.next(), false, false, false, vaults, null, false, Integer.valueOf(R$attr.uikit_colorGreyTone50), contactsWithPaidPlan, null, transactionsExtraData, 1262));
            vaults = list;
            contactsWithPaidPlan = map;
            transactionsExtraData = qVar;
            obj2 = obj2;
            i = i;
            oVar = this;
        }
        int i2 = i;
        ?? r06 = obj2;
        aim.e eVarB = zhm.u.b();
        eVarB.addAll(arrayList);
        eVarB.add(new InputDisclosureDelegate.Model(actionListId, new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.payments_transfers_scheduled_flow_go_to_scheduled_title, r06, r06, i2), null, null, null, 1016));
        return yp0.b.g(zhm.u.a(eVarB), k(this, "DEFAULT_HEADER_ID", new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.payments_transfers_scheduled_flow_upcoming_title, r06, r06, i2), moneyClause, true, false, 48), null, 0, 0, 126);
    }
}
