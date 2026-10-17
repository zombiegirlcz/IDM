package qh0;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    @NotNull
    public static final b Companion;
    public static final c DIRECT;
    public static final c ENTERPRISE;
    public static final c INDIRECT;
    public static final c NONE;

    static {
        c cVar = new c("DIRECT", 0);
        DIRECT = cVar;
        c cVar2 = new c("ENTERPRISE", 1);
        ENTERPRISE = cVar2;
        c cVar3 = new c("INDIRECT", 2);
        INDIRECT = cVar3;
        c cVar4 = new c("NONE", 3);
        NONE = cVar4;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        $VALUES = cVarArr;
        $ENTRIES = vc.s.n(cVarArr);
        Companion = new b();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new qba.c(29));
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
