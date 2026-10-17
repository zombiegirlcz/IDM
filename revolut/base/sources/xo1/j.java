package xo1;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j CANCELLED;
    public static final j COMPLETED;
    public static final j DRAFT;
    public static final j FAILED;
    public static final j SCHEDULED;

    static {
        j jVar = new j("DRAFT", 0);
        DRAFT = jVar;
        j jVar2 = new j("SCHEDULED", 1);
        SCHEDULED = jVar2;
        j jVar3 = new j("COMPLETED", 2);
        COMPLETED = jVar3;
        j jVar4 = new j("FAILED", 3);
        FAILED = jVar4;
        j jVar5 = new j("CANCELLED", 4);
        CANCELLED = jVar5;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5};
        $VALUES = jVarArr;
        $ENTRIES = s.n(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
