package ty8;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e ACCESS_TOKEN_EXPIRED;
    public static final e INVALID_SETTINGS;
    public static final e INVALID_VERIFICATION;
    public static final e UNKNOWN;

    static {
        e eVar = new e("ACCESS_TOKEN_EXPIRED", 0);
        ACCESS_TOKEN_EXPIRED = eVar;
        e eVar2 = new e("INVALID_VERIFICATION", 1);
        INVALID_VERIFICATION = eVar2;
        e eVar3 = new e("INVALID_SETTINGS", 2);
        INVALID_SETTINGS = eVar3;
        e eVar4 = new e("UNKNOWN", 3);
        UNKNOWN = eVar4;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
        $VALUES = eVarArr;
        $ENTRIES = vc.s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
