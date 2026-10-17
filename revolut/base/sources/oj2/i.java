package oj2;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.articles_deeplinks_impl.screen.ArticleWebViewScreenContract$InputData;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import wli.x;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends oki.h implements f {

    @NotNull
    private static final h Companion = new h();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Set f225718t;
    public final ArticleWebViewScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y69.a f225719p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f225720q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f225721r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f225722s;

    static {
        String[] elements = {"http", "https"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f225718t = kotlin.collections.d.y0(elements);
    }

    public i(j stateMapper, ArticleWebViewScreenContract$InputData inputData, y69.a articleInteractor, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(articleInteractor, "articleInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = inputData;
        this.f225719p = articleInteractor;
        this.f225720q = deeplinkHandler;
        this.f225721r = new vii.b();
        this.f225722s = mra.d.b(this, new e(null, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f225721r, new ns9.h(continuation, this, 25)), null, null, new o95.c(this, continuation, 23), 3);
        l2(new nt4.f(this, continuation, 23), new oh3.a(17));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f225722s;
    }
}
