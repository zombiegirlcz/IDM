package n69;

import e4m.b;
import e4m.e;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ite.a f212745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f212746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f212747c;

    public a(ite.a aVar) {
        this.f212745a = aVar;
        int i = 18;
        this.f212746b = b.b(new mil.a(this, 0, i));
        this.f212747c = b.b(new mil.a(this, 1, i));
    }

    public final p69.a a() {
        return (p69.a) this.f212746b.get();
    }
}
