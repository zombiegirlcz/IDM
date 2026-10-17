package zaj;

import cli.y;
import com.revolut.retail.feature.crypto.prelaunch.impl.ui.details.CryptoPreLaunchDetailsContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends oki.h implements b {
    public final CryptoPreLaunchDetailsContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final waj.a f320732p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f320733q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f320734r;

    public l(n mapper, CryptoPreLaunchDetailsContract$InputData inputData, waj.a repository) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.o = inputData;
        this.f320732p = repository;
        this.f320733q = new vii.b();
        this.f320734r = mra.d.b(this, new a(0), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f320733q, new z6e.g(continuation, this, 8)), null, null, new yy6.f(this, continuation, 24), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f320734r;
    }
}
