package sdl;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    @NotNull
    public static final n Companion;
    public static final o NONE;
    public static final o TOPUP_ONLY;
    public static final o TOPUP_WITHDRAWAL;
    public static final o WITHDRAWAL_ONLY;

    static {
        o oVar = new o("TOPUP_WITHDRAWAL", 0);
        TOPUP_WITHDRAWAL = oVar;
        o oVar2 = new o("WITHDRAWAL_ONLY", 1);
        WITHDRAWAL_ONLY = oVar2;
        o oVar3 = new o("TOPUP_ONLY", 2);
        TOPUP_ONLY = oVar3;
        o oVar4 = new o("NONE", 3);
        NONE = oVar4;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4};
        $VALUES = oVarArr;
        $ENTRIES = vc.s.n(oVarArr);
        Companion = new n();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new s8f.h(16));
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
