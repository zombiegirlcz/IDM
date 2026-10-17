package q2e;

import androidx.work.WorkManager;
import au0.j4;
import aw0.f4;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.multibanco.impl.via_verde.data.ViaVerdeEnrollment;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.list.EnrollmentListContract$Step;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.list.EnrollmentListScreen;
import com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.SelectorScreen;
import com.revolut.feature.card_screen.impl.nameless_card.NamelessCardDialogScreen;
import com.revolut.feature.cash_topup.impl.ui.amount.a;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.OutstandingDebtsFlowController;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.evidence_holder_selection.EvidenceHolderSelectionScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.selectautopay.LoanSelectAutopayScreen;
import com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.DeFiSendAddBeneficiaryScreen;
import com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.DeFiSendAddBeneficiaryScreenContract$Modal;
import com.revolut.feature.hidden_accounts.impl.ui.secret_accounts_flow.screens.create_secret_phrase.CreateSecretPhraseScreen;
import com.revolut.feature.main_screen_ui_customization.impl.tabs_order_settings.TabsOrderSettingsScreen;
import com.revolut.feature.pdfsave.ui.pdfnativesave.PdfNativeSaveContract$Configuration;
import com.revolut.feature.pdfsave.ui.pdfnativesave.PdfNativeSaveContract$ProfileConfirmationPayload;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.amount.PixQrCodeTransactionAmountScreen;
import com.revolut.feature.pockets.api.navigation.PocketDetailsDestination;
import com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData;
import com.revolut.feature.pockets.api.navigation.PocketDetailsInitialAction;
import com.revolut.feature.store.api.R$string;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.WealthMarginMinimumRequirementContract$ModalStep;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.WealthMarginMinimumRequirementScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import ip0.bf;
import ip0.um0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.CoroutineScope;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class i0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f241593w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.revolut.feature.store.impl.ui.brand_detail.flow.c cVar, tvb.d dVar, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.v = cVar;
        this.f241593w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i0 i0Var = new i0((com.revolut.feature.store.impl.ui.brand_detail.flow.c) this.v, continuation, 0);
                i0Var.f241593w = obj2;
                return i0Var;
            case 1:
                return new i0((com.revolut.feature.store.impl.ui.brand_detail.flow.c) this.v, (tvb.d) this.f241593w, continuation);
            case 2:
                return new i0((q30.h) this.f241593w, (v30.c0) this.v, continuation, 2);
            case 3:
                i0 i0Var2 = new i0((q42.j) this.v, continuation, 3);
                i0Var2.f241593w = obj2;
                return i0Var2;
            case 4:
                return new i0((NavBarWithToolbar) this.f241593w, (SelectorScreen) this.v, continuation, 4);
            case 5:
                i0 i0Var3 = new i0((q43.o0) this.v, continuation, 5);
                i0Var3.f241593w = obj2;
                return i0Var3;
            case 6:
                i0 i0Var4 = new i0((q48.j) this.v, continuation, 6);
                i0Var4.f241593w = obj2;
                return i0Var4;
            case 7:
                i0 i0Var5 = new i0((TabsOrderSettingsScreen) this.v, continuation, 7);
                i0Var5.f241593w = obj2;
                return i0Var5;
            case 8:
                i0 i0Var6 = new i0((q4b.j) this.v, continuation, 8);
                i0Var6.f241593w = obj2;
                return i0Var6;
            case 9:
                i0 i0Var7 = new i0((q4h.b) this.v, continuation, 9);
                i0Var7.f241593w = obj2;
                return i0Var7;
            case 10:
                return new i0((q50.q) this.f241593w, (q50.s) this.v, continuation, 10);
            case 11:
                i0 i0Var8 = new i0((DeFiSendAddBeneficiaryScreen) this.v, continuation, 11);
                i0Var8.f241593w = obj2;
                return i0Var8;
            case 12:
                i0 i0Var9 = new i0((q5h.k) this.v, continuation, 12);
                i0Var9.f241593w = obj2;
                return i0Var9;
            case 13:
                i0 i0Var10 = new i0((com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.b) this.v, continuation, 13);
                i0Var10.f241593w = obj2;
                return i0Var10;
            case 14:
                i0 i0Var11 = new i0((q65.m) this.v, continuation, 14);
                i0Var11.f241593w = obj2;
                return i0Var11;
            case 15:
                i0 i0Var12 = new i0((WealthMarginMinimumRequirementScreen) this.v, continuation, 15);
                i0Var12.f241593w = obj2;
                return i0Var12;
            case 16:
                i0 i0Var13 = new i0((NamelessCardDialogScreen) this.v, continuation, 16);
                i0Var13.f241593w = obj2;
                return i0Var13;
            case 17:
                i0 i0Var14 = new i0((q83.e) this.v, continuation, 17);
                i0Var14.f241593w = obj2;
                return i0Var14;
            case 18:
                i0 i0Var15 = new i0((OutstandingDebtsFlowController) this.v, continuation, 18);
                i0Var15.f241593w = obj2;
                return i0Var15;
            case 19:
                i0 i0Var16 = new i0((LoanSelectAutopayScreen) this.v, continuation, 19);
                i0Var16.f241593w = obj2;
                return i0Var16;
            case 20:
                i0 i0Var17 = new i0((q85.h) this.v, continuation, 20);
                i0Var17.f241593w = obj2;
                return i0Var17;
            case 21:
                i0 i0Var18 = new i0((q8d.p) this.v, continuation, 21);
                i0Var18.f241593w = obj2;
                return i0Var18;
            case 22:
                i0 i0Var19 = new i0((EnrollmentListScreen) this.v, continuation, 22);
                i0Var19.f241593w = obj2;
                return i0Var19;
            case 23:
                i0 i0Var20 = new i0((com.revolut.feature.apm.multibanco.impl.via_verde.ui.list.a) this.v, continuation, 23);
                i0Var20.f241593w = obj2;
                return i0Var20;
            case 24:
                i0 i0Var21 = new i0((qaj.g) this.v, continuation, 24);
                i0Var21.f241593w = obj2;
                return i0Var21;
            case 25:
                i0 i0Var22 = new i0((com.revolut.feature.cash_topup.impl.ui.amount.c) this.v, continuation, 25);
                i0Var22.f241593w = obj2;
                return i0Var22;
            case 26:
                i0 i0Var23 = new i0((EvidenceHolderSelectionScreen) this.v, continuation, 26);
                i0Var23.f241593w = obj2;
                return i0Var23;
            case 27:
                i0 i0Var24 = new i0((CreateSecretPhraseScreen) this.v, continuation, 27);
                i0Var24.f241593w = obj2;
                return i0Var24;
            case 28:
                i0 i0Var25 = new i0((PixQrCodeTransactionAmountScreen) this.v, continuation, 28);
                i0Var25.f241593w = obj2;
                return i0Var25;
            default:
                i0 i0Var26 = new i0((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.a) this.v, continuation, 29);
                i0Var26.f241593w = obj2;
                return i0Var26;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i0) create((s0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((i0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((i0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((i0) create((q43.e0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((i0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((i0) create((bf) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((i0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((i0) create((h3h.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((i0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((i0) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((i0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((i0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((i0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((i0) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((i0) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((i0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((i0) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((i0) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((i0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((i0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((i0) create((ViaVerdeEnrollment) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((i0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((i0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((i0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((i0) create((xu3.o0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((i0) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((i0) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v117, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v74, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v81, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v96, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = 5;
        int i2 = 16;
        int i3 = 0;
        int i5 = 18;
        int i6 = 6;
        int i21 = 14;
        Continuation continuation = null;
        switch (this.u) {
            case 0:
                s0 terms = (s0) this.f241593w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a aVar2 = ((com.revolut.feature.store.impl.ui.brand_detail.flow.c) this.v).B;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(terms, "terms");
                aVar2.e.setValue(terms);
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.store.impl.ui.brand_detail.flow.c cVar = (com.revolut.feature.store.impl.ui.brand_detail.flow.c) this.v;
                tvb.d dVar = (tvb.d) this.f241593w;
                return (dVar == tvb.d.COMPLETED || dVar == tvb.d.PENDING) ? cVar.X1(new mii.k("gift_card_purchase_success", new TextLocalisedClause(R$string.store_mega_offer_details_gift_cards_added_confirmation_label, null, null, 14), null, null, null, 28)) : cVar.X1(new mii.h(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), "gift_card_purchase_error"));
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ryc.a aVar5 = ((q30.h) this.f241593w).f241758b;
                v30.c0 feedType = (v30.c0) this.v;
                Intrinsics.checkNotNullParameter(feedType, "feedType");
                String str = "intro_" + feedType;
                Object obj3 = ((d4m.a) aVar5.f258290b).get();
                Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                ue0.c cVar2 = (ue0.c) obj3;
                synchronized (feedType) {
                    try {
                        KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                        KType kTypeB = kotlin.jvm.internal.o0.b(String.class);
                        companion.getClass();
                        Map map = (Map) cVar2.T2(str, wim.z.d(kotlin.jvm.internal.o0.d(KTypeProjection.Companion.a(kTypeB), KTypeProjection.Companion.a(kotlin.jvm.internal.o0.b(String.class)))));
                        Map mapZ = map != null ? zhm.r0.z(map) : new HashMap();
                        mapZ.put("shown", "true");
                        cVar2.G(mapZ, str, wim.z.d(kotlin.jvm.internal.o0.f186429a.d(kotlin.jvm.internal.o0.d(KTypeProjection.Companion.a(kotlin.jvm.internal.o0.b(String.class)), KTypeProjection.Companion.a(kotlin.jvm.internal.o0.b(String.class))))));
                        Unit unit = Unit.f186387a;
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
                return ((WorkManager) ((q30.h) this.f241593w).f.get()).cancelUniqueWork("preload_video_" + ((v30.c0) this.v).name());
            case 3:
                Data data = (Data) this.f241593w;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q42.j jVar = (q42.j) this.v;
                jVar.H2(jVar.f242001q, new pvk.b(data, i5));
                return Unit.f186387a;
            case 4:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) this.f241593w;
                navBarWithToolbar.K0(j4.FADE);
                SelectorScreen selectorScreen = (SelectorScreen) this.v;
                KProperty[] kPropertyArr = SelectorScreen.f65290n0;
                selectorScreen.i3().post(new p6.e(selectorScreen, navBarWithToolbar, i));
                return Unit.f186387a;
            case 5:
                q43.e0 e0Var = (q43.e0) this.f241593w;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List listC = e0Var.c();
                q43.o0 o0Var = (q43.o0) this.v;
                for (Object obj4 : listC) {
                    int i22 = i3 + 1;
                    if (i3 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    koi.j jVar2 = (koi.j) obj4;
                    for (q43.b0 b0Var : q43.o0.y2(o0Var, q43.b0.values())) {
                        if (Intrinsics.f(b0Var.a(), jVar2.getF55277b())) {
                            o0Var.E.put(b0Var, new Integer(i3));
                        }
                    }
                    i3 = i22;
                }
                return Unit.f186387a;
            case 6:
                Data data2 = (Data) this.f241593w;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q48.j jVar3 = (q48.j) this.v;
                jVar3.H2(jVar3.f242080p, new pvk.b(data2, 19));
                return Unit.f186387a;
            case 7:
                bf bfVar = (bf) this.f241593w;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q49.d dVarE3 = ((TabsOrderSettingsScreen) this.v).d();
                String listId = bfVar.f163588a;
                q49.h hVar = (q49.h) dVarE3;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                hVar.H2(hVar.f242091r, new pig.y(listId, i2));
                return Unit.f186387a;
            case 8:
                Data data3 = (Data) this.f241593w;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q4b.j jVar4 = (q4b.j) this.v;
                jVar4.H2(jVar4.f242131s, new pvk.b(data3, 21));
                return Unit.f186387a;
            case 9:
                h3h.b bVar = ((q4h.b) this.v).d;
                h3h.h hVar2 = (h3h.h) this.f241593w;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (hVar2 instanceof h3h.f) {
                    h3h.f fVar = (h3h.f) hVar2;
                    bVar.Z2(fVar.f149129a, fVar.f149130b);
                } else {
                    if (!(hVar2 instanceof h3h.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h3h.g gVar = (h3h.g) hVar2;
                    bVar.b3(gVar.f149131a, gVar.f149132b);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q50.q qVar = (q50.q) this.f241593w;
                if (!qVar.i) {
                    qVar.i = true;
                    ((q50.s) this.v).m2(qVar.f242260a);
                }
                return Unit.f186387a;
            case 11:
                ty0.a aVar14 = (ty0.a) this.f241593w;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q56.m mVarE3 = ((DeFiSendAddBeneficiaryScreen) this.v).d();
                String id10 = aVar14.f275445a;
                com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a aVar16 = (com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a) mVarE3;
                aVar16.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (Intrinsics.f(id10, "DEFI_SEND_ADD_BENEFICIARY_ADDRESS_TYPE_LEARN_MORE_ID")) {
                    oki.h.v2(aVar16.u, DeFiSendAddBeneficiaryScreenContract$Modal.AddressTypeInfo.f71814a, ModalDestination.Style.POPUP.f98311a);
                }
                return Unit.f186387a;
            case 12:
                Data data4 = (Data) this.f241593w;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q5h.k kVar = (q5h.k) this.v;
                kVar.H2(kVar.f242406q, new pvk.b(data4, 28));
                return Unit.f186387a;
            case 13:
                Data data5 = (Data) this.f241593w;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.b bVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.b) this.v;
                bVar2.H2(bVar2.f67236q, new pvk.b(data5, 29));
                return Unit.f186387a;
            case 14:
                Data data6 = (Data) this.f241593w;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((q65.m) this.v).x2(new q65.l(data6, i3));
                return Unit.f186387a;
            case 15:
                String listId2 = (String) this.f241593w;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q6h.b bVarE3 = ((WealthMarginMinimumRequirementScreen) this.v).d();
                Intrinsics.h(listId2);
                com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.a aVar21 = (com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.a) bVarE3;
                aVar21.getClass();
                Intrinsics.checkNotNullParameter(listId2, "listId");
                if (listId2.equals("INFO_MENU_ITEM_LIST_ID")) {
                    oki.h.v2(aVar21.u, WealthMarginMinimumRequirementContract$ModalStep.MarginStatusInfo.f95467a, ModalDestination.Style.POPUP.f98311a);
                }
                return Unit.f186387a;
            case 16:
                ty0.a aVar22 = (ty0.a) this.f241593w;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (Intrinsics.f(aVar22.f275445a, "CONFIRMATION_DOCUMENT_CLICK_ID")) {
                    q83.c cVar3 = (q83.c) ((NamelessCardDialogScreen) this.v).T.getValue();
                    q83.d event = q83.d.f242968a;
                    q83.e eVar = (q83.e) cVar3;
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(event, "event");
                    if (!event.equals(event)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j7a.g.Companion.getClass();
                    eVar.C1(u0.b(new ActivityNavigateCommand(j7a.a.f171876b, new PdfNativeSaveContract$Configuration(PdfNativeSaveContract$ProfileConfirmationPayload.Cards.f80322a, "PROFILE_CONFIRMATION_FLOW"), null, null, 0, null, null, null, null, false, 1020)));
                }
                return Unit.f186387a;
            case 17:
                Data data7 = (Data) this.f241593w;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q83.e eVar2 = (q83.e) this.v;
                eVar2.H2(eVar2.f242969p, new q65.l(data7, i));
                return Unit.f186387a;
            case 18:
                um0 um0Var = (um0) this.f241593w;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q84.d dVar2 = (q84.d) ((OutstandingDebtsFlowController) this.v).P.getValue();
                String listId3 = um0Var.f166695a;
                Object obj5 = um0Var.d;
                com.revolut.feature.credit.application.plugins.impl.ui.debts.c cVar4 = (com.revolut.feature.credit.application.plugins.impl.ui.debts.c) dVar2;
                cVar4.getClass();
                Intrinsics.checkNotNullParameter(listId3, "listId");
                if (Intrinsics.f(listId3, "SUBMIT_ACTION_ID")) {
                    cVar4.n2(new q84.k(cVar4, continuation, 2), new whi.b(i6));
                } else if (Intrinsics.f(listId3, "DELETE_ACTION_ID")) {
                    Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.api.models.debts.Debt");
                    cVar4.n2(new q03.m(cVar4, (pu3.b) obj5, continuation, 20), new whi.b(i6));
                }
                return Unit.f186387a;
            case 19:
                Object obj6 = this.f241593w;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                koi.j item = (koi.j) obj6;
                q85.h hVar3 = (q85.h) ((q85.d) ((LoanSelectAutopayScreen) this.v).X.getValue());
                hVar3.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                String f55189b = item.getF55277b();
                j60.a aVar27 = hVar3.f242989p;
                switch (f55189b.hashCode()) {
                    case -729463119:
                        if (f55189b.equals("ID_ITEM_CHANGE_BANK_ACCOUNT")) {
                            hVar3.z2();
                            Unit unit2 = Unit.f186387a;
                            j60.a.v(aVar27, false, null, 3);
                        }
                        break;
                    case -325193717:
                        if (f55189b.equals("ITEM_ID_TOGGLE_AUTO_PAY")) {
                            if (((q35.r) zi0.c.I(((q85.c) hVar3.t2()).f242986a)).isEnabled()) {
                                hVar3.n2(new pwb.p(hVar3, continuation, i5), new whi.b(i6));
                            } else {
                                hVar3.z2();
                            }
                            Unit unit3 = Unit.f186387a;
                        }
                        break;
                    case -60472354:
                        if (f55189b.equals("ID_ITEM_VIEW_ACCOUNT_DETAILS")) {
                            q35.r rVar = (q35.r) zi0.c.I(((q85.c) hVar3.t2()).f242986a);
                            if (rVar instanceof q35.m) {
                                hVar3.C1(new PocketDetailsDestination(new PocketDetailsFlowContract$InputData(((q35.m) rVar).f241831a, (AccountId) AccountId.Personal.f51414a, true, true, (wi0.b) null, false, false, (CheckoutParams) null, (CheckoutOrder) null, (PocketDetailsInitialAction) null, false, 4080)));
                            } else {
                                if (!(rVar instanceof q35.n) && !(rVar instanceof q35.q) && !(rVar instanceof q35.p)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                int i32 = jli.h.f175850a;
                            }
                            Unit unit4 = Unit.f186387a;
                            j60.a.v(aVar27, false, null, 3);
                        }
                        break;
                    case 828724652:
                        if (f55189b.equals("ITEM_ID_REPAY_FROM")) {
                            q35.r rVar2 = (q35.r) zi0.c.I(((q85.c) hVar3.t2()).f242986a);
                            if (rVar2 instanceof q35.m) {
                                List listK = zhm.v.k(new RowDelegate.Model("ID_ITEM_VIEW_ACCOUNT_DETAILS", q85.h.y2(R$drawable.uikit_icn_24_info_outline), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_loan_account_explainer_auto_pay_action_view_details, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904), new RowDelegate.Model("ID_ITEM_CHANGE_BANK_ACCOUNT", q85.h.y2(R$drawable.uikit_icn_24_pencil), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_autopay_settings_account_actions_change_account, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
                                yp0.b.k(listK, 0, R$attr.uikit_dp24, 0, 0, 29);
                                aVar27.x(new rp0.y(listK, null, rp0.l.WINDOW, null, null, null, null, null, null, null, 3832));
                            } else {
                                if (!(rVar2 instanceof q35.n) && !(rVar2 instanceof q35.q) && !(rVar2 instanceof q35.p)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                hVar3.z2();
                            }
                            Unit unit5 = Unit.f186387a;
                        }
                        break;
                    case 1918729248:
                        if (f55189b.equals("ERROR_STATE_ID")) {
                            hVar3.f242991r.a();
                            Unit unit6 = Unit.f186387a;
                        }
                        break;
                }
                return Unit.f186387a;
            case 20:
                Data data8 = (Data) this.f241593w;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((q85.h) this.v).x2(new q65.l(data8, i6));
                return Unit.f186387a;
            case 21:
                Data data9 = (Data) this.f241593w;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((q8d.p) this.v).x2(new q65.l(data9, 11));
                return Unit.f186387a;
            case 22:
                ViaVerdeEnrollment enrollment = (ViaVerdeEnrollment) this.f241593w;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q92.c cVar5 = (q92.c) ((EnrollmentListScreen) this.v).R.getValue();
                Intrinsics.h(enrollment);
                com.revolut.feature.apm.multibanco.impl.via_verde.ui.list.a aVar31 = (com.revolut.feature.apm.multibanco.impl.via_verde.ui.list.a) cVar5;
                aVar31.getClass();
                Intrinsics.checkNotNullParameter(enrollment, "enrollment");
                oki.h.v2(aVar31.f62670p, new EnrollmentListContract$Step.Details(enrollment), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
                return Unit.f186387a;
            case 23:
                Data data10 = (Data) this.f241593w;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.apm.multibanco.impl.via_verde.ui.list.a aVar33 = (com.revolut.feature.apm.multibanco.impl.via_verde.ui.list.a) this.v;
                aVar33.H2(aVar33.f62671q, new q65.l(data10, 12));
                return Unit.f186387a;
            case 24:
                Data data11 = (Data) this.f241593w;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qaj.g gVar2 = (qaj.g) this.v;
                gVar2.H2(gVar2.f244047r, new q65.l(data11, i21));
                return Unit.f186387a;
            case 25:
                Pair pair = (Pair) this.f241593w;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dj0.d dVar3 = (dj0.d) pair.f186385a;
                dj0.d dVar4 = (dj0.d) pair.f186386b;
                com.revolut.feature.cash_topup.impl.ui.amount.c cVar6 = (com.revolut.feature.cash_topup.impl.ui.amount.c) this.v;
                com.revolut.feature.cash_topup.impl.ui.amount.a aVar36 = (com.revolut.feature.cash_topup.impl.ui.amount.a) cVar6.t2();
                if (aVar36 instanceof qb3.h) {
                    qb3.h hVar4 = (qb3.h) aVar36;
                    if (Intrinsics.f(hVar4.d, dVar3)) {
                        cVar6.x2(new q2g.h(hVar4, dVar4, i21));
                    }
                } else {
                    if (!(aVar36 instanceof a.C0468a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException = new IllegalStateException("Fee cannot be received when state is loading");
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return Unit.f186387a;
            case 26:
                xu3.o0 type = (xu3.o0) this.f241593w;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qb4.h hVar5 = (qb4.h) ((EvidenceHolderSelectionScreen) this.v).O.getValue();
                hVar5.getClass();
                Intrinsics.checkNotNullParameter(type, "type");
                hVar5.C2(new qb4.e(type));
                return Unit.f186387a;
            case 27:
                f4 f4Var = (f4) this.f241593w;
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (Intrinsics.f(f4Var.f10303a, "LIST_ID_SECRET_PHRASE")) {
                    qb7.g gVarE3 = ((CreateSecretPhraseScreen) this.v).R2();
                    gVarE3.H2(gVarE3.f244131p, new ocb.u(f4Var.f10304b, i5));
                }
                return Unit.f186387a;
            case 28:
                CharSequence charSequence = (CharSequence) this.f241593w;
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qba.j jVarE3 = ((PixQrCodeTransactionAmountScreen) this.v).R2();
                String amount = charSequence.toString();
                qba.n nVar = (qba.n) jVarE3;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                nVar.H2(nVar.f244170r, new q2g.h(nVar, amount, i2));
                return Unit.f186387a;
            default:
                Data data12 = (Data) this.f241593w;
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.a aVar41 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.a) this.v;
                aVar41.H2(aVar41.f93884t, new q65.l(data12, 15));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f241593w = obj2;
        this.v = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }
}
