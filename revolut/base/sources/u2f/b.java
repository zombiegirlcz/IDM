package u2f;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b MEMBERSHIP_ID;
    public static final b NOT_APPLICABLE;
    public static final b TAX_ID;

    static {
        b bVar = new b("MEMBERSHIP_ID", 0);
        MEMBERSHIP_ID = bVar;
        b bVar2 = new b("TAX_ID", 1);
        TAX_ID = bVar2;
        b bVar3 = new b("NOT_APPLICABLE", 2);
        NOT_APPLICABLE = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        $VALUES = bVarArr;
        $ENTRIES = vc.s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
