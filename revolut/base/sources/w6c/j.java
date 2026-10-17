package w6c;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j EXCHANGE;
    public static final j PAYMENT;

    static {
        j jVar = new j("PAYMENT", 0);
        PAYMENT = jVar;
        j jVar2 = new j("EXCHANGE", 1);
        EXCHANGE = jVar2;
        j[] jVarArr = {jVar, jVar2};
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
