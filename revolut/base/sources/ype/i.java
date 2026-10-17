package ype;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i CANT_PROVIDE;
    public static final i DELETE;
    public static final i NOT_NOW;

    static {
        i iVar = new i("DELETE", 0);
        DELETE = iVar;
        i iVar2 = new i("NOT_NOW", 1);
        NOT_NOW = iVar2;
        i iVar3 = new i("CANT_PROVIDE", 2);
        CANT_PROVIDE = iVar3;
        i[] iVarArr = {iVar, iVar2, iVar3};
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
