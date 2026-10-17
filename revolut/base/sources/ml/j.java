package ml;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j EXIT_NFC_REQUIRED_FLOW;
    public static final j USER_EXIT_FLOW;

    static {
        j jVar = new j("EXIT_NFC_REQUIRED_FLOW", 0);
        EXIT_NFC_REQUIRED_FLOW = jVar;
        j jVar2 = new j("USER_EXIT_FLOW", 1);
        USER_EXIT_FLOW = jVar2;
        j[] jVarArr = {jVar, jVar2};
        $VALUES = jVarArr;
        $ENTRIES = vc.s.n(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
