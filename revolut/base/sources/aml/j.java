package aml;

import cli.y;
import com.revolut.sso.impl.ui.consent.common.consent_screen.ConsentScreenContract$InputData;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends oki.h implements dli.b {
    public final ConsentScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l80.e f6481p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a2 f6482q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f6483r;

    public j(ConsentScreenContract$InputData inputData, l80.e dateProvider, o stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f6481p = dateProvider;
        this.f6483r = mra.d.b(this, cli.k.f25028a, stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        long f105925b = this.o.f106454a.getF105925b();
        ((l80.f) this.f6481p).getClass();
        long jCurrentTimeMillis = f105925b - System.currentTimeMillis();
        a2 a2Var = this.f6482q;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f6482q = yji.l.a1(this, ta6.a.J(jCurrentTimeMillis, TimeUnit.MILLISECONDS), null, null, new i(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f6483r;
    }
}
