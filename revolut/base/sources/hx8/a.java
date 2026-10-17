package hx8;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a DEVICE_NOT_SUPPORTED;
    public static final a NETWORK_ERROR;
    public static final a SERVICE_UNAVAILABLE;
    public static final a UNKNOWN_ERROR;

    static {
        a aVar = new a("DEVICE_NOT_SUPPORTED", 0);
        DEVICE_NOT_SUPPORTED = aVar;
        a aVar2 = new a("NETWORK_ERROR", 1);
        NETWORK_ERROR = aVar2;
        a aVar3 = new a("SERVICE_UNAVAILABLE", 2);
        SERVICE_UNAVAILABLE = aVar3;
        a aVar4 = new a("UNKNOWN_ERROR", 3);
        UNKNOWN_ERROR = aVar4;
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
