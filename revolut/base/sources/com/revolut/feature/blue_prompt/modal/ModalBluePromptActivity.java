package com.revolut.feature.blue_prompt.modal;

import android.os.Bundle;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls2.b;
import ls2.c;
import os2.a;
import os2.d;
import pri.e;
import te0.w;
import yhm.j;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/blue_prompt/modal/ModalBluePromptActivity;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "Los2/c;", "Los2/d;", "<init>", "()V", "feature_blue_prompt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ModalBluePromptActivity extends BaseDelegatesActivity implements d {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ int f64315t0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public c f64316r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Lazy f64317s0 = j.b(new a(this, 0));

    @Override // nri.b
    public final e F0() {
        c cVar = this.f64316r0;
        if (cVar != null) {
            return (os2.c) cVar.f199607g.get();
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF71175s0() {
        return (String) this.f64317s0.getValue();
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        c cVar = this.f64316r0;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.f64316r0 = new c(((b) com.bumptech.glide.c.l(this).b(null, getF71175s0())).f199601a, rd0.e.g(this, bundle, null));
        ModalBluePromptContract$Configuration modalBluePromptContract$Configuration = (ModalBluePromptContract$Configuration) G0();
        c cVar = this.f64316r0;
        if (cVar == null) {
            Intrinsics.r("component");
            throw null;
        }
        ks2.d dVar = (ks2.d) ((ks2.a) cVar.f199605b.d.get());
        dVar.N0().set(modalBluePromptContract$Configuration.f64319b);
        dVar.B0().set(modalBluePromptContract$Configuration.f64320c);
        dVar.A0().set(modalBluePromptContract$Configuration.d);
        w.s0(dVar.z0(), modalBluePromptContract$Configuration.f);
        w.s0(dVar.C0(), modalBluePromptContract$Configuration.f64321g);
        w.s0(dVar.H0(), modalBluePromptContract$Configuration.k);
        w.s0(dVar.L0(), modalBluePromptContract$Configuration.f64324l);
        w.s0(dVar.F0(), modalBluePromptContract$Configuration.f64328q);
        w.s0(dVar.J0(), modalBluePromptContract$Configuration.f64329r);
        w.s0(dVar.E0(), modalBluePromptContract$Configuration.f64325m);
        w.s0(dVar.I0(), modalBluePromptContract$Configuration.f64326n);
        w.s0(dVar.D0(), modalBluePromptContract$Configuration.f64330s);
        w.s0(dVar.y0(), modalBluePromptContract$Configuration.f64331t);
        dVar.x0().set(modalBluePromptContract$Configuration.f64322h);
        w.s0(dVar.G0(), modalBluePromptContract$Configuration.i);
        w.s0(dVar.K0(), modalBluePromptContract$Configuration.f64323j);
        w.s0(dVar.w0(), modalBluePromptContract$Configuration.e);
        dVar.f189116n.getValue(dVar, ks2.d.f189108y[12]).set(modalBluePromptContract$Configuration.o);
        dVar.M0().set(modalBluePromptContract$Configuration.f64327p);
        super.onCreate(bundle);
    }
}
