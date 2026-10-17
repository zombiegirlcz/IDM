package com.revolut.otp.input.flow.email.flow;

import com.revolut.otp.input.flow.email.flow.ConfirmEmailWithOtpFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import tni.b;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements b {
    public final ConfirmEmailWithOtpFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f98524p;

    public a(ConfirmEmailWithOtpFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        ta8.a aVar = new ta8.a(this, 25);
        this.f98524p = d.a(this, ConfirmEmailWithOtpFlowContract$Step.CheckEmail.f98519a, f0.f322471a, aVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f98524p;
    }
}
