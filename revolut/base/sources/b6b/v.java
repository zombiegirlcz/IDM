package b6b;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class v implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f12679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f12680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f12681c;

    public v(o oVar, q qVar) {
        this.f12679a = oVar;
        int i = 7;
        this.f12680b = e4m.b.b(new m(oVar, this, 1, i));
        this.f12681c = e4m.b.b(new m(oVar, this, 0, i));
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
