package lfm;

import efm.f0;
import efm.l;
import efm.y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class e implements nfm.e {
    private static final /* synthetic */ e[] $VALUES;
    public static final e INSTANCE;
    public static final e NEVER;

    static {
        e eVar = new e("INSTANCE", 0);
        INSTANCE = eVar;
        e eVar2 = new e("NEVER", 1);
        NEVER = eVar2;
        $VALUES = new e[]{eVar, eVar2};
    }

    public static void a(y yVar) {
        yVar.onSubscribe(INSTANCE);
        yVar.onComplete();
    }

    public static void c(Throwable th10, l lVar) {
        lVar.onSubscribe(INSTANCE);
        lVar.onError(th10);
    }

    public static void d(Throwable th10, y yVar) {
        yVar.onSubscribe(INSTANCE);
        yVar.onError(th10);
    }

    public static void e(Throwable th10, f0 f0Var) {
        f0Var.onSubscribe(INSTANCE);
        f0Var.onError(th10);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    @Override // nfm.f
    public final int b(int i) {
        return 2;
    }

    @Override // nfm.j
    public final void clear() {
    }

    @Override // ifm.c
    public final void dispose() {
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this == INSTANCE;
    }

    @Override // nfm.j
    public final boolean isEmpty() {
        return true;
    }

    @Override // nfm.j
    public final boolean offer(Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // nfm.j
    public final Object poll() {
        return null;
    }
}
