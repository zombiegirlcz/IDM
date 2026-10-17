package k65;

import bjk.w2;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FullscreenQuizView$QuizSelection;
import com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.SecretAccountsFlowContract$Step;
import com.revolut.feature.hidden_accounts.impl.ui.utils.HiddenAccountProductArticleKey;
import com.revolut.feature.insurance_car.impl.data.model.CarManualInput;
import com.revolut.feature.insurance_car.impl.data.model.CarVariation;
import com.revolut.feature.insurance_car.impl.data.model.InsurableCar;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.car.CarSelectFlowContract$State;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.car.CarSelectFlowContract$Step;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.manual_input.CarManualInputScreenContract$ManualCarInfo;
import com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessOutput;
import com.revolut.feature.pricingplans.models.PlanScreenElementView;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.robo.impl.ui.flow.onboarding.OnboardingFlowContract$State;
import com.revolut.feature.subaccount.impl.ui.invite.flow.VaultInviteFlowContract$Step;
import com.revolut.feature.vaults.R$string;
import com.revolut.feature.wealth.api.declaration.DualAddMoneyDestination;
import com.revolut.feature.wealth.api.navigation.models.RecurringDepositSchedule;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanBottomSheetConfig;
import com.revolut.retail.feature.pricing_plans.ui.api.models.j;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import com.youTransactor.uCube.rpc.Constants;
import fb7.r;
import fb7.t;
import io3.l;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import k25.o;
import k4l.c0;
import k71.k;
import k7c.l0;
import kc9.m;
import kkf.n4;
import kl7.m2;
import kl7.o0;
import kl7.p1;
import kl7.s0;
import kmc.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import kotlin.text.Charsets;
import ks9.f0;
import mjk.u;
import nii.y0;
import p35.e0;
import qua.p;
import te0.w;
import tof.a3;
import tof.d3;
import tof.g3;
import tof.i3;
import tof.k5;
import tof.m5;
import tof.p5;
import tof.p6;
import tof.r5;
import tof.w5;
import tof.w6;
import tof.z6;
import uo7.f;
import vj5.a;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class d extends q implements Function1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v7, types: [com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanBottomSheetConfig$Background] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String strA;
        FeatureCommand featureCommandB;
        RecurringDepositSchedule recurringDepositSchedule;
        r5 r5Var;
        k5 k5Var;
        m5 m5Var;
        Boolean bool;
        w5 w5Var;
        l lVar;
        yvh.f fVar;
        int i = 4;
        int i2 = 26;
        int i3 = 1;
        boolean z = true;
        i3 = 1;
        int i5 = 0;
        PricingPlanBottomSheetConfig.Background background = 0;
        InsurableCar insurableCarA = null;
        background = 0;
        background = 0;
        background = 0;
        switch (this.f) {
            case 0:
                Throwable p0 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.a.I2((com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.a) this.receiver, p0);
                return Boolean.TRUE;
            case 1:
                Throwable p03 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.a.I2((com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.a) this.receiver, p03);
                return Boolean.TRUE;
            case 2:
                return new String((byte[]) ((c66.e) this.receiver).f21683a.get(((Number) obj2).intValue()), Charsets.d);
            case 3:
                l8e.g p010 = (l8e.g) obj2;
                Intrinsics.checkNotNullParameter(p010, "p0");
                com.revolut.feature.subaccount.impl.ui.invite.flow.b bVar = (com.revolut.feature.subaccount.impl.ui.invite.flow.b) this.receiver;
                bVar.getClass();
                if (p010 instanceof l8e.e) {
                    bVar.l2(new k8e.h(bVar, background, i5), new yi5.b(i2));
                } else {
                    if (!(p010 instanceof l8e.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.w2(bVar.u, VaultInviteFlowContract$Step.DeclineConfirmation.f89086a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                return Unit.f186387a;
            case 4:
                m8e.h p011 = (m8e.h) obj2;
                Intrinsics.checkNotNullParameter(p011, "p0");
                com.revolut.feature.subaccount.impl.ui.invite.flow.b bVar2 = (com.revolut.feature.subaccount.impl.ui.invite.flow.b) this.receiver;
                bVar2.getClass();
                if (p011 instanceof m8e.f) {
                    yji.l.a1(bVar2, bVar2.X1(new mii.f("DECLINE_INVITATION_ID", new TextLocalisedClause(R$string.subaccount_group_invite_dialog_invitation_declined, null, null, 14), null, null, null, null, 124)), null, null, null, 7);
                    oki.h.D2(bVar2.u);
                } else if (!(p011 instanceof m8e.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 5:
                ExchangeGlobalAccessOutput p012 = (ExchangeGlobalAccessOutput) obj2;
                Intrinsics.checkNotNullParameter(p012, "p0");
                com.revolut.feature.subaccount.impl.ui.invite.flow.b bVar3 = (com.revolut.feature.subaccount.impl.ui.invite.flow.b) this.receiver;
                bVar3.getClass();
                if (p012 instanceof ExchangeGlobalAccessOutput.FeatureAvailable) {
                    bVar3.l2(new k8e.h(bVar3, background, i3), new yi5.b(i2));
                }
                return Unit.f186387a;
            case 6:
                qa7.b p013 = (qa7.b) obj2;
                Intrinsics.checkNotNullParameter(p013, "p0");
                com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.a aVar = (com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.a) this.receiver;
                if (p013 instanceof qa7.b) {
                    oki.h.t2(aVar, aVar.f74679q, SecretAccountsFlowContract$Step.SecretAccountsRoot.f74676a, false, null, false, 12);
                    return Unit.f186387a;
                }
                aVar.getClass();
                throw new NoWhenBranchMatchedException();
            case 7:
                mb7.h p014 = (mb7.h) obj2;
                Intrinsics.checkNotNullParameter(p014, "p0");
                com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.a aVar2 = (com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.a) this.receiver;
                yki.a aVar3 = aVar2.f74679q;
                if (Intrinsics.f(p014, mb7.e.f204174a)) {
                    oki.h.t2(aVar2, aVar3, SecretAccountsFlowContract$Step.SecretAccountsPicker.f74675a, true, null, false, 12);
                } else if (Intrinsics.f(p014, mb7.f.f204175a)) {
                    oki.h.t2(aVar2, aVar3, new SecretAccountsFlowContract$Step.ProductArticle(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(HiddenAccountProductArticleKey.SECRET_ACCOUNTS))), true, null, false, 12);
                } else {
                    if (!Intrinsics.f(p014, mb7.g.f204176a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.w2(aVar3, SecretAccountsFlowContract$Step.UnhideSecretAccountsDialog.f74677a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                return Unit.f186387a;
            case 8:
                dii.g p015 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(p015, "p0");
                com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.a aVar4 = (com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.a) this.receiver;
                aVar4.getClass();
                if (p015 instanceof dii.e) {
                    aVar4.l2(new l0(aVar4, background, 9), new yi5.b(i2));
                } else if (!(p015 instanceof dii.f) && !(p015 instanceof dii.b) && !(p015 instanceof dii.c) && !(p015 instanceof dii.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 9:
                t p016 = (t) obj2;
                Intrinsics.checkNotNullParameter(p016, "p0");
                com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.a aVar5 = (com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.a) this.receiver;
                if (p016 instanceof r) {
                    CharSequence charSequence = (CharSequence) aVar5.f74678p.f295849c.a(new tk0.d("SECRET_ACCOUNTS_PHRASE"));
                    if (charSequence != null && charSequence.length() != 0) {
                        i3 = 0;
                    }
                    if (i3 == 0) {
                        aVar5.l2(new kb7.c(aVar5, ((r) p016).f133494a, background, i5), new yi5.b(i2));
                    } else {
                        oki.h.t2(aVar5, aVar5.f74679q, new SecretAccountsFlowContract$Step.CreateSecretPhrase(d0.d1(((r) p016).f133494a)), false, null, false, 12);
                    }
                } else {
                    aVar5.getClass();
                }
                return Unit.f186387a;
            case 10:
                qb7.e p017 = (qb7.e) obj2;
                Intrinsics.checkNotNullParameter(p017, "p0");
                com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.a aVar6 = (com.revolut.feature.hidden_accounts.impl.ui.secret_accounts.a) this.receiver;
                aVar6.getClass();
                if (!Intrinsics.f(p017, qb7.e.f244128a)) {
                    throw new NoWhenBranchMatchedException();
                }
                FlowStep flowStepD = aVar6.f74679q.d();
                SecretAccountsFlowContract$Step.CreateSecretPhrase createSecretPhrase = flowStepD instanceof SecretAccountsFlowContract$Step.CreateSecretPhrase ? (SecretAccountsFlowContract$Step.CreateSecretPhrase) flowStepD : null;
                if (createSecretPhrase != null) {
                    aVar6.l2(new kb7.c(aVar6, d0.i1(createSecretPhrase.f74673a), background, i5), new yi5.b(i2));
                }
                return Unit.f186387a;
            case 11:
                Throwable p018 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p018, "p0");
                ((m) this.receiver).I2(p018);
                return Boolean.TRUE;
            case 12:
                List p019 = (List) obj2;
                Intrinsics.checkNotNullParameter(p019, "p0");
                kce.q qVar = (kce.q) this.receiver;
                qVar.getClass();
                efm.d0 list = efm.r.fromIterable(p019).concatMapSingle(new k64.a(28, new d(1, qVar, kce.q.class, "wrapRecurringPaymentsByType", "wrapRecurringPaymentsByType(Lcom/revolut/feature/recurring_payments/api/data/models/RecurringPayment;)Lio/reactivex/Single;", 0, 13))).toList();
                Intrinsics.checkNotNullExpressionValue(list, "toList(...)");
                return list;
            case 13:
                p p020 = (p) obj2;
                Intrinsics.checkNotNullParameter(p020, "p0");
                kce.q qVar2 = (kce.q) this.receiver;
                qVar2.getClass();
                ufm.i iVar = new ufm.i(w.j(p020), new kce.c(new kce.d(qVar2, i5), i3), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return iVar;
            case 14:
                aii.r p021 = (aii.r) obj2;
                Intrinsics.checkNotNullParameter(p021, "p0");
                com.revolut.feature.crypto.receive_widget.impl.ui.customize.c cVar = (com.revolut.feature.crypto.receive_widget.impl.ui.customize.c) this.receiver;
                if (p021 instanceof vj5.b) {
                    cVar.getClass();
                    cVar.n2(new k0g.b(p021, (Object) cVar, false, (Continuation) null, 27), new whi.b(6));
                } else if (p021 instanceof a.C1600a) {
                    cVar.C2(p021);
                } else {
                    cVar.getClass();
                }
                return Unit.f186387a;
            case 15:
                w2 dto = (w2) obj2;
                Intrinsics.checkNotNullParameter(dto, "p0");
                u uVar = (u) this.receiver;
                uVar.getClass();
                Intrinsics.checkNotNullParameter(dto, "dto");
                String strD = dto.getId();
                String strC = dto.getHeader().getTitle();
                String strA2 = dto.getHeader().getDescription();
                w2.c cVarB = dto.getHeader().getIcon();
                PricingPlanBottomSheetConfig.Header header = new PricingPlanBottomSheetConfig.Header(strC, strA2, cVarB != null ? new PricingPlanBottomSheetConfig.Header.Icon(cVarB.getUrl(), cVarB.getAssetName()) : null);
                List listB = dto.getContent();
                ArrayList arrayList = new ArrayList();
                Iterator it8 = listB.iterator();
                while (it8.hasNext()) {
                    PlanScreenElementView planScreenElementViewH = uVar.f206063a.h((bjk.d) it8.next());
                    if (planScreenElementViewH != null) {
                        arrayList.add(planScreenElementViewH);
                    }
                }
                w2.a aVarA = dto.getBackground();
                if (aVarA != null && (strA = aVarA.getCode()) != null) {
                    if (kotlin.text.d0.W(strA)) {
                        strA = null;
                    }
                    if (strA != null && Intrinsics.f(aVarA.getType(), "ANIMATED_BACKGROUND")) {
                        background = new PricingPlanBottomSheetConfig.Background(j.ANIMATED_BACKGROUND, strA);
                    }
                }
                return new PricingPlanBottomSheetConfig(strD, header, arrayList, background);
            case 16:
                ((od0.h) this.receiver).getClass();
                return od0.h.a((e0) obj2);
            case 17:
                String p022 = (String) obj2;
                Intrinsics.checkNotNullParameter(p022, "p0");
                n4 n4Var = (n4) this.receiver;
                return vkm.q.Q(n4Var.f184850t, new o(background, n4Var, p022, i));
            case 18:
                ro7.h p023 = (ro7.h) obj2;
                Intrinsics.checkNotNullParameter(p023, "p0");
                com.revolut.feature.insurance_car.impl.ui.flow.onboarding.car.b bVar4 = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.car.b) this.receiver;
                if (!(p023 instanceof ro7.g)) {
                    bVar4.getClass();
                    throw new NoWhenBranchMatchedException();
                }
                CarSelectFlowContract$State carSelectFlowContract$State = (CarSelectFlowContract$State) bVar4.A2().f98429a;
                CarManualInputScreenContract$ManualCarInfo carManualInputScreenContract$ManualCarInfo = ((ro7.g) p023).f255919a;
                InsurableCar insurableCar = carSelectFlowContract$State.f75392b;
                carSelectFlowContract$State.getClass();
                bVar4.L2(new CarSelectFlowContract$State(carManualInputScreenContract$ManualCarInfo, insurableCar));
                bVar4.E2(CarSelectFlowContract$Step.CarManualQuestions.f75395a, true, null, false);
                return Unit.f186387a;
            case 19:
                tp7.g p024 = (tp7.g) obj2;
                Intrinsics.checkNotNullParameter(p024, "p0");
                com.revolut.feature.insurance_car.impl.ui.flow.onboarding.car.b bVar5 = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.car.b) this.receiver;
                if (p024 instanceof tp7.f) {
                    CarManualInputScreenContract$ManualCarInfo carManualInputScreenContract$ManualCarInfo2 = ((CarSelectFlowContract$State) bVar5.A2().f98429a).f75391a;
                    if (carManualInputScreenContract$ManualCarInfo2 == null) {
                        throw new IllegalStateException("Manual car input can not be null");
                    }
                    Map map = ((tp7.f) p024).f273304a;
                    Boolean bool2 = (Boolean) map.get(p1.CAR_HAS_VALID_NCT);
                    if (bool2 == null) {
                        throw new IllegalStateException("valid nct answer missing");
                    }
                    boolean zBooleanValue = bool2.booleanValue();
                    String str = carManualInputScreenContract$ManualCarInfo2.f75558a;
                    String str2 = carManualInputScreenContract$ManualCarInfo2.f75560c;
                    String str3 = carManualInputScreenContract$ManualCarInfo2.d;
                    int i6 = carManualInputScreenContract$ManualCarInfo2.f;
                    s0 s0Var = carManualInputScreenContract$ManualCarInfo2.e;
                    m2 m2Var = carManualInputScreenContract$ManualCarInfo2.f75561g;
                    CarVariation carVariation = carManualInputScreenContract$ManualCarInfo2.f75562h;
                    Integer num = carVariation.f;
                    boolean z3 = !zBooleanValue;
                    o0 o0Var = carManualInputScreenContract$ManualCarInfo2.i;
                    wi0.b bVar6 = carManualInputScreenContract$ManualCarInfo2.f75559b;
                    String str4 = carVariation.f75193b;
                    Boolean bool3 = (Boolean) map.get(p1.CAR_RIGHT_HAND_DRIVE);
                    if (bool3 == null) {
                        throw new IllegalStateException("right hand answer missing");
                    }
                    boolean zBooleanValue2 = bool3.booleanValue();
                    int i21 = carManualInputScreenContract$ManualCarInfo2.f75563j;
                    Boolean bool4 = (Boolean) map.get(p1.CAR_OWNER);
                    if (bool4 == null) {
                        throw new IllegalStateException("car owner answer missing");
                    }
                    boolean zBooleanValue3 = bool4.booleanValue();
                    Boolean bool5 = (Boolean) map.get(p1.CAR_PRIVATE_TAX_ITEM);
                    if (bool5 == null) {
                        throw new IllegalStateException("taxed privately answer missing");
                    }
                    boolean zBooleanValue4 = bool5.booleanValue();
                    Boolean bool6 = (Boolean) map.get(p1.CAR_NEVER_LEFT_UK_IE);
                    if (bool6 == null) {
                        throw new IllegalStateException("never left ie answer missing");
                    }
                    bVar5.O2(new InsurableCar(null, str, str2, str3, i6, s0Var, m2Var, num, null, null, new CarManualInput(str4, bVar6, i21, zBooleanValue2, zBooleanValue, zBooleanValue3, zBooleanValue4, bool6.booleanValue()), Boolean.valueOf(z3), o0Var, null, null));
                } else {
                    bVar5.getClass();
                }
                return Unit.f186387a;
            case 20:
                uo7.f p025 = (uo7.f) obj2;
                Intrinsics.checkNotNullParameter(p025, "p0");
                com.revolut.feature.insurance_car.impl.ui.flow.onboarding.car.b bVar7 = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.car.b) this.receiver;
                bVar7.getClass();
                if (p025 instanceof uo7.h) {
                    bVar7.E2(new CarSelectFlowContract$Step.CarConfirmation(((uo7.h) p025).f281576a), true, null, false);
                } else if (p025 instanceof f.a) {
                    bVar7.E2(new CarSelectFlowContract$Step.CarManualInput(null), true, null, false);
                } else {
                    if (!(p025 instanceof uo7.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar7.E2(new CarSelectFlowContract$Step.CarManualInput(((uo7.g) p025).f281575a), true, null, false);
                }
                return Unit.f186387a;
            case 21:
                tp7.g p026 = (tp7.g) obj2;
                Intrinsics.checkNotNullParameter(p026, "p0");
                com.revolut.feature.insurance_car.impl.ui.flow.onboarding.car.b bVar8 = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.car.b) this.receiver;
                if (p026 instanceof tp7.e) {
                    tl7.f.R(bVar8.f75398t, com.revolut.feature.insurance_car.impl.R$string.car_insurance_car_further_additional_details_learn_more_title, com.revolut.feature.insurance_car.impl.R$string.car_insurance_car_further_additional_details_learn_more_subtitle, null, null, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
                } else {
                    if (!(p026 instanceof tp7.f)) {
                        bVar8.getClass();
                        throw new NoWhenBranchMatchedException();
                    }
                    InsurableCar insurableCar2 = ((CarSelectFlowContract$State) bVar8.A2().f98429a).f75392b;
                    if (insurableCar2 != null) {
                        Map map2 = ((tp7.f) p026).f273304a;
                        Boolean bool7 = (Boolean) map2.get(p1.CAR_NCT_BOOKED);
                        if (bool7 == null) {
                            throw new IllegalStateException("Answer can not be empty");
                        }
                        Boolean bool8 = (Boolean) map2.get(p1.CAR_ROAD_WORTHY);
                        if (bool8 == null) {
                            throw new IllegalStateException("Answer can not be null");
                        }
                        insurableCarA = InsurableCar.a(insurableCar2, bool8, bool7, null, 31999);
                    }
                    if (insurableCarA == null) {
                        throw new IllegalStateException("Car can not be null");
                    }
                    bVar8.G2(new km7.c(insurableCarA));
                }
                return Unit.f186387a;
            case 22:
                OnboardingFlowContract$State currentState = (OnboardingFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(currentState, "p0");
                s sVar = (s) this.receiver;
                kmc.h hVar = sVar.u;
                String str5 = hVar.f185763a.f85119b;
                Intrinsics.checkNotNullParameter(currentState, "currentState");
                if (currentState.f85122b == ilc.a.EEA) {
                    dj0.d dVar = currentState.d;
                    dj0.d dVar2 = currentState.e;
                    Object[] objArr = dVar2 != null && dVar2.f(dj0.d.e);
                    TransferSubjectId.Portfolio portfolio = new TransferSubjectId.Portfolio(str5);
                    WealthAccountType wealthAccountType = WealthAccountType.ROBO;
                    dj0.d dVar3 = objArr != false ? dVar2 : null;
                    if (objArr == true) {
                        c0 c0Var = c0.MONTH;
                        LocalDate localDatePlusMonths = ((l80.f) hVar.f185765c).e().plusMonths(1L);
                        Intrinsics.checkNotNullExpressionValue(localDatePlusMonths, "plusMonths(...)");
                        recurringDepositSchedule = new RecurringDepositSchedule(localDatePlusMonths, c0Var);
                    } else {
                        recurringDepositSchedule = null;
                    }
                    featureCommandB = vhi.c.c(new DualAddMoneyDestination(portfolio, wealthAccountType, dVar, dVar3, recurringDepositSchedule, null, false), yhi.b.POPUP, null, false, 12);
                } else {
                    featureCommandB = b3f.b.b(hVar.f185764b, new TransferSubjectId.Portfolio(str5), WealthAccountType.ROBO, null, null, 12);
                }
                NaviCommand naviCommand = sVar.o.f85120c;
                if (naviCommand != null) {
                    sVar.C1(new BridgeDestination(new CompositeCommand(naviCommand, featureCommandB)));
                }
                oki.h.D2(sVar.z);
                return Unit.f186387a;
            case 23:
                a3 p027 = (a3) obj2;
                Intrinsics.checkNotNullParameter(p027, "p0");
                kof.j jVar = (kof.j) this.receiver;
                efm.r rVarSwitchIfEmpty = new sfm.b(new rfm.j(w.H0(jVar.f186349b.y(AccountId.Personal.f51414a), jVar.f186350c.f(false)), new km2.b(16, new kof.g(jVar, p027, 3)), i5), new km2.b(15, new kof.g(jVar, p027, i3)), i3).switchIfEmpty(zi0.c.j(kof.d.f186342a));
                Intrinsics.checkNotNullExpressionValue(rVarSwitchIfEmpty, "switchIfEmpty(...)");
                return ue0.e.H(rVarSwitchIfEmpty, h0.f322473a, new knd.a(21));
            case 24:
                Throwable p028 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p028, "p0");
                f0 f0Var = (f0) this.receiver;
                ServerError serverErrorA = f0Var.f189329q.a(p028);
                if (serverErrorA == null || serverErrorA.f51362a != 110011) {
                    z = false;
                } else {
                    f0Var.o.getClass();
                    f0Var.L2(new y0("GROUP_DETAILS_SWITCH_UNAVAILABLE_DIALOG", new nii.l0(new TextLocalisedClause(com.revolut.feature.payments.groups.api.R$string.group_smart_settle_switch_unavailable_disclaimer_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.payments.groups.api.R$string.group_smart_settle_switch_unavailable_disclaimer_subtitle, null, null, 14), null, null, null, null, false, null, 1020), false, 4));
                }
                return Boolean.valueOf(z);
            case 25:
                a3 transaction = (a3) obj2;
                Intrinsics.checkNotNullParameter(transaction, "p0");
                ((bnf.f) this.receiver).getClass();
                Intrinsics.checkNotNullParameter(transaction, "transaction");
                i3 i3Var = transaction.Q;
                p5 p5Var = transaction.f272612s0;
                z6 z6Var = transaction.G;
                String id10 = i3Var.getId();
                String strA3 = transaction.e.a();
                String strName = transaction.f.name();
                dj0.d dVar4 = transaction.f272606p;
                String str6 = transaction.f272611s;
                String str7 = transaction.f272609r;
                w5 w5Var2 = transaction.f272624y;
                String strName2 = w5Var2.f273144b.name();
                d3 d3Var = transaction.E;
                String strA4 = (d3Var == null || (fVar = d3Var.f272683b) == null) ? null : fVar.a();
                String strName3 = (z6Var == null || (w5Var = z6Var.k) == null || (lVar = w5Var.f273144b) == null) ? null : lVar.name();
                String strValueOf = String.valueOf(k.e1(transaction));
                p6 p6Var = transaction.A.f272780b;
                String strValueOf2 = (p6Var == null || (bool = p6Var.d) == null) ? null : String.valueOf(bool.booleanValue());
                String strValueOf3 = String.valueOf(k.p(transaction));
                String strA5 = (p5Var == null || (k5Var = p5Var.e.f272915h) == null || (m5Var = k5Var.f) == null) ? null : m5Var.a();
                String string = (p5Var == null || (r5Var = p5Var.f272989b) == null) ? null : r5Var.toString();
                w6 w6Var = transaction.f272602n0;
                String strName4 = w6Var != null ? w6Var.name() : null;
                String str8 = transaction.f272614t;
                String str9 = transaction.j0;
                g3 g3Var = transaction.f272582b0;
                return new bef.a(id10, strA3, strName, dVar4, str6, str7, strName2, strA4, strName3, strValueOf, strValueOf2, strValueOf3, strA5, string, strName4, str8, str9, g3Var != null ? g3Var.f272765a : null, z6Var != null ? z6Var.f273196a : null, k.o0(transaction), w5Var2.f273143a, z6Var != null ? z6Var.i : null, z6Var != null ? z6Var.f273200h : null, 131074);
            case 26:
                FullscreenQuizView$QuizSelection p029 = (FullscreenQuizView$QuizSelection) obj2;
                Intrinsics.checkNotNullParameter(p029, "p0");
                ((ihm.f) this.receiver).onNext(p029);
                return Unit.f186387a;
            case 27:
                jw.f sample = (jw.f) obj2;
                Intrinsics.checkNotNullParameter(sample, "p0");
                kw.d dVar5 = (kw.d) this.receiver;
                dVar5.getClass();
                Intrinsics.checkNotNullParameter(sample, "sample");
                if (dVar5.f) {
                    dVar5.e.add(sample);
                }
                return Unit.f186387a;
            case 28:
                ((AtomicReference) this.receiver).set((aii.r) obj2);
                return Unit.f186387a;
            default:
                ((gom.c) this.receiver).w((Throwable) obj2);
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Object obj2) {
        super(1, 0, bnf.f.class, obj2, "toAttributesModel", "toAttributesModel(Lcom/revolut/feature/transactions/models/Transaction;)Lcom/revolut/feature/transaction/item/provider/api/TransactionAttributes;");
        this.f = 25;
    }
}
