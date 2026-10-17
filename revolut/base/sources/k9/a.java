package k9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a BACK_REFERENCE;
    public static final a MANAGED_REFERENCE;

    static {
        a aVar = new a("MANAGED_REFERENCE", 0);
        MANAGED_REFERENCE = aVar;
        a aVar2 = new a("BACK_REFERENCE", 1);
        BACK_REFERENCE = aVar2;
        $VALUES = new a[]{aVar, aVar2};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
