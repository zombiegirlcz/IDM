package le3;

import java.util.concurrent.atomic.AtomicReference;
import kkf.z7;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.b f194465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppk.f f194466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f194467c;

    public i(wsg.b walletsInteractor, ppk.f ratesInteractor) {
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        this.f194465a = walletsInteractor;
        this.f194466b = ratesInteractor;
        this.f194467c = new AtomicReference();
    }

    public final Flow a() {
        return vkm.q.q(new vkm.y(new l34.a(this, null, 17), new z7(boh.f.e(vkm.q.q(nim.a.v(this.f194465a.b(w4l.h.f294642c), new b(11))), new l3l.m(1, this, i.class, "observeRatesFor", "observeRatesFor(Ljava/util/Set;)Lkotlinx/coroutines/flow/Flow;", 0, 19)), this, 26)));
    }
}
