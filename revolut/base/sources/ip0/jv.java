package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class jv {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ jv[] $VALUES;
    public static final jv DEFAULT;
    public static final jv EMPHASISED;

    static {
        jv jvVar = new jv("DEFAULT", 0);
        DEFAULT = jvVar;
        jv jvVar2 = new jv("EMPHASISED", 1);
        EMPHASISED = jvVar2;
        jv[] jvVarArr = {jvVar, jvVar2};
        $VALUES = jvVarArr;
        $ENTRIES = vc.s.n(jvVarArr);
    }

    public static jv valueOf(String str) {
        return (jv) Enum.valueOf(jv.class, str);
    }

    public static jv[] values() {
        return (jv[]) $VALUES.clone();
    }
}
