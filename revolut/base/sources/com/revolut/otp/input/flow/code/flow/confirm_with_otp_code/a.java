package com.revolut.otp.input.flow.code.flow.confirm_with_otp_code;

import com.revolut.otp.input.flow.code.flow.confirm_with_otp_code.ConfirmWithOtpCodeFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import lni.c;
import oki.h;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements c {
    public final ConfirmWithOtpCodeFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f98507p;

    public a(ConfirmWithOtpCodeFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        lcc.c cVar = new lcc.c(this, 27);
        this.f98507p = d.a(this, ConfirmWithOtpCodeFlowContract$Step.OtpInput.f98505a, f0.f322471a, cVar);
    }

    @Override // yki.g
    public final b s() {
        return this.f98507p;
    }
}
