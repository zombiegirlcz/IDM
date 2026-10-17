package com.revolut.feature.pay_with_smile.impl.ui.flow.create_passcode;

import ang.f;
import com.revolut.feature.pay_with_smile.impl.ui.flow.create_passcode.CreatePasscodeFlowContract$Step;
import hzl.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import oki.h;
import ql9.d;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends h implements zl9.b {
    public final CreatePasscodeFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f78963p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f78964q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f78965r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f78966s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final qki.d f78967t;

    public c(CreatePasscodeFlowContract$InputData inputData, e pinCodeValidator, f userInteractor, d biometricPaymentsRepository) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pinCodeValidator, "pinCodeValidator");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(biometricPaymentsRepository, "biometricPaymentsRepository");
        this.o = inputData;
        this.f78963p = pinCodeValidator;
        this.f78964q = userInteractor;
        this.f78965r = biometricPaymentsRepository;
        zba.a aVar = new zba.a(this, 24);
        this.f78966s = cp5.d.a(this, CreatePasscodeFlowContract$Step.Create.f78962a, f0.f322471a, aVar);
        m70.a.c(t0.f186434a);
        this.f78967t = hx7.e.b(this, new CreatePasscodeFlowContract$State(""));
    }

    @Override // yji.l
    public final void I1() {
        l2(new yzb.c(this, null, 25), new yi5.b(26));
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.f78967t;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f78966s;
    }
}
