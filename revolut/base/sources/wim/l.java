package wim;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l CONTEXT;
    public static final l EXTENSION_RECEIVER;
    public static final l INSTANCE;
    public static final l VALUE;

    static {
        l lVar = new l("INSTANCE", 0);
        INSTANCE = lVar;
        l lVar2 = new l("CONTEXT", 1);
        CONTEXT = lVar2;
        l lVar3 = new l("EXTENSION_RECEIVER", 2);
        EXTENSION_RECEIVER = lVar3;
        l lVar4 = new l("VALUE", 3);
        VALUE = lVar4;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4};
        $VALUES = lVarArr;
        $ENTRIES = vc.s.n(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
