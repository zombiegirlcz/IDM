package wk5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i COMPANY;
    public static final i INDIVIDUAL;
    public static final i UNSET;
    public static final i USER;

    static {
        i iVar = new i("USER", 0);
        USER = iVar;
        i iVar2 = new i("INDIVIDUAL", 1);
        INDIVIDUAL = iVar2;
        i iVar3 = new i("COMPANY", 2);
        COMPANY = iVar3;
        i iVar4 = new i("UNSET", 3);
        UNSET = iVar4;
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
