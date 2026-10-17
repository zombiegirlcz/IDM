package mm7;

import android.content.Context;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.feature.blue_prompt.fullscreen.BluePromptActivity;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.ApplicationForm;
import com.revolut.feature.insurance_car.impl.data.model.InsurableCar;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$State;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$Step;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.a;
import com.revolut.feature.insurance_car.impl.ui.screen.common.benefit_details.BenefitDetailsScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.common.benefit_details.BenefitDetailsScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.a;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import cp7.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import ko7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import kp7.k;
import kp7.m;
import m9d.y0;
import mhd.p0;
import ms0.h3;
import mx0.d3;
import mx0.m2;
import nq.e0;
import nq.o;
import nq.t;
import nq.w;
import nq.y;
import yji.l;
import zhm.f0;
import zhm.r0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h extends q implements Function1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List<t> listK;
        int i = 2;
        Continuation continuation = null;
        int i2 = 0;
        int i3 = 1;
        switch (this.f) {
            case 0:
                Throwable p0 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                vl7.a.g((l) this.receiver, p0);
                return Boolean.TRUE;
            case 1:
                Throwable p03 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                vl7.a.g((l) this.receiver, p03);
                return Boolean.TRUE;
            case 2:
                ko7.e p010 = (ko7.e) obj2;
                Intrinsics.checkNotNullParameter(p010, "p0");
                j jVar = (j) this.receiver;
                if (p010 instanceof e.a) {
                    jVar.S2(CarOnboardingFlowContract$Step.Licence.f75416a);
                    return Unit.f186387a;
                }
                jVar.getClass();
                throw new NoWhenBranchMatchedException();
            case 3:
                com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.a p011 = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.a) obj2;
                Intrinsics.checkNotNullParameter(p011, "p0");
                j jVar2 = (j) this.receiver;
                if (p011 instanceof qm7.b) {
                    jVar2.U2(com.revolut.feature.insurance_car.impl.data.model.a.a(((CarOnboardingFlowContract$State) jVar2.A2().f98429a).f75402a, ((qm7.b) p011).f247775a));
                    jVar2.S2(CarOnboardingFlowContract$Step.Penalties.f75419a);
                } else {
                    if (!(p011 instanceof a.C0504a)) {
                        jVar2.getClass();
                        throw new NoWhenBranchMatchedException();
                    }
                    jVar2.I2();
                }
                return Unit.f186387a;
            case 4:
                sm7.c p012 = (sm7.c) obj2;
                Intrinsics.checkNotNullParameter(p012, "p0");
                j jVar3 = (j) this.receiver;
                jVar3.U2(com.revolut.feature.insurance_car.impl.data.model.a.b(((CarOnboardingFlowContract$State) jVar3.A2().f98429a).f75402a, p012.f264383a));
                jVar3.S2(CarOnboardingFlowContract$Step.Claims.f75409a);
                return Unit.f186387a;
            case 5:
                wo7.f p013 = (wo7.f) obj2;
                Intrinsics.checkNotNullParameter(p013, "p0");
                j jVar4 = (j) this.receiver;
                if (!(p013 instanceof wo7.e)) {
                    jVar4.getClass();
                    throw new NoWhenBranchMatchedException();
                }
                jVar4.U2(ApplicationForm.a(((CarOnboardingFlowContract$State) jVar4.A2().f98429a).f75402a, ((wo7.e) p013).f298900a, null, null, null, null, 1021));
                Collection collection = ((CarOnboardingFlowContract$State) jVar4.A2().f98429a).f75402a.e;
                if (collection == null) {
                    collection = f0.f322471a;
                }
                jVar4.E2(new CarOnboardingFlowContract$Step.Eligibility(!collection.isEmpty()), true, null, false);
                return Unit.f186387a;
            case 6:
                cp7.f p014 = (cp7.f) obj2;
                Intrinsics.checkNotNullParameter(p014, "p0");
                j jVar5 = (j) this.receiver;
                jVar5.getClass();
                if (p014 instanceof cp7.g) {
                    jVar5.l2(new p0(jVar5, p014, continuation, 15), new lrk.h(1, jVar5, vl7.a.class, "genericErrorHandler", "genericErrorHandler(Lcom/revolut/kompot/navigable/ControllerModel;Ljava/lang/Throwable;)Z", 1, 29));
                } else if (Intrinsics.f(p014, f.a.f107894a)) {
                    jVar5.l2(new g(jVar5, continuation, i2), new d(jVar5, i3));
                } else if (Intrinsics.f(p014, f.b.f107895a)) {
                    jVar5.B2(true);
                } else {
                    if (!Intrinsics.f(p014, f.c.f107896a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jVar5.l2(new g(jVar5, continuation, i3), new d(jVar5, i));
                }
                return Unit.f186387a;
            case 7:
                um7.c p015 = (um7.c) obj2;
                Intrinsics.checkNotNullParameter(p015, "p0");
                j jVar6 = (j) this.receiver;
                jVar6.U2(com.revolut.feature.insurance_car.impl.data.model.a.c(((CarOnboardingFlowContract$State) jVar6.A2().f98429a).f75402a, p015.f281264a));
                jVar6.S2(CarOnboardingFlowContract$Step.CurrentInsurance.f75410a);
                return Unit.f186387a;
            case 8:
                wm7.c p016 = (wm7.c) obj2;
                Intrinsics.checkNotNullParameter(p016, "p0");
                j jVar7 = (j) this.receiver;
                jVar7.U2(com.revolut.feature.insurance_car.impl.data.model.a.d(((CarOnboardingFlowContract$State) jVar7.A2().f98429a).f75402a, p016.f298616a));
                jVar7.S2(CarOnboardingFlowContract$Step.Mileage.f75417a);
                return Unit.f186387a;
            case 9:
                ym7.c p017 = (ym7.c) obj2;
                Intrinsics.checkNotNullParameter(p017, "p0");
                j jVar8 = (j) this.receiver;
                jVar8.U2(com.revolut.feature.insurance_car.impl.data.model.a.e(((CarOnboardingFlowContract$State) jVar8.A2().f98429a).f75402a, p017.f314876a));
                jVar8.S2(CarOnboardingFlowContract$Step.Employment.f75415a);
                return Unit.f186387a;
            case 10:
                an7.c p018 = (an7.c) obj2;
                Intrinsics.checkNotNullParameter(p018, "p0");
                j jVar9 = (j) this.receiver;
                jVar9.U2(com.revolut.feature.insurance_car.impl.data.model.a.f(((CarOnboardingFlowContract$State) jVar9.A2().f98429a).f75402a, p018.f6571a));
                List list = ((CarOnboardingFlowContract$State) jVar9.A2().f98429a).f75402a.e;
                if (list == null) {
                    list = f0.f322471a;
                }
                jVar9.S2(new CarOnboardingFlowContract$Step.AdditionalDriver(list));
                return Unit.f186387a;
            case 11:
                com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.a p019 = (com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.a) obj2;
                Intrinsics.checkNotNullParameter(p019, "p0");
                j jVar10 = (j) this.receiver;
                jVar10.getClass();
                if (p019 instanceof m) {
                    InsurableCar insurableCar = ((CarOnboardingFlowContract$State) jVar10.A2().f98429a).f75402a.f75168c;
                    if ((insurableCar != null ? insurableCar.f75227b : null) == null) {
                        l.a1(jVar10, jVar10.X1(vl7.a.a(10, new TextLocalisedClause(R$string.car_insurance_plan_selection_error_no_car_registration_title, null, null, 14), null, new TextLocalisedClause(R$string.car_insurance_plan_selection_error_no_car_registration_action, null, null, 14))), null, null, new com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.h(jVar10, null), 3);
                    } else {
                        CarOnboardingFlowContract$State updateState = (CarOnboardingFlowContract$State) jVar10.A2().f98429a;
                        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                        m mVar = (m) p019;
                        boolean z = mVar.f188185c;
                        jVar10.L2(CarOnboardingFlowContract$State.a(updateState, null, mVar.f188183a, mVar.f188184b, Boolean.valueOf(z), 1));
                        jVar10.E2(new CarOnboardingFlowContract$Step.PlanOptions(((CarOnboardingFlowContract$State) jVar10.A2().f98429a).f75402a.f75166a, mVar.f188184b, mVar.f188183a, z), true, null, false);
                    }
                } else if (p019 instanceof k) {
                    jVar10.Y1(new BenefitDetailsScreen(new BenefitDetailsScreenContract$InputData(((k) p019).f188181a)), ModalDestination.Style.POPUP.f98311a, new d(jVar10, 3));
                } else if (p019 instanceof a.C0505a) {
                    jVar10.S2(CarOnboardingFlowContract$Step.EditApplication.f75413a);
                } else if (p019 instanceof a.b) {
                    jVar10.I2();
                } else {
                    if (!(p019 instanceof kp7.l)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jVar10.S2(new CarOnboardingFlowContract$Step.OptOutRenewalFeedback(((kp7.l) p019).f188182a));
                }
                return Unit.f186387a;
            case 12:
                Throwable p020 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p020, "p0");
                com.revolut.feature.profile.impl.ui.close_account.c cVar = (com.revolut.feature.profile.impl.ui.close_account.c) this.receiver;
                l.a1(cVar, cVar.J2(p020), null, null, new y0(cVar, continuation, 22), 3);
                return Boolean.TRUE;
            case 13:
                Throwable p021 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p021, "p0");
                ((com.revolut.feature.profile.impl.ui.close_account.c) this.receiver).J2(p021);
                return Boolean.TRUE;
            case 14:
                ty0.a p022 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(p022, "p0");
                ((ihm.f) this.receiver).onNext(p022);
                return Unit.f186387a;
            case 15:
                ty0.a p023 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(p023, "p0");
                ((ihm.f) this.receiver).onNext(p023);
                return Unit.f186387a;
            case 16:
                int iIntValue = ((Number) obj2).intValue();
                BluePromptActivity bluePromptActivity = (BluePromptActivity) this.receiver;
                BluePromptActivity.Companion companion = BluePromptActivity.INSTANCE;
                bluePromptActivity.getWindow().setNavigationBarColor(iIntValue);
                bluePromptActivity.getWindow().setNavigationBarDividerColor(iIntValue);
                return Unit.f186387a;
            case 17:
                NaviCommand p024 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(p024, "p0");
                ((sri.m) this.receiver).c(p024);
                return Unit.f186387a;
            case 18:
                Throwable p025 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p025, "p0");
                com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.e.I2((com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.e) this.receiver, p025);
                return Boolean.TRUE;
            case 19:
                ly.h p026 = (ly.h) obj2;
                Intrinsics.checkNotNullParameter(p026, "p0");
                com.revolut.biometric_verification.impl.ui.step.selfie_search.flow.a aVar = (com.revolut.biometric_verification.impl.ui.step.selfie_search.flow.a) this.receiver;
                zr.l lVar = aVar.f50662q;
                if (p026 instanceof ly.d) {
                    aVar.C2(new y(((ly.d) p026).f200610a));
                } else {
                    if (!(p026 instanceof ly.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ArrayList arrayList = new ArrayList();
                    mu.e eVar = aVar.f50661p;
                    gv.m media = ((ly.g) p026).J();
                    Map map = zv.d.f325568a;
                    Map mapG = r0.g();
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(media, "media");
                    if (media instanceof gv.j) {
                        listK = u.c(new nq.h(new nq.f(w.SELFIE_EMBEDDING, null, null), ((gv.j) media).f147015a));
                    } else if (media instanceof gv.k) {
                        listK = u.c(new o(new nq.a(w.SELFIE, mapG, null, null), ((gv.k) media).f147016a, null));
                    } else {
                        if (!(media instanceof gv.h)) {
                            throw new IllegalStateException("Embedding is only supported for selfie search");
                        }
                        gv.h hVar = (gv.h) media;
                        listK = v.k(new o(new nq.a(w.FACE_CROP, mapG, null, null), hVar.f147011b, hVar.f147010a), new nq.j(new nq.a(w.SELFIE, mapG, null, null), hVar.f147012c));
                    }
                    for (t tVar : listK) {
                        if (tVar instanceof nq.h) {
                            lVar.b("SELFIE_SEARCH_MEDIA_KEY_EMBEDDING", tVar);
                            arrayList.add("SELFIE_SEARCH_MEDIA_KEY_EMBEDDING");
                        } else if (tVar instanceof o) {
                            lVar.b("SELFIE_SEARCH_MEDIA_KEY_SELFIE_SEARCH", tVar);
                            arrayList.add("SELFIE_SEARCH_MEDIA_KEY_SELFIE_SEARCH");
                        } else {
                            if (!(tVar instanceof nq.j)) {
                                throw new IllegalStateException("Picture and video are not supported in selfie search");
                            }
                            lVar.b("SELFIE_SEARCH_MEDIA_KEY_FACE_LIVE", tVar);
                            arrayList.add("SELFIE_SEARCH_MEDIA_KEY_FACE_LIVE");
                        }
                    }
                    aVar.C2(new e0(arrayList));
                }
                return Unit.f186387a;
            case 20:
                Throwable p027 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p027, "p0");
                pu7.a.o((l) this.receiver, p027);
                return Boolean.TRUE;
            case 21:
                ((od0.h) this.receiver).getClass();
                return od0.h.a((iv9.a) obj2);
            case 22:
                return Integer.valueOf(kli.a.s(((Number) obj2).intValue(), (Context) this.receiver));
            case 23:
                Color p028 = (Color) obj2;
                Intrinsics.checkNotNullParameter(p028, "p0");
                return Integer.valueOf(io0.a.c((Context) this.receiver, p028));
            case 24:
                Intrinsics.checkNotNullParameter((h3) obj2, "p0");
                ((m2) this.receiver).getClass();
                return Unit.f186387a;
            case 25:
                float fFloatValue = ((Number) obj2).floatValue();
                d3 d3Var = (d3) this.receiver;
                return Float.valueOf(kotlin.ranges.f.f(fFloatValue, -1.0f, 1.0f) * (d3Var.f209644a.getLayoutDirection() == 1 ? d3Var.f209645b : -d3Var.f209645b));
            case 26:
                ty0.a p029 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(p029, "p0");
                ((ihm.k) this.receiver).onNext(p029);
                return Unit.f186387a;
            case 27:
                ty0.a p030 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(p030, "p0");
                ((ihm.k) this.receiver).onNext(p030);
                return Unit.f186387a;
            case 28:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                mt0.v vVar = (mt0.v) this.receiver;
                if (vVar.f208741n != zBooleanValue) {
                    vVar.f208741n = zBooleanValue;
                    if (zBooleanValue) {
                        vVar.c(false, true);
                        if (vVar.a()) {
                            vVar.b();
                        }
                    } else {
                        vVar.c(false, false);
                    }
                }
                return Unit.f186387a;
            default:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                FloatingBottomBarView floatingBottomBarView = (FloatingBottomBarView) this.receiver;
                if (floatingBottomBarView.d != zBooleanValue2) {
                    floatingBottomBarView.d = zBooleanValue2;
                    floatingBottomBarView.o();
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(od0.h hVar) {
        super(1, 0, od0.h.class, hVar, "of", "of(Ljava/lang/Object;)Lcom/revolut/core/common/Optional;");
        this.f = 21;
    }
}
