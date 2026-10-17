package cc1;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CARD_READER_SETTINGS;
    public static final c DEFAULT;
    public static final c LINK_SETTINGS;
    public static final c SETTINGS;
    public static final c TIPS_SETTINGS;

    static {
        c cVar = new c("DEFAULT", 0);
        DEFAULT = cVar;
        c cVar2 = new c("SETTINGS", 1);
        SETTINGS = cVar2;
        c cVar3 = new c("LINK_SETTINGS", 2);
        LINK_SETTINGS = cVar3;
        c cVar4 = new c("TIPS_SETTINGS", 3);
        TIPS_SETTINGS = cVar4;
        c cVar5 = new c("CARD_READER_SETTINGS", 4);
        CARD_READER_SETTINGS = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
