package x64;

import aw0.n6;
import cli.y;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.congratulations.content.CongratulationsContentScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signing_methods_info.SigningMethodsInfoScreen;
import com.revolut.feature.donations.impl.ui.kompot.screen.collection.details.CharitiesCollectionDetailsScreen;
import com.revolut.feature.retail.global_accounts.api.navigation.CountryProfilesManagementScreenDestination;
import com.revolut.feature.retail.global_accounts.impl.registered_identities.RegisteredIdentitiesBottomSheetScreen;
import com.revolut.feature.retail.salary_account.impl.model.salary_promotion.SalaryPromotionParams;
import com.revolut.feature.shops.impl.ui.bid_screen.ShopsItemsBidScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.number_of_shares.NumberOfSharesScreen;
import com.revolut.feature_travel_hotels_models.property.room.CancellationPolicy;
import com.revolut.feature_travel_hotels_models.property.room.HotelsPropertyRoom;
import com.revolut.feature_travel_hotels_models.property.room.Rates;
import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import com.revolut.retail.feature.esim.impl.ui.screens.help.EsimHelpScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.info.EsimInfoBottomSheetScreen;
import dfl.r0;
import fjd.z;
import ip0.qs;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.SerializationException;
import mx0.q5;
import nii.l1;
import nii.n1;
import vge.i0;
import vkm.j2;
import x84.q;
import x8j.g0;
import xec.c0;
import xec.x;
import yhm.r;
import zhm.a0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f303032w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Serializable serializable, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f303032w = serializable;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b((c) this.f303032w, continuation, 0);
                bVar.v = obj2;
                return bVar;
            case 1:
                b bVar2 = new b((CongratulationsContentScreen) this.f303032w, continuation, 1);
                bVar2.v = obj2;
                return bVar2;
            case 2:
                b bVar3 = new b((com.revolut.feature.trading.managed_portfolios.impl.ui.details.managed_portfolio_benchmark.a) this.f303032w, continuation, 2);
                bVar3.v = obj2;
                return bVar3;
            case 3:
                b bVar4 = new b((x6h.d) this.f303032w, continuation, 3);
                bVar4.v = obj2;
                return bVar4;
            case 4:
                b bVar5 = new b((q) this.f303032w, continuation, 4);
                bVar5.v = obj2;
                return bVar5;
            case 5:
                b bVar6 = new b((x8h.q) this.f303032w, continuation, 5);
                bVar6.v = obj2;
                return bVar6;
            case 6:
                return new b((g0) this.v, (xi0.b) this.f303032w, continuation, 6);
            case 7:
                b bVar7 = new b((RegisteredIdentitiesBottomSheetScreen) this.f303032w, continuation, 7);
                bVar7.v = obj2;
                return bVar7;
            case 8:
                b bVar8 = new b((x9b.j) this.f303032w, continuation, 8);
                bVar8.v = obj2;
                return bVar8;
            case 9:
                b bVar9 = new b((NumberOfSharesScreen) this.f303032w, continuation, 9);
                bVar9.v = obj2;
                return bVar9;
            case 10:
                b bVar10 = new b((com.revolut.feature.travel.hotels.impl.ui_kompot.flow.rooms_selection.a) this.f303032w, continuation, 10);
                bVar10.v = obj2;
                return bVar10;
            case 11:
                b bVar11 = new b((xah.b) this.f303032w, continuation, 11);
                bVar11.v = obj2;
                return bVar11;
            case 12:
                b bVar12 = new b((CharitiesCollectionDetailsScreen) this.f303032w, continuation, 12);
                bVar12.v = obj2;
                return bVar12;
            case 13:
                b bVar13 = new b((xb6.h) this.f303032w, continuation, 13);
                bVar13.v = obj2;
                return bVar13;
            case 14:
                b bVar14 = new b((com.revolut.feature.apm.spin.impl.ui.settings.a) this.f303032w, continuation, 14);
                bVar14.v = obj2;
                return bVar14;
            case 15:
                b bVar15 = new b((xd3.d) this.f303032w, continuation, 15);
                bVar15.v = obj2;
                return bVar15;
            case 16:
                b bVar16 = new b((xd4.i) this.f303032w, continuation, 16);
                bVar16.v = obj2;
                return bVar16;
            case 17:
                b bVar17 = new b((SigningMethodsInfoScreen) this.f303032w, continuation, 17);
                bVar17.v = obj2;
                return bVar17;
            case 18:
                b bVar18 = new b((com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b) this.f303032w, continuation, 18);
                bVar18.v = obj2;
                return bVar18;
            case 19:
                b bVar19 = new b((xed.n) this.f303032w, continuation, 19);
                bVar19.v = obj2;
                return bVar19;
            case 20:
                return new b((xf1.c) this.v, (qf1.f) this.f303032w, continuation, 20);
            case 21:
                b bVar20 = new b((xgb.a) this.f303032w, continuation, 21);
                bVar20.v = obj2;
                return bVar20;
            case 22:
                b bVar21 = new b((com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a) this.f303032w, continuation, 22);
                bVar21.v = obj2;
                return bVar21;
            case 23:
                b bVar22 = new b((xge.j) this.f303032w, continuation, 23);
                bVar22.v = obj2;
                return bVar22;
            case 24:
                b bVar23 = new b((EsimHelpScreen) this.f303032w, continuation, 24);
                bVar23.v = obj2;
                return bVar23;
            case 25:
                b bVar24 = new b((ShopsItemsBidScreen) this.f303032w, continuation, 25);
                bVar24.v = obj2;
                return bVar24;
            case 26:
                b bVar25 = new b((xid.l) this.f303032w, continuation, 26);
                bVar25.v = obj2;
                return bVar25;
            case 27:
                b bVar26 = new b((xih.c) this.f303032w, continuation, 27);
                bVar26.v = obj2;
                return bVar26;
            case 28:
                b bVar27 = new b((vzh.d) this.f303032w, continuation, 28);
                bVar27.v = obj2;
                return bVar27;
            default:
                b bVar28 = new b((EsimInfoBottomSheetScreen) this.f303032w, continuation, 29);
                bVar28.v = obj2;
                return bVar28;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((ax4.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((b) create((dx4.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((b) create((r0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((b) create((lw0.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((b) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((b) create((r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((b) create((f1h.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((b) create((qs) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((b) create((q5) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((b) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((b) create((SalaryPromotionParams) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((b) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((b) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((b) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((b) create((wid.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((b) create((t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v51, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v67, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v72, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v84, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean z;
        boolean z3;
        Object value;
        LinkedHashMap linkedHashMapZ;
        Double d;
        int i = this.u;
        int i2 = 2;
        int i3 = 7;
        int i5 = 1;
        int i6 = 26;
        int i21 = 17;
        int i22 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object obj3 = this.f303032w;
        switch (i) {
            case 0:
                ax4.b bVar = (ax4.b) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c cVar = (c) obj3;
                cVar.H2(cVar.f303035r, new ah4.f(bVar, 13));
                break;
            case 1:
                dx4.l lVar = (dx4.l) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c8g.c.i(((CongratulationsContentScreen) obj3).e3(), lVar);
                break;
            case 2:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.trading.managed_portfolios.impl.ui.details.managed_portfolio_benchmark.a aVar4 = (com.revolut.feature.trading.managed_portfolios.impl.ui.details.managed_portfolio_benchmark.a) obj3;
                aVar4.H2(aVar4.f91331q, new x52.a(aVar4, data, i2));
                break;
            case 3:
                Data data2 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x6h.d dVar = (x6h.d) obj3;
                dVar.X2(dVar.o, new x16.h(data2, 12));
                break;
            case 4:
                Data data3 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((q) obj3).x2(new x16.h(data3, 15));
                break;
            case 5:
                r0 r0Var = (r0) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 6:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g0 g0Var = (g0) this.v;
                g0Var.c3();
                break;
            case 7:
                lw0.l menuItem = (lw0.l) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x9b.d dVar2 = (x9b.d) ((RegisteredIdentitiesBottomSheetScreen) obj3).R.getValue();
                Intrinsics.h(menuItem);
                x9b.j jVar = (x9b.j) dVar2;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(menuItem, "menuItem");
                if (Intrinsics.f(menuItem.a(), "ID_MENU_ITEM_MANAGE")) {
                    jVar.C1(CountryProfilesManagementScreenDestination.f82640a);
                    jVar.C2(aii.q.f5292a);
                }
                break;
            case 8:
                Data data4 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x9b.j jVar2 = (x9b.j) obj3;
                jVar2.H2(jVar2.f303658q, new x16.h(data4, 16));
                break;
            case 9:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x9f.k kVarE3 = ((NumberOfSharesScreen) obj3).d();
                String amount = charSequence.toString();
                x9f.m mVar = (x9f.m) kVarE3;
                y yVar = mVar.f303710q;
                Intrinsics.checkNotNullParameter(amount, "amount");
                BigDecimal bigDecimalI = kotlin.text.y.i(d0.F0(amount).toString());
                if (bigDecimalI != null) {
                    mVar.H2(yVar, new x52.a(mVar, bigDecimalI, i21));
                } else {
                    mVar.H2(yVar, new x8i.h(6));
                }
                break;
            case 10:
                r rVar = (r) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list = (List) rVar.f314201a;
                List list2 = (List) rVar.f314202b;
                Data data5 = (Data) rVar.f314203c;
                List list3 = list;
                ArrayList arrayList = new ArrayList();
                Iterator it8 = list3.iterator();
                while (it8.hasNext()) {
                    a0.x(((HotelsPropertyRoom) it8.next()).e, arrayList);
                }
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                Iterator it9 = arrayList.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(((Rates) it9.next()).e);
                }
                if (arrayList2.isEmpty()) {
                    z = false;
                } else {
                    Iterator it10 = arrayList2.iterator();
                    while (it10.hasNext()) {
                        if (((CancellationPolicy) it10.next()).f98093b) {
                            z = true;
                        }
                    }
                    z = false;
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it11 = list3.iterator();
                while (it11.hasNext()) {
                    a0.x(((HotelsPropertyRoom) it11.next()).e, arrayList3);
                }
                ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                Iterator it12 = arrayList3.iterator();
                while (it12.hasNext()) {
                    arrayList4.add(((Rates) it12.next()).f98116b);
                }
                if (arrayList4.isEmpty()) {
                    z3 = false;
                } else {
                    Iterator it13 = arrayList4.iterator();
                    while (it13.hasNext()) {
                        if (((cgi.e) it13.next()) == cgi.e.PAY_LATER) {
                            z3 = true;
                        }
                    }
                    z3 = false;
                }
                com.revolut.feature.travel.hotels.impl.ui_kompot.flow.rooms_selection.a aVar13 = (com.revolut.feature.travel.hotels.impl.ui_kompot.flow.rooms_selection.a) obj3;
                aVar13.f93760t.b(new b7j.e(z, aVar13, data5, z3, list2));
                break;
            case 11:
                f1h.d dVar3 = (f1h.d) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((xah.b) obj3).d.Z2(dVar3);
                break;
            case 12:
                qs qsVar = (qs) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object obj4 = qsVar.i;
                String charityId = obj4 instanceof String ? (String) obj4 : null;
                if (charityId != null) {
                    xb6.h hVar = (xb6.h) ((CharitiesCollectionDetailsScreen) obj3).X.getValue();
                    hVar.getClass();
                    Intrinsics.checkNotNullParameter(charityId, "charityId");
                    hVar.v2(new xb6.d(charityId));
                }
                break;
            case 13:
                CoroutineScope coroutineScope = (CoroutineScope) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xb6.h hVar2 = (xb6.h) obj3;
                sa6.b bVar2 = hVar2.f304006p;
                String id10 = hVar2.f304007q.f72079a;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                ya6.l lVar2 = (ya6.l) bVar2.f261302a;
                lVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                break;
            case 14:
                Data data6 = (Data) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.apm.spin.impl.ui.settings.a aVar18 = (com.revolut.feature.apm.spin.impl.ui.settings.a) obj3;
                aVar18.H2(aVar18.f62884r, new x16.h(data6, 18));
                break;
            case 15:
                Data data7 = (Data) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((xd3.d) obj3).x2(new x16.h(data7, 19));
                break;
            case 16:
                Data data8 = (Data) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xd4.i iVar = (xd4.i) obj3;
                iVar.H2(iVar.f304265q, new x16.h(data8, 20));
                break;
            case 17:
                q5 q5Var = (q5) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xe4.f fVar = (xe4.f) ((SigningMethodsInfoScreen) obj3).O.getValue();
                Intrinsics.h(q5Var);
                ((com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signing_methods_info.a) fVar).I2(new xe4.c(q5Var));
                break;
            case 18:
                n1 n1Var = (n1) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof l1) {
                    com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar3 = (com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b) obj3;
                    bVar3.n2(new xb4.e(bVar3, objArr == true ? 1 : 0, i2), new x(bVar3, i22));
                }
                break;
            case 19:
                Data data9 = (Data) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((xed.n) obj3).x2(new x16.h(data9, 24));
                break;
            case 20:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar2 = ((xf1.c) this.v).f304763b;
                String id11 = ((qf1.f) obj3).getId();
                try {
                } catch (SerializationException e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                    cVar2.I0(id11);
                    return null;
                } catch (Throwable th10) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var2);
                    return null;
                }
                break;
            case 21:
                SalaryPromotionParams salaryPromotionParams = (SalaryPromotionParams) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 22:
                Data data10 = (Data) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a aVar27 = (com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists.a) obj3;
                aVar27.H2(aVar27.f86928t, new xf0.j(data10, aVar27, i3));
                break;
            case 23:
                List list4 = (List) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Set currentAccountsKeys = v13.d.a(list4);
                i0 i0Var = ((xge.j) obj3).f305728b;
                i0Var.getClass();
                Intrinsics.checkNotNullParameter(currentAccountsKeys, "currentAccountsKeys");
                j2 j2Var = i0Var.f288917a;
                do {
                    value = j2Var.getValue();
                    linkedHashMapZ = zhm.r0.z((Map) value);
                    Iterator it14 = linkedHashMapZ.entrySet().iterator();
                    while (it14.hasNext()) {
                        if (!currentAccountsKeys.contains((tge.a) ((Map.Entry) it14.next()).getKey())) {
                            it14.remove();
                        }
                    }
                } while (!j2Var.h(value, linkedHashMapZ));
                break;
            case 24:
                ty0.a aVar29 = (ty0.a) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xhj.g gVar = (xhj.g) ((EsimHelpScreen) obj3).T.getValue();
                Object obj5 = aVar29.d;
                com.revolut.retail.feature.esim.impl.ui.screens.help.b bVar4 = (com.revolut.retail.feature.esim.impl.ui.screens.help.b) gVar;
                bVar4.getClass();
                if (obj5 instanceof EsimDescriptorValue.Link) {
                    bVar4.A1(new c0(bVar4, ((EsimDescriptorValue.Link) obj5).f100253a, objArr2 == true ? 1 : 0, 9), new yi5.b(25));
                }
                break;
            case 25:
                n6 n6Var = (n6) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xid.h hVar3 = (xid.h) ((ShopsItemsBidScreen) obj3).T.getValue();
                String buttonTag = n6Var.f;
                xid.l lVar3 = (xid.l) hVar3;
                y yVar2 = lVar3.f306340s;
                Intrinsics.checkNotNullParameter(buttonTag, "buttonTag");
                if (Intrinsics.f(buttonTag, "BUY_POINTS_BUTTON_TAG")) {
                    Double d5 = ((xid.c) ((j2) yVar2.f22677a).getValue()).d;
                    if (d5 != null) {
                        lVar3.C2(new xid.f(d5.doubleValue()));
                    }
                } else if (Intrinsics.f(buttonTag, "BID_BUTTON_TAG") && (d = ((xid.c) ((j2) yVar2.f22677a).getValue()).d) != null) {
                    lVar3.l2(new xid.k(lVar3, d.doubleValue(), null), new yi5.b(i6));
                }
                break;
            case 26:
                wid.a aVar32 = (wid.a) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xid.l lVar4 = (xid.l) obj3;
                lVar4.H2(lVar4.f306340s, new z(aVar32, i5));
                break;
            case 27:
                Data data11 = (Data) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((xih.c) obj3).d3(new x16.h(data11, 28));
                break;
            case 28:
                t tVar = (t) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                whh.h hVar4 = (whh.h) ((vzh.d) obj3).e;
                Intrinsics.h(tVar);
                hVar4.f3(tVar);
                break;
            default:
                ty0.a aVar36 = (ty0.a) this.v;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xij.b bVar5 = (xij.b) ((EsimInfoBottomSheetScreen) obj3).V.getValue();
                Object obj6 = aVar36.d;
                xij.c cVar3 = (xij.c) bVar5;
                cVar3.getClass();
                if (obj6 instanceof EsimDescriptorValue.Link) {
                    cVar3.l2(new c0(cVar3, ((EsimDescriptorValue.Link) obj6).f100253a, objArr3 == true ? 1 : 0, i21), new yi5.b(i6));
                }
                break;
        }
        return Unit.f186387a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f303032w = obj2;
    }
}
