package s0m;

import kotlin.text.a0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class h {
    private static final /* synthetic */ h[] $VALUES;
    public static final h TLSv1_1;
    public static final h TLSv1_2;

    static {
        h hVar = new h("TLSv1_1", 0);
        TLSv1_1 = hVar;
        h hVar2 = new h("TLSv1_2", 1);
        TLSv1_2 = hVar2;
        $VALUES = new h[]{hVar, hVar2};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return a0.D(name(), "_", ".", false);
    }
}
