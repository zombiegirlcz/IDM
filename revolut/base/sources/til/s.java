package til;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s BACK_ARROW;
    public static final s CROSS;

    static {
        s sVar = new s("CROSS", 0);
        CROSS = sVar;
        s sVar2 = new s("BACK_ARROW", 1);
        BACK_ARROW = sVar2;
        s[] sVarArr = {sVar, sVar2};
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
