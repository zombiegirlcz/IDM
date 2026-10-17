package qh0;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    @NotNull
    public static final i Companion;
    public static final j DISCOURAGED;
    public static final j PREFERRED;
    public static final j REQUIRED;

    static {
        j jVar = new j("DISCOURAGED", 0);
        DISCOURAGED = jVar;
        j jVar2 = new j("PREFERRED", 1);
        PREFERRED = jVar2;
        j jVar3 = new j("REQUIRED", 2);
        REQUIRED = jVar3;
        j[] jVarArr = {jVar, jVar2, jVar3};
        $VALUES = jVarArr;
        $ENTRIES = vc.s.n(jVarArr);
        Companion = new i();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new d(4));
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
