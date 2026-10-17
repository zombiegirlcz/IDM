package t9h;

import aw0.f4;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.email_verification.screen.enter_email.VerifyEmailScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.summary.h;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.options.DocumentOptionsScreen;
import com.revolut.feature.crypto.remittance.impl.ui.multichain.info.CryptoMultichainInfoController;
import com.revolut.feature.insurance.api.models.CFACClaimExpense;
import com.revolut.feature.insurance.impl.ui.cfac.CFACInsuranceFlowContract$Step;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claim_expenses.CFACClaimExpensesScreen;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.expense_details.CFACClaimExpenseDetailsScreenContract$InputData;
import com.revolut.feature.junior.isa.impl.ui.jisa_national_number.JuniorIsaNationalNumberScreen;
import com.revolut.feature.junior.isa.impl.ui.jisa_national_number.JuniorIsaNationalNumberScreenContract$ModalStep;
import com.revolut.feature.pix.api.model.PixKey;
import com.revolut.feature.pix.api.model.PixKeys;
import com.revolut.feature.pix.impl.flow.pix_area.screens.my_aliases.MyAliasesScreen;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.wealth.tax_advantage_account.impl.ui.tax_allowance_detail.TaxAllowanceDetailScreen;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.cryptocommoditydetails.api.navigation.CryptoCommodityDetailsFeatureConfig;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_bottom_sheet.PlanOfferBottomSheetScreen;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import gim.i;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import kotlin.text.Regex;
import kotlinx.coroutines.CoroutineScope;
import m9d.w0;
import mga.d0;
import ngm.n;
import nq.b0;
import nq.i0;
import nq.j0;
import taa.k;
import taf.l;
import tb6.x;
import tb9.g;
import tdc.r;
import tff.d;
import th6.q;
import th9.v;
import tj9.c;
import tjf.l0;
import tk3.e;
import tk9.j;
import vel.f;
import wim.z;
import yhm.o;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f269037w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f269037w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b((k7i.i) this.v, (f) this.f269037w, continuation, 0);
            case 1:
                b bVar = new b((VerifyEmailScreen) this.f269037w, continuation, 1);
                bVar.v = obj2;
                return bVar;
            case 2:
                b bVar2 = new b((JuniorIsaNationalNumberScreen) this.f269037w, continuation, 2);
                bVar2.v = obj2;
                return bVar2;
            case 3:
                b bVar3 = new b((com.revolut.feature.junior.isa.impl.ui.jisa_national_number.a) this.f269037w, continuation, 3);
                bVar3.v = obj2;
                return bVar3;
            case 4:
                b bVar4 = new b((MyAliasesScreen) this.f269037w, continuation, 4);
                bVar4.v = obj2;
                return bVar4;
            case 5:
                b bVar5 = new b((k) this.f269037w, continuation, 5);
                bVar5.v = obj2;
                return bVar5;
            case 6:
                b bVar6 = new b((l) this.f269037w, continuation, 6);
                bVar6.v = obj2;
                return bVar6;
            case 7:
                b bVar7 = new b((h) this.f269037w, continuation, 7);
                bVar7.v = obj2;
                return bVar7;
            case 8:
                return new b((j0) this.v, (g) this.f269037w, continuation, 8);
            case 9:
                b bVar8 = new b((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a) this.f269037w, continuation, 9);
                bVar8.v = obj2;
                return bVar8;
            case 10:
                b bVar9 = new b((DocumentOptionsScreen) this.f269037w, continuation, 10);
                bVar9.v = obj2;
                return bVar9;
            case 11:
                b bVar10 = new b((r) this.f269037w, continuation, 11);
                bVar10.v = obj2;
                return bVar10;
            case 12:
                b bVar11 = new b((o9h.f) this.f269037w, continuation, 12);
                bVar11.v = obj2;
                return bVar11;
            case 13:
                b bVar12 = new b((d) this.f269037w, continuation, 13);
                bVar12.v = obj2;
                return bVar12;
            case 14:
                b bVar13 = new b((tga.k) this.f269037w, continuation, 14);
                bVar13.v = obj2;
                return bVar13;
            case 15:
                b bVar14 = new b((th6.h) this.f269037w, continuation, 15);
                bVar14.v = obj2;
                return bVar14;
            case 16:
                b bVar15 = new b((q) this.f269037w, continuation, 16);
                bVar15.v = obj2;
                return bVar15;
            case 17:
                b bVar16 = new b((v) this.f269037w, continuation, 17);
                bVar16.v = obj2;
                return bVar16;
            case 18:
                b bVar17 = new b((TaxAllowanceDetailScreen) this.f269037w, continuation, 18);
                bVar17.v = obj2;
                return bVar17;
            case 19:
                b bVar18 = new b((thh.d) this.f269037w, continuation, 19);
                bVar18.v = obj2;
                return bVar18;
            case 20:
                b bVar19 = new b((c) this.f269037w, continuation, 20);
                bVar19.v = obj2;
                return bVar19;
            case 21:
                b bVar20 = new b((l0) this.f269037w, continuation, 21);
                bVar20.v = obj2;
                return bVar20;
            case 22:
                b bVar21 = new b((e) this.f269037w, continuation, 22);
                bVar21.v = obj2;
                return bVar21;
            case 23:
                b bVar22 = new b((CryptoMultichainInfoController) this.f269037w, continuation, 23);
                bVar22.v = obj2;
                return bVar22;
            case 24:
                b bVar23 = new b((CFACClaimExpensesScreen) this.f269037w, continuation, 24);
                bVar23.v = obj2;
                return bVar23;
            case 25:
                b bVar24 = new b((j) this.f269037w, continuation, 25);
                bVar24.v = obj2;
                return bVar24;
            case 26:
                b bVar25 = new b((com.revolut.feature.junior_rewards.impl.ui.list.a) this.f269037w, continuation, 26);
                bVar25.v = obj2;
                return bVar25;
            case 27:
                b bVar26 = new b((PlanOfferBottomSheetScreen) this.f269037w, continuation, 27);
                bVar26.v = obj2;
                return bVar26;
            case 28:
                b bVar27 = new b((tn6.l) this.f269037w, continuation, 28);
                bVar27.v = obj2;
                return bVar27;
            default:
                b bVar28 = new b((tn7.h) this.f269037w, continuation, 29);
                bVar28.v = obj2;
                return bVar28;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((b) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((b) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((b) create((lw0.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((b) create((vf0.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((b) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((b) create((ncj.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((b) create((rff.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((b) create((d0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((b) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((b) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((b) create((th9.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((b) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((b) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((b) create((mhf.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((b) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((b) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((b) create((CFACClaimExpense) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((b) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((b) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((b) create((l71.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v54, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v68, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v72, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v82, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v4, types: [zhm.f0] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String f80405a;
        Object kVar;
        int i = this.u;
        int i2 = 20;
        int i3 = 2;
        int i5 = 8;
        boolean z = false;
        Object obj3 = this.f269037w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f popularAsset = (f) obj3;
                Intrinsics.checkNotNullParameter(popularAsset, "popularAsset");
                if (popularAsset instanceof vel.e) {
                    return new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new AssetDetailsDestination(((vel.e) popularAsset).f288355a.f214560a.f214596b, null, false, null, null, null, 54), false, (Integer) null, 0, 61));
                }
                if (popularAsset instanceof vel.d) {
                    return new FeatureCommand(new CryptoCommodityDetailsFeatureConfig(((vel.d) popularAsset).f288352a, null, null, null, 62));
                }
                if (!(popularAsset instanceof vel.c) && !(popularAsset instanceof vel.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                g9h.c.b(popularAsset);
                return DummyCommand.f98635a;
            case 1:
                f4 f4Var = (f4) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ta4.j jVarE3 = ((VerifyEmailScreen) obj3).d();
                jVarE3.H2(jVarE3.f269095p, new rk.b(f4Var.f10304b, 11));
                return Unit.f186387a;
            case 2:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ta8.j jVarE32 = ((JuniorIsaNationalNumberScreen) obj3).d();
                Intrinsics.h(clickData);
                com.revolut.feature.junior.isa.impl.ui.jisa_national_number.a aVar4 = (com.revolut.feature.junior.isa.impl.ui.jisa_national_number.a) jVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.f275445a, "ITEM_ID_DESCRIPTION_ACTION")) {
                    oki.h.v2(aVar4.f76809s, JuniorIsaNationalNumberScreenContract$ModalStep.NinoInfo.f76805a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                return Unit.f186387a;
            case 3:
                Data data = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.junior.isa.impl.ui.jisa_national_number.a aVar6 = (com.revolut.feature.junior.isa.impl.ui.jisa_national_number.a) obj3;
                aVar6.H2(aVar6.f76808r, new t05.v(data, i2));
                return Unit.f186387a;
            case 4:
                lw0.l lVar = (lw0.l) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar2 = (k) ((MyAliasesScreen) obj3).N.getValue();
                String itemId = lVar.a();
                kVar2.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (Intrinsics.f(itemId, "list_id_new_key")) {
                    kVar2.C2(taa.g.f269298a);
                }
                return Unit.f186387a;
            case 5:
                Data data2 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar3 = (k) obj3;
                PixKey pixKey = kVar3.o.f80666b;
                if (pixKey == null || (f80405a = pixKey.getF80405a()) == null) {
                    PixKeys pixKeys = (PixKeys) data2.getContent();
                    f80405a = pixKeys != null ? pixKeys.f80416a : null;
                }
                PixKeys pixKeys2 = (PixKeys) data2.getContent();
                 = pixKeys2 != null ? pixKeys2.f80417b : 0;
                if ( == 0) {
                     = f0.f322471a;
                }
                kVar3.H2(kVar3.f269302q, new t8e.c(new PixKeys(f80405a, ), kVar3, 4));
                return Unit.f186387a;
            case 6:
                Data data3 = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar2 = (l) obj3;
                lVar2.H2(lVar2.f269324q, new t05.v(data3, 21));
                return Unit.f186387a;
            case 7:
                Data data4 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar = (h) obj3;
                hVar.H2(hVar.f67750r, new t05.v(data4, 22));
                return Unit.f186387a;
            case 8:
                g gVar = (g) obj3;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j0 j0Var = (j0) this.v;
                if (j0Var instanceof b0) {
                    gVar.C2(tb9.c.f269508a);
                } else {
                    if (!(j0Var instanceof i0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i0 i0Var = (i0) j0Var;
                    gVar.l2(new sma.f(gVar, i0Var, , 15), new t8e.c(gVar, i0Var, i5));
                }
                return Unit.f186387a;
            case 9:
                vf0.h hVar2 = (vf0.h) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a aVar13 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.location_picker.a) obj3;
                aVar13.H2(aVar13.f93946y, new sc7.b((List) hVar2.f288433a, (List) hVar2.f288434b, (List) hVar2.f288435c, (Data) hVar2.d, 4));
                return Unit.f186387a;
            case 10:
                ty0.a aVar14 = (ty0.a) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                td4.i iVar = (td4.i) ((DocumentOptionsScreen) obj3).X.getValue();
                String url2 = aVar14.f275445a;
                td4.k kVar4 = (td4.k) iVar;
                kVar4.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                kVar4.f269931p.getClass();
                kVar4.C1(zd4.b.a(url2));
                return Unit.f186387a;
            case 11:
                Data data5 = (Data) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (data5.getContent() != null) {
                    r rVar = (r) obj3;
                    od0.i iVar2 = (od0.i) data5.getContent();
                    PaymentMethod paymentMethod = iVar2 != null ? (PaymentMethod) iVar2.f224257a : null;
                    rVar.getClass();
                    if (paymentMethod instanceof PaymentMethod.Pocket) {
                        PaymentMethod.Pocket pocket = (PaymentMethod.Pocket) paymentMethod;
                        kVar = new tdc.k(true, pocket.f84377b, pocket.f84376a, pocket.i, com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.k.f(paymentMethod));
                    } else if (paymentMethod instanceof PaymentMethod.RevolutAccount) {
                        kVar = new tdc.k(z, ((PaymentMethod.RevolutAccount) paymentMethod).f84393a);
                    } else if (paymentMethod instanceof PaymentMethod.Card) {
                        kVar = new tdc.k(z, ((PaymentMethod.Card) paymentMethod).f84370a);
                    } else {
                        if (!(paymentMethod instanceof PaymentMethod.BankAccount) && paymentMethod != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        kVar = tdc.i.f269954a;
                    }
                    rVar.X2(rVar.f269966p, new td1.f(kVar, i3));
                }
                return Unit.f186387a;
            case 12:
                ncj.d dVar = (ncj.d) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                pcj.a aVar18 = (pcj.a) ((o9h.f) obj3).e;
                Intrinsics.h(dVar);
                aVar18.g3(dVar);
                return Unit.f186387a;
            case 13:
                rff.a aVar19 = (rff.a) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                d dVar2 = (d) obj3;
                List list = (List) p.a.j(sff.c.class, KTypeProjection.INSTANCE, List.class, dVar2.d, d.a(aVar19));
                if (list == null) {
                    return null;
                }
                dVar2.f270307b.getClass();
                return uff.b.a(list);
            case 14:
                d0 d0Var = (d0) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return ((tga.k) obj3).d(d0Var);
            case 15:
                String str = (String) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                try {
                    df6.a aVar23 = (df6.a) ((th6.h) obj3).f271277b.T2("INDIA_UPI_STORAGE_KEY_" + str, z.d(o0.b(df6.a.class)));
                    if (aVar23 != null) {
                        return n.x(aVar23);
                    }
                    return null;
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                    return null;
                }
            case 16:
                String str2 = (String) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ye6.b bVar = (ye6.b) j6.a.k(ye6.b.class, ((q) obj3).f271293c, j6.a.q("LINKED_ACCOUNT_CONSENT_DETAILS_STORAGE_KEY_", str2));
                if (bVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                try {
                    return new ph6.b(bVar.getId(), bVar.getTitle(), bVar.getSubtitle(), ue8.c.X(bVar.getInstitutionSection()), ue8.c.Y(bVar.getPermissionsSection()), bVar.getExpiration());
                } catch (Exception e2) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var2);
                    return null;
                }
            case 17:
                th9.b bVar2 = (th9.b) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                v vVar = (v) obj3;
                vVar.H2(vVar.f271355t, new td1.f(bVar2, i2));
                return Unit.f186387a;
            case 18:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                thh.d dVar3 = (thh.d) ((thh.c) ((TaxAllowanceDetailScreen) obj3).S.getValue());
                dVar3.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                if (clickData2.d instanceof thh.b) {
                    dVar3.B2();
                    dVar3.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit(dVar3.o.f95851a instanceof TradingAccount.TaxAdvantage.JIsa ? "3f536a8e-c47f-4778-bbce-b46f54fdcec1" : "d3777e76-667d-46da-aab3-c0827d3bf81a", 14), (SharedFaqDestination.PassthroughData) null, false, 14));
                }
                return Unit.f186387a;
            case 19:
                Data data6 = (Data) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                thh.d dVar4 = (thh.d) obj3;
                dVar4.H2(dVar4.f271385q, new x(data6, 5));
                return Unit.f186387a;
            case 20:
                Pair pair = (Pair) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                c cVar = (c) obj3;
                cVar.H2(cVar.f271612p, new w0((Data) pair.f186385a, (Data) pair.f186386b, 17));
                return Unit.f186387a;
            case 21:
                mhf.d dVar5 = (mhf.d) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((l0) obj3).f271679g = dVar5.f205562a.e;
                return Unit.f186387a;
            case 22:
                String message = (String) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                tk3.c cVar2 = ((e) obj3).f271863b;
                Intrinsics.checkNotNullParameter(message, "code");
                Intrinsics.checkNotNullParameter(message, "message");
                Regex regex = cVar2.f271860a;
                Regex.Companion companion = Regex.INSTANCE;
                kotlin.text.o oVarB = regex.b(message);
                return Boolean.valueOf((oVarB != null ? oVarB.getValue() : null) != null);
            case 23:
                String tabId = (String) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                tk5.g gVar2 = (tk5.g) ((CryptoMultichainInfoController) obj3).P.getValue();
                Intrinsics.h(tabId);
                gVar2.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                gVar2.H2(gVar2.o, new te8.a(tabId, 9));
                return Unit.f186387a;
            case 24:
                CFACClaimExpense selectedExpense = (CFACClaimExpense) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                tk7.f fVar = (tk7.f) ((CFACClaimExpensesScreen) obj3).f75131a0.getValue();
                Intrinsics.h(selectedExpense);
                tk7.h hVar3 = (tk7.h) fVar;
                hVar3.getClass();
                Intrinsics.checkNotNullParameter(selectedExpense, "selectedExpense");
                hVar3.v2(new tk7.e(new CFACInsuranceFlowContract$Step.ClaimExpenseDetails(new CFACClaimExpenseDetailsScreenContract$InputData(selectedExpense))));
                return Unit.f186387a;
            case 25:
                Data data7 = (Data) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((j) obj3).x2(new x(data7, 6));
                return Unit.f186387a;
            case 26:
                yhm.r rVar2 = (yhm.r) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.junior_rewards.impl.ui.list.a aVar35 = (com.revolut.feature.junior_rewards.impl.ui.list.a) obj3;
                aVar35.H2(aVar35.f77242w, new afg.h(12, (Data) rVar2.f314202b, (Data) rVar2.f314201a, (Data) rVar2.f314203c));
                return Unit.f186387a;
            case 27:
                ty0.a data8 = (ty0.a) this.v;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                tmk.g gVar3 = (tmk.g) ((PlanOfferBottomSheetScreen) obj3).L.getValue();
                Intrinsics.i(gVar3, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_bottom_sheet.PlanOfferBottomSheetScreenContract.ScreenModelApi");
                Intrinsics.h(data8);
                tmk.i iVar3 = (tmk.i) gVar3;
                Intrinsics.checkNotNullParameter(data8, "data");
                Object obj4 = data8.d;
                PricingPlanAction pricingPlanAction = obj4 instanceof PricingPlanAction ? (PricingPlanAction) obj4 : null;
                if (pricingPlanAction != null) {
                    iVar3.C2(new tmk.d(pricingPlanAction));
                }
                return Unit.f186387a;
            case 28:
                l71.d dVar6 = (l71.d) this.v;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                tn6.l lVar3 = (tn6.l) obj3;
                lVar3.H2(lVar3.f272319p, new foa.k(dVar6, i3));
                return Unit.f186387a;
            default:
                Data data9 = (Data) this.v;
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((tn7.h) obj3).x2(new x(data9, i5));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f269037w = obj2;
    }
}
