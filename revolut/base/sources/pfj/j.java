package pfj;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j AWAITING_INPUT;
    public static final j COMPLETED;
    public static final j CREATED;
    public static final j FAILED;
    public static final j PROCESSING;

    static {
        j jVar = new j("CREATED", 0);
        CREATED = jVar;
        j jVar2 = new j("AWAITING_INPUT", 1);
        AWAITING_INPUT = jVar2;
        j jVar3 = new j("PROCESSING", 2);
        PROCESSING = jVar3;
        j jVar4 = new j("COMPLETED", 3);
        COMPLETED = jVar4;
        j jVar5 = new j("FAILED", 4);
        FAILED = jVar5;
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
