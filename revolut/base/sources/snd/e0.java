package snd;

import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.data.model.Data;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardContract$AccountSelectorPopupAction;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardContract$ContextMenuAction;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardContract$PeriodPopupAction;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import dod.b;
import java.time.LocalDate;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.b f264530w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f264530w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e0 e0Var = new e0(this.f264530w, continuation, 0);
                e0Var.v = obj2;
                return e0Var;
            case 1:
                e0 e0Var2 = new e0(this.f264530w, continuation, 1);
                e0Var2.v = obj2;
                return e0Var2;
            default:
                e0 e0Var3 = new e0(this.f264530w, continuation, 2);
                e0Var3.v = obj2;
                return e0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e0) create((PopupMenuItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        xnd.h hVar;
        Object objPrevious;
        lzi.j jVar;
        aii.m mVar;
        AnalyticsAccountsSelection analyticsAccountsSelection;
        int i = this.u;
        com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.b bVar = this.f264530w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.z, new s86.k(data, 15));
                return Unit.f186387a;
            case 1:
                List list = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.z, new s78.n(list, 5));
                return Unit.f186387a;
            default:
                PopupMenuItem popupMenuItem = (PopupMenuItem) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(popupMenuItem);
                boolean z = popupMenuItem instanceof PopupMenuItem.Cell;
                PopupMenuItem.Cell cell = z ? (PopupMenuItem.Cell) popupMenuItem : null;
                Object obj3 = cell != null ? cell.i : null;
                if (obj3 instanceof AnalyticsDashboardContract$AccountSelectorPopupAction) {
                    AnalyticsDashboardContract$AccountSelectorPopupAction analyticsDashboardContract$AccountSelectorPopupAction = (AnalyticsDashboardContract$AccountSelectorPopupAction) obj3;
                    if (analyticsDashboardContract$AccountSelectorPopupAction.equals(AnalyticsDashboardContract$AccountSelectorPopupAction.Filters.f87514a)) {
                        bVar.l1().M0(b.a.f116531b);
                    } else {
                        if (!(analyticsDashboardContract$AccountSelectorPopupAction instanceof AnalyticsDashboardContract$AccountSelectorPopupAction.Select)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        a aVar4 = (a) ((b) ((j2) bVar.z.f22677a).getValue()).f264521a.getContent();
                        if (aVar4 != null && (analyticsAccountsSelection = aVar4.f264515a) != null) {
                            AnalyticsDashboardContract$AccountSelectorPopupAction.Select select = (AnalyticsDashboardContract$AccountSelectorPopupAction.Select) analyticsDashboardContract$AccountSelectorPopupAction;
                            if (!Intrinsics.f(select.f87515a, analyticsAccountsSelection)) {
                                bVar.n2(new com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.a(bVar, select, null), new whi.b(6));
                            }
                        }
                    }
                } else if (obj3 instanceof AnalyticsDashboardContract$ContextMenuAction) {
                    AnalyticsDashboardContract$ContextMenuAction analyticsDashboardContract$ContextMenuAction = (AnalyticsDashboardContract$ContextMenuAction) obj3;
                    if (analyticsDashboardContract$ContextMenuAction.equals(AnalyticsDashboardContract$ContextMenuAction.LinkExternalAccount.f87521a)) {
                        mVar = b.c.f116533b;
                    } else if (analyticsDashboardContract$ContextMenuAction.equals(AnalyticsDashboardContract$ContextMenuAction.AddAsset.f87519a)) {
                        mVar = b.C0691b.f116532b;
                    } else {
                        if (!analyticsDashboardContract$ContextMenuAction.equals(AnalyticsDashboardContract$ContextMenuAction.AddTrip.f87520a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        mVar = b.d.f116534b;
                    }
                    bVar.l1().M0(mVar);
                } else {
                    PopupMenuItem.Cell cell2 = z ? (PopupMenuItem.Cell) popupMenuItem : null;
                    Object obj4 = cell2 != null ? cell2.i : null;
                    AnalyticsDashboardContract$PeriodPopupAction analyticsDashboardContract$PeriodPopupAction = obj4 instanceof AnalyticsDashboardContract$PeriodPopupAction ? (AnalyticsDashboardContract$PeriodPopupAction) obj4 : null;
                    if (analyticsDashboardContract$PeriodPopupAction != null) {
                        if (analyticsDashboardContract$PeriodPopupAction instanceof AnalyticsDashboardContract$PeriodPopupAction.SelectPeriodType) {
                            und.e eVar = bVar.o;
                            lzi.i type = ((AnalyticsDashboardContract$PeriodPopupAction.SelectPeriodType) analyticsDashboardContract$PeriodPopupAction).f87527a;
                            eVar.getClass();
                            Intrinsics.checkNotNullParameter(type, "type");
                            xnd.j jVar2 = eVar.f281426h;
                            j2 j2Var = jVar2.d;
                            Intrinsics.checkNotNullParameter(type, "type");
                            if (type != lzi.i.CUSTOM && (hVar = (xnd.h) ((od0.i) j2Var.getValue()).f224257a) != null) {
                                LocalDate localDate = (LocalDate) kotlin.ranges.f.d(hVar.f307401b.f200981b.f99211b, ((l80.f) jVar2.f307409c).e());
                                lzi.h hVar2 = hVar.f307400a;
                                kzi.a aVar5 = jVar2.f307408b;
                                lzi.h hVarN = xam.a.n(hVar2, type, 1L);
                                if (hVarN != null) {
                                    jVar = ((gqj.c) aVar5).d(localDate, hVarN);
                                } else {
                                    List listC = ((gqj.c) aVar5).c(localDate, type, null);
                                    ListIterator listIterator = listC.listIterator(listC.size());
                                    while (true) {
                                        if (listIterator.hasPrevious()) {
                                            objPrevious = listIterator.previous();
                                            AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval = (AnalyticsSpendingPeriod$Interval) objPrevious;
                                            LocalDate localDate2 = analyticsSpendingPeriod$Interval.f99210a;
                                            if (localDate.compareTo((Object) analyticsSpendingPeriod$Interval.f99211b) > 0 || localDate.compareTo((Object) localDate2) < 0) {
                                            }
                                        } else {
                                            objPrevious = null;
                                        }
                                    }
                                    AnalyticsSpendingPeriod$Interval analyticsSpendingPeriod$Interval2 = (AnalyticsSpendingPeriod$Interval) objPrevious;
                                    jVar = analyticsSpendingPeriod$Interval2 == null ? null : new lzi.j(type, analyticsSpendingPeriod$Interval2, null);
                                }
                                if (jVar != null) {
                                    xnd.h hVarA = xnd.h.a(hVar, jVar);
                                    od0.i.Companion.getClass();
                                    j2Var.g(null, od0.h.a(hVarA));
                                }
                            }
                        } else {
                            if (!analyticsDashboardContract$PeriodPopupAction.equals(AnalyticsDashboardContract$PeriodPopupAction.Preferences.f87526a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar.l1().M0(b.g.f116537b);
                        }
                    }
                }
                return Unit.f186387a;
        }
    }
}
