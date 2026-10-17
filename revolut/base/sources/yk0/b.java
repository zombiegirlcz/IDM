package yk0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b E164;
    public static final b INTERNATIONAL;
    public static final b NATIONAL;
    public static final b RFC3966;

    static {
        b bVar = new b("E164", 0);
        E164 = bVar;
        b bVar2 = new b("INTERNATIONAL", 1);
        INTERNATIONAL = bVar2;
        b bVar3 = new b("NATIONAL", 2);
        NATIONAL = bVar3;
        b bVar4 = new b("RFC3966", 3);
        RFC3966 = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
