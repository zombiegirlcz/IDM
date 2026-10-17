package q84;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b CREDIT_CARD;
    public static final b LOAN;
    public static final b MORTGAGE;
    public static final b OTHER;

    static {
        b bVar = new b("MORTGAGE", 0);
        MORTGAGE = bVar;
        b bVar2 = new b("LOAN", 1);
        LOAN = bVar2;
        b bVar3 = new b("CREDIT_CARD", 2);
        CREDIT_CARD = bVar3;
        b bVar4 = new b("OTHER", 3);
        OTHER = bVar4;
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
