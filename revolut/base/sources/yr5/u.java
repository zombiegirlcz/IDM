package yr5;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import yna.j1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class u {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final u ALL;

    @NotNull
    public static final t Companion;
    public static final u FIVE_YEARS;
    public static final u ONE_DAY;
    public static final u ONE_MONTH;
    public static final u ONE_WEEK;
    public static final u ONE_YEAR;
    public static final u SIX_MONTHS;

    static {
        u uVar = new u("ONE_DAY", 0);
        ONE_DAY = uVar;
        u uVar2 = new u("ONE_WEEK", 1);
        ONE_WEEK = uVar2;
        u uVar3 = new u("ONE_MONTH", 2);
        ONE_MONTH = uVar3;
        u uVar4 = new u("SIX_MONTHS", 3);
        SIX_MONTHS = uVar4;
        u uVar5 = new u("ONE_YEAR", 4);
        ONE_YEAR = uVar5;
        u uVar6 = new u("FIVE_YEARS", 5);
        FIVE_YEARS = uVar6;
        u uVar7 = new u("ALL", 6);
        ALL = uVar7;
        u[] uVarArr = {uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7};
        $VALUES = uVarArr;
        $ENTRIES = vc.s.n(uVarArr);
        Companion = new t();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new j1(6));
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }
}
