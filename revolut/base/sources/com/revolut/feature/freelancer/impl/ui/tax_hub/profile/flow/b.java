package com.revolut.feature.freelancer.impl.ui.tax_hub.profile.flow;

import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.flow.TaxHubProfileFlowContract$Step;
import ds6.j;
import hx7.e;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import x37.c;
import yki.i;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements x37.b {
    public final TaxHubProfileFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a61.a f74357p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f74358q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f74359r;

    public b(TaxHubProfileFlowContract$InputData inputData, a61.a taxConfigurationInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(taxConfigurationInteractor, "taxConfigurationInteractor");
        this.o = inputData;
        this.f74357p = taxConfigurationInteractor;
        this.f74358q = d8l.d.a(this, new x2g.b(this, 3));
        this.f74359r = e.b(this, new TaxHubProfileFlowContract$State(inputData.f74353a));
    }

    @Override // yki.j
    public final void M0() {
        Set set = this.o.f74353a;
        j jVar = j.INCOME;
        boolean zContains = set.contains(jVar);
        i iVar = this.f74358q;
        if (zContains) {
            h.t2(this, iVar, new TaxHubProfileFlowContract$Step.CreateProfile(jVar), true, null, false, 12);
            return;
        }
        j jVar2 = j.VAT;
        if (set.contains(jVar2)) {
            h.t2(this, iVar, new TaxHubProfileFlowContract$Step.CreateProfile(jVar2), true, null, false, 12);
            return;
        }
        j jVar3 = j.SOCIAL_SECURITY;
        if (set.contains(jVar3)) {
            h.t2(this, iVar, new TaxHubProfileFlowContract$Step.CreateProfile(jVar3), true, null, false, 12);
        } else {
            C2(c.f302700a);
        }
    }

    @Override // qki.e
    public final d getState() {
        return this.f74359r;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f74358q;
    }
}
