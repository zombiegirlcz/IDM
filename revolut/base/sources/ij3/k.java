package ij3;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final k ALL_SCREENS;

    @NotNull
    public static final j Companion;
    public static final k END_SCREEN;
    public static final k NONE;

    static {
        k kVar = new k("NONE", 0);
        NONE = kVar;
        k kVar2 = new k("ALL_SCREENS", 1);
        ALL_SCREENS = kVar2;
        k kVar3 = new k("END_SCREEN", 2);
        END_SCREEN = kVar3;
        k[] kVarArr = {kVar, kVar2, kVar3};
        $VALUES = kVarArr;
        $ENTRIES = vc.s.n(kVarArr);
        Companion = new j();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new igb.j(3));
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
