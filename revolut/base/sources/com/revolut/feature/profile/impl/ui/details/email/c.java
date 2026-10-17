package com.revolut.feature.profile.impl.ui.details.email;

import ang.f;
import com.revolut.feature.profile.impl.ui.details.email.VerifyEmailFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import oki.h;
import qki.d;
import v60.e;
import yki.i;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends h implements sma.b {
    public final VerifyEmailFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f81385p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l80.h f81386q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sf0.h f81387r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f81388s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f81389t;
    public final d u;

    public c(VerifyEmailFlowContract$InputData inputData, f userInteractor, l80.h timeProvider, sf0.h serverErrorParser, e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        this.o = inputData;
        this.f81385p = userInteractor;
        this.f81386q = timeProvider;
        this.f81387r = serverErrorParser;
        this.f81388s = serverErrorsProvider;
        this.f81389t = d8l.d.a(this, new scl.h(this, 18));
        this.u = hx7.e.b(this, new VerifyEmailFlowContract$State(0));
    }

    @Override // yki.j
    public final void M0() {
        String str = this.o.f81377a;
        if (str == null || d0.W(str)) {
            l2(new a(this, null), new yi5.b(26));
        } else {
            h.t2(this, this.f81389t, VerifyEmailFlowContract$Step.ConfirmationInProgress.f81380a, false, null, false, 12);
        }
    }

    @Override // qki.e
    public final d getState() {
        return this.u;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f81389t;
    }
}
