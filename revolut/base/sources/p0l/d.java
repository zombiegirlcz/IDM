package p0l;

import aw0.n6;
import com.revolut.chat.ui.chat_profile.profile_screen.ChatProfileScreen;
import com.revolut.feature.apm.iris.impl.ui.settings.IrisSettingsScreen;
import com.revolut.feature.apm.swish.impl.ui.home.area.SwishHomeAreaScreen;
import com.revolut.feature.apm.upi.impl.flow.area.screen.UpiAreaScreen;
import com.revolut.feature.cash_topup.impl.ui.search.CashTopUpSearchLocationScreen;
import com.revolut.feature.crypto.onboarding.impl.ui.fca.screen.learn.CryptoFcaLearnScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.pix_branch_selection.PixBranchSelectionScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.payment.recipient_picker.TaxHubPaymentRecipientPickerScreen;
import com.revolut.feature.junior.isa.impl.ui.jisa_details.JuniorIsaDetailsScreen;
import com.revolut.feature.payees.impl.ui.payees_list.PayeesListScreen;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.new_transfer_friend.NewTransferFriendScreen;
import com.revolut.feature.payments_migration.impl.ui.screen.search.SearchInBlockController;
import com.revolut.feature.pockets.impl.details_v2.qr.AccountQrCodeScreen;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection.SavingsProductSelectionScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.strategy_report.StrategyReportScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.tactical_allocations.TacticalAllocationsController;
import com.revolut.feature.travel.experiences.impl.ui.screen.bookings.TravelExperiencesBookingsScreen;
import com.revolut.feature.wealth.impl.ui.screens.pocket_picker.PocketPickerScreen;
import com.revolut.feature.wealth.ui.impl.disclosures.DisclosuresController;
import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.root.PriceTargetsFaqRootScreen;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_give.power_of_attorney.PowerOfAttorneyScreen;
import dx4.a1;
import g24.k;
import g24.n;
import gfk.j0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;
import pfk.g0;
import pfk.p0;
import wim.z;
import wp5.y;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d((PowerOfAttorneyScreen) this.v, continuation, 0);
            case 1:
                return new d((p15.b) this.v, continuation, 1);
            case 2:
                return new d((TravelExperiencesBookingsScreen) this.v, continuation, 2);
            case 3:
                return new d((p24.r) this.v, continuation, 3);
            case 4:
                return new d((TaxHubPaymentRecipientPickerScreen) this.v, continuation, 4);
            case 5:
                return new d((ChatProfileScreen) this.v, continuation, 5);
            case 6:
                return new d((NewTransferFriendScreen) this.v, continuation, 6);
            case 7:
                return new d((IrisSettingsScreen) this.v, continuation, 7);
            case 8:
                return new d((com.revolut.feature.apm.iris.impl.ui.settings.a) this.v, continuation, 8);
            case 9:
                return new d((SearchInBlockController) this.v, continuation, 9);
            case 10:
                return new d((com.revolut.feature.payments_migration.impl.ui.screen.search.b) this.v, continuation, 10);
            case 11:
                return new d((StrategyReportScreen) this.v, continuation, 11);
            case 12:
                return new d((TacticalAllocationsController) this.v, continuation, 12);
            case 13:
                return new d((JuniorIsaDetailsScreen) this.v, continuation, 13);
            case 14:
                return new d((CashTopUpSearchLocationScreen) this.v, continuation, 14);
            case 15:
                return new d((PocketPickerScreen) this.v, continuation, 15);
            case 16:
                return new d((PriceTargetsFaqRootScreen) this.v, continuation, 16);
            case 17:
                return new d((SwishHomeAreaScreen) this.v, continuation, 17);
            case 18:
                return new d((AccountQrCodeScreen) this.v, continuation, 18);
            case 19:
                return new d((UpiAreaScreen) this.v, continuation, 19);
            case 20:
                return new d((com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b) this.v, continuation, 20);
            case 21:
                return new d((g0) this.v, continuation, 21);
            case 22:
                return new d((p0) this.v, continuation, 22);
            case 23:
                return new d((phc.j) this.v, continuation, 23);
            case 24:
                return new d((CryptoFcaLearnScreen) this.v, continuation, 24);
            case 25:
                return new d((PixBranchSelectionScreen) this.v, continuation, 25);
            case 26:
                return new d((DisclosuresController) this.v, continuation, 26);
            case 27:
                return new d((PayeesListScreen) this.v, continuation, 27);
            case 28:
                return new d((SavingsProductSelectionScreen) this.v, continuation, 28);
            default:
                return new d((pmk.v) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((d) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((d) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((d) create((cv3.u) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v104, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v109, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v56, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v68, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v96, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ou3.r rVar;
        ou3.i iVar;
        a1 a1Var;
        g24.i iVar2;
        ou3.l lVar;
        ou3.m mVar;
        ou3.q qVar;
        ou3.r rVar2;
        a1 a1Var2;
        ou3.j jVar;
        int i = this.u;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((PowerOfAttorneyScreen) obj3).m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar = ((p15.b) obj3).f231875c;
                Type type = p15.b.e;
                Intrinsics.checkNotNullExpressionValue(type, "access$getCREDIT_HELP_COUNTRY_CONFIG_TYPE$cp(...)");
                Map map = (Map) cVar.T2("credit_help_country_config_key", type);
                if (map != null) {
                }
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((p1g.m) ((TravelExperiencesBookingsScreen) obj3).R2()).B2();
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g24.i iVar3 = (g24.i) ((p24.r) obj3).f232061c.T2("credit-application-dashboard-key", z.d(o0.b(g24.i.class)));
                if (iVar3 != null) {
                    Intrinsics.checkNotNullParameter(iVar3, "<this>");
                    g24.k kVarB = iVar3.getHeader();
                    String strC = kVarB.getTitle();
                    String strB = kVarB.getSubtitle();
                    List<k.a> listA = kVarB.getActionButtons();
                    ArrayList arrayList = new ArrayList();
                    for (k.a aVar5 : listA) {
                        String strB2 = aVar5.getIcon();
                        a1[] a1VarArrValues = a1.values();
                        int length = a1VarArrValues.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                a1 a1Var3 = a1VarArrValues[i2];
                                if (a0.z(a1Var3.name(), strB2, true)) {
                                    a1Var2 = a1Var3;
                                } else {
                                    i2++;
                                }
                            } else {
                                a1Var2 = null;
                            }
                        }
                        if (a1Var2 == null) {
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, "CreditApplicationDashboardEntityMapper", p.a.p("Can't support ", aVar5.getIcon(), " for CreditApplicationDashboardHeaderEntity.ActionButtonEntity"), null, h0Var);
                            jVar = null;
                        } else {
                            String strC2 = aVar5.getTitle();
                            g24.h hVarA = aVar5.getAction();
                            jVar = new ou3.j(strC2, a1Var2, hVarA != null ? g24.j.a(hVarA) : null);
                        }
                        if (jVar != null) {
                            arrayList.add(jVar);
                        }
                    }
                    ou3.k kVar = new ou3.k(strC, strB, arrayList);
                    g24.n nVarD = iVar3.getTile();
                    String strE = nVarD.getTitle();
                    String strC3 = nVarD.getDescription();
                    String strD = nVarD.getImage();
                    g24.h hVarA2 = nVarD.getAction();
                    ou3.f fVarA = hVarA2 != null ? g24.j.a(hVarA2) : null;
                    n.a aVarB = nVarD.getButton();
                    if (aVarB != null) {
                        String strA = aVarB.getStyle();
                        ou3.q[] qVarArrValues = ou3.q.values();
                        int length2 = qVarArrValues.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length2) {
                                qVar = qVarArrValues[i3];
                                if (!a0.z(qVar.name(), strA, true)) {
                                    i3++;
                                }
                            } else {
                                qVar = null;
                            }
                        }
                        if (qVar == null) {
                            h0 h0Var2 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, "CreditApplicationDashboardEntityMapper", p.a.p("Can't support ", aVarB.getStyle(), " for CreditApplicationDashboardTileEntity.ButtonEntity.Style"), null, h0Var2);
                            rVar2 = null;
                        } else {
                            rVar2 = new ou3.r(aVarB.getTitle(), qVar);
                        }
                        rVar = rVar2;
                    } else {
                        rVar = null;
                    }
                    ou3.s sVar = new ou3.s(strE, strC3, strD, fVarA, rVar);
                    g24.m mVarC = iVar3.getStepsSection();
                    String title = mVarC.getTitle();
                    List<g24.l> steps = mVarC.getSteps();
                    ArrayList arrayList2 = new ArrayList();
                    for (g24.l lVar2 : steps) {
                        String icon = lVar2.getIcon();
                        a1[] a1VarArrValues2 = a1.values();
                        int length3 = a1VarArrValues2.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 < length3) {
                                a1 a1Var4 = a1VarArrValues2[i5];
                                if (a0.z(a1Var4.name(), icon, true)) {
                                    a1Var = a1Var4;
                                } else {
                                    i5++;
                                }
                            } else {
                                a1Var = null;
                            }
                        }
                        if (a1Var == null) {
                            h0 h0Var3 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, "CreditApplicationDashboardEntityMapper", p.a.p("Can't support ", lVar2.getIcon(), " for CreditApplicationDashboardStepEntity"), null, h0Var3);
                            iVar2 = iVar3;
                            mVar = null;
                        } else {
                            String status = lVar2.getStatus();
                            ou3.l[] lVarArrValues = ou3.l.values();
                            int length4 = lVarArrValues.length;
                            int i6 = 0;
                            while (true) {
                                if (i6 < length4) {
                                    ou3.l lVar3 = lVarArrValues[i6];
                                    iVar2 = iVar3;
                                    if (a0.z(lVar3.name(), status, true)) {
                                        lVar = lVar3;
                                    } else {
                                        i6++;
                                        iVar3 = iVar2;
                                    }
                                } else {
                                    iVar2 = iVar3;
                                    lVar = null;
                                }
                            }
                            if (lVar == null) {
                                h0 h0Var4 = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, "CreditApplicationDashboardEntityMapper", p.a.p("Can't support ", lVar2.getStatus(), " for CreditApplicationDashboardStepEntity.Status"), null, h0Var4);
                                mVar = null;
                            } else {
                                String title2 = lVar2.getTitle();
                                String description = lVar2.getDescription();
                                int progress = lVar2.getProgress();
                                g24.h action = lVar2.getAction();
                                mVar = new ou3.m(title2, description, progress, a1Var, lVar, action != null ? g24.j.a(action) : null);
                            }
                        }
                        if (mVar != null) {
                            arrayList2.add(mVar);
                        }
                        iVar3 = iVar2;
                    }
                    ou3.p pVar = new ou3.p(title, arrayList2);
                    g24.b bVarA = iVar3.getCancelSection();
                    if (bVarA != null) {
                        List<g24.a> items = bVarA.getItems();
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(items, 10));
                        for (g24.a aVar6 : items) {
                            arrayList3.add(new ou3.h(aVar6.getTitle(), g24.j.a(aVar6.getAction())));
                        }
                        iVar = new ou3.i(arrayList3);
                    } else {
                        iVar = null;
                    }
                }
                break;
            case 4:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((p37.g) ((TaxHubPaymentRecipientPickerScreen) obj3).T.getValue()).C2(p37.e.f232698a);
                break;
            case 5:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ChatProfileScreen) obj3).m2().onBackPressed();
                break;
            case 6:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((NewTransferFriendScreen) obj3).m2().onBackPressed();
                break;
            case 7:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((IrisSettingsScreen) obj3).m2().onBackPressed();
                break;
            case 8:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.apm.iris.impl.ui.settings.a) obj3).C2(aii.q.f5292a);
                break;
            case 9:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.payments_migration.impl.ui.screen.search.b) ((SearchInBlockController) obj3).R2()).B2();
                break;
            case 10:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments_migration.impl.ui.screen.search.b bVar = (com.revolut.feature.payments_migration.impl.ui.screen.search.b) obj3;
                d6a.m mVar2 = bVar.f80292r;
                Continuation continuation = null;
                break;
            case 11:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.strategy_report.a) ((StrategyReportScreen) obj3).d()).B2();
                break;
            case 12:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((TacticalAllocationsController) obj3).m2().onBackPressed();
                break;
            case 13:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((oki.h) ((pa8.j) ((JuniorIsaDetailsScreen) obj3).R.getValue())).B2();
                break;
            case 14:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((CashTopUpSearchLocationScreen) obj3).m2().onBackPressed();
                break;
            case 15:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((PocketPickerScreen) obj3).m2().onBackPressed();
                break;
            case 16:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((pdj.f) ((PriceTargetsFaqRootScreen) obj3).Y.getValue()).u2();
                break;
            case 17:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((SwishHomeAreaScreen) obj3).m2().onBackPressed();
                break;
            case 18:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((AccountQrCodeScreen) obj3).m2().onBackPressed();
                break;
            case 19:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((UpiAreaScreen) obj3).m2().onBackPressed();
                break;
            case 20:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b bVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b) obj3;
                bVar2.H2(bVar2.f68143s, new pd4.u(22));
                break;
            case 21:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j0 j0Var = (j0) y.t(j0.class, ((g0) obj3).f235639c, "pricing_plan_workflow");
                if (j0Var != null) {
                }
                break;
            case 22:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((p0) obj3).d.remove("CACHE_KEY_MINIMUM_BALANCE_INFO");
                break;
            case 23:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list = (List) ((phc.j) obj3).e.T2("PERK_CATEGORIES_CACHE_KEY", phc.j.v);
                if (list != null) {
                }
                break;
            case 24:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((pi5.f) ((CryptoFcaLearnScreen) obj3).Q.getValue()).B2();
                break;
            case 25:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((PixBranchSelectionScreen) obj3).R2().B2();
                break;
            case 26:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((pkh.k) ((DisclosuresController) obj3).M.getValue()).B2();
                break;
            case 27:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((pm9.f) ((PayeesListScreen) obj3).P.getValue()).B2();
                break;
            case 28:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection.a) ((SavingsProductSelectionScreen) obj3).R2()).B2();
                break;
            default:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pmk.v vVar = (pmk.v) obj3;
                PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) zi0.c.I(((pmk.k) vVar.t2()).f237616a);
                vVar.v2(new pmk.m(pricingPlanSubscription.f81129a, pricingPlanSubscription.f81142t != null));
                break;
        }
        return Unit.f186387a;
    }
}
