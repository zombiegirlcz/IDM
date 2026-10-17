package pp9;

import e4m.e;
import pl1.h;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f238303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f238304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f238305c;
    public final e d;

    public b() {
        int i = 7;
        this.f238303a = e4m.b.b(new h(this, 1, i));
        this.f238304b = e4m.b.b(new h(this, 2, i));
        this.f238305c = e4m.b.b(new h(this, 3, i));
        e4m.b.b(new h(this, 0, i));
        this.d = e4m.b.b(new h(this, 4, i));
    }

    public final hp9.c a() {
        return (hp9.c) this.d.get();
    }
}
