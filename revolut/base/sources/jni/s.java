package jni;

import amh.w;
import cli.y;
import com.revolut.otp.input.flow.code.OtpCodeInputScreenContract$InputData;
import grl.fb;
import grl.hb;
import grl.jb;
import iyg.b0;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import no.j2;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import vkm.z1;

/* JADX INFO: loaded from: classes10.dex */
public final class s extends oki.h implements l {

    @NotNull
    public static final n Companion = new n();
    public final OtpCodeInputScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mni.a f176803p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ji0.a f176804q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j2 f176805r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Lazy f176806s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z1 f176807t;
    public a2 u;
    public final y v;

    public s(OtpCodeInputScreenContract$InputData inputData, mni.a otpObservable, ji0.a smsRetrieverClient, v stateMapper, j2 settingsEventsTracker) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(otpObservable, "otpObservable");
        Intrinsics.checkNotNullParameter(smsRetrieverClient, "smsRetrieverClient");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(settingsEventsTracker, "settingsEventsTracker");
        this.o = inputData;
        this.f176803p = otpObservable;
        this.f176804q = smsRetrieverClient;
        this.f176805r = settingsEventsTracker;
        this.f176806s = yhm.j.b(new jj9.b(26));
        this.f176807t = vkm.q.b(0, 7, null);
        this.v = mra.d.b(this, new e(inputData.f98495a, "", inputData.f98497c, false, inputData.f98496b, inputData.e, false), stateMapper, null, false, 12);
    }

    public static final void I2(s sVar, jb jbVar) {
        hb hbVar;
        fb fbVar;
        j2 j2Var = sVar.f176805r;
        y yVar = sVar.v;
        Boolean boolValueOf = Boolean.valueOf(((e) ((vkm.j2) yVar.f22677a).getValue()).d);
        int i = o.f176797a[((e) ((vkm.j2) yVar.f22677a).getValue()).f.ordinal()];
        if (i == 1) {
            hbVar = hb.SMS;
        } else if (i == 2) {
            hbVar = hb.Call;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            hbVar = hb.WhatsApp;
        }
        lni.j jVar = sVar.o.f98498g;
        int i2 = jVar == null ? -1 : o.f176799c[jVar.ordinal()];
        if (i2 == -1) {
            fbVar = null;
        } else if (i2 == 1) {
            fbVar = fb.Reauthentication;
        } else if (i2 == 2) {
            fbVar = fb.SignIn;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            fbVar = fb.SignUp;
        }
        ((com.revolut.analytics.tracking.v3.l) j2Var).o3(boolValueOf, jbVar, hbVar, fbVar);
    }

    @Override // yji.l
    public final void I1() {
        J2();
    }

    public final void J2() {
        a2 a2Var = this.u;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        OtpCodeInputScreenContract$InputData otpCodeInputScreenContract$InputData = this.o;
        if (otpCodeInputScreenContract$InputData.d.isEmpty()) {
            return;
        }
        this.u = yji.l.a1(this, ta6.a.H(otpCodeInputScreenContract$InputData.f98497c, 1L, TimeUnit.SECONDS), null, null, new a82.s(this, continuation, 3), 3);
    }

    @Override // yji.l
    public final void P1() {
        s1();
        H2(this.v, new jn2.a(10));
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.q(this.f176807t), null, new p(this, continuation, 0), 3);
        mni.a aVar = this.f176803p;
        yji.l.b1(this, new w(vkm.q.Q(new b0(aVar.f207509a, 7), new iw6.l(continuation, this, 22)), 15), null, new jkc.g(this, continuation, 5), 3);
        yji.l.b1(this, aVar.f207509a, null, new p(this, continuation, 1), 3);
        yji.l.b1(this, aVar.f207510b, null, new p(this, continuation, 2), 3);
        n2(new ji1.m(this, continuation, 6), new whi.b(6));
        yji.l.b1(this, rd0.e.b(this.f176804q.f174319b), null, new jec.p(this, continuation, 18), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
