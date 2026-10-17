package com.revolut.feature.insurance_pet.impl.ui.hub.flow;

import android.os.Bundle;
import com.revolut.retail.common.ui.R$id;
import gsi.a;
import hpi.c;
import hpi.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vy7.e;
import vy7.i;
import vy7.n;
import xpi.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/hub/flow/PetHubFlowActivity;", "Lhpi/d;", "Lvy7/i;", "Lvy7/e;", "Lcom/revolut/uicomponent/toolbar/app_bar/RevolutToolbar;", "<init>", "()V", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PetHubFlowActivity extends d implements e {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public wy7.e f76310s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f76311t0 = "PET_HUB_FLOW";

    @Override // nri.b
    public final pri.e F0() {
        wy7.e eVar = this.f76310s0;
        if (eVar != null) {
            return (i) eVar.A.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF81394t0() {
        return this.f76311t0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final a L0() {
        wy7.e eVar = this.f76310s0;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // hpi.d
    public final c b1() {
        c cVar = new c(new hpi.e((Object) null));
        f.Companion.getClass();
        f configuration = f.d;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.f = configuration;
        return cVar;
    }

    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        wy7.f fVar = ((wy7.f) com.bumptech.glide.c.l(this).b(null, this.f76311t0)).d;
        xoi.d dVarG = rd0.e.g(this, bundle, Integer.valueOf(R$id.fragment_container));
        f.Companion.getClass();
        this.f76310s0 = new wy7.e(fVar, dVarG);
        boolean z = ((PetHubFlowContract$Configuration) G0()).f76312a;
        wy7.e eVar = this.f76310s0;
        if (eVar == null) {
            Intrinsics.r("activityComponent");
            throw null;
        }
        n nVar = (n) ((vy7.d) eVar.f301128b.F.get());
        nVar.w0().set(Boolean.valueOf(z));
        nVar.x0().set(z ? vy7.c.LOADING : vy7.c.HUB);
        super.onCreate(bundle);
    }
}
