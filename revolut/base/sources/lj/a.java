package lj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a V0_NO_HEADER_FIXED_IV_CBC;
    public static final a V1_HEADER_CBC;
    public static final a V2_HEADER_GCM;

    static {
        a aVar = new a("V0_NO_HEADER_FIXED_IV_CBC", 0);
        V0_NO_HEADER_FIXED_IV_CBC = aVar;
        a aVar2 = new a("V1_HEADER_CBC", 1);
        V1_HEADER_CBC = aVar2;
        a aVar3 = new a("V2_HEADER_GCM", 2);
        V2_HEADER_GCM = aVar3;
        $VALUES = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
