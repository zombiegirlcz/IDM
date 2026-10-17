package e61;

import com.revolut.data.model.Data;
import e58.e;
import efm.r;
import java.util.Collection;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import ppk.f;
import te0.w;
import wsg.n;
import yhm.j;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f122881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f122882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f122883c;

    public a(f ratesInteractor, n walletInteractor) {
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f122881a = ratesInteractor;
        this.f122882b = walletInteractor;
        this.f122883c = j.b(new e(this, 2));
    }

    public final r a(Collection pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        if (pairs.isEmpty()) {
            return w.h(new Data(f0.f322471a, null, false, 2, null));
        }
        return this.f122881a.b(d0.d1(pairs), true);
    }
}
