package g3a;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h DEFAULT;
    public static final h GO_TO_REQUEST;
    public static final h GO_TO_SCHEDULE;
    public static final h GO_TO_SEND;

    static {
        h hVar = new h("DEFAULT", 0);
        DEFAULT = hVar;
        h hVar2 = new h("GO_TO_SEND", 1);
        GO_TO_SEND = hVar2;
        h hVar3 = new h("GO_TO_REQUEST", 2);
        GO_TO_REQUEST = hVar3;
        h hVar4 = new h("GO_TO_SCHEDULE", 3);
        GO_TO_SCHEDULE = hVar4;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4};
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
