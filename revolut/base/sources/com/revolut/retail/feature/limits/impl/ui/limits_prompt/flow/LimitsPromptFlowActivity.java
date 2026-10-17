package com.revolut.retail.feature.limits.impl.ui.limits_prompt.flow;

import android.os.Bundle;
import com.bumptech.glide.c;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import nzj.b;
import nzj.d;
import nzj.e;
import nzj.q;
import ozj.a;
import te0.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/limits/impl/ui/limits_prompt/flow/LimitsPromptFlowActivity;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "Lnzj/b;", "Lnzj/e;", "<init>", "()V", "feature_retail_limits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LimitsPromptFlowActivity extends BaseDelegatesActivity implements e {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final String f101785r0 = "LIMITS_PROMPT_FLOW";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public a f101786s0;

    @Override // nri.b
    public final pri.e F0() {
        a aVar = this.f101786s0;
        if (aVar != null) {
            return (b) aVar.f231366n.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF96906t0() {
        return this.f101785r0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        a aVar = this.f101786s0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.f101786s0 = new a(((ozj.b) c.l(this).b(null, this.f101785r0)).f231370g, rd0.e.g(this, bundle, null));
        LimitsPromptFlowContract$Configuration limitsPromptFlowContract$Configuration = (LimitsPromptFlowContract$Configuration) G0();
        a aVar = this.f101786s0;
        if (aVar == null) {
            Intrinsics.r("activityComponent");
            throw null;
        }
        q qVar = (q) ((d) aVar.f231359b.k.get());
        j jVar = qVar.f221090b;
        KProperty[] kPropertyArr = q.e;
        jVar.getValue(qVar, kPropertyArr[0]).set(limitsPromptFlowContract$Configuration.f101787a);
        qVar.f221091c.getValue(qVar, kPropertyArr[1]).set(limitsPromptFlowContract$Configuration.f101788b);
        super.onCreate(bundle);
    }
}
