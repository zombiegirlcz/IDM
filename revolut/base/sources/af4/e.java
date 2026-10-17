package af4;

import ahd.c0;
import ahe.e1;
import ahe.i1;
import ahe.k1;
import ahe.w0;
import aj6.x;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.revolut.data.model.Data;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.GooglePayConfirmationControllerContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_valuation.summary.MortgageValuationSummaryController;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.documents.RefinancingAccountDocumentsController;
import com.revolut.feature.credit.application.plugins.impl.ui.singleselectordetails.SingleSelectorInputDetailsScreen;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.robo.impl.ui.screen.edit_goal.EditGoalScreen;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlist_assets.WatchlistAssetsScreen;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlist_assets.WatchlistAssetsScreenContract$InputData;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistFetchConfig;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.suggested_experiences.TravelHotelsSuggestedExperiencesScreen;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.commodity.asset_details.api.navigation.CommodityAssetDetailsDestination;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import com.revolut.shared.cards.model.SharedRevolutCard;
import ip0.dg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import jkl.x2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.Json;
import nii.n1;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import ulm.j1;
import vkm.j2;
import vkm.v1;
import vkm.y;
import wim.z;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f3863w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f3863w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e((MortgageValuationSummaryController) this.f3863w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e((u) this.f3863w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            case 2:
                e eVar3 = new e((aff.n) this.f3863w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
            case 3:
                e eVar4 = new e((TravelHotelsSuggestedExperiencesScreen) this.f3863w, continuation, 3);
                eVar4.v = obj2;
                return eVar4;
            case 4:
                e eVar5 = new e((afg.i) this.f3863w, continuation, 4);
                eVar5.v = obj2;
                return eVar5;
            case 5:
                e eVar6 = new e((ag1.o) this.f3863w, continuation, 5);
                eVar6.v = obj2;
                return eVar6;
            case 6:
                return new e((com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.b) this.v, (String) this.f3863w, continuation, 6);
            case 7:
                return new e((com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.b) this.v, (SharedRevolutCard) this.f3863w, continuation, 7);
            case 8:
                e eVar7 = new e((RefinancingAccountDocumentsController) this.f3863w, continuation, 8);
                eVar7.v = obj2;
                return eVar7;
            case 9:
                e eVar8 = new e((WatchlistAssetsScreen) this.f3863w, continuation, 9);
                eVar8.v = obj2;
                return eVar8;
            case 10:
                e eVar9 = new e((w0) this.f3863w, continuation, 10);
                eVar9.v = obj2;
                return eVar9;
            case 11:
                return new e((k1) this.v, (Map) this.f3863w, continuation, 11);
            case 12:
                return new e((k1) this.v, (ArrayList) this.f3863w, continuation, 12);
            case 13:
                e eVar10 = new e((SingleSelectorInputDetailsScreen) this.f3863w, continuation, 13);
                eVar10.v = obj2;
                return eVar10;
            case 14:
                e eVar11 = new e((x) this.f3863w, continuation, 14);
                eVar11.v = obj2;
                return eVar11;
            case 15:
                e eVar12 = new e((ajh.l) this.f3863w, continuation, 15);
                eVar12.v = obj2;
                return eVar12;
            case 16:
                e eVar13 = new e((com.revolut.feature.retail.savings.impl.challenge.presentation.manage_challenge.a) this.f3863w, continuation, 16);
                eVar13.v = obj2;
                return eVar13;
            case 17:
                return new e((String) this.v, (OkHttpClient) this.f3863w, continuation, 17);
            case 18:
                e eVar14 = new e((al2.d) this.f3863w, continuation, 18);
                eVar14.v = obj2;
                return eVar14;
            case 19:
                e eVar15 = new e((com.revolut.feature.junior_referrals.impl.ui.allow_referrals_prompt.a) this.f3863w, continuation, 19);
                eVar15.v = obj2;
                return eVar15;
            case 20:
                e eVar16 = new e((alb.j) this.f3863w, continuation, 20);
                eVar16.v = obj2;
                return eVar16;
            case 21:
                e eVar17 = new e((ald.a) this.f3863w, continuation, 21);
                eVar17.v = obj2;
                return eVar17;
            case 22:
                e eVar18 = new e((ald.r) this.f3863w, continuation, 22);
                eVar18.v = obj2;
                return eVar18;
            case 23:
                e eVar19 = new e((ame.f) this.f3863w, continuation, 23);
                eVar19.v = obj2;
                return eVar19;
            case 24:
                return new e((wli.o) this.v, (ParcelableDestination) this.f3863w, continuation, 24);
            case 25:
                e eVar20 = new e((amk.h) this.f3863w, continuation, 25);
                eVar20.v = obj2;
                return eVar20;
            case 26:
                e eVar21 = new e((com.revolut.feature.payees.impl.ui.payees_select.b) this.f3863w, continuation, 26);
                eVar21.v = obj2;
                return eVar21;
            case 27:
                e eVar22 = new e((EditGoalScreen) this.f3863w, continuation, 27);
                eVar22.v = obj2;
                return eVar22;
            case 28:
                e eVar23 = new e((anh.m) this.f3863w, continuation, 28);
                eVar23.v = obj2;
                return eVar23;
            default:
                return new e((NaviCommand) this.v, (anh.o) this.f3863w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((dx4.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e) create((ce9.p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((e) create((dg) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((e) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((e) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((e) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((e) create((dx4.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((e) create((WatchlistItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((e) create((aj6.s) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((e) create((yk2.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((e) create((mii.q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((e) create((alb.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((e) create((SlotChecklistFetchConfig) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((e) create((SlotContext) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((e) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((e) create((oh7.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [zhm.h0] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws IOException {
        Data data;
        Data data2;
        cfi.a aVar;
        Flow gVar;
        ogd.k kVarG;
        Set setI1;
        Pair pair;
        List list;
        ejb.b bVar;
        List list2;
        List list3;
        Collection collectionValues;
        ejb.b bVar2;
        List list4;
        Set setKeySet;
        xi0.b bVar3;
        aii.u uVarA;
        int i = this.u;
        int i2 = 4;
        int i3 = 10;
        int i5 = 24;
        int i6 = 26;
        int i21 = 2;
        boolean z = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z6 = false;
        ?? I1 = 0;
        I1 = 0;
        Object obj3 = this.f3863w;
        switch (i) {
            case 0:
                dx4.l lVar = (dx4.l) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c8g.c.i(((MortgageValuationSummaryController) obj3).d(), lVar);
                return Unit.f186387a;
            case 1:
                Data data3 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVar = (u) obj3;
                uVar.H2(uVar.f3882t, new t(data3, z ? 1 : 0));
                return Unit.f186387a;
            case 2:
                ce9.p pVar = (ce9.p) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aff.n nVar = (aff.n) obj3;
                nVar.x2(new aff.m(pVar, z3 ? 1 : 0));
                ce9.o oVar = pVar.f;
                if (oVar != null) {
                    boolean z11 = ((gef.b) oVar.getContent()).f143284c.size() < 4;
                    gef.b bVar4 = (gef.b) pVar.f23436a;
                    i = (bVar4 != null ? bVar4.f143284c.size() : 0) >= 8 ? 0 : 1;
                    ce9.o oVar2 = pVar.f;
                    boolean zA = oVar2 != null ? oVar2.a() : false;
                    if ((z11 || i != 0) && !zA) {
                        io3.h.a(nVar.f4047r, ce9.n.LOAD_NEXT_PAGE);
                    }
                }
                return Unit.f186387a;
            case 3:
                dg model = (dg) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                afg.f fVarE3 = ((TravelHotelsSuggestedExperiencesScreen) obj3).d();
                Intrinsics.h(model);
                afg.i iVar = (afg.i) fVarE3;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                if (model.f163888a.equals("ERROR_ITEM_ID")) {
                    iVar.I2(w4l.i.f294643c);
                } else {
                    int i22 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 4:
                Pair pair2 = (Pair) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data4 = (Data) pair2.f186385a;
                Data data5 = (Data) pair2.f186386b;
                try {
                    Object content = data4.getContent();
                    data = new Data((content == null || (aVar = (cfi.a) d0.d0((List) content)) == null) ? null : aVar.f23696h, data4.getError(), data4.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data4.getLoading());
                }
                try {
                    Object content2 = data5.getContent();
                    data2 = new Data(content2 != null ? ((rei.g) content2).e : null, data5.getError(), data5.getLoading());
                    break;
                } catch (Throwable th11) {
                    data2 = new Data(null, th11, data5.getLoading());
                }
                afg.i iVar2 = (afg.i) obj3;
                iVar2.H2(iVar2.f4064t, new afg.h(z4 ? 1 : 0, data, data4, data2));
                return Unit.f186387a;
            case 5:
                List list5 = (List) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ag1.o oVar3 = (ag1.o) obj3;
                oVar3.H2(oVar3.f4772r, new a26.j(list5, i3));
                return Unit.f186387a;
            case 6:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.b bVar5 = (com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.b) this.v;
                k7i.i iVar3 = bVar5.f60897p;
                String token = (String) obj3;
                iVar3.getClass();
                Intrinsics.checkNotNullParameter(token, "token");
                ha3.x xVar = (ha3.x) ((l93.f) iVar3.f182069b);
                Intrinsics.checkNotNullParameter(token, "token");
                vkm.d dVarB = rd0.e.b(nim.a.w(rd0.e.c(xVar.f.v(token), kotlin.coroutines.g.f186406a), new kw2.a(iVar3, i)));
                GooglePayConfirmationControllerContract$InputData googlePayConfirmationControllerContract$InputData = bVar5.o;
                if (googlePayConfirmationControllerContract$InputData instanceof GooglePayConfirmationControllerContract$InputData.Confirmation) {
                    gVar = new y(new a35.j(i21, i, I1), new y(new v1(new a1a.b(bVar5, token, (Continuation) I1, 19)), new a35.k(3, i2, I1)));
                } else {
                    if (!(googlePayConfirmationControllerContract$InputData instanceof GooglePayConfirmationControllerContract$InputData.RevivalConfirmation)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gVar = new go.g(new Data(((GooglePayConfirmationControllerContract$InputData.RevivalConfirmation) googlePayConfirmationControllerContract$InputData).f60895b, null, false, 6, null), 2);
                }
                return yji.l.a1(bVar5, yh5.b.d(dVarB, gVar), null, null, new ah1.l(bVar5, I1, z6 ? 1 : 0), 3);
            case 7:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.b bVar6 = (com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.b) this.v;
                bVar6.C2(new ah1.f((SharedRevolutCard) obj3, bVar6.I2()));
                return Unit.f186387a;
            case 8:
                dx4.l lVar2 = (dx4.l) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c8g.c.i(((RefinancingAccountDocumentsController) obj3).e3(), lVar2);
                return Unit.f186387a;
            case 9:
                WatchlistItem watchlistItem = (WatchlistItem) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ahd.l lVarE3 = ((WatchlistAssetsScreen) obj3).R2();
                String watchlistId = watchlistItem.getId();
                c0 c0Var = (c0) lVarE3;
                c0Var.getClass();
                Intrinsics.checkNotNullParameter(watchlistId, "watchlistId");
                WatchlistAssetsScreenContract$InputData watchlistAssetsScreenContract$InputData = c0Var.o;
                String watchlistId2 = watchlistAssetsScreenContract$InputData.f86929a;
                if (watchlistId2 != null) {
                    l3d.r rVar = c0Var.f4938p;
                    String orderingKey = watchlistAssetsScreenContract$InputData.f86930b.f86889a;
                    rVar.getClass();
                    Intrinsics.checkNotNullParameter(orderingKey, "orderingKey");
                    Intrinsics.checkNotNullParameter(watchlistId2, "watchlistId");
                    n4d.m mVar = (n4d.m) rVar.f191928a;
                    Intrinsics.checkNotNullParameter(orderingKey, "orderingKey");
                    Intrinsics.checkNotNullParameter(watchlistId2, "watchlistId");
                    Map map = (Map) mVar.f212377c.a(new tk0.f("MULTIPLE_WATCHLISTS_SORTING_ALG"));
                    if (map == null || (kVarG = n4d.m.g(watchlistId2, orderingKey, map)) == null) {
                        kVarG = n4d.m.f212374j;
                    }
                    if (kVarG.f225123a == ogd.m.MANUAL) {
                        c0Var.H2(c0Var.f4943w, new a31.g(watchlistId, i5));
                    }
                }
                return Unit.f186387a;
            case 10:
                Data data6 = (Data) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((w0) obj3).f5052s.setValue(data6);
                return Unit.f186387a;
            case 11:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar = ((k1) this.v).f5010b;
                Map map2 = (Map) obj3;
                ArrayList arrayList = new ArrayList(map2.size());
                for (Map.Entry entry : map2.entrySet()) {
                    arrayList.add(new i1((TotalWealthCategoryKey) entry.getKey(), (ohe.e) entry.getValue()));
                }
                try {
                    KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                    KType kTypeB = o0.b(i1.class);
                    companion.getClass();
                    cVar.G(arrayList, "snapshot_entries_key", z.d(o0.c(List.class, KTypeProjection.Companion.a(kTypeB))));
                    break;
                } catch (SerializationException e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                    cVar.I0("snapshot_entries_key");
                } catch (Throwable th12) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th12, h0Var2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar2 = ((k1) this.v).f5010b;
                ArrayList arrayList2 = (ArrayList) obj3;
                try {
                    KTypeProjection.Companion companion2 = KTypeProjection.INSTANCE;
                    KType kTypeB2 = o0.b(e1.class);
                    companion2.getClass();
                    cVar2.G(arrayList2, "descriptors_cache_key", z.d(o0.c(List.class, KTypeProjection.Companion.a(kTypeB2))));
                    break;
                } catch (SerializationException e2) {
                    h0 h0Var3 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var3);
                    cVar2.I0("descriptors_cache_key");
                } catch (Throwable th13) {
                    h0 h0Var4 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th13, h0Var4);
                }
                return Unit.f186387a;
            case 13:
                String query = (String) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ai4.i iVarE3 = ((SingleSelectorInputDetailsScreen) obj3).d();
                Intrinsics.h(query);
                ai4.l lVar3 = (ai4.l) iVarE3;
                lVar3.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                lVar3.H2(lVar3.o, new a31.g(query, i6));
                return Unit.f186387a;
            case 14:
                aj6.s sVar = (aj6.s) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVar2 = (x) obj3;
                cli.y yVar = xVar2.u;
                fi6.d dVar = (fi6.d) sVar.f5426a.getContent();
                aj6.t tVar = x.Companion;
                if (dVar == null) {
                    h0 h0Var5 = h0.f322473a;
                    pair = new Pair(h0Var5, h0Var5);
                } else {
                    Data data7 = dVar.f135302j;
                    hi6.d.Companion.getClass();
                    Set set = hi6.d.f152510b;
                    x61.a aVar17 = ((aj6.i) ((j2) yVar.f22677a).getValue()).f;
                    boolean zT = d0.T(set, aVar17 != null ? aVar17.d : null);
                    List list6 = (List) dVar.f135301h.getContent();
                    if (list6 == null) {
                        list6 = f0.f322471a;
                    }
                    fi6.i iVarA = fi6.j.a(list6);
                    Map map3 = (Map) data7.getContent();
                    if (map3 == null || (setKeySet = map3.keySet()) == null) {
                        setI1 = null;
                    } else {
                        Set set2 = setKeySet;
                        ArrayList arrayList3 = new ArrayList(w.t(set2, 10));
                        Iterator it8 = set2.iterator();
                        while (it8.hasNext()) {
                            arrayList3.add(((bs8.b) it8.next()).f18079a);
                        }
                        setI1 = d0.i1(arrayList3);
                    }
                    if (setI1 == null) {
                        setI1 = h0.f322473a;
                    }
                    aim.o oVar4 = new aim.o();
                    List list7 = (List) dVar.f135297a.getContent();
                    if (list7 != null) {
                        Iterator it9 = list7.iterator();
                        while (it9.hasNext()) {
                            oVar4.add(((io3.d) it9.next()).f163145a);
                        }
                    }
                    List list8 = (List) dVar.f135298b.getContent();
                    if (list8 != null) {
                        Iterator it10 = list8.iterator();
                        while (it10.hasNext()) {
                            oVar4.add(((io3.d) it10.next()).f163145a);
                        }
                    }
                    Iterator it11 = dVar.d.iterator();
                    while (it11.hasNext()) {
                        oVar4.add(((CreditCard) it11.next()).f69793b);
                    }
                    Data data8 = dVar.f;
                    if (data8 != null && (bVar2 = (ejb.b) data8.getContent()) != null && (list4 = bVar2.f126837b) != null) {
                        Iterator it12 = list4.iterator();
                        while (it12.hasNext()) {
                            String pocketId = ((SavingsAccountDetails) it12.next()).f86460a.f234885h.getPocketId();
                            if (pocketId != null) {
                                oVar4.add(pocketId);
                            }
                        }
                    }
                    Iterator it13 = d0.E0(iVarA.f135316b, iVarA.f135315a).iterator();
                    while (it13.hasNext()) {
                        String pocketId2 = ((Subaccount) it13.next()).getPocketId();
                        if (pocketId2 != null) {
                            oVar4.add(pocketId2);
                        }
                    }
                    List list9 = (List) dVar.i.getContent();
                    if (list9 != null) {
                        Iterator it14 = list9.iterator();
                        while (it14.hasNext()) {
                            oVar4.add(((uc3.a) it14.next()).f278974b.f163145a);
                        }
                    }
                    Map map4 = (Map) data7.getContent();
                    if (map4 != null && (collectionValues = map4.values()) != null) {
                        Iterator it15 = collectionValues.iterator();
                        while (it15.hasNext()) {
                            Iterator it16 = ((List) it15.next()).iterator();
                            while (it16.hasNext()) {
                                oVar4.add(((bs8.a) it16.next()).f18076a);
                            }
                        }
                    }
                    Data data9 = dVar.k;
                    if (data9 != null && (list3 = (List) data9.getContent()) != null) {
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : list3) {
                            if (setI1.contains(((SavingsAccountDetails) obj4).f86460a.f)) {
                                arrayList4.add(obj4);
                            }
                        }
                        Iterator it17 = arrayList4.iterator();
                        while (it17.hasNext()) {
                            String pocketId3 = ((SavingsAccountDetails) it17.next()).f86460a.f234885h.getPocketId();
                            if (pocketId3 != null) {
                                oVar4.add(pocketId3);
                            }
                        }
                    }
                    if (!zT) {
                        List list10 = (List) dVar.f135299c.getContent();
                        if (list10 != null) {
                            Iterator it18 = list10.iterator();
                            while (it18.hasNext()) {
                                oVar4.add(((io3.d) it18.next()).f163145a);
                            }
                        }
                        Data data10 = dVar.f135300g;
                        if (data10 != null && (bVar = (ejb.b) data10.getContent()) != null && (list2 = bVar.f126837b) != null) {
                            Iterator it19 = list2.iterator();
                            while (it19.hasNext()) {
                                String pocketId4 = ((SavingsAccountDetails) it19.next()).f86460a.f234885h.getPocketId();
                                if (pocketId4 != null) {
                                    oVar4.add(pocketId4);
                                }
                            }
                        }
                        Iterator it20 = iVarA.f135317c.iterator();
                        while (it20.hasNext()) {
                            String pocketId5 = ((Subaccount) it20.next()).getPocketId();
                            if (pocketId5 != null) {
                                oVar4.add(pocketId5);
                            }
                        }
                    }
                    aim.o oVarA = y0.a(oVar4);
                    Data data11 = dVar.e;
                    if (data11 != null && (list = (List) data11.getContent()) != null) {
                        List list11 = list;
                        ArrayList arrayList5 = new ArrayList(w.t(list11, 10));
                        Iterator it21 = list11.iterator();
                        while (it21.hasNext()) {
                            arrayList5.add(((Loan) it21.next()).f70108a);
                        }
                        I1 = d0.i1(arrayList5);
                    }
                    if (I1 == 0) {
                        I1 = h0.f322473a;
                    }
                    pair = new Pair(oVarA, I1);
                }
                xVar2.H2(yVar, new a31.m(sVar, 16, (Set) pair.f186385a, (Set) pair.f186386b));
                return Unit.f186387a;
            case 15:
                Data data12 = (Data) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ajh.l lVar4 = (ajh.l) obj3;
                lVar4.H2(lVar4.u, new t(data12, 22));
                return Unit.f186387a;
            case 16:
                Data data13 = (Data) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.retail.savings.impl.challenge.presentation.manage_challenge.a aVar20 = (com.revolut.feature.retail.savings.impl.challenge.presentation.manage_challenge.a) obj3;
                aVar20.H2(aVar20.f83195t, new t(data13, 23));
                return Unit.f186387a;
            case 17:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ulm.i1 i1Var = new ulm.i1();
                i1Var.e((String) this.v);
                i1Var.c("GET", null);
                Response responseExecute = FirebasePerfOkHttpClient.execute(((OkHttpClient) obj3).b(new j1(i1Var)));
                if (!responseExecute.f226097q) {
                    throw new IOException(a0.d.n("Silent Auth failed with code ", responseExecute.d));
                }
                try {
                    String strString = responseExecute.f226090g.string();
                    Json jsonA = af0.b.a();
                    jsonA.getClass();
                    return ((x2) jsonA.b(x2.Companion.serializer(), strString)).f175497a;
                } catch (IllegalStateException e4) {
                    h0 h0Var6 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e4, h0Var6);
                    throw new IOException("Empty response from Silent Auth");
                }
            case 18:
                yk2.b bVar7 = (yk2.b) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                al2.d dVar2 = (al2.d) obj3;
                ((r60.d) dVar2.f6136l).Q();
                zj2.a aVar23 = dVar2.f6138n;
                bVar7.getClass();
                dVar2.A2(zj2.a.a(aVar23, null, 2));
                return Unit.f186387a;
            case 19:
                mii.q qVar = (mii.q) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (qVar instanceof mii.n) {
                    oki.h.D2(((com.revolut.feature.junior_referrals.impl.ui.allow_referrals_prompt.a) obj3).f77165q);
                } else if (!(qVar instanceof mii.m) && !(qVar instanceof mii.p)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 20:
                alb.d dVar3 = (alb.d) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                alb.j jVar = (alb.j) obj3;
                jVar.H2(jVar.f6183r, new alb.h(dVar3, 1));
                return Unit.f186387a;
            case 21:
                SlotChecklistFetchConfig slotChecklistFetchConfig = (SlotChecklistFetchConfig) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return j6.a.k(SlotChecklist.class, ((ald.a) obj3).f6218c, ald.a.a(slotChecklistFetchConfig.f87299c, slotChecklistFetchConfig.f87298b));
            case 22:
                SlotContext slotContext = (SlotContext) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ald.r rVar2 = (ald.r) obj3;
                String strB = rVar2.b(slotContext);
                rVar2.d.I0(strB);
                rVar2.f6245c.remove(strB);
                return Unit.f186387a;
            case 23:
                Data data14 = (Data) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ame.f fVar = (ame.f) obj3;
                fVar.H2(fVar.f6363q, new t(data14, i5));
                return Unit.f186387a;
            case 24:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ParcelableDestination destination = (ParcelableDestination) obj3;
                com.revolut.kompot.bridge.impl.rootflow.a aVar30 = (com.revolut.kompot.bridge.impl.rootflow.a) ((wli.o) this.v);
                aVar30.getClass();
                Intrinsics.checkNotNullParameter(destination, "destination");
                return Boolean.valueOf(aVar30.C2(destination));
            case 25:
                Data data15 = (Data) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                amk.h hVar = (amk.h) obj3;
                hVar.H2(hVar.f6475r, new t(data15, 25));
                return Unit.f186387a;
            case 26:
                Data data16 = (Data) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payees.impl.ui.payees_select.b bVar8 = (com.revolut.feature.payees.impl.ui.payees_select.b) obj3;
                bVar8.H2(bVar8.f79036t, new t(data16, i6));
                return Unit.f186387a;
            case 27:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                anc.g gVarE3 = ((EditGoalScreen) obj3).e3();
                String amount = charSequence.toString();
                com.revolut.feature.robo.impl.ui.screen.edit_goal.a aVar34 = (com.revolut.feature.robo.impl.ui.screen.edit_goal.a) gVarE3;
                aVar34.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                cli.y yVar2 = aVar34.f85136s;
                Data data17 = ((anc.e) ((j2) yVar2.f22677a).getValue()).e;
                if (data17 != null && (bVar3 = (xi0.b) data17.getContent()) != null) {
                    aVar34.H2(yVar2, new a31.m(aVar34, 18, amount, bVar3));
                }
                return Unit.f186387a;
            case 28:
                oh7.b bVar9 = (oh7.b) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                anh.o oVar5 = ((anh.m) obj3).d;
                vel.f performanceAsset = bVar9.f225321b.f246671a;
                Intrinsics.checkNotNullParameter(performanceAsset, "performanceAsset");
                if (performanceAsset instanceof vel.d) {
                    uVarA = new CommodityAssetDetailsDestination(((vel.d) performanceAsset).f288352a, null);
                } else if (performanceAsset instanceof vel.e) {
                    uVarA = new AssetDetailsDestination(performanceAsset.a(), null, false, null, null, null, 62);
                } else {
                    if (!(performanceAsset instanceof vel.c) && !(performanceAsset instanceof vel.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oVar5.f7794m.getClass();
                    uVarA = g9h.c.a(performanceAsset);
                }
                oVar5.A2(uVarA);
                return Unit.f186387a;
            default:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                NaviCommand naviCommand = (NaviCommand) this.v;
                Intrinsics.h(naviCommand);
                return ((anh.o) obj3).A2(u0.b(naviCommand));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f3863w = obj2;
    }
}
