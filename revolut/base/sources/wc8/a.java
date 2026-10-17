package wc8;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CONSENT_GIVEN;
    public static final a CONSENT_NOT_GIVEN;
    public static final a PROMPT_VIEWED;

    static {
        a aVar = new a("PROMPT_VIEWED", 0);
        PROMPT_VIEWED = aVar;
        a aVar2 = new a("CONSENT_GIVEN", 1);
        CONSENT_GIVEN = aVar2;
        a aVar3 = new a("CONSENT_NOT_GIVEN", 2);
        CONSENT_NOT_GIVEN = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
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
