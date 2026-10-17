package h7k;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j ACCEPT;
    public static final j CANCEL;
    public static final j DECLINE;
    public static final j REMIND;

    static {
        j jVar = new j("ACCEPT", 0);
        ACCEPT = jVar;
        j jVar2 = new j("DECLINE", 1);
        DECLINE = jVar2;
        j jVar3 = new j("CANCEL", 2);
        CANCEL = jVar3;
        j jVar4 = new j("REMIND", 3);
        REMIND = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
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
