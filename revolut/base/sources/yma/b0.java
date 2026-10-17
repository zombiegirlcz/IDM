package yma;

import android.content.Context;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.FragmentNavigateCommand;
import com.revolut.retail.feature.impl.userauth.R$string;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.uicomponent.R$menu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.joda.time.LocalDateTime;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f314898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f314899b;

    public /* synthetic */ b0(e0 e0Var, int i) {
        this.f314898a = i;
        this.f314899b = e0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        e80.j jVarD;
        int i = this.f314898a;
        pfm.m mVar = pfm.m.f235744a;
        int i2 = 3;
        e0 e0Var = this.f314899b;
        int i3 = 0;
        int i5 = 2;
        switch (i) {
            case 0:
                Integer errorCode = (Integer) obj2;
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.email_verification_status_error_title, null, null, 14);
                v60.c cVarB = ((ao0.a) e0Var.f314905c).b(errorCode);
                return new StatusViewConfiguration.Error("errorViewRepresentation", textLocalisedClause, cVarB != null ? ofm.q.O(cVarB) : null, new TextLocalisedClause(R.string.common_action_close, null, null, 14), null, null, null, 8176);
            case 1:
                t70.g gVar = e0Var.f314904b;
                c90.c cVar = e0Var.f314906g;
                e80.i iVar = e0Var.e;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                long jLongValue = ((Number) pair.f186385a).longValue();
                boolean zBooleanValue = ((Boolean) pair.f186386b).booleanValue();
                if (jLongValue > -1) {
                    String string = new LocalDateTime(jLongValue).toString("mm:ss", ((s80.b) e0Var.f).b());
                    if (zBooleanValue) {
                        com.revolut.core.android.spannable.a aVarC = iVar.c();
                        String string2 = gVar.getString(R.string.email_verification_status_check_email_resent);
                        int i6 = R$attr.uikit_colorGreen;
                        Context context = cVar.f22265a;
                        aVarC.c(string2, new e80.h[]{new e80.d(kli.a.x(i6, context))});
                        aVarC.c(" ", new e80.h[0]);
                        aVarC.c(gVar.i(R.string.email_verification_status_check_email_resend_in, string), new e80.h[]{new e80.d(kli.a.x(R$attr.uikit_colorGreyTone50, context))});
                        jVarD = aVarC.d();
                    } else {
                        com.revolut.core.android.spannable.a aVarC2 = iVar.c();
                        aVarC2.c(gVar.i(R.string.email_verification_status_check_email_resend_in, string), new e80.h[]{new e80.d(kli.a.x(R$attr.uikit_colorGreyTone50, cVar.f22265a))});
                        jVarD = aVarC2.d();
                    }
                } else {
                    com.revolut.core.android.spannable.a aVarC3 = iVar.c();
                    String string3 = gVar.getString(R.string.email_verification_status_check_email_did_not_receive);
                    int i21 = R$attr.uikit_colorGreyTone50;
                    Context context2 = cVar.f22265a;
                    aVarC3.c(string3, new e80.h[]{new e80.d(kli.a.x(i21, context2))});
                    aVarC3.c(" ", new e80.h[0]);
                    aVarC3.c(gVar.getString(R.string.email_verification_status_check_email_resend_button), new e80.h[]{new e80.d(kli.a.x(R$attr.uikit_colorAccent, context2)), new e80.b(new y99.c(e0Var, 24))});
                    jVarD = aVarC3.d();
                }
                return e0Var.f314903a.h1(jVarD);
            case 2:
                d step = (d) obj2;
                Intrinsics.checkNotNullParameter(step, "step");
                int i22 = d0.f314902a[step.ordinal()];
                if (i22 == 1) {
                    return e0Var.f314903a.l3();
                }
                if (i22 == 2) {
                    return new pfm.h(new c0(e0Var, 3), 2);
                }
                if (i22 != 3) {
                    if (i22 == 4) {
                        return new pfm.h(new c0(e0Var, 4), 2);
                    }
                    if (i22 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return new pfm.h(new c0(e0Var, 2), 2);
            case 3:
                d step2 = (d) obj2;
                Intrinsics.checkNotNullParameter(step2, "step");
                int i32 = d0.f314902a[step2.ordinal()];
                if (i32 != 1 && i32 != 2) {
                    if (i32 == 4) {
                        return new pfm.h(new c0(e0Var, 1), 2);
                    }
                    if (i32 != 5) {
                        return mVar;
                    }
                }
                return new pfm.h(new c0(e0Var, 0), 2);
            case 4:
                d step3 = (d) obj2;
                Intrinsics.checkNotNullParameter(step3, "step");
                return step3 != d.CHECK_EMAIL ? mVar : e0Var.f314908j;
            default:
                d currentStep = (d) obj2;
                Intrinsics.checkNotNullParameter(currentStep, "currentStep");
                int i33 = d0.f314902a[currentStep.ordinal()];
                if (i33 == 1) {
                    ana.d.Companion.getClass();
                    return efm.r.just(new FragmentNavigateCommand(ana.a.f6611b, null, false, 2046));
                }
                if (i33 == 2) {
                    p pVar = e0Var.f314903a;
                    m70.a.c(t0.f186434a);
                    efm.b bVarJ0 = pVar.j0();
                    o3l.d dVar = pVar.f314924b;
                    pfm.f fVarO = efm.b.o(zhm.v.k(bVarJ0, dVar.k2(), dVar.X1(R$menu.menu_not_now), pVar.S2(new FinishCommand(null, null, null, 7)), pVar.U(new TextLocalisedClause(R$string.email_verification_status_check_email_title, null, null, 14)), pVar.Z(new TextLocalisedClause(R.string.email_verification_status_check_email_subtitle, null, null, 14)), dVar.h(false), pVar.J(new TextLocalisedClause(R.string.email_verification_status_check_email_button, null, null, 14)), dVar.F0(true), pVar.s0(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D001", null, null, null, 30)), dVar.l2()));
                    Intrinsics.checkNotNullExpressionValue(fVarO, "merge(...)");
                    return fVarO.g(e0.e(true));
                }
                te0.s sVar = te0.s.f270018a;
                if (i33 != 3) {
                    if (i33 == 4) {
                        return e0Var.f314907h.c0(new StatusViewConfiguration.Success("successViewRepresentation", new TextLocalisedClause(R.string.email_verification_status_success_title, null, null, 14), new TextLocalisedClause(R.string.email_verification_status_success_subtitle, null, null, 14), null, null, 2040)).C();
                    }
                    if (i33 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    g gVar2 = (g) e0Var.f314903a.d;
                    efm.k kVarFirstElement = gVar2.f314912h.getValue(gVar2, g.k[5]).c(sVar).firstElement();
                    r rVar = new r(new b0(e0Var, i3), i5);
                    kVarFirstElement.getClass();
                    pfm.a aVar = new pfm.a(new rfm.m(kVarFirstElement, rVar, 1), new r(new yea.l(1, e0Var.f314907h, g3l.a.class, "dispatchAsync", "dispatchAsync(Ljava/lang/Object;)Lio/reactivex/Completable;", 0, 9), i2), 3);
                    Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                    return aVar.C();
                }
                p pVar2 = e0Var.f314903a;
                efm.b bVarM0 = pVar2.f314924b.M0();
                efm.b bVarU = pVar2.U(new TextLocalisedClause(R.string.email_verification_status_verifying_title, null, null, 14));
                efm.b bVarZ = pVar2.Z(new TextLocalisedClause(R.string.email_verification_status_verifying_subtitle, null, null, 14));
                o3l.d dVar2 = pVar2.f314924b;
                efm.b bVarH = dVar2.h(true);
                efm.b bVarF0 = dVar2.F0(false);
                m70.a.c(t0.f186434a);
                pfm.f fVarO2 = efm.b.o(zhm.v.k(bVarM0, bVarU, bVarZ, bVarH, bVarF0, pVar2.h1("")));
                Intrinsics.checkNotNullExpressionValue(fVarO2, "merge(...)");
                sfm.b bVarG = fVarO2.g(e0.e(false));
                p pVar3 = e0Var.f314903a;
                efm.d0 d0VarFirstOrError = ((g) pVar3.d).w0().c(sVar).firstOrError();
                yj2.a aVar2 = new yj2.a(27, new j(pVar3, 8));
                d0VarFirstOrError.getClass();
                pfm.a aVar3 = new pfm.a(d0VarFirstOrError, aVar2, 4);
                Intrinsics.checkNotNullExpressionValue(aVar3, "flatMapCompletable(...)");
                return bVarG.concatWith(aVar3);
        }
    }
}
