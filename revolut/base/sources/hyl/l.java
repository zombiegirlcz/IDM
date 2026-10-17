package hyl;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    @NotNull
    public static final k Companion;
    public static final l HIGH;
    public static final l LOW;
    public static final l MEDIUM;

    static {
        l lVar = new l("HIGH", 0);
        HIGH = lVar;
        l lVar2 = new l("MEDIUM", 1);
        MEDIUM = lVar2;
        l lVar3 = new l("LOW", 2);
        LOW = lVar3;
        l[] lVarArr = {lVar, lVar2, lVar3};
        $VALUES = lVarArr;
        $ENTRIES = vc.s.n(lVarArr);
        Companion = new k();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new hul.c(27));
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
