package yt8;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i FAILED;
    public static final i NONE;
    public static final i PASSED;
    public static final i PENDING;

    static {
        i iVar = new i("NONE", 0);
        NONE = iVar;
        i iVar2 = new i("PENDING", 1);
        PENDING = iVar2;
        i iVar3 = new i("PASSED", 2);
        PASSED = iVar3;
        i iVar4 = new i("FAILED", 3);
        FAILED = iVar4;
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
