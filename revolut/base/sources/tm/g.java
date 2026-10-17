package tm;

import com.revolut.core.extensions.rx.BreadcrumbException;
import e0f.n;
import ihm.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import no.f2;
import ofm.h;
import qza.x;
import te0.w;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f272146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ym.d f272147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final um.c f272148c;
    public final cn.e d;
    public final j e;
    public final j f;

    public g(Function1 single, lfm.c compositeDisposable, ym.d loadingDispatcher, um.c errorsDispatcher, cn.e resultsDispatcher) {
        Intrinsics.checkNotNullParameter(single, "single");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(loadingDispatcher, "loadingDispatcher");
        Intrinsics.checkNotNullParameter(errorsDispatcher, "errorsDispatcher");
        Intrinsics.checkNotNullParameter(resultsDispatcher, "resultsDispatcher");
        this.f272146a = single;
        this.f272147b = loadingDispatcher;
        this.f272148c = errorsDispatcher;
        this.d = resultsDispatcher;
        j jVarH = p.a.h("toSerialized(...)");
        this.e = jVarH;
        this.f = p.a.D("toSerialized(...)");
        pfm.a aVar = new pfm.a(w.D(jVarH, new f2(this, 15)), new yf.c(new x(new BreadcrumbException(), 10), (byte) 0), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        h hVarW = aVar.w(new n(4, f.f272145a), e.f272144a);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(compositeDisposable, hVarW);
    }

    public final pfm.h a(mm.a aVar) {
        pfm.h hVar = new pfm.h(new b(this, aVar, 0), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }
}
