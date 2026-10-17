package bgm;

import efm.y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements y {
    private static final /* synthetic */ e[] $VALUES;
    public static final e INSTANCE;

    static {
        e eVar = new e("INSTANCE", 0);
        INSTANCE = eVar;
        $VALUES = new e[]{eVar};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    @Override // efm.y
    public final void onComplete() {
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
    }
}
