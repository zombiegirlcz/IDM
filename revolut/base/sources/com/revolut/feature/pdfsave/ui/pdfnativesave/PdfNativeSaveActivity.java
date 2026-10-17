package com.revolut.feature.pdfsave.ui.pdfnativesave;

import android.os.Bundle;
import com.bumptech.glide.c;
import com.revolut.feature.pdfsave.R$id;
import com.revolut.feature.pdfsave.R$layout;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import iv0.p;
import j7a.f;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import poa.a;
import poa.b;
import pri.e;
import yhm.j;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pdfsave/ui/pdfnativesave/PdfNativeSaveActivity;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "Lj7a/e;", "Lj7a/f;", "<init>", "()V", "feature_pdf_save_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PdfNativeSaveActivity extends BaseDelegatesActivity implements f {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ int f80315t0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public a f80316r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Lazy f80317s0 = j.b(new p(this, 17));

    @Override // nri.b
    public final e F0() {
        a aVar = this.f80316r0;
        if (aVar != null) {
            return (j7a.e) aVar.f237950h.get();
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF81394t0() {
        return (String) this.f80317s0.getValue();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        a aVar = this.f80316r0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.f80316r0 = new a(((b) c.l(this).b(null, getF81394t0())).f237953c, rd0.e.g(this, bundle, null), (PdfNativeSaveContract$Configuration) G0(), new h7a.a(R$id.webView));
        super.onCreate(bundle);
        setContentView(R$layout.activity_pdf_save);
    }
}
