package lmm;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b BASIC;
    public static final b BODY;
    public static final b HEADERS;
    public static final b NONE;

    static {
        b bVar = new b("NONE", 0);
        NONE = bVar;
        b bVar2 = new b("BASIC", 1);
        BASIC = bVar2;
        b bVar3 = new b("HEADERS", 2);
        HEADERS = bVar3;
        b bVar4 = new b("BODY", 3);
        BODY = bVar4;
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
