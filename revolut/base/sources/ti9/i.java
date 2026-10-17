package ti9;

import efm.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f271464a;

    public i(wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f271464a = walletInteractor;
    }

    public final r a(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return mo3.a.n(nim.a.w(osg.b.g(this.f271464a, loadingStrategy, io3.l.INSTALMENT, null, null, null, null, null, 124), new tfh.a(27)));
    }
}
