package fkm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class i {
    private static final /* synthetic */ i[] $VALUES;
    public static final i COMPUTING;
    public static final i NOT_COMPUTED;
    public static final i RECURSION_WAS_DETECTED;

    static {
        i iVar = new i("NOT_COMPUTED", 0);
        NOT_COMPUTED = iVar;
        i iVar2 = new i("COMPUTING", 1);
        COMPUTING = iVar2;
        i iVar3 = new i("RECURSION_WAS_DETECTED", 2);
        RECURSION_WAS_DETECTED = iVar3;
        $VALUES = new i[]{iVar, iVar2, iVar3};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
