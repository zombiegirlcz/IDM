package m1c;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    @NotNull
    public static final k Companion;
    public static final l ICON;
    public static final l IMAGE;
    public static final l UNKNOWN;

    static {
        l lVar = new l("IMAGE", 0);
        IMAGE = lVar;
        l lVar2 = new l("ICON", 1);
        ICON = lVar2;
        l lVar3 = new l("UNKNOWN", 2);
        UNKNOWN = lVar3;
        l[] lVarArr = {lVar, lVar2, lVar3};
        $VALUES = lVarArr;
        $ENTRIES = vc.s.n(lVarArr);
        Companion = new k();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new m05.d(9));
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
