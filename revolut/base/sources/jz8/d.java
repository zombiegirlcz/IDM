package jz8;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    @NotNull
    public static final c Companion;
    public static final d NEW;
    public static final d TRENDING;

    static {
        d dVar = new d("NEW", 0);
        NEW = dVar;
        d dVar2 = new d("TRENDING", 1);
        TRENDING = dVar2;
        d[] dVarArr = {dVar, dVar2};
        $VALUES = dVarArr;
        $ENTRIES = vc.s.n(dVarArr);
        Companion = new c();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new jxi.a(14));
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
