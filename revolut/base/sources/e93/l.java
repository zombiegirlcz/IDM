package e93;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;

    @NotNull
    public static final k Companion;
    public static final l LOCKED;
    public static final l UNLOCKED;

    static {
        l lVar = new l("LOCKED", 0);
        LOCKED = lVar;
        l lVar2 = new l("UNLOCKED", 1);
        UNLOCKED = lVar2;
        l[] lVarArr = {lVar, lVar2};
        $VALUES = lVarArr;
        $ENTRIES = vc.s.n(lVarArr);
        Companion = new k();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
