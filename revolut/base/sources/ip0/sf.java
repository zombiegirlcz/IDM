package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class sf {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ sf[] $VALUES;
    public static final sf NEGATIVE;
    public static final sf POSITIVE;

    static {
        sf sfVar = new sf("POSITIVE", 0);
        POSITIVE = sfVar;
        sf sfVar2 = new sf("NEGATIVE", 1);
        NEGATIVE = sfVar2;
        sf[] sfVarArr = {sfVar, sfVar2};
        $VALUES = sfVarArr;
        $ENTRIES = vc.s.n(sfVarArr);
    }

    public static sf valueOf(String str) {
        return (sf) Enum.valueOf(sf.class, str);
    }

    public static sf[] values() {
        return (sf[]) $VALUES.clone();
    }
}
