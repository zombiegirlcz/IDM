package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class vc {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ vc[] $VALUES;
    public static final vc IDLE;
    public static final vc PROCESSING;

    static {
        vc vcVar = new vc("IDLE", 0);
        IDLE = vcVar;
        vc vcVar2 = new vc("PROCESSING", 1);
        PROCESSING = vcVar2;
        vc[] vcVarArr = {vcVar, vcVar2};
        $VALUES = vcVarArr;
        $ENTRIES = vc.s.n(vcVarArr);
    }

    public static vc valueOf(String str) {
        return (vc) Enum.valueOf(vc.class, str);
    }

    public static vc[] values() {
        return (vc[]) $VALUES.clone();
    }
}
