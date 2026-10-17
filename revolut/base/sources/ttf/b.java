package ttf;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b CO_IN_FX_CODES;
    public static final b CO_OUT_FX_CODES;
    public static final b IL_TRANSFER_REASON;
    public static final b UNKNOWN;

    static {
        b bVar = new b("CO_OUT_FX_CODES", 0);
        CO_OUT_FX_CODES = bVar;
        b bVar2 = new b("CO_IN_FX_CODES", 1);
        CO_IN_FX_CODES = bVar2;
        b bVar3 = new b("IL_TRANSFER_REASON", 2);
        IL_TRANSFER_REASON = bVar3;
        b bVar4 = new b("UNKNOWN", 3);
        UNKNOWN = bVar4;
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
