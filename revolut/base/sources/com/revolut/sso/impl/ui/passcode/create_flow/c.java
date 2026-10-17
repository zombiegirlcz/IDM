package com.revolut.sso.impl.ui.passcode.create_flow;

import com.revolut.sso.impl.ui.passcode.create_flow.CreatePasscodeFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qki.d;
import zhm.f0;
import znl.e;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends h implements znl.b {

    @NotNull
    public static final e Companion = new e();
    public final CreatePasscodeFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hzl.e f106607p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f106608q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f106609r;

    public c(CreatePasscodeFlowContract$InputData inputData, hzl.e pinCodeValidator) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pinCodeValidator, "pinCodeValidator");
        this.o = inputData;
        this.f106607p = pinCodeValidator;
        zba.a aVar = new zba.a(this, 29);
        this.f106608q = cp5.d.a(this, CreatePasscodeFlowContract$Step.Create.f106606a, f0.f322471a, aVar);
        this.f106609r = hx7.e.b(this, new CreatePasscodeFlowContract$State(""));
    }

    @Override // qki.e
    public final d getState() {
        return this.f106609r;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f106608q;
    }
}
