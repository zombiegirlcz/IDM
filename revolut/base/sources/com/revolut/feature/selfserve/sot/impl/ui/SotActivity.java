package com.revolut.feature.selfserve.sot.impl.ui;

import android.os.Bundle;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.retail.common.ui.R$id;
import gsi.a;
import hpi.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import opi.b;
import pri.e;
import pyc.g;
import pyc.h0;
import pyc.i;
import pyc.k;
import ryc.c;
import xpi.f;
import ypi.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/selfserve/sot/impl/ui/SotActivity;", "Lhpi/d;", "Lpyc/g;", "Lpyc/k;", "Lcom/revolut/uicomponent/toolbar/app_bar/RevolutToolbar;", "<init>", "()V", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SotActivity extends d implements k {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public c f85902t0;
    public i u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public b f85903v0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final String f85901s0 = "SELF_SERVE_SOT_FLOW";

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final LargeActionButtonDelegate f85904w0 = new LargeActionButtonDelegate();

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final ListCellDelegate f85905x0 = new ListCellDelegate();

    @Override // nri.b
    public final e F0() {
        c cVar = this.f85902t0;
        if (cVar != null) {
            return (g) cVar.I.get();
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF85901s0() {
        return this.f85901s0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final a L0() {
        c cVar = this.f85902t0;
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
        ryc.b bVar = ((ryc.b) com.bumptech.glide.c.l(this).b(null, this.f85901s0)).f258295h;
        xoi.d dVarG = rd0.e.g(this, bundle, Integer.valueOf(R$id.fragment_container));
        f.Companion.getClass();
        c cVar = new c(bVar, dVarG, new h(Integer.valueOf(R$id.next_button), null, null));
        this.f85902t0 = cVar;
        this.u0 = (i) cVar.f258309c.k.get();
        this.f85903v0 = (b) cVar.f258314m.get();
        super.onCreate(bundle);
        if (bundle == null) {
            SotContract$Configuration sotContract$Configuration = (SotContract$Configuration) G0();
            i iVar = this.u0;
            if (iVar == null) {
                Intrinsics.r("state");
                throw null;
            }
            h0 h0Var = (h0) iVar;
            h0Var.i.getValue(h0Var, h0.f240778q[7]).set(Boolean.valueOf(sotContract$Configuration.f85906a));
        }
        b bVar2 = this.f85903v0;
        if (bVar2 != null) {
            bVar2.X(new pyc.a(this, 0));
        } else {
            Intrinsics.r("expandableDialogActivityDelegate");
            throw null;
        }
    }
}
