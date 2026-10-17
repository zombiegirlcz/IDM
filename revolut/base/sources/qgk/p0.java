package qgk;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class p0 implements xki.c, klk.b, xmk.b, bok.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f246187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f246188b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f246189c = e4m.b.b(new p12.o(21));

    public p0(i0 i0Var) {
        this.f246187a = i0Var;
    }

    @Override // bok.b
    public final bok.a b() {
        return new b3(this.f246187a, this.f246188b);
    }

    @Override // klk.b
    public final t2 c() {
        return new t2(this.f246187a, this.f246188b, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // xmk.b
    public final xmk.a j() {
        return new l2(this.f246187a, this.f246188b);
    }
}
