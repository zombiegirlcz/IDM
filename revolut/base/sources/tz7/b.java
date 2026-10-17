package tz7;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b FUTURE_DATE;
    public static final b INVALID_FORMAT;
    public static final b MAX_PAST_DATE;
    public static final b NONE;

    static {
        b bVar = new b("NONE", 0);
        NONE = bVar;
        b bVar2 = new b("FUTURE_DATE", 1);
        FUTURE_DATE = bVar2;
        b bVar3 = new b("MAX_PAST_DATE", 2);
        MAX_PAST_DATE = bVar3;
        b bVar4 = new b("INVALID_FORMAT", 3);
        INVALID_FORMAT = bVar4;
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
