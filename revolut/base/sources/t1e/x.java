package t1e;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class x {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x[] $VALUES;

    @NotNull
    public static final w Companion;
    public static final x DISCOUNT;
    public static final x EARN;
    public static final x MSI;
    public static final x REDEEM;

    static {
        x xVar = new x("EARN", 0);
        EARN = xVar;
        x xVar2 = new x("REDEEM", 1);
        REDEEM = xVar2;
        x xVar3 = new x("MSI", 2);
        MSI = xVar3;
        x xVar4 = new x("DISCOUNT", 3);
        DISCOUNT = xVar4;
        x[] xVarArr = {xVar, xVar2, xVar3, xVar4};
        $VALUES = xVarArr;
        $ENTRIES = vc.s.n(xVarArr);
        Companion = new w();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) $VALUES.clone();
    }
}
