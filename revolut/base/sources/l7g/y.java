package l7g;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class y {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y[] $VALUES;

    @NotNull
    public static final x Companion;
    public static final y FEMALE;
    public static final y MALE;
    public static final y UNKNOWN;

    static {
        y yVar = new y("MALE", 0);
        MALE = yVar;
        y yVar2 = new y("FEMALE", 1);
        FEMALE = yVar2;
        y yVar3 = new y("UNKNOWN", 2);
        UNKNOWN = yVar3;
        y[] yVarArr = {yVar, yVar2, yVar3};
        $VALUES = yVarArr;
        $ENTRIES = vc.s.n(yVarArr);
        Companion = new x();
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) $VALUES.clone();
    }
}
