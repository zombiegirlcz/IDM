package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class yh {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ yh[] $VALUES;
    public static final yh CHALLENGES;
    public static final yh PORTRAIT;
    public static final yh SQUARE;

    static {
        yh yhVar = new yh("PORTRAIT", 0);
        PORTRAIT = yhVar;
        yh yhVar2 = new yh("SQUARE", 1);
        SQUARE = yhVar2;
        yh yhVar3 = new yh("CHALLENGES", 2);
        CHALLENGES = yhVar3;
        yh[] yhVarArr = {yhVar, yhVar2, yhVar3};
        $VALUES = yhVarArr;
        $ENTRIES = vc.s.n(yhVarArr);
    }

    public static yh valueOf(String str) {
        return (yh) Enum.valueOf(yh.class, str);
    }

    public static yh[] values() {
        return (yh[]) $VALUES.clone();
    }
}
