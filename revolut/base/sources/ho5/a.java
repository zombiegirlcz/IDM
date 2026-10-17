package ho5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ADDRESS_TYPE;
    public static final a BLOCKCHAIN;
    public static final a NONE;

    static {
        a aVar = new a("NONE", 0);
        NONE = aVar;
        a aVar2 = new a("BLOCKCHAIN", 1);
        BLOCKCHAIN = aVar2;
        a aVar3 = new a("ADDRESS_TYPE", 2);
        ADDRESS_TYPE = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
