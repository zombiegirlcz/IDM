package g8a;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class r {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r PIX;

    static {
        r rVar = new r("PIX", 0);
        PIX = rVar;
        r[] rVarArr = {rVar};
        $VALUES = rVarArr;
        $ENTRIES = vc.s.n(rVarArr);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
