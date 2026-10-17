package com.revolut.feature_retail_user_declarations.email.flow;

import com.revolut.feature_retail_user_declarations.email.flow.EmailFlowOutputData;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vkm.j2;
import yki.i;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends h implements rai.c {
    public final EmailFlowInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vai.c f97570p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pai.a f97571q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yva.a f97572r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gte.a f97573s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final qki.d f97574t;
    public final i u;

    public d(EmailFlowInputData inputData, vai.c emailVerificationCooldownTimer, pai.a emailVerificationInteractor, yva.a referralCodeInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(emailVerificationCooldownTimer, "emailVerificationCooldownTimer");
        Intrinsics.checkNotNullParameter(emailVerificationInteractor, "emailVerificationInteractor");
        Intrinsics.checkNotNullParameter(referralCodeInteractor, "referralCodeInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f97570p = emailVerificationCooldownTimer;
        this.f97571q = emailVerificationInteractor;
        this.f97572r = referralCodeInteractor;
        this.f97573s = featureToggleInteractor;
        this.f97574t = e.b(this, new EmailFlowContract$State(new EmailFlowOutputData.EmailData("", "", null, false)));
        this.u = d8l.d.a(this, new r6f.i(this, 10));
    }

    public final void I2(EmailFlowOutputData emailFlowOutputData) {
        if (this.o.f97557g) {
            j2 j2Var = this.f97570p.f287301a;
            j2Var.getClass();
            j2Var.g(null, 0L);
        }
        C2(emailFlowOutputData);
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new yi5.b(26));
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.f97574t;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
