package y2d;

import e4m.e;
import ifd.h;
import xf6.a1;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1d.b f310629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f310630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f310631c;

    public c(y1d.b bVar) {
        this.f310629a = bVar;
        int i = 15;
        this.f310630b = e4m.b.b(new a1(this, 0, i));
        this.f310631c = e4m.b.b(new a1(this, 1, i));
    }

    public final n3d.a a() {
        return (n3d.a) this.f310631c.get();
    }

    public final h b() {
        return (h) this.f310630b.get();
    }
}
