package eli;

import akl.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import te0.w;

/* JADX INFO: loaded from: classes13.dex */
public final class p extends nri.a implements e0m.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ujg.a f127491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ji0.a f127492c;
    public final lfm.c d;
    public final Regex e;

    public p(ujg.a twoFaRepository, ji0.a smsRetrieverClient, lfm.c compositeDisposable) {
        Intrinsics.checkNotNullParameter(twoFaRepository, "twoFaRepository");
        Intrinsics.checkNotNullParameter(smsRetrieverClient, "smsRetrieverClient");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f127491b = twoFaRepository;
        this.f127492c = smsRetrieverClient;
        this.d = compositeDisposable;
        this.e = new Regex(".*([\\d]{3}-[\\d]{3}).*");
    }

    @Override // nri.a
    public final void i3() {
        ihm.j jVar = this.f127492c.f174319b;
        s sVar = new s(this, 13);
        r rVarOnErrorResumeNext = jVar.onErrorResumeNext(new e0f.n(1, new bo.c(new BreadcrumbException(), 5)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new e0f.m(1, sVar), new e0f.m(1, m.f127488a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        w.j0(this.d, cVarSubscribe);
    }
}
