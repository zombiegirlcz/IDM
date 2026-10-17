package u7k;

import androidx.room.util.DBUtil;
import aw0.n6;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.multibanco.impl.ui.withdrawal.amount.WithdrawalAmountScreen;
import com.revolut.feature.apm.payid.impl.screen.send.contacts.ContactsScreen;
import com.revolut.feature.cashback.impl.ui.yourcashback.home.YourCashbackHomeScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.welcome.LoanWelcomeController;
import com.revolut.feature.credit.post_termination_plan.api.models.CreditPostTerminationPlanDetails;
import com.revolut.feature.credit.post_termination_plan.api.models.CreditPostTerminationPlanRepaymentInfo;
import com.revolut.feature.global_markets.impl.ui.screen.index_overview.IndexOverviewScreen;
import com.revolut.feature.payments.R$string;
import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import com.revolut.feature.shared.help_centre.impl.faq.screens.something_else.FaqSomethingElseScreen;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_retail_user_declarations.email.pending_verification.cooldown_bottomsheet.EmailVerificationCooldownBottomSheetController;
import com.revolut.feature_retail_user_declarations.occupation.screen.OccupationChooserScreen;
import com.revolut.feature_rev_points_pocket_api.navigation.RevPointsPocketDestination;
import com.revolut.feature_rev_points_pocket_impl.ui.screen.details.RevPointsPocketDetailsScreen;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.core.navigation.FinishFlowCommand;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.CryptoAssetDetailsScreen;
import com.revolut.retail.feature.payments.payment_links.impl.ui.details.PaymentLinkNotActiveException;
import com.revolut.retail.feature.plan_rewards.impl.presentation.reveal.screen.PlanRewardsRevealScreen;
import ip0.ii;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.CoroutineScope;
import le.u1;
import m9d.w0;
import nii.y0;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class f0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f277957w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.revolut.retail.feature.payments.payment_links.impl.ui.details.b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f0((com.revolut.retail.feature.payments.payment_links.impl.ui.details.b) this.v, (String) this.f277957w, continuation, 0);
            case 1:
                f0 f0Var = new f0((com.revolut.retail.feature.payments.payment_links.impl.ui.details.b) this.v, continuation);
                f0Var.f277957w = obj2;
                return f0Var;
            case 2:
                f0 f0Var2 = new f0((WithdrawalAmountScreen) this.f277957w, continuation, 2);
                f0Var2.v = obj2;
                return f0Var2;
            case 3:
                f0 f0Var3 = new f0((u82.m) this.f277957w, continuation, 3);
                f0Var3.v = obj2;
                return f0Var3;
            case 4:
                f0 f0Var4 = new f0((LoanWelcomeController) this.f277957w, continuation, 4);
                f0Var4.v = obj2;
                return f0Var4;
            case 5:
                f0 f0Var5 = new f0((u85.j) this.f277957w, continuation, 5);
                f0Var5.v = obj2;
                return f0Var5;
            case 6:
                f0 f0Var6 = new f0((IndexOverviewScreen) this.f277957w, continuation, 6);
                f0Var6.v = obj2;
                return f0Var6;
            case 7:
                f0 f0Var7 = new f0((FaqSomethingElseScreen) this.f277957w, continuation, 7);
                f0Var7.v = obj2;
                return f0Var7;
            case 8:
                f0 f0Var8 = new f0((u8i.a) this.f277957w, continuation, 8);
                f0Var8.v = obj2;
                return f0Var8;
            case 9:
                f0 f0Var9 = new f0((CryptoAssetDetailsScreen) this.f277957w, continuation, 9);
                f0Var9.v = obj2;
                return f0Var9;
            case 10:
                f0 f0Var10 = new f0((com.revolut.feature.pix.impl.flow.automatico.screens.details.a) this.f277957w, continuation, 10);
                f0Var10.v = obj2;
                return f0Var10;
            case 11:
                f0 f0Var11 = new f0((ContactsScreen) this.f277957w, continuation, 11);
                f0Var11.v = obj2;
                return f0Var11;
            case 12:
                return new f0((ua2.t) this.v, (f5j.a) this.f277957w, continuation, 12);
            case 13:
                f0 f0Var12 = new f0((ua5.e) this.f277957w, continuation, 13);
                f0Var12.v = obj2;
                return f0Var12;
            case 14:
                f0 f0Var13 = new f0((com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.c) this.f277957w, continuation, 14);
                f0Var13.v = obj2;
                return f0Var13;
            case 15:
                f0 f0Var14 = new f0((EmailVerificationCooldownBottomSheetController) this.f277957w, continuation, 15);
                f0Var14.v = obj2;
                return f0Var14;
            case 16:
                f0 f0Var15 = new f0((OccupationChooserScreen) this.f277957w, continuation, 16);
                f0Var15.v = obj2;
                return f0Var15;
            case 17:
                f0 f0Var16 = new f0((ubi.l) this.f277957w, continuation, 17);
                f0Var16.v = obj2;
                return f0Var16;
            case 18:
                return new f0((ubi.l) this.v, (ii) this.f277957w, continuation, 18);
            case 19:
                f0 f0Var17 = new f0((uc4.i) this.f277957w, continuation, 19);
                f0Var17.v = obj2;
                return f0Var17;
            case 20:
                f0 f0Var18 = new f0((ud2.q) this.f277957w, continuation, 20);
                f0Var18.v = obj2;
                return f0Var18;
            case 21:
                f0 f0Var19 = new f0((YourCashbackHomeScreen) this.f277957w, continuation, 21);
                f0Var19.v = obj2;
                return f0Var19;
            case 22:
                f0 f0Var20 = new f0((ud6.h) this.f277957w, continuation, 22);
                f0Var20.v = obj2;
                return f0Var20;
            case 23:
                f0 f0Var21 = new f0((RevPointsPocketDetailsScreen) this.f277957w, continuation, 23);
                f0Var21.v = obj2;
                return f0Var21;
            case 24:
                f0 f0Var22 = new f0((PlanRewardsRevealScreen) this.f277957w, continuation, 24);
                f0Var22.v = obj2;
                return f0Var22;
            case 25:
                f0 f0Var23 = new f0((udk.z) this.f277957w, continuation, 25);
                f0Var23.v = obj2;
                return f0Var23;
            case 26:
                f0 f0Var24 = new f0((uec.e) this.f277957w, continuation, 26);
                f0Var24.v = obj2;
                return f0Var24;
            case 27:
                return new f0((ued.d) this.v, (LocalDate) this.f277957w, continuation, 27);
            case 28:
                f0 f0Var25 = new f0((uef.l) this.f277957w, continuation, 28);
                f0Var25.v = obj2;
                return f0Var25;
            default:
                f0 f0Var26 = new f0((uek.m) this.f277957w, continuation, 29);
                f0Var26.v = obj2;
                return f0Var26;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((f0) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((f0) create((u82.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((f0) create((yx4.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((f0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((f0) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((f0) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((f0) create((n8i.k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((f0) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((f0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((f0) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((f0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((f0) create((ua5.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((f0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((f0) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((f0) create((ii) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((f0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((f0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((f0) create((rp0.p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((f0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((f0) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((f0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((f0) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((f0) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((f0) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((f0) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((f0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((f0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f0) create((uek.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v46, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v56, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v85, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y0 y0Var;
        nii.z zVar;
        nii.z zVar2;
        Object next;
        int i = 7;
        int i2 = 18;
        int i3 = 8;
        int i5 = 4;
        int i6 = 6;
        int i21 = 26;
        int i22 = 3;
        int i32 = 0;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.payments.payment_links.impl.ui.details.b bVar = (com.revolut.retail.feature.payments.payment_links.impl.ui.details.b) this.v;
                c70.a.b(bVar.f102187p, null, (String) this.f277957w, false, 5);
                r70.c.b(bVar.f102188q, 3);
                return bVar.X1(te0.w.a("SHOT_DIALOG_ID", new TextLocalisedClause(R$string.payment_links_toast_copied_to_clipboard, null, null, 14), null, null, null, null, 124));
            case 1:
                Data data = (Data) this.f277957w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.payments.payment_links.impl.ui.details.b bVar2 = (com.revolut.retail.feature.payments.payment_links.impl.ui.details.b) this.v;
                bVar2.H2(bVar2.v, new u4e.l(data, i22));
                j0 j0Var = bVar2.u;
                Throwable error = data.getError();
                j0Var.getClass();
                PaymentLinkNotActiveException paymentLinkNotActiveException = error instanceof PaymentLinkNotActiveException ? (PaymentLinkNotActiveException) error : null;
                int i33 = 2;
                if (paymentLinkNotActiveException == null) {
                    y0Var = null;
                } else {
                    int i43 = i0.f277962a[paymentLinkNotActiveException.f102184a.ordinal()];
                    if (i43 == 1) {
                        zVar = new nii.z(new TextLocalisedClause(com.revolut.retail.feature.payments.payment_links.impl.R$string.payments_links_claim_redeemed, null, null, 14), null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_done, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758);
                    } else if (i43 == 2) {
                        zVar = new nii.z(new TextLocalisedClause(com.revolut.retail.feature.payments.payment_links.impl.R$string.payments_links_claim_rejected, null, null, 14), null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_done, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758);
                    } else if (i43 != 3) {
                        if (i43 == 4) {
                            zVar2 = new nii.z(new TextLocalisedClause(com.revolut.retail.feature.payments.payment_links.impl.R$string.payments_links_claim_cancelled, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.payments.payment_links.impl.R$string.payment_links_claim_cancelled_description, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_done, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756);
                        } else {
                            if (i43 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            zVar2 = new nii.z(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.general_error_common, null, null, 14), null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_done, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758);
                        }
                        zVar = zVar2;
                    } else {
                        zVar = new nii.z(new TextLocalisedClause(com.revolut.retail.feature.payments.payment_links.impl.R$string.payments_links_claim_expired, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.payments.payment_links.impl.R$string.payment_links_claim_expired_description, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_done, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756);
                    }
                    y0Var = new y0("PAYMENT_LINK_DIALOG_ID", zVar, false, 4);
                }
                if (y0Var != null) {
                    yji.l.a1(bVar2, bVar2.X1(y0Var), null, null, new y(bVar2, dVar, i33), 3);
                }
                return Unit.f186387a;
            case 2:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u82.g gVar = (u82.g) ((WithdrawalAmountScreen) this.f277957w).S.getValue();
                String amount = charSequence.toString();
                u82.m mVar = (u82.m) gVar;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                mVar.H2(mVar.v, new u69.g(new u69.g(mVar, amount, i), mVar, i3));
                return Unit.f186387a;
            case 3:
                u82.e eVar = (u82.e) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u82.m mVar2 = (u82.m) this.f277957w;
                mVar2.H2(mVar2.v, new u6b.k(eVar, i));
                return Unit.f186387a;
            case 4:
                yx4.b item = (yx4.b) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u85.j jVarE3 = ((LoanWelcomeController) this.f277957w).e3();
                j60.a aVar6 = jVarE3.f278118q;
                Intrinsics.checkNotNullParameter(item, "item");
                Object obj3 = item.f317545b;
                if (obj3 instanceof u85.h) {
                    m35.f fVar = jVarE3.f278119r;
                    boolean z = ((u85.h) obj3).f278113a;
                    c55.n nVar = (c55.n) fVar;
                    nVar.getClass();
                    rp0.t tVar = new rp0.t(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.loan_management_details_repayment_methods_explainer_sheet_title, null, null, 14), z ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.loan_management_details_repayment_methods_explainer_sheet_text_multi_borrower, null, null, 14) : new TextLocalisedClause(com.revolut.feature.credit.core.R$string.loan_management_details_repayment_methods_explainer_sheet_text_single_borrower, null, null, 14), null, 28);
                    List listC = zhm.u.c(nVar.f21452a.a("ID_HOW_REPAYMENTS_WORK_GOT_IT_BUTTON"));
                    yp0.b.q(listC, R$attr.uikit_dp16, 0, 0, 0, 14);
                    aVar6.x(new rp0.y(listC, tVar, rp0.l.WINDOW, null, null, null, 1016));
                } else {
                    String str = item.f317544a;
                    if (Intrinsics.f(str, "ID_HOW_REPAYMENTS_WORK_GOT_IT_BUTTON")) {
                        j60.a.v(aVar6, false, null, 3);
                    } else if (Intrinsics.f(str, "ERROR_STATE_ID")) {
                        jVarE3.f278121t.a();
                    }
                }
                return Unit.f186387a;
            case 5:
                Data data2 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u85.j jVar = (u85.j) this.f277957w;
                jVar.H2(jVar.u, new u4e.l(data2, i5));
                return Unit.f186387a;
            case 6:
                g6 selectedData = (g6) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u87.f fVar2 = (u87.f) ((IndexOverviewScreen) this.f277957w).V.getValue();
                Intrinsics.h(selectedData);
                u87.q qVar = (u87.q) fVar2;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(selectedData, "selectedData");
                Iterator it8 = u87.h.f278135a.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((eel.c) next).getId(), selectedData.f54199a)) {
                        }
                    } else {
                        next = null;
                    }
                }
                eel.c cVar = (eel.c) next;
                if (cVar != null) {
                    qVar.n2(new u2i.g(qVar, cVar, dVar, i22), new whi.b(i6));
                }
                return Unit.f186387a;
            case 7:
                String itemId = (String) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u8d.e eVar2 = (u8d.e) ((FaqSomethingElseScreen) this.f277957w).c0.getValue();
                Intrinsics.h(itemId);
                u8d.g gVar2 = (u8d.g) eVar2;
                gVar2.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (itemId.equals("DONE_BUTTON_ITEM_ID")) {
                    gVar2.v2(u8d.b.f278167a);
                }
                return Unit.f186387a;
            case 8:
                n8i.k kVar = (n8i.k) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                AccountWrapper accountWrapper = c8g.a.q(kVar).f302980b;
                Intrinsics.checkNotNullParameter(kVar, "<this>");
                s6i.e eVar3 = kVar.f213439a;
                return zi0.c.P(new n8i.x(eVar3.f260363b.f302980b, accountWrapper, c8g.a.m(kVar), v13.d.r(eVar3), !((o8b.c) ((u8i.a) this.f277957w).f278219a).g(), eVar3.f260364c, eVar3.e), false, null, 3);
            case 9:
                String menuItemId = (String) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u8j.c cVar2 = (u8j.c) ((CryptoAssetDetailsScreen) this.f277957w).f99951b0.getValue();
                Intrinsics.h(menuItemId);
                com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.a aVar12 = (com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.a) cVar2;
                aVar12.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                aVar12.l2(new u2i.g(menuItemId, aVar12, dVar, i5), new yi5.b(i21));
                return Unit.f186387a;
            case 10:
                Pair pair = (Pair) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data3 = (Data) pair.f186385a;
                Data data4 = (Data) pair.f186386b;
                com.revolut.feature.pix.impl.flow.automatico.screens.details.a aVar14 = (com.revolut.feature.pix.impl.flow.automatico.screens.details.a) this.f277957w;
                aVar14.H2(aVar14.f80620w, new toh.h(data4, 16, data3, aVar14));
                return Unit.f186387a;
            case 11:
                String str2 = (String) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ua2.g gVarE3 = ((ContactsScreen) this.f277957w).R2();
                Intrinsics.h(str2);
                ((ua2.t) gVarE3).I2(new ua2.l(str2));
                return Unit.f186387a;
            case 12:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ua2.t tVar2 = (ua2.t) this.v;
                return tVar2.C1(u0.b(d2k.g.a(tVar2.f278534q, (f5j.a) this.f277957w, null, null, null, null, new FlowExtras(FinishFlowCommand.f98647a), null, null, 894)));
            case 13:
                ua5.a aVar17 = (ua5.a) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ma5.a aVar19 = (ma5.a) DBUtil.performBlocking(((ua5.e) this.f277957w).f278547c.f193318a, true, false, new l3d.a(aVar17.f278541a, i6));
                if (aVar19 == null) {
                    return null;
                }
                Object obj4 = sa5.d.f261295a;
                Intrinsics.checkNotNullParameter(aVar19, "<this>");
                xi0.a aVar20 = xi0.b.Companion;
                String str3 = aVar19.f203945c;
                aVar20.getClass();
                xi0.b bVarA = xi0.a.a(str3);
                String str4 = aVar19.f203943a;
                ia5.b bVar3 = (ia5.b) u1.u(aVar19.f203944b, sa5.d.f261295a);
                dj0.d dVar = new dj0.d(aVar19.d, bVarA);
                Long l2 = aVar19.e;
                dj0.d dVar2 = l2 != null ? new dj0.d(l2.longValue(), bVarA) : null;
                Long l3 = aVar19.f;
                dj0.d dVar3 = l3 != null ? new dj0.d(l3.longValue(), bVarA) : null;
                Integer num = aVar19.f203946g;
                int i59 = aVar19.f203947h;
                ia5.a aVar21 = (ia5.a) u1.u(aVar19.i, sa5.d.f261296b);
                dj0.d dVar4 = new dj0.d(aVar19.f203948j, bVarA);
                dj0.d dVar5 = new dj0.d(aVar19.k, bVarA);
                Long l4 = aVar19.f203949l;
                return new CreditPostTerminationPlanDetails(str4, bVar3, dVar, dVar2, dVar3, num, i59, aVar21, new CreditPostTerminationPlanRepaymentInfo(dVar4, dVar5, l4 != null ? new dj0.d(l4.longValue(), bVarA) : 0));
            case 14:
                Data data5 = (Data) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.c cVar3 = (com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.c) this.f277957w;
                cVar3.H2(cVar3.v, new u4e.l(data5, 21));
                return Unit.f186387a;
            case 15:
                n6 model = (n6) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                uai.i iVar = (uai.i) ((EmailVerificationCooldownBottomSheetController) this.f277957w).Q.getValue();
                iVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                if (iVar.f278672q.f97578a.getF97582b()) {
                    iVar.l2(new uai.h(iVar, dVar, i32), new yi5.b(i21));
                } else {
                    iVar.C2(new uai.c(null));
                }
                return Unit.f186387a;
            case 16:
                ii data6 = (ii) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ubi.l lVarE3 = ((OccupationChooserScreen) this.f277957w).R2();
                Intrinsics.h(data6);
                lVarE3.getClass();
                Intrinsics.checkNotNullParameter(data6, "data");
                lVarE3.n2(new f0(lVarE3, data6, dVar, i2), new whi.b(i6));
                return Unit.f186387a;
            case 17:
                Data data7 = (Data) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ubi.l lVar = (ubi.l) this.f277957w;
                lVar.H2(lVar.f278910r, new u4e.l(data7, 22));
                return Unit.f186387a;
            case 18:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ubi.l lVar2 = (ubi.l) this.v;
                cli.y yVar = lVar2.f278910r;
                if (i2b.a.k(((ubi.f) ((j2) yVar.f22677a).getValue()).f278901a)) {
                    return Unit.f186387a;
                }
                Object e = ((ii) this.f277957w).f164695b.getF53564b();
                tbi.a aVar27 = e instanceof tbi.a ? (tbi.a) e : null;
                if (aVar27 != null) {
                    lVar2.H2(yVar, new u6b.k(lVar2, aVar27));
                }
                return Unit.f186387a;
            case 19:
                rp0.p pVar = (rp0.p) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (pVar == rp0.p.USER) {
                    ((uc4.i) this.f277957w).v2(uc4.c.f278982a);
                }
                return Unit.f186387a;
            case 20:
                Data data8 = (Data) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ud2.q qVar2 = (ud2.q) this.f277957w;
                qVar2.H2(qVar2.f279086s, new u4e.l(data8, 24));
                return Unit.f186387a;
            case 21:
                com.revolut.core.ui_kit.delegates.t clickData = (com.revolut.core.ui_kit.delegates.t) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ud3.k kVarG3 = ((YourCashbackHomeScreen) this.f277957w).T2();
                Intrinsics.h(clickData);
                ud3.e0 e0Var = (ud3.e0) kVarG3;
                e0Var.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.f54721a, ActionWidgetDelegate.a.d.f51610a) && Intrinsics.f(clickData.f54722b.f51590a, "ID_REV_POINTS_BANNER")) {
                    e0Var.l2(new ud3.x(e0Var, null), new yi5.b(i21));
                }
                return Unit.f186387a;
            case 22:
                Pair pair2 = (Pair) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data9 = (Data) pair2.f186385a;
                Data data10 = (Data) pair2.f186386b;
                ud6.h hVar = (ud6.h) this.f277957w;
                hVar.H2(hVar.f279163t, new w0(data10, data9, i2));
                return Unit.f186387a;
            case 23:
                com.revolut.core.ui_kit.delegates.t clickData2 = (com.revolut.core.ui_kit.delegates.t) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                udi.k kVarE3 = ((RevPointsPocketDetailsScreen) this.f277957w).R2();
                Intrinsics.h(clickData2);
                com.revolut.feature_rev_points_pocket_impl.ui.screen.details.b bVar4 = (com.revolut.feature_rev_points_pocket_impl.ui.screen.details.b) kVarE3;
                bVar4.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                if (Intrinsics.f(clickData2.f54721a, ActionWidgetDelegate.a.c.f51609a)) {
                    bVar4.C1(u0.c(u0.d(new RevPointsPocketDestination.Onboarding(RevPointsPocketDestination.Onboarding.Mode.Boost.f97800a, null))));
                }
                return Unit.f186387a;
            case 24:
                ty0.a clickData3 = (ty0.a) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                udk.z zVarE3 = ((PlanRewardsRevealScreen) this.f277957w).e3();
                Intrinsics.h(clickData3);
                zVarE3.getClass();
                Intrinsics.checkNotNullParameter(clickData3, "clickData");
                Object obj5 = clickData3.d;
                udk.i iVar2 = obj5 instanceof udk.i ? (udk.i) obj5 : null;
                if (iVar2 != null) {
                    zVarE3.C2(new udk.f(iVar2.f279258a));
                }
                return Unit.f186387a;
            case 25:
                String str5 = (String) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                udk.z zVar3 = (udk.z) this.f277957w;
                zVar3.H2(zVar3.f279283x, new te8.a(str5, i21));
                return Unit.f186387a;
            case 26:
                od0.i iVar3 = (od0.i) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return iVar3.d() ? ((uec.e) this.f277957w).c3((ShippingContact) iVar3.c()) : zi0.c.i(new pec.c(null));
            case 27:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ve0.c cVar4 = ((ued.d) this.v).f279344a;
                String string = ((LocalDate) this.f277957w).plusDays(30L).toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                cVar4.G(string, "SHARED_ALERTS_SUGGEST_NOTIFICATION_PERMISSION_DATE", wim.z.d(o0.b(String.class)));
                return Unit.f186387a;
            case 28:
                Data data11 = (Data) this.v;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((uef.l) this.f277957w).x2(new ud3.a0(data11, i3));
                return Unit.f186387a;
            default:
                uek.g gVar3 = (uek.g) this.v;
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                uek.m mVar3 = (uek.m) this.f277957w;
                mVar3.H2(mVar3.f279484t, new u69.g(mVar3, gVar3, 23));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f277957w = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f277957w = obj2;
    }
}
