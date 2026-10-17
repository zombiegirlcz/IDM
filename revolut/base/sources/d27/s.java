package d27;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s AMOUNT;
    public static final s CUSTOM_FIELD;
    public static final s NONE;
    public static final s REUSABLE_COUNT;
    public static final s TITLE;

    static {
        s sVar = new s("AMOUNT", 0);
        AMOUNT = sVar;
        s sVar2 = new s("CUSTOM_FIELD", 1);
        CUSTOM_FIELD = sVar2;
        s sVar3 = new s("NONE", 2);
        NONE = sVar3;
        s sVar4 = new s("REUSABLE_COUNT", 3);
        REUSABLE_COUNT = sVar4;
        s sVar5 = new s("TITLE", 4);
        TITLE = sVar5;
        s[] sVarArr = {sVar, sVar2, sVar3, sVar4, sVar5};
        $VALUES = sVarArr;
        $ENTRIES = vc.s.n(sVarArr);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
