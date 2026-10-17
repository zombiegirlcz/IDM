package com.revolut.retail.feature.trading_onboarding.impl.ui.extended_hours.extended_hours_screen;

import android.os.Bundle;
import com.revolut.retail.common.ui.R$id;
import com.revolut.retail.feature.trading_onboarding.impl.ui.extended_hours.ExtendedHoursBackendFlowContract$Configuration;
import gsi.a;
import hqi.k;
import iqi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pri.e;
import qc0.b;
import qc0.i;
import te0.w;
import xpi.f;
import yyk.c;
import yyk.d;
import zc0.h;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/extended_hours/extended_hours_screen/ExtendedHoursBackendFlowActivity;", "Lqc0/b;", "Lqc0/i;", "Lqc0/l;", "<init>", "()V", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExtendedHoursBackendFlowActivity extends b {
    public static final /* synthetic */ int J0 = 0;
    public yyk.b G0;
    public final Object H0 = w.y0(new zh0.b(this, 24));
    public final String I0 = "TRADING_ONBOARDING_EXTENDED_HOURS_FLOW";

    @Override // nri.b
    public final e F0() {
        yyk.b bVar = this.G0;
        if (bVar != null) {
            return (i) bVar.P.get();
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF82699s0() {
        return this.I0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final a L0() {
        yyk.b bVar = this.G0;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("component");
        throw null;
    }

    @Override // qc0.b
    public final h Z0() {
        yyk.b bVar = this.G0;
        if (bVar != null) {
            return (h) bVar.f317961a0.get();
        }
        Intrinsics.r("component");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qc0.b, com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c cVar = ((c) ((d) com.bumptech.glide.c.l(this).b(null, this.I0))).f317988j;
        xoi.d dVarG = rd0.e.g(this, bundle, Integer.valueOf(R$id.fragment_container));
        f.Companion.getClass();
        ypi.h.Companion.getClass();
        ypi.h hVarA = ypi.h.a(ypi.h.e, null, Integer.valueOf(com.revolut.core.backend_flow.R$id.bottom_note_text), 3);
        hqi.i iVar = new hqi.i(Integer.valueOf(com.revolut.core.backend_flow.R$id.toolbar_progress), k.a.f154719a);
        g gVar = new g(R$id.twinVerticalButton);
        ?? r06 = this.H0;
        ((ExtendedHoursBackendFlowContract$Configuration) r06.getValue()).getClass();
        yyk.b bVar = new yyk.b(cVar, dVarG, hVarA, iVar, gVar);
        this.G0 = bVar;
        c cVar2 = bVar.e;
        this.f244393r0 = (qc0.k) cVar2.f317996q.get();
        this.f244394s0 = (zd7.b) bVar.Z.get();
        xyk.b bVar2 = (xyk.b) cVar2.f317996q.get();
        if (bVar2 == null) {
            Intrinsics.r("state");
            throw null;
        }
        ((xyk.e) bVar2).w0().set((ExtendedHoursBackendFlowContract$Configuration) r06.getValue());
        super.onCreate(bundle);
    }
}
