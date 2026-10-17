package s77;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
@mlm.g
public final class z {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ z[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final z APAC;

    @NotNull
    public static final y Companion;
    public static final z EUROPE;
    public static final z US;

    static {
        z zVar = new z("US", 0);
        US = zVar;
        z zVar2 = new z("EUROPE", 1);
        EUROPE = zVar2;
        z zVar3 = new z("APAC", 2);
        APAC = zVar3;
        z[] zVarArr = {zVar, zVar2, zVar3};
        $VALUES = zVarArr;
        $ENTRIES = vc.s.n(zVarArr);
        Companion = new y(0);
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new x(0));
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }
}
