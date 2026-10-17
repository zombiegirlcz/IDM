package t89;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CREDIT_TERMS;
    public static final a CREDIT_TERMS_NO_CONSENTS;
    public static final a NO_TERMS;
    public static final a TERMS;

    static {
        a aVar = new a("NO_TERMS", 0);
        NO_TERMS = aVar;
        a aVar2 = new a("TERMS", 1);
        TERMS = aVar2;
        a aVar3 = new a("CREDIT_TERMS", 2);
        CREDIT_TERMS = aVar3;
        a aVar4 = new a("CREDIT_TERMS_NO_CONSENTS", 3);
        CREDIT_TERMS_NO_CONSENTS = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
