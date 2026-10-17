package cd7;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.n3;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.home_feed.api.R$string;
import com.revolut.feature.home_feed.impl.widgets.scheduled_payments.ScheduledPaymentsEntryPoint;
import com.revolut.feature.home_feed.impl.widgets.scheduled_payments.ScheduledPaymentsWidgetContext;
import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k71.q;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qua.p;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScheduledPaymentsWidgetContext f23200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f23202c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ com.revolut.feature.home_feed.impl.widgets.scheduled_payments.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f23203g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23204h;

    public /* synthetic */ b(ScheduledPaymentsWidgetContext scheduledPaymentsWidgetContext, boolean z, boolean z3, boolean z4, boolean z6, com.revolut.feature.home_feed.impl.widgets.scheduled_payments.b bVar, String str, int i) {
        this.f23200a = scheduledPaymentsWidgetContext;
        this.f23201b = z;
        this.f23202c = z3;
        this.d = z4;
        this.e = z6;
        this.f = bVar;
        this.f23203g = str;
        this.f23204h = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z;
        vf0.h hVar = (vf0.h) obj2;
        Intrinsics.checkNotNullParameter(hVar, "<destruct>");
        List recurringPayments = (List) hVar.f288433a;
        List vaults = (List) hVar.f288434b;
        Map contactsWithPaidPlan = (Map) hVar.f288435c;
        q transactionsExtraData = (q) hVar.d;
        ScheduledPaymentsWidgetContext scheduledPaymentsWidgetContext = this.f23200a;
        boolean z3 = scheduledPaymentsWidgetContext.getEntryPoint() instanceof ScheduledPaymentsEntryPoint.CreditCard;
        boolean z4 = this.f23201b && !z3;
        boolean z6 = this.f23202c && !z3;
        boolean z11 = this.d && !z3;
        if (!z3 || !this.e) {
            z = false;
            break;
        }
        List list = recurringPayments;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                if (((RecurringPaymentWithExtra) it8.next()).getF81653a().f249314a.f160152c == ibd.h.CREDIT_CARD_PAYMENT) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        boolean zIsEmpty = recurringPayments.isEmpty();
        String listId = this.f23203g;
        if (zIsEmpty) {
            boolean z12 = z;
            boolean z29 = z4;
            boolean z31 = z11;
            Intrinsics.checkNotNullParameter(listId, "listId");
            RowsWidgetDelegate.Model.Companion companion = RowsWidgetDelegate.Model.INSTANCE;
            BaseDynamicWidgetDelegate.BigHeaderModel bigHeaderModel = new BaseDynamicWidgetDelegate.BigHeaderModel("header", gc7.f.d(), null, false, null, 56);
            aim.e eVarB = u.b();
            if (z12) {
                eVarB.add(gc7.f.b());
            }
            eVarB.addAll(gc7.f.c(z29, z6, z31));
            Unit unit = Unit.f186387a;
            return RowsWidgetDelegate.Model.Companion.d(companion, listId, bigHeaderModel, u.a(eVarB), null, null, null, null, SyslogConstants.LOG_CLOCK);
        }
        gc7.f fVar = this.f.d;
        Intrinsics.h(transactionsExtraData);
        ScheduledPaymentsEntryPoint entryPoint = scheduledPaymentsWidgetContext.getEntryPoint();
        Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
        Intrinsics.checkNotNullParameter(vaults, "vaults");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(contactsWithPaidPlan, "contactsWithPaidPlan");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        List list2 = recurringPayments;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            RecurringPaymentWithExtra recurringPaymentWithExtra = (RecurringPaymentWithExtra) it9.next();
            boolean z41 = z4;
            boolean z49 = z6;
            gc7.f fVar2 = fVar;
            boolean z54 = z11;
            String str = listId;
            ArrayList arrayList2 = arrayList;
            boolean z74 = z;
            Iterator it10 = it9;
            ScheduledPaymentsEntryPoint scheduledPaymentsEntryPoint = entryPoint;
            RowDelegate.Model modelD = a9e.h.d(fVar.f142369a, recurringPaymentWithExtra, vaults, transactionsExtraData, true, !(recurringPaymentWithExtra.getF81653a().f249314a.f160152c == ibd.h.CREDIT_CARD_PAYMENT && (entryPoint instanceof ScheduledPaymentsEntryPoint.CreditCard)), null, false, contactsWithPaidPlan, null, 352);
            p f81653a = recurringPaymentWithExtra.getF81653a();
            if (qua.u.k(f81653a)) {
                modelD = RowDelegate.Model.x(modelD, null, null, null, new CompositeClause(v.k(new TextLocalisedClause(R$string.scheduled_payments_widget_item_state_blocked, null, null, 14), new TextLocalisedClause(R$string.scheduled_payments_widget_item_type_subscription, null, null, 14)), new DotDividerClause((Integer) null), null, null, 12), null, 0, null, false, null, null, 0, 0, 0, 0, null, -33, 15);
            } else if (qua.u.s(f81653a, ((l80.f) fVar2.f142370b).g())) {
                modelD = RowDelegate.Model.x(modelD, null, null, null, new CompositeClause(v.k(new TextLocalisedClause(R$string.scheduled_payments_widget_item_state_inactive, null, null, 14), new TextLocalisedClause(R$string.scheduled_payments_widget_item_type_recurring, null, null, 14)), new DotDividerClause((Integer) null), null, null, 12), null, 0, null, false, null, null, 0, 0, 0, 0, null, -33, 15);
            }
            arrayList2.add(modelD);
            arrayList = arrayList2;
            z11 = z54;
            fVar = fVar2;
            z4 = z41;
            entryPoint = scheduledPaymentsEntryPoint;
            it9 = it10;
            z = z74;
            z6 = z49;
            listId = str;
        }
        boolean z83 = z;
        boolean z89 = z4;
        boolean z96 = z6;
        boolean z100 = z11;
        String str2 = listId;
        ArrayList arrayList3 = arrayList;
        aim.e eVarB2 = u.b();
        if (z83) {
            eVarB2.add(gc7.f.b());
        }
        aim.e eVarA = u.a(eVarB2);
        aim.e eVarB3 = u.b();
        eVarB3.addAll(arrayList3);
        eVarB3.addAll(gc7.f.c(z89, z96, z100));
        ArrayList arrayListE0 = d0.E0(u.a(eVarB3), eVarA);
        int i = this.f23204h;
        List items = d0.V0(arrayListE0, i);
        boolean z101 = arrayList3.size() + eVarA.size() > i;
        Intrinsics.checkNotNullParameter(items, "items");
        return RowsWidgetDelegate.Model.Companion.d(RowsWidgetDelegate.Model.INSTANCE, str2, new BaseDynamicWidgetDelegate.BigHeaderModel("header", gc7.f.d(), null, false, null, 56), items, z101 ? new n3(new TextLocalisedClause(R$string.scheduled_payments_widget_action_see_all, null, null, 14), null) : null, null, null, null, 112);
    }
}
