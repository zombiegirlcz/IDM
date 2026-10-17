package ip3;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.corporate_events.impl.R$string;
import com.revolut.feature.corporate_events.impl.ui.screen.type_filter.CorporateEventsTypeFilterScreen;
import ip0.n40;
import ip0.o40;
import ip0.r40;
import java.util.ArrayList;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import yhm.o;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CorporateEventsTypeFilterScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CorporateEventsTypeFilterScreen corporateEventsTypeFilterScreen, Continuation continuation) {
        super(2, continuation);
        this.v = corporateEventsTypeFilterScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i;
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVarI3 = this.v.T2();
        Intrinsics.h(model);
        l lVar = (l) jVarI3;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52708a, "CORPORATE_EVENTS_EVENTS_FILTERS_HEADER_ID")) {
            j60.a aVar2 = lVar.f167639q;
            f fVar = lVar.f167640r;
            Set allActiveFilters = lVar.f167638p.f66153a;
            ((m) fVar).getClass();
            Intrinsics.checkNotNullParameter(allActiveFilters, "allActiveFilters");
            t tVar = new t(new TextLocalisedClause(R$string.feature_corporate_events_filter_screen_title_event_types, null, null, 14), null, null, 30);
            Set<iel.e> setH0 = d0.h0(ce9.m.c(), allActiveFilters);
            ArrayList arrayList = new ArrayList(w.t(setH0, 10));
            for (iel.e eVar : setH0) {
                String strR = a0.d.r(eVar.name(), "_glossary");
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(ce9.m.a(eVar), null, null, 14);
                switch (n.f167642a[eVar.ordinal()]) {
                    case 1:
                        i = R$string.feature_corporate_events_event_type_ex_dividend_description;
                        break;
                    case 2:
                        i = R$string.feature_corporate_events_bubble_dividends_description;
                        break;
                    case 3:
                        i = R$string.feature_corporate_events_event_type_market_holiday_description;
                        break;
                    case 4:
                        i = R$string.feature_corporate_events_bubble_listing_status_change_description;
                        break;
                    case 5:
                        i = R$string.feature_corporate_events_bubble_stock_split_description;
                        break;
                    case 6:
                        i = R$string.feature_corporate_events_bubble_symbol_change_description;
                        break;
                    case 7:
                        i = R$string.feature_corporate_events_bubble_earnings_call_full_description;
                        break;
                    case 8:
                        i = R$string.trading_corporate_event_learn_more_merger_what_is_it;
                        break;
                    case 9:
                        i = R$string.trading_corporate_event_learn_more_spin_off_what_is_it;
                        break;
                    case 10:
                        i = R$string.trading_corporate_event_learn_more_bankruptcy_what_is_it;
                        break;
                    case 11:
                        i = R$string.feature_corporate_events_event_type_coupon_description;
                        break;
                    case 12:
                        i = R$string.feature_corporate_events_event_type_call_description;
                        break;
                    case 13:
                        i = R$string.feature_corporate_events_event_type_principal_description;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                arrayList.add(new r40(strR, null, textLocalisedClause, new TextLocalisedClause(i, null, null, 14), null, null, ce9.m.b(eVar), false, new o40(n40.PAST), R$attr.uikit_dp16, R$attr.uikit_dp8, 0, null, 14514));
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            aVar2.x(new y(arrayList, tVar, rp0.l.WINDOW, null, null, null, 1016));
        }
        return Unit.f186387a;
    }
}
