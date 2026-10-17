package t7h;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    @NotNull
    public static final e Companion;
    public static final f KILLSWITCH;
    public static final f NON_MARGINABLE_INSTRUMENT;

    static {
        f fVar = new f("KILLSWITCH", 0);
        KILLSWITCH = fVar;
        f fVar2 = new f("NON_MARGINABLE_INSTRUMENT", 1);
        NON_MARGINABLE_INSTRUMENT = fVar2;
        f[] fVarArr = {fVar, fVar2};
        $VALUES = fVarArr;
        $ENTRIES = vc.s.n(fVarArr);
        Companion = new e();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new t73.h(10));
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
