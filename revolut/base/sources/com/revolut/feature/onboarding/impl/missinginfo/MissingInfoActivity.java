package com.revolut.feature.onboarding.impl.missinginfo;

import android.os.Bundle;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.revolut.retail.common.ui.R$id;
import com.revolut.retail.core.navigation.NaviCommand;
import hpi.h;
import iqi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pri.e;
import xpi.f;
import y99.f0;
import y99.g0;
import y99.i;
import y99.j;
import y99.w;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/onboarding/impl/missinginfo/MissingInfoActivity;", "Lhpi/h;", "Ly99/w;", "Ly99/j;", "Ly99/f0;", "<init>", "()V", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MissingInfoActivity extends h implements j, f0 {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public CoordinatorLayout.Behavior f78287s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f78288t0 = "MISSING_INFO_FLOW";
    public ca9.c u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public i f78289v0;

    @Override // nri.b
    public final e F0() {
        ca9.c cVar = this.u0;
        if (cVar != null) {
            return (w) cVar.C.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF76305t0() {
        return this.f78288t0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        ca9.c cVar = this.u0;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // hpi.d
    public final hpi.c b1() {
        hpi.c cVar = new hpi.c(new hpi.e((Object) null));
        g.Companion.getClass();
        g configuration = g.f167870b;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.i = configuration;
        f.Companion.getClass();
        f configuration2 = f.d;
        Intrinsics.checkNotNullParameter(configuration2, "configuration");
        cVar.f = configuration2;
        cVar.e = true;
        return cVar;
    }

    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ca9.d dVar = ((ca9.d) com.bumptech.glide.c.l(this).b(null, this.f78288t0)).f22562g;
        xoi.d dVarG = rd0.e.g(this, bundle, Integer.valueOf(R$id.fragment_container));
        ypi.h.Companion.getClass();
        f.Companion.getClass();
        g.Companion.getClass();
        ca9.c cVar = new ca9.c(dVar, dVarG);
        this.u0 = cVar;
        this.f78289v0 = (i) cVar.f22543b.f22564j.get();
        super.onCreate(bundle);
        if (bundle == null) {
            MissingInfoInternalContract$Configuration missingInfoInternalContract$Configuration = (MissingInfoInternalContract$Configuration) G0();
            NaviCommand naviCommand = missingInfoInternalContract$Configuration.f78295b;
            if (naviCommand != null) {
                i iVar = this.f78289v0;
                if (iVar == null) {
                    Intrinsics.r("flowState");
                    throw null;
                }
                g0 g0Var = (g0) iVar;
                g0Var.f.getValue(g0Var, g0.f311775p[4]).set(naviCommand);
            }
            i iVar2 = this.f78289v0;
            if (iVar2 != null) {
                ((g0) iVar2).z0().set(missingInfoInternalContract$Configuration.f78294a);
            } else {
                Intrinsics.r("flowState");
                throw null;
            }
        }
    }
}
