package v30;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s METAL;
    public static final s NONE;
    public static final s PREMIUM;
    public static final s PRIVATE;
    public static final s STANDARD;
    public static final s ULTRA;

    static {
        s sVar = new s("NONE", 0);
        NONE = sVar;
        s sVar2 = new s("STANDARD", 1);
        STANDARD = sVar2;
        s sVar3 = new s("PREMIUM", 2);
        PREMIUM = sVar3;
        s sVar4 = new s("METAL", 3);
        METAL = sVar4;
        s sVar5 = new s("ULTRA", 4);
        ULTRA = sVar5;
        s sVar6 = new s("PRIVATE", 5);
        PRIVATE = sVar6;
        s[] sVarArr = {sVar, sVar2, sVar3, sVar4, sVar5, sVar6};
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
