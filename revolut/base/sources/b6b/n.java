package b6b;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f12644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f12645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f12646c;

    public n(o oVar) {
        this.f12644a = oVar;
        int i = 0;
        this.f12645b = e4m.b.b(new m(oVar, this, 1, i));
        this.f12646c = e4m.b.b(new m(oVar, this, 0, i));
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
