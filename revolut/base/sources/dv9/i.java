package dv9;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i BLOCKED_BY_TOO_MANY_USERS;
    public static final i OPTED_OUT;
    public static final i TEXT_NOT_SUPPORTED;
    public static final i UNSUPPORTED;

    static {
        i iVar = new i("OPTED_OUT", 0);
        OPTED_OUT = iVar;
        i iVar2 = new i("UNSUPPORTED", 1);
        UNSUPPORTED = iVar2;
        i iVar3 = new i("TEXT_NOT_SUPPORTED", 2);
        TEXT_NOT_SUPPORTED = iVar3;
        i iVar4 = new i("BLOCKED_BY_TOO_MANY_USERS", 3);
        BLOCKED_BY_TOO_MANY_USERS = iVar4;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4};
        $VALUES = iVarArr;
        $ENTRIES = vc.s.n(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
