package yfm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class d implements nfm.g {
    private static final /* synthetic */ d[] $VALUES;
    public static final d INSTANCE;

    static {
        d dVar = new d("INSTANCE", 0);
        INSTANCE = dVar;
        $VALUES = new d[]{dVar};
    }

    public static void c(dom.a aVar) {
        aVar.e(INSTANCE);
        aVar.onComplete();
    }

    public static void d(Throwable th10, dom.a aVar) {
        aVar.e(INSTANCE);
        aVar.onError(th10);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    @Override // dom.b
    public final void a(long j2) {
        g.f(j2);
    }

    @Override // nfm.f
    public final int b(int i) {
        return 2;
    }

    @Override // dom.b
    public final void cancel() {
    }

    @Override // nfm.j
    public final void clear() {
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

    @Override // java.lang.Enum
    public final String toString() {
        return "EmptySubscription";
    }
}
