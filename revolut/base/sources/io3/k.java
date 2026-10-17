package io3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k ACTIVE;
    public static final k COMPLETE;
    public static final k DELETED;
    public static final k DELISTED;
    public static final k INACTIVE;
    public static final k UNKNOWN;

    static {
        k kVar = new k("ACTIVE", 0);
        ACTIVE = kVar;
        k kVar2 = new k("INACTIVE", 1);
        INACTIVE = kVar2;
        k kVar3 = new k("DELISTED", 2);
        DELISTED = kVar3;
        k kVar4 = new k("DELETED", 3);
        DELETED = kVar4;
        k kVar5 = new k("COMPLETE", 4);
        COMPLETE = kVar5;
        k kVar6 = new k("UNKNOWN", 5);
        UNKNOWN = kVar6;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6};
        $VALUES = kVarArr;
        $ENTRIES = s.n(kVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
