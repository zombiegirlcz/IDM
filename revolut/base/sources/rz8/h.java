package rz8;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import rwg.e0;
import vc.s;
import yhm.j;
import yhm.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    @NotNull
    public static final g Companion;
    public static final h GRID;
    public static final h LIST_LARGE;
    public static final h LIST_SMALL;

    static {
        h hVar = new h("LIST_SMALL", 0);
        LIST_SMALL = hVar;
        h hVar2 = new h("LIST_LARGE", 1);
        LIST_LARGE = hVar2;
        h hVar3 = new h("GRID", 2);
        GRID = hVar3;
        h[] hVarArr = {hVar, hVar2, hVar3};
        $VALUES = hVarArr;
        $ENTRIES = s.n(hVarArr);
        Companion = new g();
        $cachedSerializer$delegate = j.c(k.PUBLICATION, new e0(16));
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
