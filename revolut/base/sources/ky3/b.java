package ky3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b EDITABLE;
    public static final b IN_REVIEW;
    public static final b MISSING_INFO;
    public static final b NOT_EDITABLE;

    static {
        b bVar = new b("EDITABLE", 0);
        EDITABLE = bVar;
        b bVar2 = new b("IN_REVIEW", 1);
        IN_REVIEW = bVar2;
        b bVar3 = new b("MISSING_INFO", 2);
        MISSING_INFO = bVar3;
        b bVar4 = new b("NOT_EDITABLE", 3);
        NOT_EDITABLE = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
