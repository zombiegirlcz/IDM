package db1;

import cwi.d0;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f112650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f112651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f112652c;

    public d(b bVar, c cVar) {
        this.f112650a = bVar;
        this.f112651b = e4m.b.b(new d0(bVar, this, 1, 29));
        this.f112652c = e4m.b.b(new d0(bVar, this, 0, 29));
    }

    @Override // sji.b
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // sji.b
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
