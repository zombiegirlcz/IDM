package com.revolut.feature.insurance_pet.impl.ui.add.flow;

import android.os.Bundle;
import com.revolut.retail.common.ui.R$id;
import hpi.c;
import hpi.d;
import iqi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx7.f;
import nx7.u;
import ox7.a;
import ox7.b;
import pri.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/add/flow/PetAddFlowActivity;", "Lhpi/d;", "Lnx7/u;", "Lnx7/f;", "Lcom/revolut/uicomponent/toolbar/app_bar/RevolutToolbar;", "<init>", "()V", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PetAddFlowActivity extends d implements f {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public a f76228s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f76229t0 = "PET_ADD_FLOW";

    @Override // nri.b
    public final e F0() {
        a aVar = this.f76228s0;
        if (aVar != null) {
            return (u) aVar.B.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF96906t0() {
        return this.f76229t0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        a aVar = this.f76228s0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // hpi.d
    public final c b1() {
        c cVar = new c(new hpi.e((Object) null));
        xpi.f.Companion.getClass();
        xpi.f configuration = xpi.f.d;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        cVar.f = configuration;
        g.Companion.getClass();
        g configuration2 = g.f167870b;
        Intrinsics.checkNotNullParameter(configuration2, "configuration");
        cVar.i = configuration2;
        cVar.e = true;
        return cVar;
    }

    @Override // hpi.d, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        b bVar = ((b) com.bumptech.glide.c.l(this).b(null, this.f76229t0)).e;
        xoi.d dVarG = rd0.e.g(this, bundle, Integer.valueOf(R$id.fragment_container));
        xpi.f.Companion.getClass();
        g.Companion.getClass();
        this.f76228s0 = new a(bVar, dVarG);
        super.onCreate(bundle);
    }
}
