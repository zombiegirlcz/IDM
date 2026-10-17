package m9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b AsEmpty;
    public static final b AsNull;
    public static final b Fail;
    public static final b TryConvert;

    static {
        b bVar = new b("Fail", 0);
        Fail = bVar;
        b bVar2 = new b("TryConvert", 1);
        TryConvert = bVar2;
        b bVar3 = new b("AsNull", 2);
        AsNull = bVar3;
        b bVar4 = new b("AsEmpty", 3);
        AsEmpty = bVar4;
        $VALUES = new b[]{bVar, bVar2, bVar3, bVar4};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
