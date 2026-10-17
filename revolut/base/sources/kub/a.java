package kub;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CACHE_IMMEDIATE;
    public static final a CACHE_WAIT_FOR_SYNCHRONISATION;
    public static final a NETWORK_IMMEDIATE;
    public static final a NETWORK_IMMEDIATE_AND_FORCE_UPDATE;

    static {
        a aVar = new a("CACHE_IMMEDIATE", 0);
        CACHE_IMMEDIATE = aVar;
        a aVar2 = new a("CACHE_WAIT_FOR_SYNCHRONISATION", 1);
        CACHE_WAIT_FOR_SYNCHRONISATION = aVar2;
        a aVar3 = new a("NETWORK_IMMEDIATE", 2);
        NETWORK_IMMEDIATE = aVar3;
        a aVar4 = new a("NETWORK_IMMEDIATE_AND_FORCE_UPDATE", 3);
        NETWORK_IMMEDIATE_AND_FORCE_UPDATE = aVar4;
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
