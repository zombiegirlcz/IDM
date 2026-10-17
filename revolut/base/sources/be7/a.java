package be7;

import kotlin.enums.EnumEntries;
import zhm.v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CONNECTED;
    public static final a CONNECTING;
    public static final a DISCONNECTED;
    public static final a IDLE;
    public static final a RECONNECTING;
    public static final a RINGING;

    static {
        a aVar = new a("IDLE", 0);
        IDLE = aVar;
        a aVar2 = new a("RINGING", 1);
        RINGING = aVar2;
        a aVar3 = new a("CONNECTING", 2);
        CONNECTING = aVar3;
        a aVar4 = new a("CONNECTED", 3);
        CONNECTED = aVar4;
        a aVar5 = new a("RECONNECTING", 4);
        RECONNECTING = aVar5;
        a aVar6 = new a("DISCONNECTED", 5);
        DISCONNECTED = aVar6;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        $VALUES = aVarArr;
        $ENTRIES = vc.s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final boolean a() {
        return v.k(RINGING, CONNECTING, CONNECTED, RECONNECTING).contains(this);
    }
}
