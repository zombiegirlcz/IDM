package dej;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class s0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s0[] $VALUES;
    public static final s0 TRACK_PORTABILITY;

    static {
        s0 s0Var = new s0("TRACK_PORTABILITY", 0);
        TRACK_PORTABILITY = s0Var;
        s0[] s0VarArr = {s0Var};
        $VALUES = s0VarArr;
        $ENTRIES = vc.s.n(s0VarArr);
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) $VALUES.clone();
    }
}
