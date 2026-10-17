package agb;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a NON_SALARIED;
    public static final a NON_SALARIED_UK;
    public static final a SALARIED;

    @NotNull
    private final String value;

    static {
        a aVar = new a("SALARIED", 0, "salary-account-product-article-salaried");
        SALARIED = aVar;
        a aVar2 = new a("NON_SALARIED", 1, "salary-account-product-article-non-salaried");
        NON_SALARIED = aVar2;
        a aVar3 = new a("NON_SALARIED_UK", 2, "salary-account-product-article-non-salaried-uk");
        NON_SALARIED_UK = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
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
