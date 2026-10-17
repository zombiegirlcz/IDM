package ofa;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    @NotNull
    public static final i Companion;
    public static final j PHYSICAL;
    public static final j VIRTUAL;

    static {
        j jVar = new j("PHYSICAL", 0);
        PHYSICAL = jVar;
        j jVar2 = new j("VIRTUAL", 1);
        VIRTUAL = jVar2;
        j[] jVarArr = {jVar, jVar2};
        $VALUES = jVarArr;
        $ENTRIES = vc.s.n(jVarArr);
        Companion = new i();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new ob1.e(29));
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
