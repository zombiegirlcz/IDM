package kq2;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l CROSS_BORDER_TRANSFER;

    @NotNull
    public static final k Companion;
    public static final l INTERNATIONAL_TRANSFER;
    public static final l LOCAL_TRANSFER;
    public static final l SWIFT_NON_USD_TRANSFER;
    public static final l SWIFT_USD_TRANSFER;

    static {
        l lVar = new l("LOCAL_TRANSFER", 0);
        LOCAL_TRANSFER = lVar;
        l lVar2 = new l("CROSS_BORDER_TRANSFER", 1);
        CROSS_BORDER_TRANSFER = lVar2;
        l lVar3 = new l("INTERNATIONAL_TRANSFER", 2);
        INTERNATIONAL_TRANSFER = lVar3;
        l lVar4 = new l("SWIFT_USD_TRANSFER", 3);
        SWIFT_USD_TRANSFER = lVar4;
        l lVar5 = new l("SWIFT_NON_USD_TRANSFER", 4);
        SWIFT_NON_USD_TRANSFER = lVar5;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5};
        $VALUES = lVarArr;
        $ENTRIES = s.n(lVarArr);
        Companion = new k();
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
