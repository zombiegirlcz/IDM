package j18;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    @NotNull
    public static final e Companion;
    public static final f EARNING_CALL;
    public static final f EXTERNAL_SUGGESTION;
    public static final f FUNDAMENTAL_METRIC_CHANGE;
    public static final f PRICE_MOVEMENT;
    public static final f PRICE_TARGET_CHANGE;
    public static final f REVOLUT_RECOMMENDATION;
    public static final f UNKNOWN;

    static {
        f fVar = new f("PRICE_MOVEMENT", 0);
        PRICE_MOVEMENT = fVar;
        f fVar2 = new f("REVOLUT_RECOMMENDATION", 1);
        REVOLUT_RECOMMENDATION = fVar2;
        f fVar3 = new f("EXTERNAL_SUGGESTION", 2);
        EXTERNAL_SUGGESTION = fVar3;
        f fVar4 = new f("FUNDAMENTAL_METRIC_CHANGE", 3);
        FUNDAMENTAL_METRIC_CHANGE = fVar4;
        f fVar5 = new f("PRICE_TARGET_CHANGE", 4);
        PRICE_TARGET_CHANGE = fVar5;
        f fVar6 = new f("EARNING_CALL", 5);
        EARNING_CALL = fVar6;
        f fVar7 = new f("UNKNOWN", 6);
        UNKNOWN = fVar7;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7};
        $VALUES = fVarArr;
        $ENTRIES = vc.s.n(fVarArr);
        Companion = new e();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new iw4.b(29));
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
