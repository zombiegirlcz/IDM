package com.revolut.feature.pdfsave.ui.fullscreen;

import android.os.Bundle;
import com.bumptech.glide.c;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import gsi.a;
import hq1.f;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pri.e;
import yhm.j;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pdfsave/ui/fullscreen/PdfFullscreenActivity;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "", "<init>", "()V", "feature_pdf_save_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PdfFullscreenActivity extends BaseDelegatesActivity {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ int f80310s0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Lazy f80311r0 = j.b(new f(this, 20));

    @Override // nri.b
    public final e F0() {
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF77819s0() {
        return (String) this.f80311r0.getValue();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final a L0() {
        Intrinsics.r("component");
        throw null;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c.l(this).b(null, getF77819s0()).getClass();
        throw new ClassCastException();
    }
}
