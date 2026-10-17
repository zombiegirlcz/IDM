package hng;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p ALREADY_TAKEN;
    public static final p NOT_ALLOWED;
    private final int code;

    static {
        p pVar = new p("ALREADY_TAKEN", 0, 1171);
        ALREADY_TAKEN = pVar;
        p pVar2 = new p("NOT_ALLOWED", 1, 1111);
        NOT_ALLOWED = pVar2;
        p[] pVarArr = {pVar, pVar2};
        $VALUES = pVarArr;
        $ENTRIES = s.n(pVarArr);
    }

    public p(String str, int i, int i2) {
        this.code = i2;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }

    public final int a() {
        return this.code;
    }
}
