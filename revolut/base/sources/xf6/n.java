package xf6;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uj6.l f304953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f304954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f304955c;

    public n(t tVar, m mVar, uj6.l lVar) {
        this.f304953a = lVar;
        this.f304954b = e4m.b.b(new wpg.g(tVar, mVar, this, 1, 10));
        this.f304955c = e4m.b.b(new wpg.g(tVar, mVar, this, 0, 10));
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
