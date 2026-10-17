package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class qw {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ qw[] $VALUES;
    public static final qw CIRCULAR_PIN;

    static {
        qw qwVar = new qw("CIRCULAR_PIN", 0);
        CIRCULAR_PIN = qwVar;
        qw[] qwVarArr = {qwVar};
        $VALUES = qwVarArr;
        $ENTRIES = vc.s.n(qwVarArr);
    }

    public static qw valueOf(String str) {
        return (qw) Enum.valueOf(qw.class, str);
    }

    public static qw[] values() {
        return (qw[]) $VALUES.clone();
    }
}
