package j72;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import im9.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import nii.y0;
import nii.z;
import pth.g;
import r10.t;
import r10.w;
import til.m;
import yji.n;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends n implements a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f171835l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m f171836m;

    public b(t provider, m workflowFlowProvider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(workflowFlowProvider, "workflowFlowProvider");
        this.f171835l = provider;
        this.f171836m = workflowFlowProvider;
    }

    public final void Z2(n1 dialogResult, Function0 onFinish) {
        Intrinsics.checkNotNullParameter(dialogResult, "dialogResult");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        if ((dialogResult instanceof j1) || (dialogResult instanceof k1) || (dialogResult instanceof m1)) {
            onFinish.invoke();
        } else {
            if (!(dialogResult instanceof l1)) {
                throw new NoWhenBranchMatchedException();
            }
            FinishCommand finishCommand = new FinishCommand(null, null, null, 7);
            Parcelable parcelableA = ((l1) dialogResult).f216190a.a();
            FeatureConfig featureConfig = parcelableA instanceof FeatureConfig ? (FeatureConfig) parcelableA : null;
            A2(u0.b(com.revolut.retail.core.navigation.a.c(finishCommand, featureConfig != null ? gc0.c.f(featureConfig) : null)));
        }
    }

    public final boolean b3(Throwable throwable, Function0 onFinish) {
        String str;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        t tVar = this.f171835l;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        c cVarH = ((w) tVar.f250857a).h(throwable);
        if (cVarH != null && (str = cVarH.f171839c) != null) {
            A2(((g) this.f171836m).d(new WorkflowConfiguration.Workflow(str, (wi0.b) null, (NaviCommand) null, (String) null, (AnalyticsProduct) null, (WorkflowConfiguration.Extras) null, 126), false, new j4h.m(onFinish, this, 15)));
            return true;
        }
        z zVarE = tVar.e(throwable);
        if (zVarE == null) {
            return false;
        }
        n.j2(this, L2(new y0(null, zVarE, false, 5)), null, new h(this, onFinish, (Continuation) null, 5), 3);
        return true;
    }
}
