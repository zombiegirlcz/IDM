package lr6;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ACCOUNT_CLOSED;
    public static final d ACCOUNT_CLOSED_MANUALLY;
    public static final d INBOUND_BLOCKED;
    public static final d INBOUND_OUTBOUND_BLOCKED;
    public static final d OUTBOUND_BLOCKED;

    static {
        d dVar = new d("INBOUND_BLOCKED", 0);
        INBOUND_BLOCKED = dVar;
        d dVar2 = new d("OUTBOUND_BLOCKED", 1);
        OUTBOUND_BLOCKED = dVar2;
        d dVar3 = new d("INBOUND_OUTBOUND_BLOCKED", 2);
        INBOUND_OUTBOUND_BLOCKED = dVar3;
        d dVar4 = new d("ACCOUNT_CLOSED", 3);
        ACCOUNT_CLOSED = dVar4;
        d dVar5 = new d("ACCOUNT_CLOSED_MANUALLY", 4);
        ACCOUNT_CLOSED_MANUALLY = dVar5;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5};
        $VALUES = dVarArr;
        $ENTRIES = vc.s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
