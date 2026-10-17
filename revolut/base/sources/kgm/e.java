package kgm;

import igm.o;
import igm.q;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes14.dex */
public final class e implements Callable, q, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f184019a;

    public e(Object obj2) {
        this.f184019a = obj2;
    }

    @Override // igm.o
    public final Object apply(Object obj2) {
        return this.f184019a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f184019a;
    }

    @Override // igm.q
    public final Object get() {
        return this.f184019a;
    }
}
