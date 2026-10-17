package kgm;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class f implements Comparator {
    private static final /* synthetic */ f[] $VALUES;
    public static final f INSTANCE;

    static {
        f fVar = new f("INSTANCE", 0);
        INSTANCE = fVar;
        $VALUES = new f[]{fVar};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return ((Comparable) obj2).compareTo(obj3);
    }
}
