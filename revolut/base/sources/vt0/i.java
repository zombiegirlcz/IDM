package vt0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i ERROR;
    public static final i LOADING;
    public static final i NONE;
    public static final i PLAYBACK;

    static {
        i iVar = new i("NONE", 0);
        NONE = iVar;
        i iVar2 = new i("LOADING", 1);
        LOADING = iVar2;
        i iVar3 = new i("PLAYBACK", 2);
        PLAYBACK = iVar3;
        i iVar4 = new i("ERROR", 3);
        ERROR = iVar4;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4};
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
