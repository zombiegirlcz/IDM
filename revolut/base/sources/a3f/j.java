package a3f;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j BUY;
    public static final j HOLD;
    public static final j SELL;
    public static final j STRONG_BUY;
    public static final j STRONG_SELL;

    static {
        j jVar = new j("STRONG_BUY", 0);
        STRONG_BUY = jVar;
        j jVar2 = new j("BUY", 1);
        BUY = jVar2;
        j jVar3 = new j("HOLD", 2);
        HOLD = jVar3;
        j jVar4 = new j("SELL", 3);
        SELL = jVar4;
        j jVar5 = new j("STRONG_SELL", 4);
        STRONG_SELL = jVar5;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5};
        $VALUES = jVarArr;
        $ENTRIES = s.n(jVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
