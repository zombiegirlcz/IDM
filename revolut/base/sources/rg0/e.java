package rg0;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e4m.e f253996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f253997b;

    public e() {
        int i = 10;
        this.f253996a = e4m.b.b(new r5a.b(this, 0, i));
        this.f253997b = e4m.b.b(new r5a.b(this, 1, i));
    }

    public final CoroutineScope a() {
        return (CoroutineScope) this.f253996a.get();
    }
}
