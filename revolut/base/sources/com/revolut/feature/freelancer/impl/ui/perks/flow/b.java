package com.revolut.feature.freelancer.impl.ui.perks.flow;

import d8l.d;
import gr6.p;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vmf.k;
import vvc.s;
import vz6.c;
import yki.i;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements vz6.b {
    public final p o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final FreelancerPerksFlowContract$InputData f74012p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f74013q;

    public b(p freelancerProductArticleInteractor, FreelancerPerksFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(freelancerProductArticleInteractor, "freelancerProductArticleInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = freelancerProductArticleInteractor;
        this.f74012p = inputData;
        this.f74013q = d.a(this, new s(this, 4));
    }

    @Override // yki.j
    public final void M0() {
        l2(new k(this, null, 16), new c(this, 0));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f74013q;
    }
}
