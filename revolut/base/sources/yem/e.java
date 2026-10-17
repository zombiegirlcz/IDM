package yem;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class e {
    private static final /* synthetic */ e[] $VALUES;
    public static final e E164;
    public static final e INTERNATIONAL;
    public static final e NATIONAL;
    public static final e RFC3966;

    static {
        e eVar = new e("E164", 0);
        E164 = eVar;
        e eVar2 = new e("INTERNATIONAL", 1);
        INTERNATIONAL = eVar2;
        e eVar3 = new e("NATIONAL", 2);
        NATIONAL = eVar3;
        e eVar4 = new e("RFC3966", 3);
        RFC3966 = eVar4;
        $VALUES = new e[]{eVar, eVar2, eVar3, eVar4};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
