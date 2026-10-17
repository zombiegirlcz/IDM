package svk;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowControllerDescriptor$InputData;
import hdh.f;
import hdh.h;
import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zjh.f f266033l;

    public c(zjh.f ipoInstrumentInteractor) {
        Intrinsics.checkNotNullParameter(ipoInstrumentInteractor, "ipoInstrumentInteractor");
        this.f266033l = ipoInstrumentInteractor;
    }

    @Override // hdh.f
    public final void Z2(h request, kul.b proceed) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proceed, "proceed");
        n nVarN = request.f151439b.n();
        if (nVarN.b()) {
            V2(new b(this, nVarN, proceed, null), new yi5.b(29));
        } else {
            proceed.invoke();
        }
    }

    public final ViewController b3(String str) {
        return o2(new til.c(new WorkflowControllerDescriptor$InputData(new WorkflowConfiguration.Workflow(str, (wi0.b) null, (NaviCommand) null, (String) null, (AnalyticsProduct) null, (WorkflowConfiguration.Extras) null, 126), null, null, 58)));
    }
}
