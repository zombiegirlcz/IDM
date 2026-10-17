package t7h;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    @NotNull
    public static final j Companion;
    public static final k FINAL_CALL;
    public static final k GOOD;
    public static final k LIQUIDATION;
    public static final k MARGIN_CALL;
    public static final k UNKNOWN;

    static {
        k kVar = new k("GOOD", 0);
        GOOD = kVar;
        k kVar2 = new k("MARGIN_CALL", 1);
        MARGIN_CALL = kVar2;
        k kVar3 = new k("FINAL_CALL", 2);
        FINAL_CALL = kVar3;
        k kVar4 = new k("LIQUIDATION", 3);
        LIQUIDATION = kVar4;
        k kVar5 = new k("UNKNOWN", 4);
        UNKNOWN = kVar5;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5};
        $VALUES = kVarArr;
        $ENTRIES = vc.s.n(kVarArr);
        Companion = new j();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new t73.h(12));
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
