package y9a;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;

/* JADX INFO: loaded from: classes5.dex */
public final class r extends oki.h implements n {
    public final zja.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s8a.f f311825p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z1 f311826q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f311827r;

    public r(cli.n stateMapper, zja.a productArticleInteractor, s8a.f interactor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.o = productArticleInteractor;
        this.f311825p = interactor;
        z1 z1VarB = vkm.q.b(0, 6, null);
        z1VarB.k(Unit.f186387a);
        this.f311826q = z1VarB;
        this.f311827r = mra.d.b(this, new h(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(this.f311826q, new y4f.o(continuation, this, 8)), null, new y83.d(this, continuation, 2), 3);
        n2(new q(this, SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, null), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f311827r;
    }
}
