package tw9;

import android.app.Activity;
import android.os.Parcelable;
import aw0.db;
import aw0.o9;
import com.google.android.gms.pay.PayClient;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.bills.core.api.model.BillInput;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.backgroundpicker.impl.interactor.ThemeCustomisationSandboxInteractorImpl$SandboxState;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.domain.SwitchOutReview;
import com.revolut.feature.credit.direct.debit.account_selection.models.DirectDebitPreviousMandate;
import com.revolut.feature.freelancer.common.models.FreelancerCustomer;
import com.revolut.feature.hidden_accounts.impl.R$string;
import com.revolut.feature.payments.who_to_transfer.api.navigation.RecipientSelectionType;
import com.revolut.feature.salary_switch.api.navigation.SalarySwitchDestination;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.models.AppTheme;
import com.revolut.feature.uipersonalisation.api.models.ColorThemeOption;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.BeneficiaryInfoState;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.BeneficiaryCreationFlowContract$CreationProcessState;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import ip0.tm0;
import ip0.um0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import jq9.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kye.a0;
import kye.u;
import n30.n;
import n3j.q;
import n8a.r;
import n8a.s;
import nii.j0;
import nii.u1;
import nii.y0;
import rp0.y;
import s06.j;
import skm.e0;
import skm.p0;
import tof.q6;
import tof.s9;
import ty4.o;
import uf7.f0;
import uf7.l;
import uf7.v;
import uf7.w;
import uk9.k;
import ukk.p;
import uyh.o0;
import v30.u0;
import vi9.c0;
import vkm.j2;
import wli.x;
import xjg.m;
import zh9.r0;
import zhm.h0;
import zhm.q0;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f274960w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f274961x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.u = 25;
        this.f274960w = iVar;
        this.f274961x = (gim.i) function1;
    }

    /* JADX WARN: Type inference failed for: r2v48, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h((i) this.f274960w, (Activity) this.f274961x, continuation, 0);
            case 1:
                return new h((o) this.f274960w, this.f274961x, continuation, 1);
            case 2:
                return new h((o) this.f274960w, (DirectDebitPreviousMandate) this.f274961x, continuation, 2);
            case 3:
                return new h((com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.f) this.f274960w, (q) this.f274961x, continuation, 3);
            case 4:
                return new h((com.revolut.feature.shared.help_centre.impl.faq.c) this.f274960w, (String) this.f274961x, continuation, 4);
            case 5:
                return new h((r9a.g) this.f274960w, (com.revolut.feature.pix.impl.flow.automatico.screens.details.a) this.f274961x, continuation, 5);
            case 6:
                return new h((ua7.f) this.f274960w, (String) this.f274961x, continuation, 6);
            case 7:
                return new h((w) this.f274960w, (f0) this.f274961x, continuation, 7);
            case 8:
                return new h((uf9.d) this.f274960w, (List) this.f274961x, continuation, 8);
            case 9:
                return new h((com.revolut.retail.feature.esim.impl.ui.screens.gift_recipient_selection.a) this.f274960w, (String) this.f274961x, continuation, 9);
            case 10:
                return new h((k) this.f274960w, (r0) this.f274961x, continuation, 10);
            case 11:
                return new h((p) this.f274960w, (String) this.f274961x, continuation, 11);
            case 12:
                return new h((com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b) this.f274960w, (ColorThemeOption) this.f274961x, continuation, 12);
            case 13:
                return new h((com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b) this.f274960w, (m) this.f274961x, continuation, 13);
            case 14:
                return new h((GlobalThemeDeclaration) this.f274960w, (com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b) this.f274961x, continuation, 14);
            case 15:
                return new h(this.f274960w, (com.revolut.feature.payees.impl.ui.payees_overview.junior.a) this.f274961x, continuation, 15);
            case 16:
                return new h((com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.a) this.f274960w, (SwitchOutReview) this.f274961x, continuation, 16);
            case 17:
                return new h((uth.c) this.f274961x, continuation);
            case 18:
                return new h((uu8.d) this.f274960w, (ty0.a) this.f274961x, continuation, 18);
            case 19:
                return new h((com.revolut.trading.orders.ui.invest.placement.wrapper_flow.b) this.f274960w, (InvestOrderContract$InputData) this.f274961x, continuation, 19);
            case 20:
                return new h((com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a) this.f274960w, (String) this.f274961x, continuation, 20);
            case 21:
                return new h((com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a) this.f274960w, (gw6.d) this.f274961x, continuation, 21);
            case 22:
                return new h((com.revolut.feature.topup_screen.impl.flows.topup.flow.i) this.f274960w, (u) this.f274961x, continuation, 22);
            case 23:
                return new h((com.revolut.feature.topup_screen.impl.flows.topup.flow.i) this.f274960w, (a0) this.f274961x, continuation, 23);
            case 24:
                return new h((com.revolut.feature.topup_screen.impl.flows.topup.flow.i) this.f274960w, (hwe.k) this.f274961x, continuation, 24);
            case 25:
                return new h((com.revolut.feature.topup_screen.impl.flows.topup.flow.i) this.f274960w, (gim.i) this.f274961x, continuation);
            case 26:
                return new h((bzh.f) this.f274960w, (com.revolut.feature_crypto_order_flow.impl.exchange.d) this.f274961x, continuation, 26);
            case 27:
                return new h((com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow.c) this.f274960w, (dj0.d) this.f274961x, continuation, 27);
            case 28:
                return new h((v4a.m) this.f274960w, (t) this.f274961x, continuation, 28);
            default:
                return new h((vc2.u) this.f274960w, (Alias) this.f274961x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((h) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v76, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objJ;
        Object objA;
        Object objJ2;
        Object objJ3;
        g8a.k kVar;
        Object objA2;
        Map map;
        Object objP2;
        Object next;
        Object value;
        ThemeCustomisationSandboxInteractorImpl$SandboxState themeCustomisationSandboxInteractorImpl$SandboxState;
        AppTheme originalAppTheme;
        Object value2;
        ThemeCustomisationSandboxInteractorImpl$SandboxState themeCustomisationSandboxInteractorImpl$SandboxState2;
        AppTheme originalAppTheme2;
        Object objJ4;
        Object value3;
        ThemeCustomisationSandboxInteractorImpl$SandboxState themeCustomisationSandboxInteractorImpl$SandboxState3;
        AppTheme originalAppTheme3;
        Object objL1;
        String str;
        Object objD;
        Object objI2;
        Object objA3;
        Object objY2;
        int i = this.u;
        int i2 = 26;
        int i3 = 23;
        int i5 = 0;
        Continuation continuation = null;
        Object obj3 = this.f274961x;
        int i6 = 1;
        switch (i) {
            case 0:
                i iVar = (i) this.f274960w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    ogm.i iVar2 = iVar.f274965s;
                    qw9.a aVar2 = qw9.a.REVTAG;
                    this.v = 1;
                    ll6.i iVar3 = new ll6.i((kye.e) iVar2.f225222b, aVar2.a(), continuation, i2);
                    p0 p0Var = p0.f264001a;
                    objJ = e0.J(elm.f.f127540b, iVar3, this);
                    if (objJ == aVar) {
                        return aVar;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objJ = obj2;
                }
                fi0.b bVar = iVar.f274964r;
                Activity activity = (Activity) obj3;
                String jwtToken = ((iw9.a) objJ).f168998a;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(jwtToken, "jwtToken");
                ((PayClient) bVar.f135282a.getValue()).savePassesJwt(jwtToken, activity, 0);
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                d0 d0VarS1 = lg0.b.s1(((o) this.f274960w).f275478p, ((ty0.a) obj3).f275445a, null, null, 6);
                this.v = 1;
                Object objB = nim.a.b(d0VarS1, this);
                return objB == aVar3 ? aVar3 : objB;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    o oVar = (o) this.f274960w;
                    cz4.b bVar2 = oVar.f275481s;
                    String str2 = oVar.f275479q.f69887a;
                    efm.b bVarA = bVar2.a(str2 != null ? str2 : "", ((DirectDebitPreviousMandate) obj3).f69895b);
                    this.v = 1;
                    if (nim.a.a(bVarA, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    v4j.g gVar = ((com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.flow.f) this.f274960w).f99755q;
                    BeneficiaryInfoState beneficiaryInfoState = ((q) obj3).f212153a;
                    this.v = 1;
                    objA = gVar.a(beneficiaryInfoState, this);
                    if (objA == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA = obj2;
                }
                return new BeneficiaryCreationFlowContract$CreationProcessState((BeneficiaryInfoState) objA, null, null, null);
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 != 0) {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                n nVar = ((com.revolut.feature.shared.help_centre.impl.faq.c) this.f274960w).f86203t;
                String str3 = (String) obj3;
                if (str3 == null) {
                    str3 = ib.b.Flow;
                }
                v30.t source = v30.t.DEFAULT;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(source, "source");
                ufm.n nVarJ = ((v20.f0) nVar.f211647a).j(str3, u0.Chat, source);
                this.v = 1;
                Object objB2 = nim.a.b(nVarJ, this);
                return objB2 == aVar6 ? aVar6 : objB2;
            case 5:
                com.revolut.feature.pix.impl.flow.automatico.screens.details.a aVar7 = (com.revolut.feature.pix.impl.flow.automatico.screens.details.a) obj3;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    r9a.g gVar2 = (r9a.g) this.f274960w;
                    Continuation continuation2 = null;
                    if (gVar2 instanceof r9a.f) {
                        ryc.a aVar9 = aVar7.f80616q;
                        String str4 = aVar7.o.f80611a;
                        this.v = 1;
                        s sVar = (s) aVar9.f258289a;
                        sVar.getClass();
                        n8a.q qVar = new n8a.q(sVar, str4, continuation2, 3);
                        p0 p0Var2 = p0.f264001a;
                        objJ3 = e0.J(elm.f.f127540b, qVar, this);
                        if (objJ3 == aVar8) {
                            return aVar8;
                        }
                        kVar = (g8a.k) objJ3;
                    } else {
                        if (!(gVar2 instanceof r9a.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ryc.a aVar10 = aVar7.f80616q;
                        String str5 = aVar7.o.f80611a;
                        dj0.d dVar = ((r9a.e) gVar2).f252547a;
                        this.v = 2;
                        s sVar2 = (s) aVar10.f258289a;
                        sVar2.getClass();
                        r rVar = new r(sVar2, str5, dVar, continuation2, 1);
                        p0 p0Var3 = p0.f264001a;
                        objJ2 = e0.J(elm.f.f127540b, rVar, this);
                        if (objJ2 == aVar8) {
                            return aVar8;
                        }
                        kVar = (g8a.k) objJ2;
                    }
                } else if (i59 == 1) {
                    yhm.o.b(obj2);
                    objJ3 = obj2;
                    kVar = (g8a.k) objJ3;
                } else {
                    if (i59 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objJ2 = obj2;
                    kVar = (g8a.k) objJ2;
                }
                aVar7.H2(aVar7.f80620w, new o9a.a0(kVar, i6));
                return Unit.f186387a;
            case 6:
                ua7.f fVar = (ua7.f) this.f274960w;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    Object objL = fVar.f278556l.l((String) obj3, "HIDDEN_ACCOUNTS", this);
                    if (objL != aVar11) {
                        objL = Unit.f186387a;
                    }
                    if (objL == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                fVar.f278557m.getClass();
                return fVar.L2(new mii.k("UNHIDE_ACCOUNT_SUCCESS_DIALOG_ID", new TextLocalisedClause(R$string.hidden_accounts_toast_account_unhidden, null, null, 14), null, null, null, 28));
            case 7:
                f0 f0Var = (f0) obj3;
                j60.a aVar12 = f0Var.u;
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    w wVar = (w) this.f274960w;
                    if (wVar instanceof uf7.t) {
                        uf7.t tVar = (uf7.t) wVar;
                        String str6 = tVar.f279619a;
                        Set set = tVar.f279620b;
                        if (set.isEmpty()) {
                            IllegalStateException illegalStateException = new IllegalStateException("TransactionIds set is empty");
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        } else {
                            f0Var.C1(new TransactionListDestination(new TransactionListDestination.InputData((Clause) new TextClause(str6, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByTransactionsFilter(new s9(set), null, null, 6), (String) null, (AccountId) null, (rhf.h) null, (rhf.g) null, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 65518)));
                        }
                    } else if (wVar instanceof uf7.u) {
                        String str7 = ((uf7.u) wVar).f279621a;
                        this.v = 1;
                        Object objB3 = nim.a.b(((j) f0Var.f279603s).c(str7, false, lg0.a.OPEN_BROWSER), this);
                        if (objB3 != obj4) {
                            objB3 = Unit.f186387a;
                        }
                        if (objB3 == obj4) {
                            return obj4;
                        }
                    } else if (wVar instanceof v) {
                        f0Var.f279601q.getClass();
                        aVar12.x(new y(zhm.u.c(new um0("OPT_OUT_CONFIRM_BUTTONS_LIST_ID", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(com.revolut.feature.incentive_reward.impl.R$string.incentive_reward_details_opt_out_confirm_cancel, null, null, 14), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.feature.incentive_reward.impl.R$string.incentive_reward_details_opt_out_confirm_opt_out, null, null, 14), false, null, null, 56), (Object) null, (AnalyticsContext) null, (AnalyticsContext) null, R$attr.uikit_dp24, 0, 0, 888)), new rp0.t(new TextLocalisedClause(com.revolut.feature.incentive_reward.impl.R$string.incentive_reward_details_opt_out_confirm_title, null, new Custom(null, false, db.HEADING3, false, null, Constants.TAG_FB_CHARGING_STATUS), 10), new TextLocalisedClause(com.revolut.feature.incentive_reward.impl.R$string.incentive_reward_details_opt_out_confirm_subtitle, null, null, 14), null, 28), null, null, null, null, 1020));
                    } else if (wVar instanceof uf7.r) {
                        String str8 = ((uf7.r) wVar).f279617a;
                        this.v = 2;
                        l lVar = (l) ((uf7.k) ((j2) f0Var.f279605w.f22677a).getValue()).f279609a.getContent();
                        if7.e eVar = (lVar == null || (map = lVar.f279612c) == null) ? null : (if7.e) map.get(str8);
                        if (eVar == null) {
                            IllegalStateException illegalStateException2 = new IllegalStateException(j6.a.q("No action found for action with id ", str8));
                            h0 h0Var2 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                            objA2 = Unit.f186387a;
                        } else {
                            Object obj5 = f0Var.f279604t.f15531a.get(eVar.getClass());
                            vf7.d dVar2 = obj5 instanceof vf7.d ? (vf7.d) obj5 : null;
                            if (dVar2 == null) {
                                IllegalStateException illegalStateException3 = new IllegalStateException("No action handler found for action " + eVar);
                                h0 h0Var3 = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException3, h0Var3);
                                objA2 = Unit.f186387a;
                            } else {
                                objA2 = ((vf7.c) dVar2).a((if7.c) eVar, this);
                                if (objA2 != obj4) {
                                    objA2 = Unit.f186387a;
                                }
                            }
                            if (objA2 != obj4) {
                                objA2 = Unit.f186387a;
                            }
                        }
                        if (objA2 == obj4) {
                            return obj4;
                        }
                    } else {
                        if (!(wVar instanceof uf7.s)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        j60.a.v(aVar12, false, null, 3);
                    }
                } else {
                    if (i74 != 1 && i74 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 != 0) {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                wo1.b bVar3 = ((uf9.d) this.f274960w).f279630m;
                List<BillInput> list = (List) obj3;
                int iB = q0.b(zhm.w.t(list, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB >= 16 ? iB : 16);
                for (BillInput billInput : list) {
                    String str9 = billInput.f61298a;
                    String str10 = billInput.f61299b;
                    if (str10 == null) {
                        str10 = "";
                    }
                    linkedHashMap.put(str9, str10);
                }
                dp1.a aVar14 = new dp1.a(linkedHashMap);
                this.v = 1;
                Object objB4 = ((vp1.c) bVar3).f291042a.b(aVar14, this);
                return objB4 == aVar13 ? aVar13 : objB4;
            case 9:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 != 0) {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                Object objC = ((com.revolut.retail.feature.esim.impl.ui.screens.gift_recipient_selection.a) this.f274960w).o.c((String) obj3, w4l.i.f294643c, this);
                return objC == aVar15 ? aVar15 : objC;
            case 10:
                r0 plan = (r0) obj3;
                k kVar2 = (k) this.f274960w;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    uk9.h hVar = new uk9.h(kVar2, continuation, i5);
                    this.v = 1;
                    objP2 = kVar2.p2(this, hVar);
                    if (objP2 == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objP2 = obj2;
                }
                dj0.d dVar3 = (dj0.d) objP2;
                Iterator it8 = plan.B.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (czi.c.B((zh9.p) next)) {
                        }
                    } else {
                        next = null;
                    }
                }
                zh9.p pVar = (zh9.p) next;
                if (pVar == null) {
                    return Unit.f186387a;
                }
                if (dVar3.e(czi.c.v(pVar))) {
                    j60.a aVar17 = kVar2.f280709r;
                    c0 c0Var = kVar2.f280708q;
                    Intrinsics.checkNotNullParameter(plan, "<this>");
                    bi9.f fVar2 = new bi9.f(plan, null, zh9.u0.x(plan));
                    c0Var.getClass();
                    Intrinsics.checkNotNullParameter(plan, "plan");
                    RowDelegate.Model modelE = c0Var.f289535b.e(plan);
                    yp0.b.l(modelE, 0, 0, 0, 0, null, false, 63);
                    aVar17.x(c0.a(modelE, "PAY_LATER_SELECT_PLAN_BOTTOM_DIALOG_DELEGATES_KEY", fVar2));
                } else {
                    j60.a aVar18 = kVar2.f280709r;
                    kVar2.f280708q.getClass();
                    aVar18.x(c0.c());
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                x xVar = ((p) this.f274960w).f280790t;
                String str11 = (String) obj3;
                lg0.a aVar20 = lg0.a.OPEN_BROWSER;
                this.v = 1;
                Object objX1 = lg0.b.x1(xVar, str11, aVar20, null, this, 4);
                return objX1 == aVar19 ? aVar19 : objX1;
            case 12:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    bn2.e0 e0Var = ((com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b) this.f274960w).u;
                    xjg.j jVar = ((ColorThemeOption) obj3).f94564a;
                    this.v = 1;
                    j2 j2Var = e0Var.f17005j;
                    do {
                        value = j2Var.getValue();
                        themeCustomisationSandboxInteractorImpl$SandboxState = (ThemeCustomisationSandboxInteractorImpl$SandboxState) value;
                        originalAppTheme = themeCustomisationSandboxInteractorImpl$SandboxState.f63797a;
                        Intrinsics.checkNotNullParameter(originalAppTheme, "originalAppTheme");
                    } while (!j2Var.h(value, ThemeCustomisationSandboxInteractorImpl$SandboxState.a(themeCustomisationSandboxInteractorImpl$SandboxState, null, e0Var.f17002c.k(AppTheme.a(originalAppTheme, null, null, jVar, 3)), null, 5)));
                    if (Unit.f186387a == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    bn2.e0 e0Var2 = ((com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b) this.f274960w).u;
                    m mVar = (m) obj3;
                    this.v = 1;
                    j2 j2Var2 = e0Var2.f17005j;
                    do {
                        value2 = j2Var2.getValue();
                        themeCustomisationSandboxInteractorImpl$SandboxState2 = (ThemeCustomisationSandboxInteractorImpl$SandboxState) value2;
                        originalAppTheme2 = themeCustomisationSandboxInteractorImpl$SandboxState2.f63797a;
                        Intrinsics.checkNotNullParameter(originalAppTheme2, "originalAppTheme");
                    } while (!j2Var2.h(value2, ThemeCustomisationSandboxInteractorImpl$SandboxState.a(themeCustomisationSandboxInteractorImpl$SandboxState2, null, e0Var2.f17002c.k(AppTheme.a(originalAppTheme2, null, mVar, null, 5)), null, 5)));
                    if (Unit.f186387a == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b bVar4 = (com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b) obj3;
                GlobalThemeDeclaration globalThemeDeclaration = (GlobalThemeDeclaration) this.f274960w;
                Object obj6 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    if (globalThemeDeclaration.getF94528c()) {
                        km2.x xVar2 = bVar4.f63792t;
                        String f94454a = globalThemeDeclaration.getF94454a();
                        this.v = 1;
                        xVar2.getClass();
                        km2.x.Companion.getClass();
                        Intrinsics.checkNotNullParameter("VIEWED_FEATURED_THEMES", "id");
                        if (xVar2.a().contains(f94454a)) {
                            objJ4 = Unit.f186387a;
                        } else {
                            kb7.c cVar = new kb7.c(xVar2, f94454a, continuation, i3);
                            p0 p0Var4 = p0.f264001a;
                            objJ4 = e0.J(elm.f.f127540b, cVar, this);
                            if (objJ4 != obj6) {
                                objJ4 = Unit.f186387a;
                            }
                        }
                        if (objJ4 != obj6) {
                            objJ4 = Unit.f186387a;
                        }
                        if (objJ4 == obj6) {
                            return obj6;
                        }
                    }
                } else {
                    if (i103 != 1) {
                        if (i103 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                bn2.e0 e0Var3 = bVar4.u;
                this.v = 2;
                j2 j2Var3 = e0Var3.f17005j;
                do {
                    value3 = j2Var3.getValue();
                    themeCustomisationSandboxInteractorImpl$SandboxState3 = (ThemeCustomisationSandboxInteractorImpl$SandboxState) value3;
                    originalAppTheme3 = themeCustomisationSandboxInteractorImpl$SandboxState3.f63797a;
                    Intrinsics.checkNotNullParameter(originalAppTheme3, "originalAppTheme");
                } while (!j2Var3.h(value3, ThemeCustomisationSandboxInteractorImpl$SandboxState.a(themeCustomisationSandboxInteractorImpl$SandboxState3, null, e0Var3.f17002c.k(AppTheme.a(originalAppTheme3, globalThemeDeclaration, null, null, 6)), null, 5)));
                if (Unit.f186387a == obj6) {
                    return obj6;
                }
                return Unit.f186387a;
            case 15:
                com.revolut.feature.payees.impl.ui.payees_overview.junior.a aVar23 = (com.revolut.feature.payees.impl.ui.payees_overview.junior.a) obj3;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    Object obj7 = this.f274960w;
                    if (obj7 instanceof km9.c) {
                        km9.c cVar2 = (km9.c) obj7;
                        kq8.b bVar5 = cVar2.f185735b;
                        ogm.i iVar4 = aVar23.f79014q;
                        String str12 = cVar2.f185734a.f188343a;
                        kq8.g gVar3 = new kq8.g(bVar5.f188337g, bVar5.f188338h, bVar5.f188334a, bVar5.f188335b, bVar5.f188336c, bVar5.d, bVar5.e, false);
                        this.v = 1;
                        if (iVar4.l(str12, gVar3, this) == aVar24) {
                            return aVar24;
                        }
                    }
                    return Unit.f186387a;
                }
                if (i104 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                aVar23.f79013p.getClass();
                aVar23.X1(new mii.k("PAYEES_UNBLOCK_SUCCESS_DIALOG_ID", new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_payees_toast_unblocked_title, null, null, 14), null, null, null, 28));
                return Unit.f186387a;
            case 16:
                com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.a aVar25 = (com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.a) this.f274960w;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    bp2.c cVar3 = aVar25.f64055p;
                    String str13 = ((up2.e) ((j2) aVar25.f64058s.f22677a).getValue()).f281816a;
                    this.v = 1;
                    if (cVar3.a(str13, this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                SwitchOutReview switchOutReview = (SwitchOutReview) obj3;
                aVar25.f64056q.getClass();
                Intrinsics.checkNotNullParameter(switchOutReview, "switchOutReview");
                yji.l.b1(aVar25, aVar25.X1(new y0("ID_ACCEPT_DIALOG_SUCCESS", new j0((Clause) new TextLocalisedClause(com.revolut.feature.bank_account_switching.api.R$string.account_switch_accept_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.bank_account_switching.api.R$string.account_switch_accept_subtitle, zhm.u.c(new TextClause(switchOutReview.f64068a.d.f63972a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4092), false, 4)), null, new up2.q(aVar25, switchOutReview, continuation, i5), 3);
                return Unit.f186387a;
            case 17:
                uth.c cVar4 = (uth.c) obj3;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    String str14 = cVar4.o.f96503a.e;
                    x xVar3 = cVar4.f283104p;
                    lg0.a aVar28 = lg0.a.IGNORE;
                    Boolean bool = Boolean.FALSE;
                    this.f274960w = str14;
                    this.v = 1;
                    objL1 = xVar3.L1(str14, aVar28, bool, this);
                    if (objL1 == aVar27) {
                        return aVar27;
                    }
                    str = str14;
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) this.f274960w;
                    yhm.o.b(obj2);
                    objL1 = obj2;
                }
                if (((Boolean) objL1).booleanValue()) {
                    cVar4.B2();
                } else {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Deeplink to close product ", str, " was not handled"));
                    h0 h0Var4 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "CloseProduct", null, illegalArgumentException, h0Var4);
                }
                return Unit.f186387a;
            case 18:
                ty0.a aVar29 = (ty0.a) obj3;
                uu8.d dVar4 = (uu8.d) this.f274960w;
                uu8.a aVar30 = dVar4.o;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    tu8.d dVar5 = dVar4.f283167p;
                    String str15 = aVar29.f275445a;
                    my8.k kVar3 = aVar30.f283163a;
                    wi0.b bVar6 = aVar30.f283164b;
                    this.v = 1;
                    os8.a aVar32 = os8.b.Companion;
                    objD = dVar5.d(str15, kVar3, bVar6, null, this);
                    if (objD == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objD = obj2;
                }
                aii.u uVar = (aii.u) objD;
                if (uVar != null) {
                    return dVar4.C1(uVar);
                }
                String str16 = aVar29.f275445a;
                String strName = aVar30.f283163a.name();
                String str17 = aVar30.f283164b.f297794a;
                StringBuilder sbM = v0.a.m("Missing KYC consent navigation: ", str16, ", consent=", strName, ", countryCode=");
                sbM.append(str17);
                IllegalStateException illegalStateException4 = new IllegalStateException(sbM.toString());
                h0 h0Var5 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException4, h0Var5);
                return Unit.f186387a;
            case 19:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.trading.orders.ui.invest.placement.wrapper_flow.b.J2((com.revolut.trading.orders.ui.invest.placement.wrapper_flow.b) this.f274960w, (InvestOrderContract$InputData) obj3, this) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a aVar34 = (com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a) this.f274960w;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    d0 d0VarFirstOrError = m70.a.g(aVar34.o.d(aVar34.f73887t.f73880a, false), null, new utk.b(i), 1).firstOrError();
                    uwf.b bVar7 = new uwf.b(7, new uif.d(aVar34, (String) obj3, i3));
                    d0VarFirstOrError.getClass();
                    pfm.a aVar36 = new pfm.a(d0VarFirstOrError, bVar7, 4);
                    Intrinsics.checkNotNullExpressionValue(aVar36, "flatMapCompletable(...)");
                    this.v = 1;
                    if (nim.a.a(aVar36, this) == aVar35) {
                        return aVar35;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar34.B2();
                return Unit.f186387a;
            case 21:
                com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a aVar37 = (com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a) this.f274960w;
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    objI2 = com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a.I2(aVar37, (gw6.d) obj3, this);
                    if (objI2 == aVar38) {
                        return aVar38;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objI2 = obj2;
                }
                aVar37.n2(new un8.j(aVar37, ((FreelancerCustomer) objI2).f73281a, continuation, 17), new whi.b(6));
                return Unit.f186387a;
            case 22:
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.topup_screen.impl.flows.topup.flow.i.K2((com.revolut.feature.topup_screen.impl.flows.topup.flow.i) this.f274960w, (a0) ((u) obj3), this) == aVar39) {
                        return aVar39;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.topup_screen.impl.flows.topup.flow.i.K2((com.revolut.feature.topup_screen.impl.flows.topup.flow.i) this.f274960w, (a0) obj3, this) == aVar40) {
                        return aVar40;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar5 = (com.revolut.feature.topup_screen.impl.flows.topup.flow.i) this.f274960w;
                fim.a aVar41 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    rfb.b bVar8 = iVar5.f0;
                    this.v = 1;
                    objA3 = bVar8.a(rfb.c.f253750a, this);
                    if (objA3 == aVar41) {
                        return aVar41;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA3 = obj2;
                }
                rfb.a aVar42 = (rfb.a) objA3;
                return aVar42.f253748a ? iVar5.C1(aVar42.f253749b) : iVar5.C1(new SalarySwitchDestination(((hwe.h) ((hwe.k) obj3)).f156141a, null));
            case 25:
                fim.a aVar43 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar6 = (com.revolut.feature.topup_screen.impl.flows.topup.flow.i) this.f274960w;
                    boe.k kVar4 = new boe.k(23, null, (gim.i) obj3);
                    this.v = 1;
                    if (iVar6.p2(this, kVar4) == aVar43) {
                        return aVar43;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                com.revolut.feature_crypto_order_flow.impl.exchange.d dVar6 = (com.revolut.feature_crypto_order_flow.impl.exchange.d) obj3;
                fim.a aVar44 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    bzh.f fVar3 = (bzh.f) this.f274960w;
                    if (fVar3 instanceof bzh.d) {
                        o0 o0Var = new o0(dVar6, fVar3);
                        this.v = 1;
                        Set set2 = com.revolut.feature_crypto_order_flow.impl.exchange.d.M;
                        if (dVar6.T2(this, o0Var) == aVar44) {
                            return aVar44;
                        }
                    } else {
                        if (!(fVar3 instanceof bzh.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        o0 o0Var2 = new o0(fVar3, dVar6);
                        this.v = 2;
                        Set set3 = com.revolut.feature_crypto_order_flow.impl.exchange.d.M;
                        if (dVar6.T2(this, o0Var2) == aVar44) {
                            return aVar44;
                        }
                    }
                } else {
                    if (i115 != 1 && i115 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar45 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 != 0) {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow.c cVar5 = (com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow.c) this.f274960w;
                fnc.s sVar3 = cVar5.f79875p;
                this.v = 1;
                e1a.f fVar4 = (e1a.f) sVar3.f136657b;
                fVar4.getClass();
                e1a.d dVar7 = new e1a.d(fVar4, cVar5.f79877r.f272581b, (dj0.d) obj3, null, 0);
                p0 p0Var5 = p0.f264001a;
                Object objJ5 = e0.J(elm.f.f127540b, dVar7, this);
                return objJ5 == aVar45 ? aVar45 : objJ5;
            case 28:
                t tVar2 = (t) obj3;
                fim.a aVar46 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    v4a.m mVar2 = (v4a.m) this.f274960w;
                    RecipientSelectionType recipientSelectionType = mVar2.D.f80018g;
                    if (recipientSelectionType instanceof RecipientSelectionType.Default) {
                        mVar2.v2(new b3a.e(tVar2));
                    } else {
                        if (!(recipientSelectionType instanceof RecipientSelectionType.Transfer)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        x4a.d dVar8 = mVar2.f286013s;
                        this.v = 1;
                        x4a.h hVar2 = (x4a.h) dVar8;
                        if (!(hVar2.f302836l.f80018g instanceof RecipientSelectionType.Transfer) || (objY2 = hVar2.Y2(this, new w64.d(hVar2, tVar2, continuation, i2))) != aVar46) {
                            objY2 = Unit.f186387a;
                        }
                        if (objY2 == aVar46) {
                            return aVar46;
                        }
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar47 = fim.a.COROUTINE_SUSPENDED;
                int i118 = this.v;
                if (i118 != 0) {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                Object objB1 = ((vc2.u) this.f274960w).f287639p.b1((Alias) obj3, this);
                return objB1 == aVar47 ? aVar47 : objB1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f274960w = obj2;
        this.f274961x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(uth.c cVar, Continuation continuation) {
        super(1, continuation);
        this.u = 17;
        this.f274961x = cVar;
    }
}
