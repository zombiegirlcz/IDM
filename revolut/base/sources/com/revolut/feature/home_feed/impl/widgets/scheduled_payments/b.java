package com.revolut.feature.home_feed.impl.widgets.scheduled_payments;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.home_feed.impl.widgets.scheduled_payments.ScheduledPaymentsEntryPoint;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import csh.e;
import dsh.r;
import g48.r0;
import gc7.f;
import java.util.ArrayList;
import java.util.List;
import koi.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Flow;
import o7.d;
import od0.i;
import om4.y3;
import op0.q;
import op0.s;
import skm.p0;
import te0.w;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f74733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ppg.b f74734c;
    public final f d;
    public final wif.a e;
    public final ypf.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r0 f74735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vo1.c f74736h;
    public final cl3.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final nhf.a f74737j;
    public final a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final lb5.b f74738l;

    public b(d scheduledPaymentsForWidgetProvider, ppg.b vaultsInteractor, f mapper, wif.a userFeaturesChecker, ypf.b scheduleAvailabilityInteractor, r0 jointInteractor, vo1.c billsFeatureChecker, cl3.a contactsInteractor, nhf.a unitedWalletInteractor, a additionalFilterProvider, lb5.b creditCardAutopayInteractor) {
        Intrinsics.checkNotNullParameter(scheduledPaymentsForWidgetProvider, "scheduledPaymentsForWidgetProvider");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(userFeaturesChecker, "userFeaturesChecker");
        Intrinsics.checkNotNullParameter(scheduleAvailabilityInteractor, "scheduleAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(jointInteractor, "jointInteractor");
        Intrinsics.checkNotNullParameter(billsFeatureChecker, "billsFeatureChecker");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(additionalFilterProvider, "additionalFilterProvider");
        Intrinsics.checkNotNullParameter(creditCardAutopayInteractor, "creditCardAutopayInteractor");
        this.f74733b = scheduledPaymentsForWidgetProvider;
        this.f74734c = vaultsInteractor;
        this.d = mapper;
        this.e = userFeaturesChecker;
        this.f = scheduleAvailabilityInteractor;
        this.f74735g = jointInteractor;
        this.f74736h = billsFeatureChecker;
        this.i = contactsInteractor;
        this.f74737j = unitedWalletInteractor;
        this.k = additionalFilterProvider;
        this.f74738l = creditCardAutopayInteractor;
    }

    public static int i(String str, dsh.e eVar) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1196745529) {
            if (iHashCode != 1003263326) {
                if (iHashCode == 1555354674 && str.equals("UpcomingPaymentsLarge")) {
                    r.Companion.getClass();
                    return r.a.b(eVar, 5);
                }
            } else if (str.equals("UpcomingPaymentsMedium")) {
                r.Companion.getClass();
                return r.a.b(eVar, 2);
            }
        } else if (str.equals("UpcomingPaymentsList")) {
            return r.a.c(r.Companion, eVar);
        }
        throw new IllegalArgumentException(p.a.p("Widget ", str, " type not supported"));
    }

    @Override // csh.e
    public final List a(String widgetType, dsh.e inputConfig) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        return u.c(r.a.a(r.Companion, inputConfig, null, String.valueOf(i(widgetType, inputConfig)), 6));
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1196745529 ? !str.equals("UpcomingPaymentsList") : iHashCode == 1003263326 ? !str.equals("UpcomingPaymentsMedium") : !(iHashCode == 1555354674 && str.equals("UpcomingPaymentsLarge"))) {
            throw new IllegalArgumentException();
        }
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String listId, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(listId, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        int iHashCode = widgetType.hashCode();
        if (iHashCode != -1196745529) {
            if (iHashCode != 1003263326) {
                if (iHashCode == 1555354674 && widgetType.equals("UpcomingPaymentsLarge")) {
                    Intrinsics.checkNotNullParameter(listId, "listId");
                    RowsWidgetDelegate.Model.Companion companion = RowsWidgetDelegate.Model.INSTANCE;
                    TextLocalisedClause title = f.d();
                    companion.getClass();
                    Intrinsics.checkNotNullParameter(listId, "listId");
                    Intrinsics.checkNotNullParameter(title, "title");
                    s0 s0Var = new s0(2);
                    s0Var.a(new s(yh5.b.a(title), true));
                    q qVar = q.LARGE;
                    s0Var.b(RowsWidgetDelegate.Model.Companion.f(5, qVar));
                    ArrayList arrayList = s0Var.f186433a;
                    return new RowsWidgetDelegate.Model(listId, v.k(arrayList.toArray(new j[arrayList.size()])), true, qVar, null, new py0.c(title), false, null, null, 1920);
                }
            } else if (widgetType.equals("UpcomingPaymentsMedium")) {
                Intrinsics.checkNotNullParameter(listId, "listId");
                return RowsWidgetDelegate.Model.Companion.g(RowsWidgetDelegate.Model.INSTANCE, listId, f.d());
            }
        } else if (widgetType.equals("UpcomingPaymentsList")) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            return RowsWidgetDelegate.Model.Companion.b(RowsWidgetDelegate.Model.INSTANCE, listId, f.d(), r.a.c(r.Companion, eVar), null, 24);
        }
        throw new IllegalArgumentException();
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        ScheduledPaymentsWidgetContext scheduledPaymentsWidgetContext = (ScheduledPaymentsWidgetContext) widgetContext;
        int iHashCode = str2.hashCode();
        if (iHashCode == -1196745529 ? !str2.equals("UpcomingPaymentsList") : iHashCode == 1003263326 ? !str2.equals("UpcomingPaymentsMedium") : !(iHashCode == 1555354674 && str2.equals("UpcomingPaymentsLarge"))) {
            throw new IllegalArgumentException();
        }
        return vkm.q.x(j(str, str2, eVar, scheduledPaymentsWidgetContext), fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        ScheduledPaymentsWidgetContext widgetContext2 = (ScheduledPaymentsWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        int iHashCode = widgetType.hashCode();
        if (iHashCode == -1196745529 ? !widgetType.equals("UpcomingPaymentsList") : iHashCode == 1003263326 ? !widgetType.equals("UpcomingPaymentsMedium") : !(iHashCode == 1555354674 && widgetType.equals("UpcomingPaymentsLarge"))) {
            throw new IllegalArgumentException();
        }
        return j(id10, widgetType, config, widgetContext2);
    }

    @Override // csh.e
    public final /* bridge */ dsh.j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((ScheduledPaymentsWidgetContext) widgetContext, str, eVar);
        return null;
    }

    public final vkm.d j(String str, String str2, dsh.e eVar, ScheduledPaymentsWidgetContext widgetContext) {
        efm.r rVarG;
        Flow flowG;
        String str3;
        int i = i(str2, eVar);
        int i2 = i + 1;
        efm.r rVarD = this.e.d(wog.a.SUBSCRIPTIONS);
        ae8.c cVarA = this.f.f315862a.f109573b.A("TRANSFER.scheduled");
        g gVar = g.f186406a;
        efm.r rVarC = rd0.e.c(cVarA, gVar);
        ufm.c cVar = new ufm.c(new fp1.a((fp1.d) this.f74736h, 5), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        efm.r rVarX = cVar.x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        int i3 = cd7.c.f23205a[widgetContext.getAccountType().ordinal()];
        w4l.j jVar = w4l.j.f294644c;
        if (i3 == 1) {
            n38.q[] elements = {n38.q.ACTIVE, n38.q.OFFBOARDING, n38.q.PENDING};
            Intrinsics.checkNotNullParameter(elements, "elements");
            rVarG = m70.a.g(nim.a.w(rd0.e.c(this.f74735g.e(kotlin.collections.d.y0(elements), jVar), p0.f264003c), new ccg.c(7)), null, new ccg.a(5), 1);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            rVarG = w.h(AccountId.Personal.f51414a);
        }
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        ScheduledPaymentsEntryPoint entryPoint = widgetContext.getEntryPoint();
        if (entryPoint == null) {
            i.Companion.getClass();
            flowG = new go.g(i.f224256b, 2);
        } else {
            if (!(entryPoint instanceof ScheduledPaymentsEntryPoint.CreditCard)) {
                throw new NoWhenBranchMatchedException();
            }
            flowG = mo3.a.g(nim.a.v(((y3) this.k.f74732a).f(((ScheduledPaymentsEntryPoint.CreditCard) entryPoint).f74731a, jVar), new ccg.c(6)), null, new ccg.a(2), 1);
        }
        efm.r rVarC2 = rd0.e.c(flowG, gVar);
        ScheduledPaymentsEntryPoint entryPoint2 = widgetContext.getEntryPoint();
        ScheduledPaymentsEntryPoint.CreditCard creditCard = entryPoint2 instanceof ScheduledPaymentsEntryPoint.CreditCard ? (ScheduledPaymentsEntryPoint.CreditCard) entryPoint2 : null;
        efm.r rVarSwitchMap = w.p(rVarD, rVarC, rVarX, rVarG, rVarC2, rd0.e.c((creditCard == null || (str3 = creditCard.f74731a) == null) ? new go.g(Boolean.FALSE, 2) : ((yb5.e) this.f74738l).g(str3, jVar), gVar)).switchMap(new cd0.c(new cd7.a(this, i2, widgetContext, str, i), 4));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rd0.e.b(rVarSwitchMap);
    }
}
