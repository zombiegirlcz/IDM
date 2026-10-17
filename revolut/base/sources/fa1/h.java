package fa1;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h CONNECTED;
    public static final h CONNECTING;
    public static final h DISCONNECTED;
    public static final h DISCONNECTING;

    static {
        h hVar = new h("CONNECTED", 0);
        CONNECTED = hVar;
        h hVar2 = new h("DISCONNECTED", 1);
        DISCONNECTED = hVar2;
        h hVar3 = new h("CONNECTING", 2);
        CONNECTING = hVar3;
        h hVar4 = new h("DISCONNECTING", 3);
        DISCONNECTING = hVar4;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4};
        $VALUES = hVarArr;
        $ENTRIES = vc.s.n(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
