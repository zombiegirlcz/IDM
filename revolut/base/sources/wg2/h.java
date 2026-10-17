package wg2;

import cli.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends oki.h implements dli.b {
    public final ve2.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ze2.a f297227p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zf2.a f297228q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f297229r;

    public h(i mapper, ve2.a upiTransferExtension, ze2.a upiAliasValidator, zf2.a upiProductArticleInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(upiTransferExtension, "upiTransferExtension");
        Intrinsics.checkNotNullParameter(upiAliasValidator, "upiAliasValidator");
        Intrinsics.checkNotNullParameter(upiProductArticleInteractor, "upiProductArticleInteractor");
        this.o = upiTransferExtension;
        this.f297227p = upiAliasValidator;
        this.f297228q = upiProductArticleInteractor;
        this.f297229r = mra.d.b(this, new e(0), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new w76.a(this, null, 9), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f297229r;
    }
}
