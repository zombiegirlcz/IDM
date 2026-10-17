package ejb;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;

    @NotNull
    public static final n Companion;
    public static final o INTEREST;
    public static final o MONEY_IN;
    public static final o MONEY_OUT;

    static {
        o oVar = new o("INTEREST", 0);
        INTEREST = oVar;
        o oVar2 = new o("MONEY_IN", 1);
        MONEY_IN = oVar2;
        o oVar3 = new o("MONEY_OUT", 2);
        MONEY_OUT = oVar3;
        o[] oVarArr = {oVar, oVar2, oVar3};
        $VALUES = oVarArr;
        $ENTRIES = s.n(oVarArr);
        Companion = new n();
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
