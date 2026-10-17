package aw8;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ACCESS_DENIED;
    public static final a CANCEL;
    public static final a DISABLE;
    public static final a SUCCESS;

    static {
        a aVar = new a("SUCCESS", 0);
        SUCCESS = aVar;
        a aVar2 = new a("ACCESS_DENIED", 1);
        ACCESS_DENIED = aVar2;
        a aVar3 = new a("CANCEL", 2);
        CANCEL = aVar3;
        a aVar4 = new a("DISABLE", 3);
        DISABLE = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
