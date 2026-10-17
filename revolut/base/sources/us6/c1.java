package us6;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 implements xki.c, z07.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f282472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f282473b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f282474c = e4m.b.b(new r96.a(27));

    public c1(q qVar) {
        this.f282472a = qVar;
    }

    @Override // z07.a
    public final t1 b() {
        return new t1(this.f282472a, this.f282473b, 0);
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
