package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class qv {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ qv[] $VALUES;
    public static final qv GREY;
    public static final qv PURPLE_GREY;

    static {
        qv qvVar = new qv("PURPLE_GREY", 0);
        PURPLE_GREY = qvVar;
        qv qvVar2 = new qv("GREY", 1);
        GREY = qvVar2;
        qv[] qvVarArr = {qvVar, qvVar2};
        $VALUES = qvVarArr;
        $ENTRIES = vc.s.n(qvVarArr);
    }

    public static qv valueOf(String str) {
        return (qv) Enum.valueOf(qv.class, str);
    }

    public static qv[] values() {
        return (qv[]) $VALUES.clone();
    }
}
