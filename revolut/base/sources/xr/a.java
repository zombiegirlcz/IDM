package xr;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a FILE_ABSENT;
    public static final a NETWORK_ERROR;
    public static final a SUCCESS;
    public static final a UPDATE_TOKEN;

    static {
        a aVar = new a("SUCCESS", 0);
        SUCCESS = aVar;
        a aVar2 = new a("UPDATE_TOKEN", 1);
        UPDATE_TOKEN = aVar2;
        a aVar3 = new a("NETWORK_ERROR", 2);
        NETWORK_ERROR = aVar3;
        a aVar4 = new a("FILE_ABSENT", 3);
        FILE_ABSENT = aVar4;
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
