package msb;

import a08.p0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.r;
import java.util.concurrent.TimeUnit;
import kl.t1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class g extends nri.a implements sjg.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rpa.b f208651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f208652c;
    public final ihm.j d;

    public g(rpa.b pushInterceptor, long j2) {
        Intrinsics.checkNotNullParameter(pushInterceptor, "pushInterceptor");
        this.f208651b = pushInterceptor;
        this.f208652c = j2;
        this.d = p.a.D("toSerialized(...)");
    }

    @Override // nri.a
    public final void i3() {
        r rVarHide = this.f208651b.f256308a.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        r rVarDelay = rVarHide.doOnNext(new e(0, new d(this, 0))).delay(this.f208652c, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarDelay, "delay(...)");
        d dVar = new d(this, 1);
        r rVarOnErrorResumeNext = rVarDelay.onErrorResumeNext(new t1(new ms2.j(new BreadcrumbException(), 1)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext.subscribe(new p0(27, dVar), new p0(27, f.f208650a)), "subscribe(...)");
    }
}
