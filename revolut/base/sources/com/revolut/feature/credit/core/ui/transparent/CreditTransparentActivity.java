package com.revolut.feature.credit.core.ui.transparent;

import android.os.Bundle;
import com.bumptech.glide.c;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import jxi.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pri.e;
import te0.w;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/core/ui/transparent/CreditTransparentActivity;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "", "<init>", "()V", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditTransparentActivity extends BaseDelegatesActivity {
    public static final /* synthetic */ int u0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Object f69849r0 = w.y0(new a(7));

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Object f69850s0 = w.y0(new a(8));

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Object f69851t0 = w.y0(new jj2.a(this, 17));

    @Override // nri.b
    public final e F0() {
        Intrinsics.r("component");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF76305t0() {
        return (String) this.f69851t0.getValue();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        Intrinsics.r("component");
        throw null;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c.l(this).b(null, getF76305t0()).getClass();
        throw new ClassCastException();
    }
}
