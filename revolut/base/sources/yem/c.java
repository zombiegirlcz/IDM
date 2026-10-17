package yem;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c INVALID_COUNTRY_CODE;
    public static final c NOT_A_NUMBER;
    public static final c TOO_LONG;
    public static final c TOO_SHORT_AFTER_IDD;
    public static final c TOO_SHORT_NSN;

    static {
        c cVar = new c("INVALID_COUNTRY_CODE", 0);
        INVALID_COUNTRY_CODE = cVar;
        c cVar2 = new c("NOT_A_NUMBER", 1);
        NOT_A_NUMBER = cVar2;
        c cVar3 = new c("TOO_SHORT_AFTER_IDD", 2);
        TOO_SHORT_AFTER_IDD = cVar3;
        c cVar4 = new c("TOO_SHORT_NSN", 3);
        TOO_SHORT_NSN = cVar4;
        c cVar5 = new c("TOO_LONG", 4);
        TOO_LONG = cVar5;
        $VALUES = new c[]{cVar, cVar2, cVar3, cVar4, cVar5};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
