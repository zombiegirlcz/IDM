package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class qa {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ qa[] $VALUES;
    public static final qa PRIMARY;
    public static final qa SECONDARY;

    static {
        qa qaVar = new qa("PRIMARY", 0);
        PRIMARY = qaVar;
        qa qaVar2 = new qa("SECONDARY", 1);
        SECONDARY = qaVar2;
        qa[] qaVarArr = {qaVar, qaVar2};
        $VALUES = qaVarArr;
        $ENTRIES = vc.s.n(qaVarArr);
    }

    public static qa valueOf(String str) {
        return (qa) Enum.valueOf(qa.class, str);
    }

    public static qa[] values() {
        return (qa[]) $VALUES.clone();
    }
}
