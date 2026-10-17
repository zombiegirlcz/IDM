package pfj;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h INVALID_CODE;
    public static final h MAX_ATTEMPTS_REACHED;
    public static final h PORTING_FAILED;

    static {
        h hVar = new h("INVALID_CODE", 0);
        INVALID_CODE = hVar;
        h hVar2 = new h("MAX_ATTEMPTS_REACHED", 1);
        MAX_ATTEMPTS_REACHED = hVar2;
        h hVar3 = new h("PORTING_FAILED", 2);
        PORTING_FAILED = hVar3;
        h[] hVarArr = {hVar, hVar2, hVar3};
        $VALUES = hVarArr;
        $ENTRIES = s.n(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
