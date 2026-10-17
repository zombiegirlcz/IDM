package yh8;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior_onboarding.api.navigation.JuniorOnboardingDestination;
import com.revolut.feature.junior_onboarding.impl.R$string;
import com.revolut.feature.junior_onboarding.impl.ui.app_invite.JuniorAppInviteFlowContract$Step;
import d67.p;
import d67.r;
import d67.s;
import d67.t;
import d67.u;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import mii.k;
import y7i.h;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        JuniorAppInviteFlowContract$Step.AppAccess appAccess;
        u p0 = (u) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        com.revolut.feature.junior_onboarding.impl.ui.app_invite.b bVar = (com.revolut.feature.junior_onboarding.impl.ui.app_invite.b) this.receiver;
        bVar.getClass();
        if ((p0 instanceof p) || (p0 instanceof d67.q)) {
            IllegalStateException illegalStateException = new IllegalStateException("Unexpected result in App invite flow " + p0);
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        } else if (p0 instanceof r) {
            bVar.l2(new h(bVar, null, 15), new yi5.b(26));
        } else if (p0 instanceof s) {
            yki.a aVar = bVar.u;
            JuniorOnboardingDestination.AppInvite.InputData.NextStep nextStep = bVar.o.f76963c;
            if (Intrinsics.f(nextStep, JuniorOnboardingDestination.AppInvite.InputData.NextStep.AppAccess.f76964a)) {
                appAccess = JuniorAppInviteFlowContract$Step.AppAccess.f76974a;
            } else {
                if (nextStep != null) {
                    throw new NoWhenBranchMatchedException();
                }
                appAccess = null;
            }
            if (appAccess != null) {
                oki.h.t2(bVar, aVar, appAccess, false, null, false, 12);
            } else {
                oki.h.D2(aVar);
            }
        } else {
            if (!(p0 instanceof t)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar.f76983p.a(null, bVar.f76985r.u(), false);
            if (!c70.a.g()) {
                r70.c.b(bVar.f76984q, 3);
                bVar.X1(new k("JUNIOR_INVITE_APP:COPY_DIALOG_ID", new TextLocalisedClause(R$string.junior_app_sharing_prompt_copied, null, null, 14), null, null, null, 28));
            }
        }
        return Unit.f186387a;
    }
}
