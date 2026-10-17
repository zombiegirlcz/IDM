package ysj;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import yna.j1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class v {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final v CUSTOM;

    @NotNull
    public static final u Companion;
    public static final v PREDEFINED;

    static {
        v vVar = new v("PREDEFINED", 0);
        PREDEFINED = vVar;
        v vVar2 = new v("CUSTOM", 1);
        CUSTOM = vVar2;
        v[] vVarArr = {vVar, vVar2};
        $VALUES = vVarArr;
        $ENTRIES = vc.s.n(vVarArr);
        Companion = new u();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new j1(18));
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }
}
