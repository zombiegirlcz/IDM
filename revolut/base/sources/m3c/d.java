package m3c;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f202328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f202329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f202330c;
    public final e4m.e d;
    public final e4m.e e;

    public d(j jVar, e eVar) {
        this.f202328a = jVar;
        int i = 17;
        this.f202329b = e4m.b.b(new lzk.b(jVar, this, 1, i));
        this.f202330c = e4m.b.b(new lzk.b(jVar, this, 0, i));
        this.d = e4m.b.b(new lzk.b(jVar, this, 3, i));
        this.e = e4m.b.b(new lzk.b(jVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        mse.a extension = (mse.a) this.f202330c.get();
        p3c.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(extension, "extension");
        s.k(extension);
        y9l.a aVar = (y9l.a) this.f202329b.get();
        xhi.f.j(aVar);
        return ImmutableSet.of((y9l.a) extension, aVar);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
