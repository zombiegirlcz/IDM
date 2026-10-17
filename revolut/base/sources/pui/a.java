package pui;

import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.card.models.additional_cards.AdditionalCardholdersState;
import com.revolut.feature.insurance_embedded.impl.data.model.l0;
import com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.RevPointsGiftcardsHomePagerFlowContract$PagerItem;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.stock_details.StockDetailsFlowControllerContract$Page;
import ip0.i70;
import ip0.kg;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import ip0.yl;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.MatchResult;
import lw0.h;
import puk.i;
import pv7.m;
import pv7.o;
import pv7.r;
import pvk.p;
import pw4.k;
import pwc.g;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f239899a;

    public /* synthetic */ a(int i) {
        this.f239899a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f239899a) {
            case 0:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.asft_pass_details_date, null, null, 14);
                CounterTextDelegate.c.a aVar = CounterTextDelegate.c.a.f52173a;
                CounterTextDelegate.Model model = new CounterTextDelegate.Model("list_id_pass_details_date", textLocalisedClause, aVar, null, false, null, null, 0, 0, 0, 0, 2024);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                CounterTextDelegate.Model model2 = new CounterTextDelegate.Model("list_id_pass_details_time_slot", new TextLocalisedClause(R$string.asft_pass_details_time_slot, null, null, 14), aVar, null, false, null, null, 0, 0, 0, 0, 2024);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                return u.c(c.b(v.k(model, model2)));
            case 1:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                s7 s7Var = new s7("list_id_manage_booking_loading", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                return u.c(s7Var);
            case 2:
                Function0 it10 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                kg kgVar = new kg("list_id_pass_loading", 14);
                yp0.b.l(kgVar, 0, 0, 0, 0, null, false, 63);
                return u.c(kgVar);
            case 3:
                Function0 it11 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                i70 i70Var = new i70("list_id_qr_code_loading", null, 6);
                yp0.b.l(i70Var, 0, 0, 0, 0, null, false, 63);
                return f.b(u.c(i70Var), false);
            case 4:
                puk.f it12 = (puk.f) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f239930c;
            case 5:
                puk.f it13 = (puk.f) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.f239930c;
            case 6:
                puk.f update = (puk.f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return puk.f.a(update, StockDetailsFlowControllerContract$Page.OVERVIEW.getF103057c(), null, null, null, null, null, false, false, null, 510);
            case 7:
                Function0 it14 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return i.f239938a;
            case 8:
                Function0 it15 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return null;
            case 9:
                m it16 = (m) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                l0 l0Var = (l0) it16.f239986a.getContent();
                if (l0Var != null) {
                    return l0Var.k;
                }
                return null;
            case 10:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new r((List) getDefaultLoadingItems.invoke(), o.b.f239993a);
            case 11:
                Function0 it17 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return f0.f322471a;
            case 12:
                kv9.f it18 = (kv9.f) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.getMembersKeychains();
            case 13:
                Function0 it19 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                h hVar = new h(lw0.i.AVATAR);
                IntRange intRange = new IntRange(0, 2, 1);
                ArrayList arrayList = new ArrayList(w.t(intRange, 10));
                vim.f it20 = intRange.iterator();
                while (it20.f289625c) {
                    arrayList.add(nb0.b(pb0.Companion, a0.d.n("LOADING_ITEM_ID_", it20.nextInt()), false, 0, false, 30));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return new cii.b(null, arrayList, hVar);
            case 14:
                p it21 = (p) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return it21.f240297a;
            case 15:
                p update2 = (p) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return p.a(update2, null, null, null, null, null, zi0.c.P(new hdh.e(f0.f322471a), false, null, 3), null, null, null, 479);
            case 16:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                hdh.e eVar = (hdh.e) pair.f186385a;
                mel.p pVar = (mel.p) pair.f186386b;
                List<Object> list = eVar.f151437a;
                ArrayList actionsInfo = new ArrayList(w.t(list, 10));
                for (Object objB : list) {
                    if (!(objB instanceof hdh.a) && !(objB instanceof hdh.b)) {
                        if (!(objB instanceof hdh.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i = pvk.a.f240262a[pVar.f204769a.ordinal()];
                        if (i == 1 || i == 2) {
                            objB = hdh.c.b((hdh.c) objB, 3);
                        } else if (i == 3) {
                            objB = hdh.c.b((hdh.c) objB, 1);
                        } else {
                            if (i != 4 && i != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            objB = hdh.c.b((hdh.c) objB, 5);
                        }
                    }
                    actionsInfo.add(objB);
                }
                Intrinsics.checkNotNullParameter(actionsInfo, "actionsInfo");
                return new hdh.e(actionsInfo);
            case 17:
                Function0 it22 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return v.k(new yl("summary-list-id", 0, 30), new yl("graph-header-list-id", 0, 30), new yl("loading-item-any", 0, 30));
            case 18:
                MatchResult it23 = (MatchResult) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return it23.getValue();
            case 19:
                AdditionalCardholdersState availability = (AdditionalCardholdersState) obj2;
                Intrinsics.checkNotNullParameter(availability, "availability");
                boolean z = false;
                if (availability instanceof AdditionalCardholdersState.Available) {
                    int i2 = k.f240331a[((AdditionalCardholdersState.Available) availability).f69811c.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        z = true;
                    }
                } else if (!(availability instanceof AdditionalCardholdersState.NotAvailable)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Boolean.valueOf(z);
            case 20:
                Throwable it24 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return Boolean.FALSE;
            case 21:
                pwb.f update3 = (pwb.f) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return pwb.f.a(update3, new RevPointsGiftcardsHomePagerFlowContract$PagerItem.Discover(false).getF103057c(), null, null, 13);
            case 22:
                pwb.f update4 = (pwb.f) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return pwb.f.a(update4, RevPointsGiftcardsHomePagerFlowContract$PagerItem.MyCards.f83676a.getF103057c(), null, null, 13);
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return f0.f322471a;
            case 24:
                g update5 = (g) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return g.a(update5, null, false, false, pwc.h.TRANSFERS, null, null, false, null, null, false, 4063);
            case 25:
                g update6 = (g) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return g.a(update6, null, false, false, pwc.h.CARD_PAYMENTS, null, null, false, null, null, false, 4063);
            case 26:
                g update7 = (g) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return g.a(update7, null, false, false, null, null, null, true, null, null, false, 3839);
            case 27:
                g update8 = (g) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return g.a(update8, null, false, false, null, null, null, false, null, null, false, 3839);
            case 28:
                return g.a((g) obj2, null, false, false, pwc.h.CARD_AND_CACHE_WITHDRAWALS, null, null, false, null, null, false, 4063);
            default:
                ((Long) obj2).longValue();
                return Unit.f186387a;
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f239899a = i;
    }
}
