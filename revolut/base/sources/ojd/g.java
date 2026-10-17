package ojd;

import cli.k;
import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends oki.h implements dli.b {
    public final mre.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y21.c f225763p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f225764q;

    public g(n stateMapper, mre.c termsNavigationFactory, y21.c optOutRepository) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(optOutRepository, "optOutRepository");
        this.o = termsNavigationFactory;
        this.f225763p = optOutRepository;
        this.f225764q = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f225764q;
    }
}
