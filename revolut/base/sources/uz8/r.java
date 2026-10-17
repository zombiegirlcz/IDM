package uz8;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class r {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    @NotNull
    public static final q Companion;
    public static final r INCENTIVE_ENDED;
    public static final r PAID;
    public static final r PAYABLE;
    public static final r PAYMENT_PENDING;
    public static final r UNINITIALIZED;

    static {
        r rVar = new r("UNINITIALIZED", 0);
        UNINITIALIZED = rVar;
        r rVar2 = new r("PAYABLE", 1);
        PAYABLE = rVar2;
        r rVar3 = new r("PAYMENT_PENDING", 2);
        PAYMENT_PENDING = rVar3;
        r rVar4 = new r("PAID", 3);
        PAID = rVar4;
        r rVar5 = new r("INCENTIVE_ENDED", 4);
        INCENTIVE_ENDED = rVar5;
        r[] rVarArr = {rVar, rVar2, rVar3, rVar4, rVar5};
        $VALUES = rVarArr;
        $ENTRIES = vc.s.n(rVarArr);
        Companion = new q();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new ux7.g(27));
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
