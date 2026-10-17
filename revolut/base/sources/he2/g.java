package he2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.swish.impl.ui.home.area.SwishHomeAreaScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SwishHomeAreaScreenContract$InputData f151542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f151543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f151544c;
    public final e4m.e d;

    public g(c cVar, SwishHomeAreaScreenContract$InputData swishHomeAreaScreenContract$InputData) {
        this.f151543b = cVar;
        this.f151542a = swishHomeAreaScreenContract$InputData;
        int i = 25;
        this.f151544c = e4m.b.b(new h08.e(cVar, this, 1, i));
        this.d = e4m.b.b(new h08.e(cVar, this, 0, i));
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
