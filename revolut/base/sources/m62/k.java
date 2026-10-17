package m62;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.models.onboarding.ApmOnboardingConflict;
import com.revolut.feature.apm.iris.api.R$string;
import com.revolut.feature.apm.iris.impl.ui.registration.confirmation.IrisRegistrationConfirmationScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lhk.a0;
import nii.l0;
import nii.m0;
import nii.y0;
import nii.z;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ IrisRegistrationConfirmationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(IrisRegistrationConfirmationScreen irisRegistrationConfirmationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = irisRegistrationConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.v, continuation, 0);
            default:
                return new k(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        m0 zVar;
        int i = this.u;
        IrisRegistrationConfirmationScreen irisRegistrationConfirmationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                irisRegistrationConfirmationScreen.m2().onBackPressed();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVar = (p) ((g) irisRegistrationConfirmationScreen.P.getValue());
                ApmOnboardingConflict conflict = ((a) ((j2) pVar.f202983t.f22677a).getValue()).f202968a.getConflict();
                if (conflict != null) {
                    pVar.f202980q.getClass();
                    Intrinsics.checkNotNullParameter(conflict, "conflict");
                    if (conflict instanceof ApmOnboardingConflict.PhoneMismatch) {
                        zVar = new l0(new TextLocalisedClause(R$string.iris_registration_mismatch_phone_dialog_title, null, null, 14), new TextLocalisedClause(R$string.iris_registration_mismatch_phone_dialog_description, null, null, 14), null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), new TextLocalisedClause(R$string.iris_registration_mismatch_phone_dialog_update_phone_action, null, null, 14), null, false, null, 996);
                    } else if (conflict instanceof ApmOnboardingConflict.TaxIdMismatch) {
                        zVar = new l0(new TextLocalisedClause(R$string.iris_registration_mismatch_tax_number_dialog_title, null, null, 14), new TextLocalisedClause(R$string.iris_registration_mismatch_tax_number_dialog_description, null, null, 14), null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), new TextLocalisedClause(R$string.iris_registration_mismatch_tax_number_dialog_update_tax_number_action, null, null, 14), null, false, null, 996);
                    } else {
                        if (!(conflict instanceof ApmOnboardingConflict.TaxIdMissing) && !conflict.equals(ApmOnboardingConflict.PhoneAlreadyInUse.f61962b) && !conflict.equals(ApmOnboardingConflict.BusinessAccountNotRegistered.f61961b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unsupported conflict reason: ".concat(conflict.f61960a));
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                        zVar = new z(new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
                    }
                    yji.l.a1(pVar, pVar.X1(new y0(null, zVar, false, 5)), null, null, new a0(pVar, conflict, null, 9), 3);
                } else {
                    pVar.l2(new n(pVar, null, 0), new yi5.b(26));
                }
                return Unit.f186387a;
        }
    }
}
