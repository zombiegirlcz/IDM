package s69;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l LEGACY_INBOX;
    public static final l REVOLUT_FEED;

    static {
        l lVar = new l("LEGACY_INBOX", 0);
        LEGACY_INBOX = lVar;
        l lVar2 = new l("REVOLUT_FEED", 1);
        REVOLUT_FEED = lVar2;
        l[] lVarArr = {lVar, lVar2};
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
