package com.revolut.retail.feature.esim.impl.ui.flows.troubleshooting;

import com.revolut.retail.feature.esim.impl.ui.flows.troubleshooting.EsimConnectivityTroubleshootingFlowContract$Step;
import dfj.z2;
import kotlin.jvm.internal.Intrinsics;
import sfj.d;
import u7k.w;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends d implements ugj.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f100902r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(z2 esimRestrictionsInteractor) {
        super(esimRestrictionsInteractor, a.f);
        Intrinsics.checkNotNullParameter(esimRestrictionsInteractor, "esimRestrictionsInteractor");
        w wVar = new w(this, 18);
        this.f100902r = cp5.d.a(this, EsimConnectivityTroubleshootingFlowContract$Step.Suggestions.f100901a, f0.f322471a, wVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f100902r;
    }
}
