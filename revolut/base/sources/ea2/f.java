package ea2;

import com.google.common.collect.ImmutableSet;
import dw3.p3;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements xki.c, ta2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f124065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f124066b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f124067c = e4m.b.b(new p3(8));

    public f(h hVar) {
        this.f124065a = hVar;
    }

    @Override // ta2.a
    public final l b() {
        return new l(this.f124065a, this.f124066b, 2);
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
