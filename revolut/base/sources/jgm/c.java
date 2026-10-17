package jgm;

import fgm.l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class c implements bhm.b {
    private static final /* synthetic */ c[] $VALUES;
    public static final c INSTANCE;
    public static final c NEVER;

    static {
        c cVar = new c("INSTANCE", 0);
        INSTANCE = cVar;
        c cVar2 = new c("NEVER", 1);
        NEVER = cVar2;
        $VALUES = new c[]{cVar, cVar2};
    }

    public static void a(l lVar) {
        lVar.onSubscribe(INSTANCE);
        lVar.onComplete();
    }

    public static void c(Throwable th10, l lVar) {
        lVar.onSubscribe(INSTANCE);
        lVar.onError(th10);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    @Override // bhm.c
    public final int b(int i) {
        return 2;
    }

    @Override // bhm.g
    public final void clear() {
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this == INSTANCE;
    }

    @Override // bhm.g
    public final boolean isEmpty() {
        return true;
    }

    @Override // bhm.g
    public final boolean offer(Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // bhm.g
    public final Object poll() {
        return null;
    }
}
