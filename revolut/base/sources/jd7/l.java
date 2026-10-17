package jd7;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.html_viewer.impl.screen.HtmlViewerScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends oki.h implements h {
    public final HtmlViewerScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final pre.c f172994p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f80.a f172995q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f172996r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f172997s;

    public l(m stateMapper, HtmlViewerScreenContract$InputData inputData, pre.c termsInteractor, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.o = inputData;
        this.f172994p = termsInteractor;
        this.f172995q = uriHelper;
        this.f172996r = new vii.b();
        this.f172997s = mra.d.b(this, new d(inputData.f74753b, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, q.Q(this.f172996r, new iw6.l((Continuation) null, this, 13)), null, null, new j(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f172997s;
    }
}
