package hi5;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowType;
import grl.k9;
import ji5.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import til.m;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends th5.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final hc5.a f152505l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i f152506m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m f152507n;

    public h(hc5.a cryptoAccountInteractor, i cryptoOnboardingInteractor, m workflowFlowDestinationProvider) {
        Intrinsics.checkNotNullParameter(cryptoAccountInteractor, "cryptoAccountInteractor");
        Intrinsics.checkNotNullParameter(cryptoOnboardingInteractor, "cryptoOnboardingInteractor");
        Intrinsics.checkNotNullParameter(workflowFlowDestinationProvider, "workflowFlowDestinationProvider");
        this.f152505l = cryptoAccountInteractor;
        this.f152506m = cryptoOnboardingInteractor;
        this.f152507n = workflowFlowDestinationProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // th5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(ec5.i r8, vqd.b r9, gim.c r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hi5.h.Z2(ec5.i, vqd.b, gim.c):java.lang.Object");
    }

    public final void b3(String str, Function0 function0) throws Throwable {
        if (str == null) {
            hx7.e.n(new Exception("rfiWorkflowId is null"));
            return;
        }
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = k9.Crypto;
        companion.getClass();
        N2(m.b(this.f152507n, new WorkflowConfiguration.Workflow(str, (wi0.b) null, (NaviCommand) null, (String) null, AnalyticsProduct.Companion.b(k9Var), (WorkflowConfiguration.Extras) null, LDSFile.EF_DG14_TAG), WorkflowFlowType.Inner.f105817a, null, 60), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a, new ac1.b(8, function0));
    }
}
