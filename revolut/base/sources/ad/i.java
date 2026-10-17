package ad;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class i {
    private static final /* synthetic */ i[] $VALUES;
    public static final i CRUNCHY;
    public static final i LEGACY;
    public static final i RAW;
    public static final i TINK;

    static {
        i iVar = new i("TINK", 0);
        TINK = iVar;
        i iVar2 = new i("LEGACY", 1);
        LEGACY = iVar2;
        i iVar3 = new i("RAW", 2);
        RAW = iVar3;
        i iVar4 = new i("CRUNCHY", 3);
        CRUNCHY = iVar4;
        $VALUES = new i[]{iVar, iVar2, iVar3, iVar4};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
