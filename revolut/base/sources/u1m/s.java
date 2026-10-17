package u1m;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s ALL_COMPLETED;
    public static final s DEVELOPMENT_MODE_CHECKED;
    public static final s ERROR_OR_ABORTED;
    public static final s INITIAL;
    public static final s PROCESSES_COMPLETED;
    public static final s RUNNING_PROCESSES;
    public static final s SESSION_CREATED;

    static {
        s sVar = new s("INITIAL", 0);
        INITIAL = sVar;
        s sVar2 = new s("SESSION_CREATED", 1);
        SESSION_CREATED = sVar2;
        s sVar3 = new s("DEVELOPMENT_MODE_CHECKED", 2);
        DEVELOPMENT_MODE_CHECKED = sVar3;
        s sVar4 = new s("RUNNING_PROCESSES", 3);
        RUNNING_PROCESSES = sVar4;
        s sVar5 = new s("PROCESSES_COMPLETED", 4);
        PROCESSES_COMPLETED = sVar5;
        s sVar6 = new s("ALL_COMPLETED", 5);
        ALL_COMPLETED = sVar6;
        s sVar7 = new s("ERROR_OR_ABORTED", 6);
        ERROR_OR_ABORTED = sVar7;
        s[] sVarArr = {sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7};
        $VALUES = sVarArr;
        $ENTRIES = vc.s.n(sVarArr);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
