package com.revolut.feature.credit.application.plugins.impl.ui.transparent;

import aj4.b;
import android.os.Bundle;
import bj4.a;
import com.bumptech.glide.c;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pri.e;
import yhm.d;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/transparent/TransparentKompotDestinationActivity;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "Laj4/d;", "Laj4/b;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class TransparentKompotDestinationActivity extends BaseDelegatesActivity implements b {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final String f68491r0 = "TRANSPARENT_KOMPOT_DESTINATION_FLOW";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public a f68492s0;

    @Override // nri.b
    public final e F0() {
        a aVar = this.f68492s0;
        if (aVar != null) {
            return (aj4.d) aVar.f15556n.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF96906t0() {
        return this.f68491r0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        a aVar = this.f68492s0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.f68492s0 = new a(((bj4.b) c.l(this).b(null, this.f68491r0)).f15558b, rd0.e.g(this, bundle, null), (TransparentKompotDestinationContract$Configuration) G0());
        super.onCreate(bundle);
    }

    @Override // nri.b, in0.g
    public final boolean p0() {
        return true;
    }
}
