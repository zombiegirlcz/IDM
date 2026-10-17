package ez0;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BUSINESS;
    public static final a INVEST;
    public static final a INVEST_PRO;
    public static final a JUNIOR;
    public static final a RETAIL;
    public static final a REVOLUT_X;

    @NotNull
    private final String assetName;

    static {
        a aVar = new a("RETAIL", 0, "retail");
        RETAIL = aVar;
        a aVar2 = new a("REVOLUT_X", 1, "revolut_x");
        REVOLUT_X = aVar2;
        a aVar3 = new a("BUSINESS", 2, "business");
        BUSINESS = aVar3;
        a aVar4 = new a("JUNIOR", 3, "junior");
        JUNIOR = aVar4;
        a aVar5 = new a("INVEST", 4, "invest");
        INVEST = aVar5;
        a aVar6 = new a("INVEST_PRO", 5, "invest_pro");
        INVEST_PRO = aVar6;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, String str2) {
        this.assetName = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String a() {
        return this.assetName;
    }
}
