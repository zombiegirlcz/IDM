package cfi;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b CANCELLABLE_IF_BAD_WEATHER;
    public static final b CANCELLABLE_IF_MIN_VISITORS_NOT_MET;
    public static final b UNKNOWN;

    static {
        b bVar = new b("CANCELLABLE_IF_BAD_WEATHER", 0);
        CANCELLABLE_IF_BAD_WEATHER = bVar;
        b bVar2 = new b("CANCELLABLE_IF_MIN_VISITORS_NOT_MET", 1);
        CANCELLABLE_IF_MIN_VISITORS_NOT_MET = bVar2;
        b bVar3 = new b("UNKNOWN", 2);
        UNKNOWN = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
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
