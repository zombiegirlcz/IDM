package xgm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class c implements bhm.d {
    private static final /* synthetic */ c[] $VALUES;
    public static final c INSTANCE;

    static {
        c cVar = new c("INSTANCE", 0);
        INSTANCE = cVar;
        $VALUES = new c[]{cVar};
    }

    public static void c(Throwable th10, dom.a aVar) {
        aVar.e(INSTANCE);
        aVar.onError(th10);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    @Override // dom.b
    public final void a(long j2) {
        f.f(j2);
    }

    @Override // bhm.c
    public final int b(int i) {
        return 2;
    }

    @Override // dom.b
    public final void cancel() {
    }

    @Override // bhm.g
    public final void clear() {
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

    @Override // java.lang.Enum
    public final String toString() {
        return "EmptySubscription";
    }
}
