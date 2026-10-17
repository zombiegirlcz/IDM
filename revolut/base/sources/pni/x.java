package pni;

import android.content.Intent;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.otp.input.flow.email.OtpEmailScreenContract$InputData;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class x extends oki.h implements s {

    @NotNull
    private static final u Companion = new u();
    public final OtpEmailScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mni.a f237826p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final iki.c f237827q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a2 f237828r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cli.y f237829s;

    public x(y stateMapper, OtpEmailScreenContract$InputData inputData, mni.a otpObservable, iki.c externalDestinationResolver) {
        k iVar;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(otpObservable, "otpObservable");
        Intrinsics.checkNotNullParameter(externalDestinationResolver, "externalDestinationResolver");
        this.o = inputData;
        this.f237826p = otpObservable;
        this.f237827q = externalDestinationResolver;
        String str = inputData.f98509a;
        boolean z = inputData.f;
        List list = inputData.d;
        if (!list.isEmpty() || z) {
            long j2 = inputData.f98511c;
            iVar = j2 == 0 ? h.f237812a : new i(j2);
        } else {
            iVar = j.f237814a;
        }
        this.f237829s = mra.d.b(this, new l(str, iVar, z ? g.REQUEST_ANOTHER_METHOD : list.size() == 1 ? g.RESEND_ONLY : g.SELECT_ANOTHER_METHOD, inputData.e, true, inputData.f98510b), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        I2();
        yji.l.a1(this, this.f237826p.f207511c, null, null, new w(this, null, 0), 3);
    }

    public final void I2() {
        a2 a2Var = this.f237828r;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        if (Intrinsics.f(((l) ((j2) this.f237829s.f22677a).getValue()).f237816b, j.f237814a)) {
            return;
        }
        this.f237828r = yji.l.a1(this, ta6.a.H(this.o.f98511c, 1L, TimeUnit.SECONDS), null, null, new a82.s(this, continuation, 7), 3);
    }

    @Override // yji.l
    public final void P1() {
        t1(new lii.c("LOADING_TAG_PRIMARY_BUTTON"));
        s1();
    }

    @Override // yji.l
    public final void T1(long j2) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.APP_EMAIL");
        intent.addFlags(268435456);
        Continuation continuation = null;
        H2(this.f237829s, new ocb.u(this.f237827q.a(new ExternalDestination.ByIntent(intent, null)), 13));
        mni.a aVar = this.f237826p;
        yji.l.b1(this, aVar.f207509a, null, new w(this, continuation, 1), 3);
        yji.l.b1(this, aVar.f207510b, null, new w(this, continuation, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f237829s;
    }
}
