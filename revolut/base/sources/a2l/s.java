package a2l;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s GET_STARTED;
    public static final s POPUP;
    public static final s UNKNOWN;
    public static final s UPGRADE;
    public static final s URL;

    static {
        s sVar = new s("GET_STARTED", 0);
        GET_STARTED = sVar;
        s sVar2 = new s("URL", 1);
        URL = sVar2;
        s sVar3 = new s("UPGRADE", 2);
        UPGRADE = sVar3;
        s sVar4 = new s("POPUP", 3);
        POPUP = sVar4;
        s sVar5 = new s("UNKNOWN", 4);
        UNKNOWN = sVar5;
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
