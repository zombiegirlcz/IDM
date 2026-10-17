package i9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a METADATA_PROPERTY;
    public static final a PARENT_PROPERTY;
    public static final a PAYLOAD_PROPERTY;
    public static final a WRAPPER_ARRAY;
    public static final a WRAPPER_OBJECT;

    static {
        a aVar = new a("WRAPPER_ARRAY", 0);
        WRAPPER_ARRAY = aVar;
        a aVar2 = new a("WRAPPER_OBJECT", 1);
        WRAPPER_OBJECT = aVar2;
        a aVar3 = new a("METADATA_PROPERTY", 2);
        METADATA_PROPERTY = aVar3;
        a aVar4 = new a("PAYLOAD_PROPERTY", 3);
        PAYLOAD_PROPERTY = aVar4;
        a aVar5 = new a("PARENT_PROPERTY", 4);
        PARENT_PROPERTY = aVar5;
        $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
