package g67;

import d67.g;
import fd2.n;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f140883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f140884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f140885c;

    public b(a aVar, g gVar) {
        this.f140883a = gVar;
        int i = 12;
        this.f140884b = e4m.b.b(new n(this, 1, i));
        this.f140885c = e4m.b.b(new n(this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // xki.e
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
