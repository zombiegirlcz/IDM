package db1;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f112647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f112648b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f112649c;
    public final e4m.e d;
    public final e4m.e e;

    public c(b bVar) {
        this.f112647a = bVar;
        int i = 12;
        this.f112649c = e4m.b.b(new cbb.b(bVar, 0, i));
        this.d = e4m.b.b(new cbb.b(bVar, 1, i));
        this.e = e4m.b.b(new cbb.b(bVar, 2, i));
    }

    @Override // dki.t
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // dki.q
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
