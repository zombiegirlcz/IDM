package he2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.swish.impl.ui.home.transaction_limit.SwishTransactionLimitScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SwishTransactionLimitScreenContract$InputData f151545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f151546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f151547c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public h(c cVar, f fVar, SwishTransactionLimitScreenContract$InputData swishTransactionLimitScreenContract$InputData) {
        this.f151546b = cVar;
        this.f151545a = swishTransactionLimitScreenContract$InputData;
        int i = 26;
        this.f151547c = e4m.b.b(new h08.e(cVar, this, 2, i));
        this.d = e4m.b.b(new h08.e(cVar, this, 3, i));
        this.e = e4m.b.b(new h08.e(cVar, this, 1, i));
        this.f = e4m.b.b(new h08.e(cVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
