package com.revolut.retail.core.navigation.pendingintent;

import android.os.Bundle;
import bq.i;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.ByIdFeatureConfig;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import gsi.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import sri.m;
import vri.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00062\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/retail/core/navigation/pendingintent/PendingIntentFeatureNavigationActivity;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "Lpri/e;", "Lrri/a;", "<init>", "()V", "Companion", "a", "retail_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PendingIntentFeatureNavigationActivity extends BaseDelegatesActivity {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public b f98682r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public m f98683s0;

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF77819s0() {
        return null;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final a L0() {
        b bVar = this.f98682r0;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        vri.a aVar = new vri.a();
        aVar.f291607a = e.g(this, bundle, null);
        b bVar = (b) aVar.build();
        this.f98682r0 = bVar;
        this.f98683s0 = i.l(bVar.f291608a);
        super.onCreate(bundle);
        m mVar = this.f98683s0;
        if (mVar == null) {
            Intrinsics.r("navigator");
            throw null;
        }
        FeatureConfig featureConfig = (FeatureConfig) getIntent().getParcelableExtra("ARG_FEATURE_CONFIG");
        String stringExtra = getIntent().getStringExtra("ARG_FEATURE_ID");
        ByIdFeatureConfig byIdFeatureConfig = stringExtra != null ? new ByIdFeatureConfig(stringExtra) : null;
        NaviCommand featureCommand = (NaviCommand) getIntent().getParcelableExtra("ARG_NAVI_COMMAND");
        if (featureConfig != null) {
            featureCommand = new FeatureCommand(featureConfig);
        } else if (byIdFeatureConfig != null) {
            featureCommand = new FeatureCommand(byIdFeatureConfig);
        } else if (featureCommand == null) {
            throw new IllegalStateException("feature config or command must present for pending intent");
        }
        mVar.c(featureCommand);
        finish();
    }
}
