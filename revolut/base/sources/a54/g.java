package a54;

import ajh.l;
import ald.m;
import b0a.j;
import b9d.n;
import bke.x;
import bt9.w;
import c84.t;
import cbh.y;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.payments.groups.api.R$string;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.ManagedPortfolioSelectTemplateScreenContract$ModalStep;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferUserAccountInformation;
import com.revolut.feature.transfer.models.quotes.TransferQuoteSplitOption;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import d8f.k;
import e4b.q;
import g8i.e0;
import i6j.p;
import iaf.r;
import ip0.tm0;
import ip0.um0;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g((com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2.a) this.v, continuation, 0);
            case 1:
                return new g((com.revolut.feature.credit.application.plugins.impl.ui.documents_remediation.a) this.v, continuation, 1);
            case 2:
                return new g((l) this.v, continuation, 2);
            case 3:
                return new g((com.revolut.feature.retail.cfd.impl.screens.order.v2.a) this.v, continuation, 3);
            case 4:
                return new g((n) this.v, continuation, 4);
            case 5:
                return new g((com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.a) this.v, continuation, 5);
            case 6:
                return new g((x) this.v, continuation, 6);
            case 7:
                return new g((w) this.v, continuation, 7);
            case 8:
                return new g((com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.a) this.v, continuation, 8);
            case 9:
                return new g((y) this.v, continuation, 9);
            case 10:
                return new g((cc4.c) this.v, continuation, 10);
            case 11:
                return new g((com.revolut.trading.orders.ui.screens.pocket_picker.b) this.v, continuation, 11);
            case 12:
                return new g((com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.b) this.v, continuation, 12);
            case 13:
                return new g((db4.i) this.v, continuation, 13);
            case 14:
                return new g((com.revolut.kompot.navigable.a) this.v, continuation, 14);
            case 15:
                return new g((com.revolut.feature.credit.card.impl.ui.instalment.term.b) this.v, continuation, 15);
            case 16:
                return new g((q) this.v, continuation, 16);
            case 17:
                return new g((com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow.a) this.v, continuation, 17);
            case 18:
                return new g((com.revolut.feature.credit.application.plugins.impl.ui.personal_details.a) this.v, continuation, 18);
            case 19:
                return new g((com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a) this.v, continuation, 19);
            case 20:
                return new g((com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.c) this.v, continuation, 20);
            case 21:
                return new g((com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.a) this.v, continuation, 21);
            case 22:
                return new g((e0) this.v, continuation, 22);
            case 23:
                return new g((gh3.l) this.v, continuation, 23);
            case 24:
                return new g((gm5.e) this.v, continuation, 24);
            case 25:
                return new g((hu1.e0) this.v, continuation, 25);
            case 26:
                return new g((com.revolut.feature.card_screen.impl.kompot.reactivate.b) this.v, continuation, 26);
            case 27:
                return new g((r) this.v, continuation, 27);
            default:
                return new g((ivh.c) this.v, continuation, 28);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v106, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.revolut.kompot.navigable.flow.FlowStep] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TransferUserAccountInformation acatTransferUserAccountInformation;
        String str;
        Object next;
        int i = this.u;
        boolean z = true;
        int i2 = 0;
        ?? riskDialog = 0;
        riskDialog = 0;
        riskDialog = 0;
        riskDialog = 0;
        riskDialog = 0;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                t.J2((com.revolut.feature.credit.application.plugins.impl.ui.agreements.v2.a) obj3, false, null, null, 7);
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                t.J2((com.revolut.feature.credit.application.plugins.impl.ui.documents_remediation.a) obj3, false, null, null, 7);
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((l) obj3).B2();
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.retail.cfd.impl.screens.order.v2.a aVar5 = (com.revolut.feature.retail.cfd.impl.screens.order.v2.a) obj3;
                cli.y yVar = aVar5.J;
                if (!((b4b.n) ((j2) yVar.f22677a).getValue()).k) {
                    aVar5.H2(yVar, new j(19));
                    Continuation continuation = null;
                    aVar5.n2(new m((Object) aVar5, (Object) continuation, false, continuation, 3), new whi.b(6));
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                n nVar = (n) obj3;
                String str2 = nVar.f13727q.f86324c;
                if (str2 == null) {
                    str2 = n.B;
                }
                nVar.v2(new b9d.g(str2));
                return Unit.f186387a;
            case 5:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.a aVar8 = (com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.a) obj3;
                baf.i iVar = (baf.i) ((j2) aVar8.f91596p.f22677a).getValue();
                boolean z3 = iVar.f;
                wi0.b bVar = iVar.f14054c;
                String str3 = iVar.f14052a;
                if (z3) {
                    u8f.h hVar = iVar.e.f91502c;
                    switch (hVar == null ? -1 : baf.n.f14061a[hVar.ordinal()]) {
                        case -1:
                        case 1:
                        case 2:
                        case 3:
                            if (str3 == null || bVar == null) {
                                r6.b.D("State is valid but missing accountNumber!");
                                acatTransferUserAccountInformation = null;
                            } else {
                                acatTransferUserAccountInformation = new TransferUserAccountInformation.AcatTransferUserAccountInformation(str3, bVar);
                            }
                            break;
                        case 0:
                        default:
                            throw new NoWhenBranchMatchedException();
                        case 4:
                        case 5:
                            if (str3 == null || (str = iVar.f14053b) == null || bVar == null) {
                                r6.b.D("State is valid but missing accountNumber!");
                                acatTransferUserAccountInformation = null;
                            } else {
                                acatTransferUserAccountInformation = new TransferUserAccountInformation.DtcTransferUserAccountInformation(str3, str, bVar);
                            }
                            break;
                        case 6:
                            if (str3 == null) {
                                r6.b.D("State is valid but missing accountNumber!");
                                acatTransferUserAccountInformation = null;
                            } else {
                                acatTransferUserAccountInformation = new TransferUserAccountInformation.TaaTransferUserAccountInformation(str3);
                            }
                            break;
                    }
                } else {
                    acatTransferUserAccountInformation = null;
                }
                if (acatTransferUserAccountInformation == null) {
                    return null;
                }
                aVar8.C2(new baf.j(acatTransferUserAccountInformation));
                return Unit.f186387a;
            case 6:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((x) obj3).g3();
                return Unit.f186387a;
            case 7:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                w wVar = (w) obj3;
                j60.a aVar11 = wVar.f18481x;
                et9.a aVar12 = wVar.v;
                PaymentGroup group = wVar.B2().f18465a;
                aVar12.getClass();
                Intrinsics.checkNotNullParameter(group, "group");
                String str4 = null;
                aVar11.x(new rp0.y(u.c(new um0("ID_BOTTOM_DIALOG_ACTION_REMOVE", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), false, null, str4, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_remove, null, null, 14), false, str4, null, 56), (Object) null, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1016)), new rp0.t(new TextLocalisedClause(R$string.payments_groups_details_bill_remove_title, null, null, 14), new TextLocalisedClause(R$string.payments_groups_details_bill_remove_subtitle, u.c(group.f79286b), null, 12), null, 28), null, null, null, null, 1020));
                return Unit.f186387a;
            case 8:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.a) obj3).f69741y.a();
                return Unit.f186387a;
            case 9:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((y) obj3).B2();
                return Unit.f186387a;
            case 10:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                t.J2((cc4.c) obj3, false, null, null, 7);
                return Unit.f186387a;
            case 11:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.trading.orders.ui.screens.pocket_picker.b) obj3).B2();
                return Unit.f186387a;
            case 12:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.b bVar2 = (com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.b) obj3;
                com.revolut.kompot.navigable.vc.modal.a aVar18 = bVar2.f91455x;
                cli.y yVar2 = bVar2.v;
                j2 j2Var = (j2) yVar2.f22677a;
                j2 j2Var2 = (j2) yVar2.f22677a;
                d8f.h templateSelectionMode = ((d8f.i) j2Var.getValue()).d;
                if (templateSelectionMode == null) {
                    throw new IllegalStateException("No selected template mode in state when showing risk dialog");
                }
                String str5 = ((d8f.i) j2Var2.getValue()).f112246b;
                Iterator it8 = templateSelectionMode.a().iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((Template) next).f95706a, str5)) {
                        }
                    } else {
                        next = null;
                    }
                }
                Template selectedTemplate = (Template) next;
                if (selectedTemplate == null) {
                    throw new IllegalStateException("No selected template in state when showing risk dialog");
                }
                xdh.a aVar19 = selectedTemplate.f95707b;
                ilc.a roboContext = ((d8f.i) j2Var2.getValue()).e;
                if (roboContext == null) {
                    throw new IllegalStateException("No loaded robo context when showing risk dialog");
                }
                bVar2.u.getClass();
                Intrinsics.checkNotNullParameter(templateSelectionMode, "templateSelectionMode");
                Intrinsics.checkNotNullParameter(roboContext, "roboContext");
                Intrinsics.checkNotNullParameter(selectedTemplate, "selectedTemplate");
                if ((templateSelectionMode instanceof d8f.f) || (templateSelectionMode instanceof d8f.g)) {
                    int i3 = f8f.b.f132768a[roboContext.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3 && i3 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (aVar19.a() != templateSelectionMode.b().f95707b.a()) {
                            riskDialog = new ManagedPortfolioSelectTemplateScreenContract$ModalStep.RiskDialog(selectedTemplate, templateSelectionMode.b(), roboContext);
                        }
                    } else if (aVar19.a() >= templateSelectionMode.b().f95707b.a() + 2) {
                        riskDialog = new ManagedPortfolioSelectTemplateScreenContract$ModalStep.RiskDialog(selectedTemplate, templateSelectionMode.b(), roboContext);
                    }
                } else if (!(templateSelectionMode instanceof d8f.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                if (riskDialog != 0) {
                    oki.h.v2(aVar18, riskDialog, bottom_dialog);
                } else if (((d8f.i) j2Var2.getValue()).d instanceof d8f.e) {
                    oki.h.v2(aVar18, new ManagedPortfolioSelectTemplateScreenContract$ModalStep.ConfirmChangeDialog(selectedTemplate, templateSelectionMode.b(), roboContext), bottom_dialog);
                } else {
                    bVar2.C2(new k(selectedTemplate));
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((db4.i) obj3).C2(db4.d.f112664a);
                return Unit.f186387a;
            case 14:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.kompot.navigable.a) obj3).y2().a();
                return Unit.f186387a;
            case 15:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.credit.card.impl.ui.instalment.term.b) obj3).K2();
                return Unit.f186387a;
            case 16:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                vii.c cVar = ((q) obj3).f122536s;
                Unit unit = Unit.f186387a;
                cVar.b(unit);
                return unit;
            case 17:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow.a aVar25 = (com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow.a) obj3;
                aVar25.O2(null, aVar25.f67659p.f67655a.f66892b);
                return Unit.f186387a;
            case 18:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                t.J2((com.revolut.feature.credit.application.plugins.impl.ui.personal_details.a) obj3, false, null, null, 7);
                return Unit.f186387a;
            case 19:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a) obj3).v.a();
                return Unit.f186387a;
            case 20:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                t.J2((com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.c) obj3, false, null, null, 7);
                return Unit.f186387a;
            case 21:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                t.J2((com.revolut.feature.credit.application.plugins.impl.ui.consents_v2.a) obj3, false, null, null, 7);
                return Unit.f186387a;
            case 22:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e0 e0Var = (e0) obj3;
                OrderQuote orderQuote = ((g8i.r) e0Var.t2()).f141385a;
                Action action = e0Var.f141366p.f104833a;
                if (!(action instanceof Action.OpenBalanceAutomation) && !(action instanceof Action.Add) && !(action instanceof Action.AddNewScheduledPayment) && !(action instanceof Action.Deposit) && !(action instanceof Action.EditScheduledPayment) && !(action instanceof Action.MoveWithFixedAccount) && !(action instanceof Action.Withdraw) && !(action instanceof Action.EditScheduledAutomation)) {
                    if (action instanceof Action.MoveMoney) {
                        z = ((Action.MoveMoney) action).f104819c;
                    } else if (action instanceof Action.Topup) {
                        z = ((Action.Topup) action).e;
                    } else {
                        if (!(action instanceof Action.MoveMoneyWithAccountPair)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        z = ((Action.MoveMoneyWithAccountPair) action).e;
                    }
                }
                TransferQuoteSplitOption transferQuoteSplitOption = a.a.t(((g8i.r) e0Var.t2()).f141391l).f291588a;
                e0Var.v2(new g8i.t(orderQuote, z, transferQuoteSplitOption != null ? new Integer(transferQuoteSplitOption.f92290c) : null, ((g8i.r) e0Var.t2()).f141388g));
                return Unit.f186387a;
            case 23:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((gh3.l) obj3).f143850t.a();
                return Unit.f186387a;
            case 24:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((gm5.e) obj3).f3(gm5.a.ACCEPTED);
                return Unit.f186387a;
            case 25:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                hu1.e0 e0Var2 = (hu1.e0) obj3;
                e0Var2.x2(new hu1.u(e0Var2, 2));
                e0Var2.l2(new hu1.y(e0Var2, riskDialog, i2), new yi5.b(26));
                return Unit.f186387a;
            case 26:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.card_screen.impl.kompot.reactivate.b bVar3 = (com.revolut.feature.card_screen.impl.kompot.reactivate.b) obj3;
                return yji.l.a1(bVar3, rd0.e.b(nim.a.w(rd0.e.c(((ha3.x) bVar3.o).f.s(true), kotlin.coroutines.g.f186406a), new p(10))), null, null, new i13.d(bVar3, (Continuation) riskDialog, 23), 3);
            case 27:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                r rVar = (r) obj3;
                iaf.j jVar = (iaf.j) ((j2) rVar.f160018r.f22677a).getValue();
                boolean z4 = jVar.f160005c;
                ?? r110 = jVar.f160003a;
                iaf.l lVar = (!z4 || r110.isEmpty()) ? null : new iaf.l(d0.d1(r110.values()));
                if (lVar == null) {
                    return null;
                }
                rVar.C2(lVar);
                return Unit.f186387a;
            default:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ivh.c cVar2 = (ivh.c) obj3;
                cVar2.A2(cVar2.f168866m.b(null));
                return Unit.f186387a;
        }
    }
}
