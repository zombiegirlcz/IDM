package com.revolut.retail.feature.pod_nominees.impl.flow;

import com.revolut.retail.feature.pod_nominees.api.navigation.PodNomineesFlowUseCase;
import com.revolut.retail.feature.pod_nominees.impl.flow.PodNomineesFlowContract$Step;
import d8l.d;
import kgm.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements pek.b {
    public final PodNomineesFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f102614p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qek.a f102615q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f102616r;

    public b(PodNomineesFlowContract$InputData inputData, c reuthInteractor, qek.a podNomineeDialogMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(reuthInteractor, "reuthInteractor");
        Intrinsics.checkNotNullParameter(podNomineeDialogMapper, "podNomineeDialogMapper");
        this.o = inputData;
        this.f102614p = reuthInteractor;
        this.f102615q = podNomineeDialogMapper;
        this.f102616r = d.a(this, new p5f.c(this, 15));
    }

    @Override // yki.j
    public final void M0() {
        PodNomineesFlowUseCase podNomineesFlowUseCase = this.o.f102606a;
        if (podNomineesFlowUseCase instanceof PodNomineesFlowUseCase.Profile) {
            l2(new a(this, null), new yi5.b(26));
        } else {
            if (!(podNomineesFlowUseCase instanceof PodNomineesFlowUseCase.Onboarding)) {
                throw new NoWhenBranchMatchedException();
            }
            h.t2(this, this.f102616r, new PodNomineesFlowContract$Step.AddPodNominee(true), false, null, false, 12);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f102616r;
    }
}
