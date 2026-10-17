package nu3;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a SAVE_FOR_LATER;
    public static final a SELECT_STATEMENT_DUE_DAY;
    public static final a SHOW_BENEFITS;
    public static final a SHOW_PLAN_SELECTION;

    @NotNull
    private final String value;

    static {
        a aVar = new a("SHOW_BENEFITS", 0, "showBenefits");
        SHOW_BENEFITS = aVar;
        a aVar2 = new a("SELECT_STATEMENT_DUE_DAY", 1, "dueDaySelection");
        SELECT_STATEMENT_DUE_DAY = aVar2;
        a aVar3 = new a("SAVE_FOR_LATER", 2, "saveForLater");
        SAVE_FOR_LATER = aVar3;
        a aVar4 = new a("SHOW_PLAN_SELECTION", 3, "showPlanSelection");
        SHOW_PLAN_SELECTION = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, String str2) {
        this.value = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
