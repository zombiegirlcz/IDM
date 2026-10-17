package sii;

import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.foundation.text.modifiers.TextStringSimpleNode;
import com.revolut.core.security.provider.database.DatabaseSessionProviderV0ImplTokenCreatedException;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.internal.views.swipeablecards.SwipeableCardViewPager;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card.terminate.impl.ui.flow.CardTerminateFlow;
import com.revolut.feature.card_order_new.impl.virtual.IssueVirtualCardActivity;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.options.DocumentOptionsScreen;
import com.revolut.feature.defi.exchange.impl.domain.model.DeFiSwapSourceAmount;
import com.revolut.feature.incentive_reward.impl.ui.incentive_reward.flow.IncentiveRewardFlow;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.current_insurance.CurrentInsuranceFlowContract$State;
import com.revolut.feature.recurring_payments.api.RecurringPaymentApi$Toggles$PredictedSubscriptions;
import com.revolut.feature.revolutpay.api.shared.domain.models.order.CheckoutMode;
import com.revolut.feature.selfserve.sot.impl.ui.document.list.SotDocumentListFragment;
import com.revolut.feature.subaccount.impl.ui.qr_link.SubaccountQRLinkScreen;
import com.revolut.feature.transfer.core.impl.ui.reference.ReferenceScreen;
import com.revolut.feature.workflow.engine.rfi.impl.ui.timeline.TimelineQuestionScreen;
import com.revolut.feature_exchange.impl.ui.exchange.order_intro.OrderIntroActivity;
import com.revolut.feature_move_money.impl.amount.order_automations.OrderAutomationsScreen;
import com.revolut.kompot.common.flow.permissions.PermissionsFlow;
import com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.screen.account.IndiaWithdrawalChooseAccountScreen;
import com.youTransactor.uCube.rpc.Constants;
import dw3.i2;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.text.Charsets;
import nii.y0;
import r6e.r;
import rm0.s;
import rm0.u;
import rm0.v;
import rm0.y;
import t6i.k;
import td4.i;
import u7i.p;
import vkm.j2;
import wim.z;
import z4l.j;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f263631b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f263630a = i;
        this.f263631b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v112, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v120, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v99, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f263630a;
        String strA = null;
        Object obj2 = this.f263631b;
        switch (i) {
            case 0:
                return (b) ((PermissionsFlow) obj2).T.f271534g.get();
            case 1:
                j2 j2Var = ((com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g) obj2).v.f264658a;
                Boolean bool = Boolean.FALSE;
                j2Var.getClass();
                j2Var.g(null, bool);
                return Unit.f186387a;
            case 2:
                sm0.a aVar = (sm0.a) obj2;
                ue0.c cVar = aVar.f264300b;
                String str = (String) cVar.T2("DEFAULT_T_V0", String.class);
                if (str == null) {
                    String plaintext = aVar.f264299a.a();
                    Intrinsics.checkNotNullParameter(plaintext, "plaintext");
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                        byte[] bytes = plaintext.getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                        StringBuilder sb6 = new StringBuilder(new BigInteger(1, messageDigest.digest(bytes)).toString(16));
                        int length = sb6.length();
                        if (length < 32) {
                            char[] cArr = new char[32 - length];
                            Arrays.fill(cArr, '0');
                            sb6.insert(0, cArr);
                        }
                        String string = sb6.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        str = string;
                    } catch (NoSuchAlgorithmException unused) {
                        str = plaintext;
                    }
                    cVar.G(str, "DEFAULT_T_V0", z.d(o0.b(String.class)));
                    DatabaseSessionProviderV0ImplTokenCreatedException databaseSessionProviderV0ImplTokenCreatedException = new DatabaseSessionProviderV0ImplTokenCreatedException();
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, databaseSessionProviderV0ImplTokenCreatedException, h0Var);
                }
                return str;
            case 3:
                sm0.c cVar2 = (sm0.c) obj2;
                v vVar = cVar2.f264302a;
                ue0.c cVar3 = cVar2.f264304c;
                String str2 = (String) cVar3.T2("DEFAULT_T_V1", String.class);
                if (str2 != null) {
                    u.Companion.getClass();
                    u uVarA = s.a(str2);
                    try {
                        hn0.d dVar = hn0.d.f154015a;
                        String strB = ((y) vVar).b(dVar, uVarA);
                        try {
                            if (uVarA.c() && cVar2.d.b()) {
                                u uVarA2 = v.a(vVar, dVar, strB);
                                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                rd0.d.b(rd0.c.WARNING, "DatabaseSessionProvider", "Saving migrated token to storage", null, null, 16);
                                cVar3.G(uVarA2.b(), "DEFAULT_T_V1", z.d(o0.b(String.class)));
                            }
                        } catch (Exception e) {
                            IllegalStateException illegalStateException = new IllegalStateException("Database token OAEP migration failed", e);
                            h0 h0Var2 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, "DatabaseSessionProvider", null, illegalStateException, h0Var2);
                        }
                        strA = strB;
                    } catch (Exception e2) {
                        IllegalStateException illegalStateException2 = new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.n("decryptSavedToken failed: ", e2), e2);
                        h0 h0Var3 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "DatabaseSessionProvider", null, illegalStateException2, h0Var3);
                        strA = cVar2.a();
                    }
                    break;
                }
                return strA == null ? cVar2.a() : strA;
            case 4:
                com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.current_insurance.a aVar2 = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.current_insurance.a) obj2;
                tl7.f fVar = aVar2.f75453t;
                Answer.CurrentInsuranceState currentInsuranceState = ((CurrentInsuranceFlowContract$State) aVar2.A2().f98429a).f75449a;
                Answer.CurrentInsuranceState currentInsuranceState2 = Answer.CurrentInsuranceState.OWN_POLICY;
                tl7.f.R(fVar, currentInsuranceState == currentInsuranceState2 ? R$string.car_insurance_question_no_claims_years_policy_in_my_name_learn_more_title : R$string.car_insurance_question_no_claims_years_insured_as_named_driver_or_on_company_car_learn_more_title, ((CurrentInsuranceFlowContract$State) aVar2.A2().f98429a).f75449a == currentInsuranceState2 ? R$string.car_insurance_question_no_claims_years_policy_in_my_name_learn_more_description : R$string.car_insurance_question_no_claims_years_insured_as_named_driver_or_on_company_car_learn_more_description, null, null, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
                return Unit.f186387a;
            case 5:
                KProperty[] kPropertyArr = ReferenceScreen.f92217b0;
                lpf.s sVar = (lpf.s) ((ReferenceScreen) obj2).Z.getValue();
                switch (sVar.f199080a) {
                    case 0:
                        return (sqf.g) sVar.i.get();
                    default:
                        return (sqf.g) sVar.i.get();
                }
            case 6:
                int i2 = SwipeableCardViewPager.f57604g;
                return Integer.valueOf(((SwipeableCardViewPager) obj2).getAdapter().getItemCount());
            case 7:
                return (su2.a) ((ou2.e) ((CardTerminateFlow) obj2).R.getValue()).d.get();
            case 8:
                int i3 = TimelineQuestionScreen.X;
                return (suh.h) ((euh.g) ((tuh.a) ((TimelineQuestionScreen) obj2).U.getValue())).e.get();
            case 9:
                return Boolean.valueOf(((com.revolut.feature.card_design.impl.card_design.carousel.e) obj2).f64710s.a());
            case 10:
                com.revolut.camerakit.revolut.ui.flow.steps.camera.a aVar3 = (com.revolut.camerakit.revolut.ui.flow.steps.camera.a) obj2;
                aVar3.o.getClass();
                return y0.a(uy.a.a(), null, aVar3.f50805r.f293112j, 3);
            case 11:
                ((com.revolut.feature.rev_points.impl.ui.c) obj2).I2();
                return Unit.f186387a;
            case 12:
                int i5 = SotDocumentListFragment.f85907h0;
                return new SelectableDelegate((RowDelegate) ((SotDocumentListFragment) obj2).f0.getValue());
            case 13:
                return Boolean.valueOf(TextAnnotatedStringNode.applySemantics$lambda$3((TextAnnotatedStringNode) obj2));
            case 14:
                return Boolean.valueOf(TextStringSimpleNode.applySemantics$lambda$3((TextStringSimpleNode) obj2));
            case 15:
                return new j(7, zhm.u.c((TrendViewDelegate) ((OrderIntroActivity) obj2).f96902t0.getValue()), false);
            case 16:
                int i6 = IndiaWithdrawalChooseAccountScreen.U;
                return (t2k.h) ((p2k.b) ((IndiaWithdrawalChooseAccountScreen) obj2).S.getValue()).f232273c.get();
            case 17:
                IssueVirtualCardActivity issueVirtualCardActivity = (IssueVirtualCardActivity) obj2;
                int i21 = IssueVirtualCardActivity.f65227x0;
                return new j(7, zhm.v.k((InputTextDelegate) issueVirtualCardActivity.u0.getValue(), (SuggestionsBarDelegate) issueVirtualCardActivity.f65230v0.getValue()), false);
            case 18:
                DeFiSwapSourceAmount deFiSwapSourceAmount = (DeFiSwapSourceAmount) obj2;
                return new BigDecimal(deFiSwapSourceAmount.f71742b, deFiSwapSourceAmount.f71743c);
            case 19:
                ((com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c) obj2).v.f194072c = false;
                return Unit.f186387a;
            case 20:
                int i22 = OrderAutomationsScreen.U;
                return (k) ((p) ((OrderAutomationsScreen) obj2).S.getValue()).f277888b.get();
            case 21:
                return Boolean.valueOf(((jte.d) ((t73.f) obj2).f268461b).c(RecurringPaymentApi$Toggles$PredictedSubscriptions.f81650c));
            case 22:
                com.revolut.feature.subaccount.impl.ui.create.flow.main.c cVar4 = (com.revolut.feature.subaccount.impl.ui.create.flow.main.c) obj2;
                oki.h.t2(cVar4, cVar4.f89043y, cVar4.M2(), true, null, false, 12);
                return Unit.f186387a;
            case 23:
                return (t8e.b) ((r) ((SubaccountQRLinkScreen) obj2).S.getValue()).f251798c.get();
            case 24:
                ((com.revolut.feature.subaccount.impl.ui.qr_link.a) obj2).X1(new mii.f("SUCCESS_COPY_SHOT_ID", new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_copied_to_clipboard, null, null, 14), null, null, null, null, 124));
                return Unit.f186387a;
            case 25:
                t8g.e eVar = (t8g.e) obj2;
                return mra.d.c(eVar, new t8g.a(eVar.c3()), new a54.b(eVar, 27));
            case 26:
                oki.h.D2(((com.revolut.feature.apm.qvik.impl.ui.pay.a) obj2).f62825t);
                return Unit.f186387a;
            case 27:
                KProperty[] kPropertyArr2 = DocumentOptionsScreen.c0;
                return (i) ((i2) ((DocumentOptionsScreen) obj2).W.getValue()).f118949h.get();
            case 28:
                tdc.r rVar = (tdc.r) obj2;
                zcc.b bVar = rVar.f269965n;
                CheckoutMode f84525c = rVar.o.getF84525c();
                bVar.getClass();
                return zcc.b.a(f84525c, true);
            default:
                return (tf7.a) ((cf7.d) ((IncentiveRewardFlow) obj2).P.getValue()).d.get();
        }
    }
}
