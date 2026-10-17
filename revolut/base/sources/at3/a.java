package at3;

import kotlin.enums.EnumEntries;
import ks3.c;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class a implements c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CREDIT_SELECTION_AND_LOAN_SETUP;
    public static final a FINAL_OFFER;
    public static final a INTRO;

    static {
        a aVar = new a("INTRO", 0);
        INTRO = aVar;
        a aVar2 = new a("CREDIT_SELECTION_AND_LOAN_SETUP", 1);
        CREDIT_SELECTION_AND_LOAN_SETUP = aVar2;
        a aVar3 = new a("FINAL_OFFER", 2);
        FINAL_OFFER = aVar3;
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
