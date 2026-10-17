package iug;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f PRIVATE_MARKETS;
    public static final f TRADING_ACCOUNT;

    static {
        f fVar = new f("TRADING_ACCOUNT", 0);
        TRADING_ACCOUNT = fVar;
        f fVar2 = new f("PRIVATE_MARKETS", 1);
        PRIVATE_MARKETS = fVar2;
        f[] fVarArr = {fVar, fVar2};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
