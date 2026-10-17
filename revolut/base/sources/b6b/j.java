package b6b;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements xki.c, h7b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f12622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f12623b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f12624c = e4m.b.b(new a96.b(8));

    public j(o oVar) {
        this.f12622a = oVar;
    }

    @Override // h7b.a
    public final e0 b() {
        return new e0(this.f12622a, this.f12623b, 0);
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
