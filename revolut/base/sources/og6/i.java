package og6;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i INBOUND_TOP_UP_AUTHORIZATION;
    public static final i OUTBOUND_PAYMENT_AUTHORIZATION;

    static {
        i iVar = new i("INBOUND_TOP_UP_AUTHORIZATION", 0);
        INBOUND_TOP_UP_AUTHORIZATION = iVar;
        i iVar2 = new i("OUTBOUND_PAYMENT_AUTHORIZATION", 1);
        OUTBOUND_PAYMENT_AUTHORIZATION = iVar2;
        i[] iVarArr = {iVar, iVar2};
        $VALUES = iVarArr;
        $ENTRIES = s.n(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
