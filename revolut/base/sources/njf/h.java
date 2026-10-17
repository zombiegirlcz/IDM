package njf;

import efm.p;
import efm.r;
import java.util.concurrent.TimeUnit;
import kl.b0;
import kl.t1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import tnb.g0;
import tsk.t;
import twl.o;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f216491b;

    public h(Object obj2, int i) {
        this.f216490a = i;
        switch (i) {
            case 1:
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                this.f216491b = obj2;
                break;
            case 2:
            default:
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                this.f216491b = obj2;
                break;
            case 3:
                TimeUnit timeUnit3 = TimeUnit.MILLISECONDS;
                this.f216491b = obj2;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f216490a) {
            case 0:
                r shared = (r) obj2;
                Intrinsics.checkNotNullParameter(shared, "shared");
                p pVarB = p.b(this.f216491b);
                Intrinsics.checkNotNullExpressionValue(pVarB, "createOnNext(...)");
                return r.merge(shared, r.timer(500L, TimeUnit.MILLISECONDS).map(new ly7.g(8, new m2j.f(pVarB, 2))).takeUntil(shared)).filter(new b0(new m2j.g(pVarB, new Ref$BooleanRef(), 2))).doOnNext(new t1(new fjm.j(pVarB, 4)));
            case 1:
                r shared2 = (r) obj2;
                Intrinsics.checkNotNullParameter(shared2, "shared");
                p pVarB2 = p.b(this.f216491b);
                Intrinsics.checkNotNullExpressionValue(pVarB2, "createOnNext(...)");
                return r.merge(shared2, r.timer(500L, TimeUnit.MILLISECONDS).map(new lhi.b(24, new m2j.f(pVarB2, 3))).takeUntil(shared2)).filter(new os2.g(new m2j.g(pVarB2, new Ref$BooleanRef(), 3))).doOnNext(new pak.h(new fjm.j(pVarB2, 9)));
            case 2:
                r published = (r) obj2;
                Intrinsics.checkNotNullParameter(published, "published");
                return published.ambWith(r.fromCallable(new sd.d(this.f216491b, 1)).delaySubscription(1L, TimeUnit.SECONDS).concatWith(published));
            default:
                r shared3 = (r) obj2;
                Intrinsics.checkNotNullParameter(shared3, "shared");
                p pVarB3 = p.b(this.f216491b);
                Intrinsics.checkNotNullExpressionValue(pVarB3, "createOnNext(...)");
                return r.merge(shared3, r.timer(500L, TimeUnit.MILLISECONDS).map(new o(9, new m2j.f(pVarB3, 4))).takeUntil(shared3)).filter(new g0(new m2j.g(pVarB3, new Ref$BooleanRef(), 4))).doOnNext(new t(new fjm.j(pVarB3, 14)));
        }
    }

    public h(f0 f0Var) {
        this.f216490a = 2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f216491b = f0Var;
    }
}
