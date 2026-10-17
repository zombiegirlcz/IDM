package e8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    private static final /* synthetic */ k[] $VALUES;
    public static final k DECODE_DATA;
    public static final k INITIALIZE;
    public static final k SWITCH_TO_SOURCE_SERVICE;

    static {
        k kVar = new k("INITIALIZE", 0);
        INITIALIZE = kVar;
        k kVar2 = new k("SWITCH_TO_SOURCE_SERVICE", 1);
        SWITCH_TO_SOURCE_SERVICE = kVar2;
        k kVar3 = new k("DECODE_DATA", 2);
        DECODE_DATA = kVar3;
        $VALUES = new k[]{kVar, kVar2, kVar3};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
