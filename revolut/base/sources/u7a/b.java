package u7a;

import java.util.Collections;
import java.util.Set;
import s7a.x;
import u45.w0;
import xki.e;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x7a.d f277721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f277722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f277723c;
    public final e4m.e d;
    public final e4m.e e;

    public b(a aVar, x xVar, x7a.d dVar) {
        this.f277721a = dVar;
        this.f277722b = xVar;
        int i = 3;
        this.f277723c = e4m.b.b(new w0(aVar, this, 2, i));
        this.d = e4m.b.b(new w0(aVar, this, 1, i));
        this.e = e4m.b.b(new w0(aVar, this, 0, i));
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
