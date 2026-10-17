package x3g;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b FULL_REFUND;
    public static final b NO_REFUND;
    public static final b PARTIAL_REFUND;

    static {
        b bVar = new b("FULL_REFUND", 0);
        FULL_REFUND = bVar;
        b bVar2 = new b("PARTIAL_REFUND", 1);
        PARTIAL_REFUND = bVar2;
        b bVar3 = new b("NO_REFUND", 2);
        NO_REFUND = bVar3;
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
