package nx7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit_core.displayers.image.models.AnimatedResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.ui.planbuilder.PetPlanBuilderFlowContract$PlanBuilderAction;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f220468b;

    public /* synthetic */ o(u uVar, int i) {
        this.f220467a = i;
        this.f220468b = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        efm.b bVarV;
        efm.b bVarM;
        switch (this.f220467a) {
            case 0:
                e step = (e) obj2;
                Intrinsics.checkNotNullParameter(step, "step");
                b bVar = this.f220468b.o;
                int i = p.f220469a[step.ordinal()];
                pfm.m mVar = pfm.m.f235744a;
                if (i == 1) {
                    ((n) bVar).k.getClass();
                    Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                    return ue0.e.v(mVar);
                }
                if (i == 2) {
                    ((n) bVar).k.getClass();
                    Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                    return ue0.e.v(mVar);
                }
                if (i == 3) {
                    ((n) bVar).k.getClass();
                    Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                    return ue0.e.v(mVar);
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                ((n) bVar).k.getClass();
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return ue0.e.v(mVar);
            case 1:
                iqi.h hVar = this.f220468b.k;
                if (((Boolean) obj2).booleanValue()) {
                    AnimatedResourceImage animatedResourceImage = new AnimatedResourceImage(R$drawable.uikit_icn_48_loading_anim, 12, (Clause) null, Integer.valueOf(R$attr.uikit_colorWhite));
                    TwinVerticalButton twinVerticalButton = ((iqi.b) hVar).f167867j;
                    if (twinVerticalButton == null) {
                        Intrinsics.r("twinVerticalButton");
                        throw null;
                    }
                    twinVerticalButton.setMainButtonIcon(animatedResourceImage);
                } else {
                    TwinVerticalButton twinVerticalButton2 = ((iqi.b) hVar).f167867j;
                    if (twinVerticalButton2 == null) {
                        Intrinsics.r("twinVerticalButton");
                        throw null;
                    }
                    twinVerticalButton2.setMainButtonIcon(null);
                }
                return Unit.f186387a;
            case 2:
                String petId = (String) obj2;
                Intrinsics.checkNotNullParameter(petId, "petId");
                if (d0.W(petId)) {
                    petId = null;
                }
                u uVar = this.f220468b;
                if (petId != null) {
                    return uVar.Q(petId);
                }
                ((n) uVar.o).k.getClass();
                pfm.m mVar2 = pfm.m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                return ue0.e.v(mVar2);
            case 3:
                PetPlanBuilderFlowContract$PlanBuilderAction action = (PetPlanBuilderFlowContract$PlanBuilderAction) obj2;
                Intrinsics.checkNotNullParameter(action, "action");
                return this.f220468b.f220478p.c0(action);
            case 4:
                ((rpi.b) this.f220468b.f220476m).N(false);
                return Unit.f186387a;
            case 5:
                return ((z) this.f220468b.f220477n).l();
            case 6:
                ((rpi.b) this.f220468b.f220476m).N(false);
                return Unit.f186387a;
            default:
                u uVar2 = this.f220468b;
                n nVar = (n) uVar2.o;
                Object step2 = nVar.getStep();
                d dVar = nVar.i;
                if (step2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                e eVar = (e) step2;
                int[] iArr = p.f220469a;
                int i2 = iArr[eVar.ordinal()];
                if (i2 == 1) {
                    pfm.m mVar3 = pfm.m.f235744a;
                    Intrinsics.checkNotNullExpressionValue(mVar3, "complete(...)");
                    bVarV = mVar3;
                } else if (i2 == 2) {
                    pfm.a aVar = new pfm.a(te0.w.N(((a0) dVar).f220448c.c0()), new noi.l(29, new h(nVar, 2)), 4);
                    Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                    bVarV = ue0.e.v(aVar);
                } else if (i2 == 3) {
                    pfm.a aVar2 = new pfm.a(te0.w.N(((a0) dVar).d.A()), new i(new h(nVar, 3), 0), 4);
                    Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                    bVarV = ue0.e.v(aVar2);
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pfm.a aVar3 = new pfm.a(te0.w.N(((a0) dVar).e.getDateOfBirth()), new noi.l(28, new h(nVar, 0)), 4);
                    Intrinsics.checkNotNullExpressionValue(aVar3, "flatMapCompletable(...)");
                    bVarV = ue0.e.v(aVar3);
                }
                if (iArr[eVar.ordinal()] == 4) {
                    String str = (String) ((od0.i) ((a0) dVar).f.d().get()).f224257a;
                    if (str == null) {
                        pfm.h hVarA = ((tm.g) nVar.f220466n.getValue()).a(tx7.a.f275340a);
                        Intrinsics.checkNotNullParameter(hVarA, "<this>");
                        bVarM = o70.a.g(te0.w.g0(hVarA));
                    } else {
                        bVarM = uVar2.Q(str);
                    }
                } else {
                    bVarM = ((z) uVar2.f220477n).m();
                }
                pfm.a aVarE = bVarV.e(bVarM);
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return aVarE;
        }
    }
}
