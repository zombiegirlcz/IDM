package ec5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j ACCEPTED;
    public static final j COMPLETED;
    public static final j FAILED;
    public static final j NOT_ELIGIBLE;
    public static final j NOT_STARTED;
    public static final j RENEW;
    public static final j STARTED;
    public static final j UNKNOWN;

    static {
        j jVar = new j("NOT_STARTED", 0);
        NOT_STARTED = jVar;
        j jVar2 = new j("STARTED", 1);
        STARTED = jVar2;
        j jVar3 = new j("ACCEPTED", 2);
        ACCEPTED = jVar3;
        j jVar4 = new j("COMPLETED", 3);
        COMPLETED = jVar4;
        j jVar5 = new j("RENEW", 4);
        RENEW = jVar5;
        j jVar6 = new j("FAILED", 5);
        FAILED = jVar6;
        j jVar7 = new j("NOT_ELIGIBLE", 6);
        NOT_ELIGIBLE = jVar7;
        j jVar8 = new j("UNKNOWN", 7);
        UNKNOWN = jVar8;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8};
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
