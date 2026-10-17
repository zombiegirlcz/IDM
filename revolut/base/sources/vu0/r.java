package vu0;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class r {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;

    @NotNull
    public static final q Companion;
    public static final r END_TO_START;
    public static final r NONE;
    public static final r START_TO_END;

    static {
        r rVar = new r("NONE", 0);
        NONE = rVar;
        r rVar2 = new r("START_TO_END", 1);
        START_TO_END = rVar2;
        r rVar3 = new r("END_TO_START", 2);
        END_TO_START = rVar3;
        r[] rVarArr = {rVar, rVar2, rVar3};
        $VALUES = rVarArr;
        $ENTRIES = vc.s.n(rVarArr);
        Companion = new q();
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
