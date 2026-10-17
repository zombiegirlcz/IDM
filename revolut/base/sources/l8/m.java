package l8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class m {
    private static final /* synthetic */ m[] $VALUES;
    public static final m MEMORY;
    public static final m QUALITY;

    static {
        m mVar = new m("MEMORY", 0);
        MEMORY = mVar;
        m mVar2 = new m("QUALITY", 1);
        QUALITY = mVar2;
        $VALUES = new m[]{mVar, mVar2};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
