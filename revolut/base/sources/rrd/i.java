package rrd;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i NOTE_WONT_VERIFY;
    public static final i TOTAL_ASSETS;
    public static final i TOTAL_ASSETS_AI;
    public static final i VALUES_NOT_VERIFIED;
    public static final i VALUES_NOT_VERIFIED_PROPERTY;

    static {
        i iVar = new i("TOTAL_ASSETS", 0);
        TOTAL_ASSETS = iVar;
        i iVar2 = new i("TOTAL_ASSETS_AI", 1);
        TOTAL_ASSETS_AI = iVar2;
        i iVar3 = new i("NOTE_WONT_VERIFY", 2);
        NOTE_WONT_VERIFY = iVar3;
        i iVar4 = new i("VALUES_NOT_VERIFIED", 3);
        VALUES_NOT_VERIFIED = iVar4;
        i iVar5 = new i("VALUES_NOT_VERIFIED_PROPERTY", 4);
        VALUES_NOT_VERIFIED_PROPERTY = iVar5;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5};
        $VALUES = iVarArr;
        $ENTRIES = s.n(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
