package sx2;

import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.data.model.Data;
import com.revolut.feature.card_screen.common.cards.models.CardsStateSnapshot$SubscriptionsContent;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.api.models.rev10.LoanState;
import com.revolut.feature.shared.help_centre.api.faq.model.DisplayableFaqItem;
import com.revolut.feature.shared.help_centre.impl.R$string;
import com.revolut.feature.shared.help_centre.impl.extension.HelpWidgetParcel;
import com.revolut.feature.travel.flights.impl.ui.screen.dates_selection.TravelFlightsDatesSelectionScreenContract$Trip;
import com.revolut.feature.travel.flights.impl.ui.screen.post_booking.TravelFlightsPostBookingScreenContract$Tab;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.shared.cards.model.card_config.domain.CardDetailsDesignConfig;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t73.d3;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f266292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f266293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f266294c;

    public /* synthetic */ h(com.revolut.feature.travel.flights.impl.ui.screen.dates_selection.a aVar, TravelFlightsDatesSelectionScreenContract$Trip travelFlightsDatesSelectionScreenContract$Trip, LocalDate localDate) {
        this.f266292a = 22;
        this.f266293b = travelFlightsDatesSelectionScreenContract$Trip;
        this.f266294c = localDate;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sx2.h.a(java.lang.Object):java.lang.Object");
    }

    private final Object b(Object obj2) {
        t45.k kVar = (t45.k) this.f266293b;
        String loanId = (String) this.f266294c;
        LoanDetails loanDetails = (LoanDetails) obj2;
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        Loan loan = loanDetails.f70144a;
        if ((loan.getI() instanceof LoanState.Repaid) || (loan.getI() instanceof LoanState.Planned)) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "LoanActionPerformerImpl", "Partial repayment - unrepayable state: " + loanDetails.f70144a.i, null, null, 16);
            ufm.b bVarM = efm.d0.m(DummyCommand.f98635a);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        g55.c cVar = (g55.c) kVar.f;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        efm.d0 d0VarFirstOrError = m70.a.g(cVar.f140625a.b(loanId, w4l.h.f294642c), null, new g3e.s(24), 1).firstOrError();
        g48.k kVar2 = new g48.k(12, new g48.j(cVar, loanId, 5));
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, kVar2, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    private final Object c(Object obj2) {
        List pagerItems = (List) this.f266293b;
        com.revolut.feature.travel.flights.impl.ui.screen.post_booking.b bVar = (com.revolut.feature.travel.flights.impl.ui.screen.post_booking.b) this.f266294c;
        String f70838b = ((t6g.d) obj2).f268348b;
        List list = pagerItems;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((TravelFlightsPostBookingScreenContract$Tab) it8.next()).getF94249a());
        }
        String str = bVar.f93394q;
        if (str != null && arrayList.contains(str)) {
            bVar.f93394q = null;
            f70838b = str;
        } else if (f70838b == null || !arrayList.contains(f70838b)) {
            f70838b = TravelFlightsPostBookingScreenContract$Tab.Overview.f93392a.getF94249a();
        }
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        return new t6g.d(pagerItems, f70838b);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    private final Object d(Object obj2) {
        efm.r rVarT;
        t73.f fVar = (t73.f) this.f266293b;
        String str = (String) this.f266294c;
        Boolean isIndiaUser = (Boolean) obj2;
        Intrinsics.checkNotNullParameter(isIndiaUser, "isIndiaUser");
        ?? r2 = fVar.f;
        if (!((Boolean) r2.getValue()).booleanValue() && !isIndiaUser.booleanValue()) {
            zhm.f0 f0Var = zhm.f0.f322471a;
            return te0.w.h(new CardsStateSnapshot$SubscriptionsContent(f0Var, f0Var, f0Var, false));
        }
        efm.r rVarP = ((yua.q) fVar.f268460a).p(str, false);
        if (((Boolean) r2.getValue()).booleanValue()) {
            wae.e eVar = (wae.e) fVar.e;
            yua.q qVar = (yua.q) eVar.f295870a;
            sfm.b bVar = new sfm.b(qVar.m(), new yta.c(16, new yua.g(qVar, 0)), 2);
            Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
            rVarT = pd.b.t(bVar, new w38.v(eVar, str, 17));
        } else {
            rVarT = te0.w.h(new Data(zhm.f0.f322471a, null, false, 6, null));
        }
        return kli.a.h(rVarP, rVarT).map(new t45.a(new t5e.m(fVar, 4), 14));
    }

    private final Object e(Object obj2) {
        h93.f0 f0Var = (h93.f0) this.f266293b;
        CardDetailsDesignConfig cardDetailsDesignConfig = (CardDetailsDesignConfig) this.f266294c;
        t73.q0 update = (t73.q0) obj2;
        Intrinsics.checkNotNullParameter(update, "$this$update");
        s63.g gVar = (s63.g) update.f268506a.getContent();
        s63.e eVar = update.f268516q;
        if (!Intrinsics.f(eVar != null ? eVar.f260114a : null, f0Var) || gVar == null) {
            return Intrinsics.f(eVar != null ? eVar.f260114a : null, f0Var) ? t73.q0.a(update, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33488895) : update;
        }
        List list = gVar.f260121b;
        h93.f0 f0Var2 = (h93.f0) zhm.d0.e0(eVar.f260115b, list);
        if (f0Var2 == null) {
            f0Var2 = (h93.f0) zhm.d0.m0(list);
        }
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        CardDetailsDesignConfig cardDetailsDesignConfigI = uj3.b.i(f0Var2, gVar.f260122c);
        od0.i.Companion.getClass();
        h93.f0 f0Var3 = f0Var2;
        return t73.q0.a(update, new Data(s63.g.a(gVar, od0.h.a(f0Var3)), null, false, 6, null), od0.h.a(f0Var3), od0.i.f224256b, null, null, null, null, null, null, null, null, null, null, new b9.u(cardDetailsDesignConfig, cardDetailsDesignConfigI), null, null, false, 32440262);
    }

    private final Object g(Object obj2) {
        d3 d3Var = (d3) this.f266293b;
        CardsStateSnapshot$SubscriptionsContent cardsStateSnapshot$SubscriptionsContent = (CardsStateSnapshot$SubscriptionsContent) this.f266294c;
        String it8 = (String) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return d3Var.f268454t.a(it8).startWith(cardsStateSnapshot$SubscriptionsContent);
    }

    private final Object h(Object obj2) {
        com.revolut.feature.shared.help_centre.impl.extension.b bVar = (com.revolut.feature.shared.help_centre.impl.extension.b) this.f266293b;
        i7d.k kVar = (i7d.k) this.f266294c;
        List flattenItems = (List) obj2;
        Intrinsics.checkNotNullParameter(flattenItems, "flattenItems");
        if (flattenItems.isEmpty()) {
            return zhm.f0.f322471a;
        }
        String strValueOf = String.valueOf(kVar.hashCode());
        TextLocalisedClause textLocalisedClause = kVar.f159275b;
        String str = kVar.f159274a;
        bVar.getClass();
        boolean z = flattenItems.size() > 4;
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model(strValueOf, (Image) null, (Clause) textLocalisedClause, (ResourceImage) null, false, false, (Clause) (z ? new TextLocalisedClause(R$string.faq_entry_header_button_see_all, null, null, 14) : null), z, (Object) new HelpWidgetParcel.SeeAll(textLocalisedClause, str, flattenItems), (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 259898);
        List<DisplayableFaqItem> listV0 = zhm.d0.V0(flattenItems, flattenItems.size() > 4 ? 3 : 4);
        ArrayList arrayList = new ArrayList(zhm.w.t(listV0, 10));
        for (DisplayableFaqItem displayableFaqItem : listV0) {
            arrayList.add(new InputDisclosureDelegate.Model(com.google.android.gms.internal.mlkit_vision_face.a.o(strValueOf, ":", displayableFaqItem.getF86140b()), displayableFaqItem.getF86141c(), null, new HelpWidgetParcel.Item(displayableFaqItem), null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return zhm.d0.E0(arrayList, zhm.u.c(model));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25, types: [ej0.b] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r4v38, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v39, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v40, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v53 */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r47) {
        /*
            Method dump skipped, instruction units count: 2756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sx2.h.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ h(Object obj2, Object obj3, int i) {
        this.f266292a = i;
        this.f266293b = obj2;
        this.f266294c = obj3;
    }
}
