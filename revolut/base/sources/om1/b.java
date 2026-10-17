package om1;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ACTIVE;
    public static final b INACTIVATING;
    public static final b NOT_REGISTERED;
    public static final b PENDING;

    static {
        b bVar = new b("NOT_REGISTERED", 0);
        NOT_REGISTERED = bVar;
        b bVar2 = new b("PENDING", 1);
        PENDING = bVar2;
        b bVar3 = new b("ACTIVE", 2);
        ACTIVE = bVar3;
        b bVar4 = new b("INACTIVATING", 3);
        INACTIVATING = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
