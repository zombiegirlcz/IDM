package gm0;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final c APP;

    @NotNull
    public static final b Companion;
    public static final c GLOBAL;

    @NotNull
    private final String value;

    static {
        c cVar = new c("GLOBAL", 0, "GLOBAL");
        GLOBAL = cVar;
        c cVar2 = new c("APP", 1, "APP");
        APP = cVar2;
        c[] cVarArr = {cVar, cVar2};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
        Companion = new b();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new gla.k(3));
    }

    public c(String str, int i, String str2) {
        this.value = str2;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final String b() {
        return this.value;
    }
}
