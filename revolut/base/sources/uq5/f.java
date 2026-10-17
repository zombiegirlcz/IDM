package uq5;

import cli.y;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import up2.q;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends h implements e {
    public final ap5.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final se5.a f282108p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l80.e f282109q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f282110r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f282111s;

    public f(g stateMapper, ap5.b cryptoWithdrawInteractor, se5.a cryptoFaqKeysProvider, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(cryptoWithdrawInteractor, "cryptoWithdrawInteractor");
        Intrinsics.checkNotNullParameter(cryptoFaqKeysProvider, "cryptoFaqKeysProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.o = cryptoWithdrawInteractor;
        this.f282108p = cryptoFaqKeysProvider;
        this.f282109q = dateProvider;
        this.f282110r = mra.d.b(this, new d(0), stateMapper, null, false, 12);
        this.f282111s = new AtomicBoolean(false);
    }

    @Override // yji.l
    public final void T1(long j2) {
        xi0.b.Companion.getClass();
        l.b1(this, rd0.e.b(this.o.i(xi0.b.H, false)), null, new q(this, null, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f282110r;
    }
}
