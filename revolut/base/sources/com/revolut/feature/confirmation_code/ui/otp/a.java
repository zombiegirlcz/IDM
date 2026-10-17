package com.revolut.feature.confirmation_code.ui.otp;

import a82.s;
import cli.y;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.confirmation_code.ui.otp.ESignOtpScreenContract$InputData;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mra.d;
import mt8.b;
import nii.y0;
import oki.h;
import r40.n0;
import r83.g;
import rk3.e;
import rk3.f;
import rk3.j;
import rk3.l;
import rk3.p;
import skm.a2;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements j {
    public final ESignOtpScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final pk3.a f65964p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Map f65965q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Set f65966r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gte.a f65967s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a2 f65968t;
    public a2 u;
    public final y v;

    public a(ESignOtpScreenContract$InputData inputData, pk3.a interactor, ImmutableMap otpHandlers, ImmutableSet errorHandlers, p stateMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(otpHandlers, "otpHandlers");
        Intrinsics.checkNotNullParameter(errorHandlers, "errorHandlers");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f65964p = interactor;
        this.f65965q = otpHandlers;
        this.f65966r = errorHandlers;
        this.f65967s = featureToggleInteractor;
        String str = inputData.f65953c;
        m70.a.c(t0.f186434a);
        this.v = d.b(this, new e(str, "", 0L, false, null, inputData.e.f65962b, false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        if (this.o.e.f65961a) {
            l2(new b(this, false, continuation, 8), new yi5.b(26));
            return;
        }
        nk3.a aVar = ((e) ((j2) this.v.f22677a).getValue()).f;
        a2 a2Var = this.u;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.u = l2(new g(this, aVar, continuation, 23), new l(this, 0));
        this.f65968t = yji.l.a1(this, ta6.a.H(120000L, 1000L, TimeUnit.MILLISECONDS), null, null, new s(this, continuation, 10), 3);
    }

    public final void I2(String inputText) {
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        y yVar = this.v;
        if (Intrinsics.f(inputText, ((e) ((j2) yVar.f22677a).getValue()).f254730b)) {
            return;
        }
        H2(yVar, new n0(inputText, 13));
        if (inputText.length() == 8) {
            ESignOtpScreenContract$InputData.Mode mode = this.o.f65951a;
            if (mode instanceof ESignOtpScreenContract$InputData.Mode.Asynchronous) {
                C2(new f(inputText));
            } else {
                if (!Intrinsics.f(mode, ESignOtpScreenContract$InputData.Mode.Synchronous.f65960a)) {
                    throw new NoWhenBranchMatchedException();
                }
                n2(new rhl.b(this, inputText, null, 1), new whi.b(6));
            }
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Continuation continuation;
        Object next;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Iterator it8 = this.f65966r.iterator();
        while (true) {
            continuation = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((qk3.a) next).a(throwable)) {
                break;
            }
        }
        qk3.a aVar = (qk3.a) next;
        if (aVar == null) {
            return false;
        }
        y0 y0VarB = aVar.b();
        yji.l.a1(this, X1(y0VarB), null, null, new qqj.g(this, y0VarB, continuation, 5), 3);
        return true;
    }
}
