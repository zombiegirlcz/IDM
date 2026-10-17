package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class jq {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ jq[] $VALUES;
    public static final jq NEGATIVE;
    public static final jq POSITIVE;

    static {
        jq jqVar = new jq("POSITIVE", 0);
        POSITIVE = jqVar;
        jq jqVar2 = new jq("NEGATIVE", 1);
        NEGATIVE = jqVar2;
        jq[] jqVarArr = {jqVar, jqVar2};
        $VALUES = jqVarArr;
        $ENTRIES = vc.s.n(jqVarArr);
    }

    public static jq valueOf(String str) {
        return (jq) Enum.valueOf(jq.class, str);
    }

    public static jq[] values() {
        return (jq[]) $VALUES.clone();
    }
}
