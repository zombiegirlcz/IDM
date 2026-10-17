package j9j;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nw5.j;
import rd0.e;
import vkm.q;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements c8j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fn2.c f172349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f172350b;

    public c(fn2.c cryptoDetailsAboutInteractor, j cryptoStatsInteractor) {
        Intrinsics.checkNotNullParameter(cryptoDetailsAboutInteractor, "cryptoDetailsAboutInteractor");
        Intrinsics.checkNotNullParameter(cryptoStatsInteractor, "cryptoStatsInteractor");
        this.f172349a = cryptoDetailsAboutInteractor;
        this.f172350b = cryptoStatsInteractor;
    }

    @Override // c8j.a
    public final Flow a(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return q.Q(e.b(this.f172350b.a(true)), new eh9.j((Continuation) null, this, currency, 26));
    }
}
