package rm0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class r {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;

    @yhm.d
    public static final r V1_PKCS1;
    public static final r V2_OAEP;
    private final int code;

    static {
        r rVar = new r("V1_PKCS1", 0, 1);
        V1_PKCS1 = rVar;
        r rVar2 = new r("V2_OAEP", 1, 2);
        V2_OAEP = rVar2;
        r[] rVarArr = {rVar, rVar2};
        $VALUES = rVarArr;
        $ENTRIES = vc.s.n(rVarArr);
    }

    public r(String str, int i, int i2) {
        this.code = i2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
