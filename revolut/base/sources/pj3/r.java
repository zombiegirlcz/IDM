package pj3;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.cms.stories.impl.ui.screen.CmsStoriesScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfk.o0;
import skm.a2;
import vkm.j2;
import wli.x;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class r extends oki.h implements g {

    @NotNull
    private static final n Companion = new n();
    public final CmsStoriesScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jj3.e f236650p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f236651q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final nj3.b f236652r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f236653s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a2 f236654t;
    public hj3.a u;
    public final y v;

    public r(CmsStoriesScreenContract$InputData inputData, jj3.e repository, x deeplinkHandler, nj3.b mediaPrefetcher, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(mediaPrefetcher, "mediaPrefetcher");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f236650p = repository;
        this.f236651q = deeplinkHandler;
        this.f236652r = mediaPrefetcher;
        this.f236653s = new vii.b();
        this.v = mra.d.b(this, new f(new Data(null, null, true, 3, null), null, inputData.f65945b), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f236653s, new okf.m(continuation, this, 27)), null, null, new o0(this, continuation, 7), 3);
    }

    public final String I2(int i) {
        hj3.d dVar;
        hj3.a aVar = (hj3.a) ((f) ((j2) this.v.f22677a).getValue()).f236634a.getContent();
        if (aVar == null || (dVar = (hj3.d) d0.e0(i, aVar.e)) == null) {
            return null;
        }
        return dVar.f152660b;
    }

    public final void J2(String str) {
        if (str == null || this.o.e) {
            B2();
        } else {
            l2(new q(this, str, null, 1), new yi5.b(26));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
