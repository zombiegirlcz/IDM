package l25;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.feature.credit.card.api.navigation.AdditionalCardholderAccountInfoDestination;
import com.revolut.feature.credit.card.api.navigation.AdditionalCardsDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardDetailsDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardInstalmentHubDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardKompotFeatureConfig;
import com.revolut.feature.credit.card.api.navigation.CreditCardSelectDueDateFlowDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardSettingsDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardSetupAutoPayDestination;
import com.revolut.feature.credit.card.api.navigation.CreditCardTopupDestination;
import com.revolut.feature.credit.card.api.navigation.descriptor.CreditCardDisplayBalanceSettings$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.impl.ui.account.creditcard.events.actions.CreditCardAccountActionParcel;
import com.revolut.feature.credit.impl.ui.account.creditcard.mappers.CreditCardAdministrationFeeMapper;
import com.revolut.feature.credit.impl.ui.account.creditcard.mappers.CreditCardStatementSectionMapper;
import com.revolut.feature.credit.impl.ui.account.creditcard.mappers.CreditCardWidgetItemMapper$SubtitleAction$BeDrivenAction;
import com.revolut.feature.credit.impl.ui.account.creditcard.mappers.CreditCardWidgetItemMapper$SubtitleAction$SharedCardInfoDialog;
import com.revolut.feature.credit.post_termination_plan.api.navigation.CreditPostTerminationPlanEntryPoint;
import com.revolut.feature.insurance_credit.api.navigation.Facility;
import com.revolut.feature.insurance_credit.api.navigation.InsuranceCreditNavigationDestination;
import com.revolut.feature.settings.preview.displayAmount.DisplayAmountToggleController;
import com.revolut.feature.settings.preview.displayAmount.DisplayAmountToggleControllerContract$InputData;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import ft3.a1;
import ft3.e0;
import grl.r2;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import om4.k3;
import om4.w;
import rp0.y;
import wli.x;
import zh9.u0;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class u extends r25.b {
    public final k3 A;
    public final gz3.a B;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final cx4.a f191647l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m25.f f191648m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final an4.a f191649n;
    public final j60.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f15.a f191650p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pm4.e f191651q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vp4.a f191652r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final al4.q f191653s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final al4.n f191654t;
    public final lb5.b u;
    public final v15.k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w f191655w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ang.f f191656x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final x f191657y;
    public final ssi.m z;

    public u(cx4.a creditScreenConstructorControllerExtension, m25.f creditCardAccountDialogMapper, an4.a creditCardDestinationFactory, j60.a bottomDialogExtension, f15.a getCreditHelpExtension, pm4.e creditCardPaymentDialogMapper, vp4.a creditCardAutopayDialogMapper, al4.q creditCardProductInteractor, al4.n creditCardInteractor, lb5.b creditCardAutopayInteractor, v15.k creditCardBalanceInteractor, w creditCardBoletoInteractor, ang.f userInteractor, x deeplinkHandler, ssi.m transactionsWidgetActionExtension, k3 preferenceInteractor, gz3.a startCreditApplicationNavigationDestinationProvider) {
        Intrinsics.checkNotNullParameter(creditScreenConstructorControllerExtension, "creditScreenConstructorControllerExtension");
        Intrinsics.checkNotNullParameter(creditCardAccountDialogMapper, "creditCardAccountDialogMapper");
        Intrinsics.checkNotNullParameter(creditCardDestinationFactory, "creditCardDestinationFactory");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(getCreditHelpExtension, "getCreditHelpExtension");
        Intrinsics.checkNotNullParameter(creditCardPaymentDialogMapper, "creditCardPaymentDialogMapper");
        Intrinsics.checkNotNullParameter(creditCardAutopayDialogMapper, "creditCardAutopayDialogMapper");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(creditCardAutopayInteractor, "creditCardAutopayInteractor");
        Intrinsics.checkNotNullParameter(creditCardBalanceInteractor, "creditCardBalanceInteractor");
        Intrinsics.checkNotNullParameter(creditCardBoletoInteractor, "creditCardBoletoInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(transactionsWidgetActionExtension, "transactionsWidgetActionExtension");
        Intrinsics.checkNotNullParameter(preferenceInteractor, "preferenceInteractor");
        Intrinsics.checkNotNullParameter(startCreditApplicationNavigationDestinationProvider, "startCreditApplicationNavigationDestinationProvider");
        this.f191647l = creditScreenConstructorControllerExtension;
        this.f191648m = creditCardAccountDialogMapper;
        this.f191649n = creditCardDestinationFactory;
        this.o = bottomDialogExtension;
        this.f191650p = getCreditHelpExtension;
        this.f191651q = creditCardPaymentDialogMapper;
        this.f191652r = creditCardAutopayDialogMapper;
        this.f191653s = creditCardProductInteractor;
        this.f191654t = creditCardInteractor;
        this.u = creditCardAutopayInteractor;
        this.v = creditCardBalanceInteractor;
        this.f191655w = creditCardBoletoInteractor;
        this.f191656x = userInteractor;
        this.f191657y = deeplinkHandler;
        this.z = transactionsWidgetActionExtension;
        this.A = preferenceInteractor;
        this.B = startCreditApplicationNavigationDestinationProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e3(l25.u r4, java.lang.String r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof l25.e
            if (r0 == 0) goto L13
            r0 = r6
            l25.e r0 = (l25.e) r0
            int r1 = r0.f191628w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f191628w = r1
            goto L18
        L13:
            l25.e r0 = new l25.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f191628w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L5d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            al4.n r4 = r4.f191654t
            w4l.j r6 = w4l.j.f294644c
            om4.x2 r4 = (om4.x2) r4
            kotlinx.coroutines.flow.Flow r4 = r4.z(r5, r6)
            zhm.h0 r5 = zhm.h0.f322473a
            vkm.q0 r4 = rd0.e.n(r4, r5)
            kye.l0 r5 = new kye.l0
            r6 = 18
            r5.<init>(r6)
            kye.l0 r6 = new kye.l0
            r2 = 19
            r6.<init>(r2)
            jhi.b r4 = mo3.a.e(r4, r5, r6)
            r0.f191628w = r3
            java.lang.Object r6 = vkm.q.z(r4, r0)
            if (r6 != r1) goto L5d
            return r1
        L5d:
            java.util.List r6 = (java.util.List) r6
            r4 = 0
            if (r6 == 0) goto L7e
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r5 = r6.iterator()
        L68:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L7c
            java.lang.Object r6 = r5.next()
            r0 = r6
            ll4.t r0 = (ll4.t) r0
            ll4.s r0 = r0.f196533a
            ll4.s r1 = ll4.s.BALANCE_TRANSFER
            if (r0 != r1) goto L68
            r4 = r6
        L7c:
            ll4.t r4 = (ll4.t) r4
        L7e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l25.u.e3(l25.u, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // r25.b
    public final Object b3(sfe.s sVar, Continuation continuation) {
        if (sVar instanceof sfe.m) {
            sfe.m mVar = (sfe.m) sVar;
            if (!g3(mVar.f262421c)) {
                f3(mVar.f262419a);
            }
        } else {
            if (sVar instanceof sfe.n) {
                Object objI3 = i3((sfe.n) sVar, continuation);
                return objI3 == fim.a.COROUTINE_SUSPENDED ? objI3 : Unit.f186387a;
            }
            if (!(sVar instanceof sfe.i) && !(sVar instanceof sfe.o)) {
                if (sVar instanceof sfe.l) {
                    throw new IllegalArgumentException("Event = " + sVar + " must be handled by common credit handler");
                }
                if (sVar instanceof sfe.p) {
                    TabAccountsInitialPayload tabAccountsInitialPayload = ((sfe.p) sVar).f262426b;
                    TabAccountsInitialPayload.Action action = tabAccountsInitialPayload instanceof TabAccountsInitialPayload.Action ? (TabAccountsInitialPayload.Action) tabAccountsInitialPayload : null;
                    g3(action != null ? action.f89543a : null);
                } else if (sVar instanceof sfe.h) {
                    Object obj2 = ((sfe.h) sVar).f262411b;
                    if (Intrinsics.f(obj2, CreditCardWidgetItemMapper$SubtitleAction$SharedCardInfoDialog.f70053a)) {
                        this.f191648m.getClass();
                        rp0.s sVar2 = new rp0.s(null, new TextLocalisedClause(R$string.credit_card_shared_card_info_title, null, null, 14), new TextLocalisedClause(R$string.credit_card_shared_card_info_subtitle, null, null, 14), 24);
                        aim.e eVarB = zhm.u.b();
                        boolean z = false;
                        RowDelegate.Model model = new RowDelegate.Model("shared_credit_card_dialog_repayments", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, 6), new TextLocalisedClause(R$string.credit_card_shared_card_info_repayments_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.credit_card_shared_card_info_repayments_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
                        boolean z3 = false;
                        boolean z4 = false;
                        List listK = v.k(model, new RowDelegate.Model("shared_credit_card_dialog_transactions", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_eye, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z3, z3, 6), new TextLocalisedClause(R$string.credit_card_shared_card_info_transactions_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.credit_card_shared_card_info_transactions_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("shared_credit_card_dialog_limits", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_draw_parallel_channel, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z4, z4, 6), new TextLocalisedClause(R$string.credit_card_shared_card_info_limits_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.credit_card_shared_card_info_limits_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
                        yp0.b.k(listK, 0, 0, 0, 0, 31);
                        eVarB.addAll(listK);
                        eVarB.add(m25.f.a("id_credit_card_account_dialog_info_button_got_it", new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14), null));
                        this.o.x(new y(zhm.u.a(eVarB), sVar2, rp0.l.WINDOW, null, null, null, 1016));
                    } else if (obj2 instanceof CreditCardWidgetItemMapper$SubtitleAction$BeDrivenAction) {
                        c8g.c.i(this.f191647l, ((CreditCardWidgetItemMapper$SubtitleAction$BeDrivenAction) obj2).f70052a);
                    } else {
                        int i = jli.h.f175850a;
                    }
                } else if (sVar instanceof sfe.j) {
                    ViewController viewControllerO2 = o2(new zl4.g(new CreditCardDisplayBalanceSettings$InputData(((sfe.j) sVar).f262415a.f89729a)));
                    l0c.s block = new l0c.s(this, 5);
                    Intrinsics.checkNotNullParameter(block, "block");
                    viewControllerO2.H = block;
                    yji.n.P2(this, viewControllerO2, ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
                } else {
                    if (!(sVar instanceof sfe.r) && !(sVar instanceof sfe.q) && !(sVar instanceof sfe.k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i2 = jli.h.f175850a;
                }
            }
        }
        return Unit.f186387a;
    }

    @Override // r25.b
    public final boolean d3(Object model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return h3(model);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean f3(String str) {
        int iHashCode = str.hashCode();
        j60.a aVar = this.o;
        Continuation continuation = null;
        m25.f fVar = this.f191648m;
        switch (iHashCode) {
            case -1816561454:
                if (!str.equals("id_credit_card_account_dialog_info_button_got_it")) {
                    return false;
                }
                break;
            case -211710597:
                if (!str.equals("id_statement_statement")) {
                    return false;
                }
                fVar.getClass();
                aVar.x(fVar.b(new TextLocalisedClause(R$string.credit_card_account_statement_info_statement_title, null, null, 14), new TextLocalisedClause(R$string.credit_card_account_statement_info_statement_description, null, null, 14)));
                return true;
            case 843024154:
                if (!str.equals("id_statement_minimum")) {
                    return false;
                }
                fVar.getClass();
                aVar.x(fVar.b(new TextLocalisedClause(R$string.credit_card_account_statement_info_minimum_title, null, null, 14), new TextLocalisedClause(R$string.credit_card_account_statement_info_minimum_description, null, null, 14)));
                return true;
            case 1918729248:
                if (!str.equals("ERROR_STATE_ID")) {
                    return false;
                }
                break;
            default:
                return false;
        }
        V2(new kze.h(this, continuation, 1), new yi5.b(29));
        return true;
    }

    public final boolean g3(Object obj2) {
        boolean z = obj2 instanceof CreditCardStatementSectionMapper.StatementParcel;
        j60.a aVar = this.o;
        m25.f fVar = this.f191648m;
        Continuation continuation = null;
        if (z) {
            CreditCardStatementSectionMapper.StatementParcel statementParcel = (CreditCardStatementSectionMapper.StatementParcel) obj2;
            if (statementParcel instanceof CreditCardStatementSectionMapper.StatementParcel.PaymentDueParcel) {
                fVar.getClass();
                aVar.x(fVar.b(new TextLocalisedClause(R$string.credit_card_account_statement_info_payment_due_title, null, null, 14), new TextLocalisedClause(R$string.credit_card_account_statement_info_payment_due_description_v2, null, null, 14)));
                return true;
            }
            if (statementParcel instanceof CreditCardStatementSectionMapper.StatementParcel.SetupAutoPay) {
                A2(new CreditCardSetupAutoPayDestination(((CreditCardStatementSectionMapper.StatementParcel.SetupAutoPay) statementParcel).f70051a));
                return true;
            }
            if (!(statementParcel instanceof CreditCardStatementSectionMapper.StatementParcel.AutoPaySettings)) {
                throw new NoWhenBranchMatchedException();
            }
            A2(new CreditCardKompotFeatureConfig.AutoPaySettings.AutoPaySettingsDestination(((CreditCardStatementSectionMapper.StatementParcel.AutoPaySettings) statementParcel).f70049a));
            return true;
        }
        if (!(obj2 instanceof CreditCardAccountActionParcel)) {
            if (obj2 instanceof m25.k) {
                m25.k kVar = (m25.k) obj2;
                if (kVar instanceof m25.j) {
                    m25.j jVar = (m25.j) kVar;
                    l3(jVar.f201704a, jVar.f201706c);
                    return true;
                }
                if (!(kVar instanceof m25.i)) {
                    throw new NoWhenBranchMatchedException();
                }
                m25.i iVar = (m25.i) kVar;
                k3(iVar.f201702a, iVar.f201703b);
                return true;
            }
            if (obj2 instanceof CreditCardAdministrationFeeMapper.AdministrationFeeInfoParcel) {
                int i = ((CreditCardAdministrationFeeMapper.AdministrationFeeInfoParcel) obj2).f70048a;
                fVar.getClass();
                aVar.x(fVar.b(new TextLocalisedClause(R$string.credit_management_monthly_fee, null, null, 14), new TextLocalisedClause(R$string.credit_management_administration_fee_description, zhm.u.c(Integer.valueOf(i)), null, 12)));
                return true;
            }
            if (obj2 instanceof dl4.a) {
                l3(((dl4.a) obj2).f115698a, null);
                return true;
            }
            if (!(obj2 instanceof bl4.c)) {
                if (obj2 instanceof m25.d) {
                    j60.a.v(aVar, false, null, 3);
                    return true;
                }
                if (!(obj2 instanceof m25.c)) {
                    return false;
                }
                j60.a.v(aVar, false, null, 3);
                m25.c cVar = (m25.c) obj2;
                T2(new d(this, cVar.f201699a, cVar.f201700b, continuation, 0), new yi5.b(27));
                return true;
            }
            bl4.c cVar2 = (bl4.c) obj2;
            if (cVar2 instanceof bl4.b) {
                j60.a.v(aVar, false, null, 3);
                A2(new CreditCardSetupAutoPayDestination(((bl4.b) cVar2).f16465a));
                return true;
            }
            if (!(cVar2 instanceof bl4.a)) {
                throw new NoWhenBranchMatchedException();
            }
            j60.a.v(aVar, false, null, 3);
            A2(new CreditCardKompotFeatureConfig.AutoPaySettings.AutoPaySettingsDestination(((bl4.a) cVar2).f16463a));
            return true;
        }
        CreditCardAccountActionParcel creditCardAccountActionParcel = (CreditCardAccountActionParcel) obj2;
        if (creditCardAccountActionParcel instanceof CreditCardAccountActionParcel.BalanceTransfer) {
            CreditCardAccountActionParcel.BalanceTransfer balanceTransfer = (CreditCardAccountActionParcel.BalanceTransfer) creditCardAccountActionParcel;
            V2(new d(this, balanceTransfer.f70026a, balanceTransfer.f70027b, continuation, 1), new yi5.b(29));
            return true;
        }
        if (creditCardAccountActionParcel instanceof CreditCardAccountActionParcel.Details) {
            CreditCardAccountActionParcel.Details details = (CreditCardAccountActionParcel.Details) creditCardAccountActionParcel;
            k3(details.f70029a, details.f70030b);
            return true;
        }
        if (creditCardAccountActionParcel instanceof CreditCardAccountActionParcel.Repay) {
            CreditCardAccountActionParcel.Repay repay = (CreditCardAccountActionParcel.Repay) creditCardAccountActionParcel;
            l3(repay.f70042a, repay.f70044c);
            return true;
        }
        if (creditCardAccountActionParcel instanceof CreditCardAccountActionParcel.SetupAutoPay) {
            A2(new CreditCardSetupAutoPayDestination(((CreditCardAccountActionParcel.SetupAutoPay) creditCardAccountActionParcel).f70046a));
            return true;
        }
        if (creditCardAccountActionParcel instanceof CreditCardAccountActionParcel.AutoPaySettings) {
            A2(new CreditCardKompotFeatureConfig.AutoPaySettings.AutoPaySettingsDestination(((CreditCardAccountActionParcel.AutoPaySettings) creditCardAccountActionParcel).f70025a));
            return true;
        }
        if (creditCardAccountActionParcel instanceof CreditCardAccountActionParcel.Statement) {
            V2(new i(this, ((CreditCardAccountActionParcel.Statement) creditCardAccountActionParcel).f70047a, continuation, 3), new yi5.b(29));
            return true;
        }
        if (creditCardAccountActionParcel instanceof CreditCardAccountActionParcel.GetHelp) {
            V2(new i(this, ((CreditCardAccountActionParcel.GetHelp) creditCardAccountActionParcel).f70033a, continuation, 2), new yi5.b(29));
            return true;
        }
        if (creditCardAccountActionParcel instanceof CreditCardAccountActionParcel.Move) {
            CreditCardAccountActionParcel.Move move = (CreditCardAccountActionParcel.Move) creditCardAccountActionParcel;
            if (move instanceof CreditCardAccountActionParcel.Move.Available) {
                A2(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveMoney(new StartUpPocket.CreditCardAccount(((CreditCardAccountActionParcel.Move.Available) move).f70037a), (com.revolut.shared.feature.move_money.api.navigation.a) null, 6), (Set) null, 6), null));
                return true;
            }
            if (!(move instanceof CreditCardAccountActionParcel.Move.Overdue)) {
                if (!(move instanceof CreditCardAccountActionParcel.Move.Forbearance)) {
                    throw new NoWhenBranchMatchedException();
                }
                wi0.b countryCode = ((CreditCardAccountActionParcel.Move.Forbearance) move).f70038a;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                wi0.b.Companion.getClass();
                wi0.b bVar = wi0.b.l2;
                TextLocalisedClause textLocalisedClause = (Intrinsics.f(countryCode, bVar) || Intrinsics.f(countryCode, wi0.b.f297756l)) ? new TextLocalisedClause(R$string.credit_card_management_dialog_move_money_restricted_title, null, null, 14) : new TextLocalisedClause(R$string.credit_card_account_dialog_move_forbearance_title, null, null, 14);
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                aVar.x(m25.f.c(textLocalisedClause, (Intrinsics.f(countryCode, bVar) || Intrinsics.f(countryCode, wi0.b.f297756l)) ? new TextLocalisedClause(R$string.credit_card_management_dialog_move_money_restricted_description, null, null, 14) : new TextLocalisedClause(R$string.credit_card_account_dialog_move_forbearance_description, null, null, 14), zhm.u.c(m25.f.a("id_credit_card_account_dialog_info_button_got_it", new TextLocalisedClause(R$string.credit_card_account_dialog_move_forbearance_action, null, null, 14), null))));
                return true;
            }
            CreditCardAccountActionParcel.Move.Overdue overdue = (CreditCardAccountActionParcel.Move.Overdue) move;
            String pocketId = overdue.f70039a;
            dj0.d amount = overdue.f70040b;
            wi0.b countryCode2 = overdue.f70041c;
            fVar.getClass();
            Intrinsics.checkNotNullParameter(pocketId, "pocketId");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(countryCode2, "countryCode");
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_card_account_dialog_move_overdue_title, null, null, 14);
            Intrinsics.checkNotNullParameter(countryCode2, "countryCode");
            Intrinsics.checkNotNullParameter(amount, "amount");
            wi0.b.Companion.getClass();
            aVar.x(m25.f.c(textLocalisedClause2, Intrinsics.f(countryCode2, wi0.b.f297756l) ? new TextLocalisedClause(R$string.credit_card_account_dialog_move_overdue_description_au, null, null, 14) : new TextLocalisedClause(R$string.credit_card_account_dialog_move_overdue_description, zhm.u.c(sx4.f.b(3, null, null, amount)), null, 12), zhm.u.c(m25.f.a("id_credit_card_account_dialog_warning_pay", new TextLocalisedClause(R$string.credit_card_account_dialog_move_overdue_action, null, null, 14), new dl4.a(amount, pocketId)))));
            return true;
        }
        if (creditCardAccountActionParcel instanceof CreditCardAccountActionParcel.DisplayAmount) {
            CreditCardAccountActionParcel.DisplayAmount displayAmount = (CreditCardAccountActionParcel.DisplayAmount) creditCardAccountActionParcel;
            String facilityId = displayAmount.f70031a;
            xi0.b currency = displayAmount.f70032b;
            an4.a aVar2 = this.f191649n;
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            A2(new com.revolut.kompot.common.b(new DisplayAmountToggleController(aVar2.f6550a, new DisplayAmountToggleControllerContract$InputData(facilityId, currency)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, 4));
            return true;
        }
        if (creditCardAccountActionParcel instanceof CreditCardAccountActionParcel.Instalment) {
            A2(new CreditCardInstalmentHubDestination(((CreditCardAccountActionParcel.Instalment) creditCardAccountActionParcel).f70034a, null));
            return true;
        }
        if (creditCardAccountActionParcel instanceof CreditCardAccountActionParcel.AdditionalCards) {
            A2(new AdditionalCardsDestination(((CreditCardAccountActionParcel.AdditionalCards) creditCardAccountActionParcel).f70023a, null));
            return true;
        }
        if (creditCardAccountActionParcel instanceof CreditCardAccountActionParcel.AdditionalCardsOnboarding) {
            A2(u0.c(new CreditApplicationFeatureConfig.StartApplication(new a1(r2.HOME, null, null, null, null, 30), new ft3.r(((CreditCardAccountActionParcel.AdditionalCardsOnboarding) creditCardAccountActionParcel).f70024a), null, null, null, null, null, null, null, null, 2044)));
            return true;
        }
        if (creditCardAccountActionParcel instanceof CreditCardAccountActionParcel.Settings) {
            A2(new CreditCardSettingsDestination(((CreditCardAccountActionParcel.Settings) creditCardAccountActionParcel).f70045a));
            return true;
        }
        if (creditCardAccountActionParcel instanceof CreditCardAccountActionParcel.ChangeDueDate) {
            A2(new CreditCardSelectDueDateFlowDestination(((CreditCardAccountActionParcel.ChangeDueDate) creditCardAccountActionParcel).f70028a));
            return true;
        }
        if (creditCardAccountActionParcel instanceof CreditCardAccountActionParcel.Insurance) {
            CreditCardAccountActionParcel.Insurance insurance = (CreditCardAccountActionParcel.Insurance) creditCardAccountActionParcel;
            A2(new InsuranceCreditNavigationDestination(new Facility.CreditCard(insurance.f70035a), insurance.f70036b, null));
            return true;
        }
        if (!(creditCardAccountActionParcel instanceof CreditCardAccountActionParcel.AddInsurance)) {
            throw new NoWhenBranchMatchedException();
        }
        A2(this.B.c(new e0(((CreditCardAccountActionParcel.AddInsurance) creditCardAccountActionParcel).f70022a), new a1(r2.HOME, null, null, null, null, 30), wp3.a.OPEN_EXISTING_APPLICATION, yp3.d.DEFAULT, (1916 & 16) != 0 ? null : null, (1916 & 32) != 0 ? yp3.f.SHOW_ALL : null, yp3.c.DEFAULT, (1916 & 128) != 0 ? yp3.e.SKIP_ON_TOGGLE_DISABLED : null, yp3.b.DEFAULT, (1916 & 512) != 0 ? null : null, null));
        return true;
    }

    public final boolean h3(Object obj2) {
        if (!(obj2 instanceof koi.j) || !(obj2 instanceof qv0.p)) {
            return obj2 instanceof TagViewData ? g3(((TagViewData) obj2).k) : g3(obj2);
        }
        qv0.p pVar = (qv0.p) obj2;
        return this.f191650p.O1(pVar) || g3(pVar.getF()) || f3(((koi.j) obj2).getF51938a());
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i3(sfe.n r25, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l25.u.i3(sfe.n, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j3(sfe.n r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof l25.p
            if (r0 == 0) goto L13
            r0 = r6
            l25.p r0 = (l25.p) r0
            int r1 = r0.f191642w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f191642w = r1
            goto L18
        L13:
            l25.p r0 = new l25.p
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f191642w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.Object r5 = r5.f262423b
            ssi.m r6 = r4.z
            ssi.k r5 = r6.c3(r5)
            if (r5 != 0) goto L3f
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L3f:
            r0.f191642w = r3
            java.lang.Object r5 = r6.Z2(r5, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l25.u.j3(sfe.n, gim.c):java.lang.Object");
    }

    public final void k3(String str, yw4.l lVar) {
        int i = b.f191620a[lVar.ordinal()];
        if (i == 1) {
            A2(new CreditCardDetailsDestination(str));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            A2(new AdditionalCardholderAccountInfoDestination(str));
        }
    }

    public final void l3(String str, String str2) {
        j60.a.v(this.o, false, null, 3);
        if (str2 != null) {
            A2(new CreditPostTerminationPlanEntryPoint.Repay(str2, null));
        } else {
            A2(new CreditCardTopupDestination(str, (KompotDestination) null, 6));
        }
    }
}
