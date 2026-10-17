package yah;

import e4m.e;
import f1h.c;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h9h.a f312021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f312022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f312023c;

    public a(h9h.a aVar) {
        this.f312021a = aVar;
        int i = 11;
        this.f312022b = e4m.b.b(new xs6.a(this, 0, i));
        this.f312023c = e4m.b.b(new xs6.a(this, 1, i));
    }

    public final c a() {
        return (c) this.f312022b.get();
    }

    public final ugc.a b() {
        return new ugc.a(this.f312021a.z());
    }
}
