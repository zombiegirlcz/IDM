package e18;

import dv9.r;
import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final h ATTRIBUTED;

    @NotNull
    public static final g Companion;
    public static final h PENDING;

    static {
        h hVar = new h("PENDING", 0);
        PENDING = hVar;
        h hVar2 = new h("ATTRIBUTED", 1);
        ATTRIBUTED = hVar2;
        h[] hVarArr = {hVar, hVar2};
        $VALUES = hVarArr;
        $ENTRIES = s.n(hVarArr);
        Companion = new g();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new r(29));
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
