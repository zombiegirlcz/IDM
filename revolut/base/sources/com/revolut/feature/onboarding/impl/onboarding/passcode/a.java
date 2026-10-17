package com.revolut.feature.onboarding.impl.onboarding.passcode;

import cli.g;
import cli.n;
import cli.y;
import jb9.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements e {
    public final hzl.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f78464p;

    public a(PasscodeCollectionScreenContract$InputData inputData, n stateMapper, hzl.e pinCodeValidator) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(pinCodeValidator, "pinCodeValidator");
        this.o = pinCodeValidator;
        this.f78464p = d.b(this, new jb9.a(inputData.f78460a, false), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.f78464p;
    }
}
