package wp5;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f EXPIRED_QUOTE_TOKEN;
    public static final f INCORRECT_FEES;

    static {
        f fVar = new f("INCORRECT_FEES", 0);
        INCORRECT_FEES = fVar;
        f fVar2 = new f("EXPIRED_QUOTE_TOKEN", 1);
        EXPIRED_QUOTE_TOKEN = fVar2;
        f[] fVarArr = {fVar, fVar2};
        $VALUES = fVarArr;
        $ENTRIES = vc.s.n(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
