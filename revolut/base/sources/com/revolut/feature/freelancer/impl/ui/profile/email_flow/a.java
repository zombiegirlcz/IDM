package com.revolut.feature.freelancer.impl.ui.profile.email_flow;

import com.revolut.feature.freelancer.impl.ui.profile.email_flow.FreelancerEmailFlowContract$Step;
import cp5.d;
import g07.b;
import g07.c;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f74044p;

    public a(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        fv1.a aVar = new fv1.a(this, 13);
        this.f74044p = d.a(this, FreelancerEmailFlowContract$Step.ChangeEmail.f74042a, f0.f322471a, aVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f74044p;
    }
}
