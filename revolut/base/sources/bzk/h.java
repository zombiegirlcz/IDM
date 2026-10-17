package bzk;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h DECLINED;
    public static final h INFO_REQUEST;
    public static final h RETRY_LIMIT_REACHED;

    static {
        h hVar = new h("DECLINED", 0);
        DECLINED = hVar;
        h hVar2 = new h("INFO_REQUEST", 1);
        INFO_REQUEST = hVar2;
        h hVar3 = new h("RETRY_LIMIT_REACHED", 2);
        RETRY_LIMIT_REACHED = hVar3;
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
