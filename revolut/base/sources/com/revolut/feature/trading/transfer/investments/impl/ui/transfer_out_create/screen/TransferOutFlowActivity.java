package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create.screen;

import a0.d;
import android.os.Bundle;
import com.bumptech.glide.c;
import com.revolut.feature.trading.transfer.investments.api.navigation.TransferOutFeatureConfig;
import com.revolut.retail.common.ui.R$id;
import gsi.a;
import hqi.k;
import iqi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l9f.k;
import pri.e;
import qc0.b;
import qc0.i;
import xpi.f;
import zc0.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_out_create/screen/TransferOutFlowActivity;", "Lqc0/b;", "Lqc0/i;", "Lqc0/l;", "<init>", "()V", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferOutFlowActivity extends b {
    public waf.b G0;
    public final String H0 = "TRANSFER_OUT_FLOW";

    @Override // nri.b
    public final e F0() {
        waf.b bVar = this.G0;
        if (bVar != null) {
            return (i) bVar.R.get();
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF82699s0() {
        return this.H0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final a L0() {
        waf.b bVar = this.G0;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // qc0.b
    public final h Z0() {
        waf.b bVar = this.G0;
        if (bVar != null) {
            return (h) bVar.c0.get();
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // qc0.b, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        TransferOutFeatureConfig.TransferOut transferOut = (TransferOutFeatureConfig.TransferOut) G0();
        phm.a aVar = (phm.a) ue0.e.j(this).a().get(k.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(d.q("Api ", k.class, " is not found"));
        }
        k kVar = (k) aVar2.b();
        waf.d dVar = ((waf.d) ((waf.e) c.l(this).b(transferOut, this.H0))).f295917l;
        xoi.d dVarG = rd0.e.g(this, bundle, Integer.valueOf(R$id.fragment_container));
        n9f.a aVar3 = (n9f.a) kVar.B.get();
        aVar3.getClass();
        f.Companion.getClass();
        ypi.h.Companion.getClass();
        waf.b bVar = new waf.b(dVar, dVarG, ypi.h.a(ypi.h.e, null, Integer.valueOf(com.revolut.core.backend_flow.R$id.bottom_note_text), 3), new hqi.i(Integer.valueOf(com.revolut.core.backend_flow.R$id.toolbar_progress), k.a.f154719a), new g(R$id.twinVerticalButton), transferOut, aVar3);
        this.G0 = bVar;
        this.f244393r0 = (qc0.k) bVar.f295889g.o.get();
        this.f244394s0 = (zd7.b) bVar.f295887b0.get();
        super.onCreate(bundle);
    }
}
