package ho3;

import java.io.Serializable;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class d implements Serializable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ACTIVE;
    public static final d EXPIRING;
    public static final d REVALIDATION_PENDING;
    public static final d REVOKED;

    static {
        d dVar = new d("ACTIVE", 0);
        ACTIVE = dVar;
        d dVar2 = new d("EXPIRING", 1);
        EXPIRING = dVar2;
        d dVar3 = new d("REVOKED", 2);
        REVOKED = dVar3;
        d dVar4 = new d("REVALIDATION_PENDING", 3);
        REVALIDATION_PENDING = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
