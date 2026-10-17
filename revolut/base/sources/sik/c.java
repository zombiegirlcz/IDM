package sik;

import chk.c;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.StudentVerificationFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.a;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import qnk.d;
import snk.j;
import vkm.j2;
import yji.l;
import yki.i;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g f263650b;

    public /* synthetic */ c(com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g gVar, int i) {
        this.f263649a = i;
        this.f263650b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f263649a;
        Continuation continuation = null;
        com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g gVar = this.f263650b;
        switch (i) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                l.b1(gVar, gVar.X1(new y0(null, new z(new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, new g(gVar, continuation, 0), 3);
                return Boolean.TRUE;
            case 1:
                bhk.e output = (bhk.e) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof bhk.d) {
                    gVar.C2(a.c.f103289a);
                } else if (!(output instanceof bhk.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 2:
                i iVar = gVar.f103298x;
                j output2 = (j) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof snk.i) {
                    j2 j2Var = gVar.f103293q.f271575a;
                    Long lValueOf = Long.valueOf(System.currentTimeMillis() + 60000);
                    j2Var.getClass();
                    j2Var.g(null, lValueOf);
                    oki.h.z2(iVar, new StudentVerificationFlowContract$Step.EmailVerification(((snk.i) output2).f264639a, null), ModalDestination.Style.POPUP.f98311a);
                } else if (output2 instanceof j.a) {
                    oki.h.w2(iVar, StudentVerificationFlowContract$Step.HideStudent.f103282a, ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a);
                } else if (output2 instanceof snk.g) {
                    oki.h.z2(iVar, new StudentVerificationFlowContract$Step.EmailReview(((snk.g) output2).f264637a), ModalDestination.Style.POPUP.f98311a);
                } else {
                    if (!(output2 instanceof snk.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.z2(iVar, new StudentVerificationFlowContract$Step.EmailRejected(((snk.h) output2).f264638a), ModalDestination.Style.POPUP.f98311a);
                }
                return Unit.f186387a;
            case 3:
                qnk.d output3 = (qnk.d) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                if (!(output3 instanceof d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                gVar.l2(new g(gVar, continuation, 1), new yi5.b(26));
                return Unit.f186387a;
            case 4:
                chk.c output4 = (chk.c) obj2;
                Intrinsics.checkNotNullParameter(output4, "output");
                if (output4 instanceof c.b) {
                    gVar.C2(a.d.f103290a);
                } else if (!(output4 instanceof c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            default:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g gVar2 = this.f263650b;
                i81.c cVarA = ((g81.e) gVar2.u).a(new aii.i((Throwable) obj2, aii.a.USER_ACTION, 4));
                if (cVarA instanceof i81.b) {
                    l.a1(gVar2, gVar2.X1(((i81.b) cVarA).f159410a), null, null, null, 7);
                } else {
                    if (!(cVarA instanceof i81.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(gVar2.f103298x);
                    Unit unit = Unit.f186387a;
                }
                return Boolean.TRUE;
        }
    }
}
