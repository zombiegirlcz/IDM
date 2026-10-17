package e62;

import aii.q;
import c12.j;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.models.iris.IrisRegistrationStatus;
import com.revolut.feature.apm.iris.impl.ui.IrisFlowContract$Step;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.revolut.feature_fourthline_impl.R;
import dze.n;
import j62.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l62.f;
import nii.g0;
import nii.j;
import nii.y0;
import oki.h;
import pth.g;
import til.o;
import til.p;
import til.r;
import yji.l;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.iris.impl.ui.a f122887b;

    public /* synthetic */ c(com.revolut.feature.apm.iris.impl.ui.a aVar, int i) {
        this.f122886a = i;
        this.f122887b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f122886a) {
            case 0:
                e it8 = (e) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                h.D2(this.f122887b.u);
                return Unit.f186387a;
            case 1:
                q it9 = (q) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                h.D2(this.f122887b.u);
                return Unit.f186387a;
            case 2:
                f output = (f) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                boolean zF = Intrinsics.f(output, l62.c.f192346a);
                com.revolut.feature.apm.iris.impl.ui.a aVar = this.f122887b;
                if (zF || Intrinsics.f(output, l62.d.f192347a)) {
                    h.D2(aVar.u);
                } else {
                    if (!Intrinsics.f(output, l62.e.f192348a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h.t2(aVar, aVar.u, IrisFlowContract$Step.Intro.f62500a, false, null, false, 12);
                }
                return Unit.f186387a;
            case 3:
                j it10 = (j) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                h.D2(this.f122887b.u);
                return Unit.f186387a;
            case 4:
                d12.d outputData = (d12.d) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                IrisRegistrationStatus irisRegistrationStatus = ((f62.a) outputData).f132373a;
                boolean zF2 = Intrinsics.f(irisRegistrationStatus, IrisRegistrationStatus.Active.f61936a);
                com.revolut.feature.apm.iris.impl.ui.a aVar2 = this.f122887b;
                if (zF2) {
                    h.t2(aVar2, aVar2.u, aVar2.I2(), false, TransitionAnimation.FADE.f98392a, false, 8);
                } else if (irisRegistrationStatus instanceof IrisRegistrationStatus.NotRegistered) {
                    h.t2(aVar2, aVar2.u, new IrisFlowContract$Step.Registration((IrisRegistrationStatus.NotRegistered) irisRegistrationStatus), false, TransitionAnimation.FADE.f98392a, false, 8);
                } else if (irisRegistrationStatus instanceof IrisRegistrationStatus.RemediationRequired) {
                    String str = ((IrisRegistrationStatus.RemediationRequired) irisRegistrationStatus).f61942a;
                    aVar2.C1(((g) aVar2.f62508r).d(new WorkflowConfiguration.Workflow(str, (wi0.b) null, (NaviCommand) null, (String) null, (AnalyticsProduct) null, (WorkflowConfiguration.Extras) null, 126), false, new c(aVar2, 6)));
                } else {
                    if (!(irisRegistrationStatus instanceof IrisRegistrationStatus.Pending)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    l.b1(aVar2, aVar2.X1(new y0("ID_REGISTRATION_PENDING_DIALOG", new g0(new TextLocalisedClause(R$string.apm_registration_pending_dialog_title, null, null, 14), new TextLocalisedClause(R$string.apm_registration_pending_dialog_subtitle, null, null, 14), null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null, null, null, j.b.f216170a, false, null, false, null, 16244), false, 4)), null, new n(aVar2, null, 13), 3);
                }
                return Unit.f186387a;
            case 5:
                q it11 = (q) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                h.D2(this.f122887b.u);
                return Unit.f186387a;
            default:
                r result = (r) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean zF3 = Intrinsics.f(result, til.q.f271586a);
                com.revolut.feature.apm.iris.impl.ui.a aVar3 = this.f122887b;
                if (zF3 || Intrinsics.f(result, til.n.f271581a)) {
                    h.t2(aVar3, aVar3.u, aVar3.I2(), false, TransitionAnimation.NONE.f98393a, false, 8);
                } else {
                    if (!(result instanceof o) && !(result instanceof p)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h.D2(aVar3.u);
                }
                return Unit.f186387a;
        }
    }
}
