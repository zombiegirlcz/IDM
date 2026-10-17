package r40;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i ACCEPT_CALL;
    public static final i END_CHAT;
    public static final i NONE;
    public static final i OPEN_CALL_REQUEST;
    public static final i OPEN_CHAT;
    public static final i RATE_CALL_REQUEST;
    public static final i RETURN_TO_CALL;

    static {
        i iVar = new i("NONE", 0);
        NONE = iVar;
        i iVar2 = new i("OPEN_CHAT", 1);
        OPEN_CHAT = iVar2;
        i iVar3 = new i("END_CHAT", 2);
        END_CHAT = iVar3;
        i iVar4 = new i("OPEN_CALL_REQUEST", 3);
        OPEN_CALL_REQUEST = iVar4;
        i iVar5 = new i("ACCEPT_CALL", 4);
        ACCEPT_CALL = iVar5;
        i iVar6 = new i("RETURN_TO_CALL", 5);
        RETURN_TO_CALL = iVar6;
        i iVar7 = new i("RATE_CALL_REQUEST", 6);
        RATE_CALL_REQUEST = iVar7;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7};
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
