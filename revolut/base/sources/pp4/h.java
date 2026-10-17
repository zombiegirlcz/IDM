package pp4;

import com.revolut.biometric_verification.impl.ui.step.document.manual_document_selection.BiometricVerificationManualDocumentSelectionScreen;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.SelectorScreen;
import com.revolut.feature.credit.card.impl.ui.additional_cards.management.AdditionalCardsManagementScreen;
import com.revolut.feature.credit.card.impl.ui.additional_cards.management.AdditionalCardsManagementScreenContract$ModalStep;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.LoanPartialRepaymentController;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.LoanPartialRepaymentControllerContract$FinalRepaymentReductionParcel;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.LoanPartialRepaymentControllerContract$ModalStep;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.LoanPartialRepaymentControllerContract$MonthlyRepaymentsReductionParcel;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.datepicker.ChallengeEditFrequencyDatePickerScreen;
import com.revolut.feature.kyc.impl.introduction.IntroductionScreen;
import com.revolut.feature.learn.shared.impl.ui.lesson.LessonScreen;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.screen.AddMoneyScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.stock_details.StockDetailsFlowController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import pqg.i0;
import q09.d0;
import q09.m0;
import q09.x;
import q43.a0;
import q43.o0;
import rp0.t;
import rp0.y;
import vkm.j2;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class h extends kotlin.jvm.internal.a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f238259a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f238259a = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        nel.n nVar;
        int i = this.f238259a;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        Continuation continuation = null;
        switch (i) {
            case 0:
                yx4.b item = (yx4.b) obj2;
                n nVar2 = (n) this.receiver;
                KProperty[] kPropertyArr = AdditionalCardsManagementScreen.U;
                com.revolut.feature.credit.card.impl.ui.additional_cards.management.a aVar = (com.revolut.feature.credit.card.impl.ui.additional_cards.management.a) nVar2;
                j60.a aVar2 = aVar.f69033p;
                Intrinsics.checkNotNullParameter(item, "item");
                Object obj4 = item.f317545b;
                if (obj4 instanceof s) {
                    s sVar = (s) obj4;
                    aVar.C2(new l(sVar.f238271a, sVar.f238272b));
                } else if (obj4 instanceof r) {
                    r rVar = (r) obj4;
                    oki.h.v2(aVar.f69036s, new AdditionalCardsManagementScreenContract$ModalStep.CancelInvitation(rVar.f238268a, rVar.f238269b, rVar.f238270c), bottom_dialog);
                } else {
                    if (obj4 instanceof b) {
                        j60.a.v(aVar2, false, null, 3);
                    } else {
                        String str = item.f317544a;
                        int iHashCode = str.hashCode();
                        if (iHashCode != -580532364) {
                            if (iHashCode != 1098265962) {
                                if (iHashCode == 1918729248 && str.equals("ERROR_STATE_ID")) {
                                    aVar.I2();
                                }
                            } else if (str.equals("id_additional_cards_add_cardholder")) {
                                el4.i iVar = (el4.i) ((i) ((j2) aVar.f69037t.f22677a).getValue()).f238260a.getContent();
                                if ((iVar != null ? iVar.f127265a : 0) > 0) {
                                    aVar.C2(j.f238261a);
                                } else {
                                    aVar.f69034q.getClass();
                                    t tVar = new t(new TextLocalisedClause(R$string.additional_cards_cardholders_details_limit_reached_title, null, null, 14), new TextLocalisedClause(R$string.additional_cards_cardholders_details_limit_reached_subtitle, null, null, 14), null, 28);
                                    LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("additional_cardholder_primary_button", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.additional_cards_cardholders_details_limit_reached_button, null, null, 14), false, null, null, b.f238254a, null, 744);
                                    yp0.b.r(model, R$attr.uikit_dp16, R$attr.uikit_dp24, 0, 0, 12);
                                    aVar2.x(new y(u.c(model), tVar, null, null, null, null, 1020));
                                }
                            }
                        } else if (str.equals("id_additional_cards_navigation_icon")) {
                            aVar.B2();
                        }
                    }
                }
                break;
            case 1:
                pp8.j jVar = (pp8.j) this.receiver;
                int i2 = ChallengeEditFrequencyDatePickerScreen.W;
                jVar.I2((pp8.h) obj2);
                break;
            case 2:
                pp8.j jVar2 = (pp8.j) this.receiver;
                int i3 = ChallengeEditFrequencyDatePickerScreen.W;
                jVar2.I2((pp8.h) obj2);
                break;
            case 3:
                pp8.j jVar3 = (pp8.j) this.receiver;
                int i5 = ChallengeEditFrequencyDatePickerScreen.W;
                jVar3.I2((pp8.h) obj2);
                break;
            case 4:
                pqg.l value = (pqg.l) obj2;
                pqg.r rVar2 = (pqg.r) this.receiver;
                KProperty[] kPropertyArr2 = AddMoneyScreen.j0;
                i0 i0Var = (i0) rVar2;
                i0Var.getClass();
                Intrinsics.checkNotNullParameter(value, "value");
                i0Var.x2(new pp5.d(value, 11));
                i0Var.L.onNext(Boolean.TRUE);
                break;
            case 5:
                pt.m mVar = (pt.m) this.receiver;
                KProperty[] kPropertyArr3 = BiometricVerificationManualDocumentSelectionScreen.S;
                ((com.revolut.biometric_verification.impl.ui.step.document.manual_document_selection.a) mVar).I2((pt.k) obj2);
                break;
            case 6:
                pt.m mVar2 = (pt.m) this.receiver;
                KProperty[] kPropertyArr4 = BiometricVerificationManualDocumentSelectionScreen.S;
                ((com.revolut.biometric_verification.impl.ui.step.document.manual_document_selection.a) mVar2).I2((pt.k) obj2);
                break;
            case 7:
                String menuItemId = (String) obj2;
                puk.d dVar = (puk.d) this.receiver;
                KProperty[] kPropertyArr5 = StockDetailsFlowController.R;
                puk.s sVar2 = (puk.s) dVar;
                sVar2.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                sVar2.n2(new pnf.f(sVar2, menuItemId, continuation, 18), new whi.b(6));
                if (Intrinsics.f(menuItemId, "WATCHLIST_TOOLBAR_ICON_ID") && (nVar = (nel.n) ((puk.f) ((j2) sVar2.z.f22677a).getValue()).f239930c.getContent()) != null) {
                    sVar2.n2(new puk.r(sVar2, nVar, null), new whi.b(6));
                }
                break;
            case 8:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                pw8.k kVar = (pw8.k) this.receiver;
                KProperty[] kPropertyArr6 = IntroductionScreen.T;
                pw8.l lVar = (pw8.l) kVar;
                lVar.H2(lVar.f240353p, new ocb.u(zBooleanValue, 15));
                break;
            case 9:
                d0 d0Var = (d0) this.receiver;
                KProperty[] kPropertyArr7 = LessonScreen.c0;
                ((m0) d0Var).y2((x) obj2);
                break;
            case 10:
                d0 d0Var2 = (d0) this.receiver;
                KProperty[] kPropertyArr8 = LessonScreen.c0;
                ((m0) d0Var2).y2((x) obj2);
                break;
            case 11:
                d0 d0Var3 = (d0) this.receiver;
                KProperty[] kPropertyArr9 = LessonScreen.c0;
                ((m0) d0Var3).y2((x) obj2);
                break;
            case 12:
                d0 d0Var4 = (d0) this.receiver;
                KProperty[] kPropertyArr10 = LessonScreen.c0;
                ((m0) d0Var4).y2((x) obj2);
                break;
            case 13:
                d0 d0Var5 = (d0) this.receiver;
                KProperty[] kPropertyArr11 = LessonScreen.c0;
                ((m0) d0Var5).y2((x) obj2);
                break;
            case 14:
                d0 d0Var6 = (d0) this.receiver;
                KProperty[] kPropertyArr12 = LessonScreen.c0;
                ((m0) d0Var6).y2((x) obj2);
                break;
            case 15:
                d0 d0Var7 = (d0) this.receiver;
                KProperty[] kPropertyArr13 = LessonScreen.c0;
                ((m0) d0Var7).y2((x) obj2);
                break;
            case 16:
                d0 d0Var8 = (d0) this.receiver;
                KProperty[] kPropertyArr14 = LessonScreen.c0;
                ((m0) d0Var8).y2((x) obj2);
                break;
            case 17:
                d0 d0Var9 = (d0) this.receiver;
                KProperty[] kPropertyArr15 = LessonScreen.c0;
                ((m0) d0Var9).y2((x) obj2);
                break;
            case 18:
                d0 d0Var10 = (d0) this.receiver;
                KProperty[] kPropertyArr16 = LessonScreen.c0;
                ((m0) d0Var10).y2((x) obj2);
                break;
            case 19:
                d0 d0Var11 = (d0) this.receiver;
                KProperty[] kPropertyArr17 = LessonScreen.c0;
                ((m0) d0Var11).y2((x) obj2);
                break;
            case 20:
                a0 a0Var = (a0) this.receiver;
                KProperty[] kPropertyArr18 = SelectorScreen.f65290n0;
                ((o0) a0Var).A2((com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.d) obj2);
                break;
            case 21:
                a0 a0Var2 = (a0) this.receiver;
                KProperty[] kPropertyArr19 = SelectorScreen.f65290n0;
                ((o0) a0Var2).A2((com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.d) obj2);
                break;
            case 22:
                a0 a0Var3 = (a0) this.receiver;
                KProperty[] kPropertyArr20 = SelectorScreen.f65290n0;
                ((o0) a0Var3).A2((com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.d) obj2);
                break;
            case 23:
                a0 a0Var4 = (a0) this.receiver;
                KProperty[] kPropertyArr21 = SelectorScreen.f65290n0;
                ((o0) a0Var4).A2((com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.d) obj2);
                break;
            case 24:
                a0 a0Var5 = (a0) this.receiver;
                KProperty[] kPropertyArr22 = SelectorScreen.f65290n0;
                ((o0) a0Var5).A2((com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.d) obj2);
                break;
            case 25:
                a0 a0Var6 = (a0) this.receiver;
                KProperty[] kPropertyArr23 = SelectorScreen.f65290n0;
                ((o0) a0Var6).A2((com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.d) obj2);
                break;
            case 26:
                a0 a0Var7 = (a0) this.receiver;
                KProperty[] kPropertyArr24 = SelectorScreen.f65290n0;
                ((o0) a0Var7).A2((com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.d) obj2);
                break;
            case 27:
                a0 a0Var8 = (a0) this.receiver;
                KProperty[] kPropertyArr25 = SelectorScreen.f65290n0;
                ((o0) a0Var8).A2((com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.d) obj2);
                break;
            case 28:
                a0 a0Var9 = (a0) this.receiver;
                KProperty[] kPropertyArr26 = SelectorScreen.f65290n0;
                ((o0) a0Var9).A2((com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.d) obj2);
                break;
            default:
                yx4.b item2 = (yx4.b) obj2;
                q75.k kVar2 = (q75.k) this.receiver;
                KProperty[] kPropertyArr27 = LoanPartialRepaymentController.X;
                com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.a aVar3 = (com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.a) kVar2;
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(item2, "item");
                if (!aVar3.f70501w.O1(item2)) {
                    if (Intrinsics.f(item2.f317544a, "FOOTER_BUTTON")) {
                        dj0.d balance = aVar3.K2().f70504a.getBalance();
                        dj0.d dVar2 = ((q75.f) ((j2) aVar3.f70503y.f22677a).getValue()).f242747c;
                        if (dVar2 != null) {
                            if (dVar2.f(balance)) {
                                aVar3.f70502x.b3();
                            } else {
                                aVar3.n2(new q03.m(aVar3, dVar2, continuation, 17), new whi.b(6));
                            }
                        }
                    } else {
                        Object obj5 = item2.f317545b;
                        com.revolut.kompot.navigable.vc.modal.a aVar4 = aVar3.z;
                        if (obj5 instanceof q75.l) {
                            oki.h.v2(aVar4, new LoanPartialRepaymentControllerContract$ModalStep.LoanStateExplainer(((q75.l) obj5).f242751a), bottom_dialog);
                        } else if (obj5 instanceof LoanPartialRepaymentControllerContract$MonthlyRepaymentsReductionParcel) {
                            oki.h.v2(aVar4, LoanPartialRepaymentControllerContract$ModalStep.MonthlyRepaymentReductionExplainer.f70492a, bottom_dialog);
                        } else if (obj5 instanceof LoanPartialRepaymentControllerContract$FinalRepaymentReductionParcel) {
                            oki.h.v2(aVar4, LoanPartialRepaymentControllerContract$ModalStep.FinalRepaymentReductionExplainer.f70490a, bottom_dialog);
                        }
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
