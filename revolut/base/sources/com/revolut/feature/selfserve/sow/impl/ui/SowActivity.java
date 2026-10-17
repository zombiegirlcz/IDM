package com.revolut.feature.selfserve.sow.impl.ui;

import android.os.Bundle;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.retail.common.ui.R$id;
import gsi.a;
import hpi.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import opi.b;
import ozc.g;
import ozc.i;
import ozc.s0;
import pri.e;
import vzc.c;
import xpi.f;
import ypi.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/selfserve/sow/impl/ui/SowActivity;", "Lhpi/d;", "Lozc/e;", "Lozc/i;", "Lcom/revolut/uicomponent/toolbar/app_bar/RevolutToolbar;", "<init>", "()V", "feature_selfserve_sow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SowActivity extends d implements i {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public c f85955t0;
    public g u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public b f85956v0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final String f85954s0 = "SELF_SERVE_SOW_FLOW";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final LargeActionButtonDelegate f85957w0 = new LargeActionButtonDelegate();

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final ListCellDelegate f85958x0 = new ListCellDelegate();

    @Override // nri.b
    public final e F0() {
        c cVar = this.f85955t0;
        if (cVar != null) {
            return (ozc.e) cVar.I.get();
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF85954s0() {
        return this.f85954s0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final a L0() {
        c cVar = this.f85955t0;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // hpi.d
    public final hpi.c b1() {
        hpi.c cVar = new hpi.c(new hpi.e((Object) null));
        f.Companion.getClass();
        f configuration = f.d;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.f = configuration;
        hpi.c.b(cVar);
        return cVar;
    }

    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        vzc.b bVar = ((vzc.b) com.bumptech.glide.c.l(this).b(null, this.f85954s0)).i;
        xoi.d dVarG = rd0.e.g(this, bundle, Integer.valueOf(R$id.fragment_container));
        f.Companion.getClass();
        h.Companion.getClass();
        c cVar = new c(bVar, dVarG);
        this.f85955t0 = cVar;
        this.u0 = (g) cVar.f293467b.f293458p.get();
        this.f85956v0 = (b) cVar.f293472l.get();
        super.onCreate(bundle);
        SowContract$Configuration sowContract$Configuration = (SowContract$Configuration) I0();
        boolean z = sowContract$Configuration != null ? sowContract$Configuration.f85959a : false;
        g gVar = this.u0;
        if (gVar == null) {
            Intrinsics.r("state");
            throw null;
        }
        ((s0) gVar).Q0().set(Boolean.valueOf(z));
        b bVar2 = this.f85956v0;
        if (bVar2 != null) {
            bVar2.X(new os2.a(this, 11));
        } else {
            Intrinsics.r("expandableDialogActivityDelegate");
            throw null;
        }
    }
}
