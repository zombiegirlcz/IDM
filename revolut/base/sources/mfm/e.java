package mfm;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements Comparator {
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

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return ((Comparable) obj2).compareTo(obj3);
    }
}
