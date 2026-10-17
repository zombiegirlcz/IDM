package com.revolut.feature.apm.breb.impl.flow;

import com.revolut.feature.apm.breb.impl.flow.BrebFlowContract$Step;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import or4.i;
import ov1.b;
import ov1.e;
import rs1.c;
import rv1.t;
import sv1.d;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements b {
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gte.a f61719p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f61720q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wj0.a f61721r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zu1.a f61722s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f61723t;
    public final c u;
    public final yki.a v;

    public a(e nextStep, gte.a featureToggleInteractor, t onboardingInteractor, wj0.a idempotencyKeyHolder, zu1.a interactor, d dialogsProvider, c entryExtension) {
        Intrinsics.checkNotNullParameter(nextStep, "nextStep");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(dialogsProvider, "dialogsProvider");
        Intrinsics.checkNotNullParameter(entryExtension, "entryExtension");
        this.o = nextStep;
        this.f61719p = featureToggleInteractor;
        this.f61720q = onboardingInteractor;
        this.f61721r = idempotencyKeyHolder;
        this.f61722s = interactor;
        this.f61723t = dialogsProvider;
        this.u = entryExtension;
        i iVar = new i(this, 8);
        this.v = cp5.d.a(this, BrebFlowContract$Step.Intro.f61715a, f0.f322471a, iVar);
    }

    public static BrebFlowContract$Step I2(e eVar) {
        if (eVar instanceof ov1.c) {
            return new BrebFlowContract$Step.Area(((ov1.c) eVar).f229947a);
        }
        if (eVar instanceof ov1.d) {
            return new BrebFlowContract$Step.Transfer(((ov1.d) eVar).f229948a);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // yji.l
    public final void I1() {
        this.f61721r.a("IDEMPOTENCY_TAG_CHECK_ALIAS_AVAILABILITY");
    }

    @Override // yji.l
    public final void O1() {
        s1();
    }

    @Override // yki.g
    public final yki.b s() {
        return this.v;
    }
}
