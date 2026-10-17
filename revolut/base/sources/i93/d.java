package i93;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ALL;
    public static final d ALL_CRYPTO;
    public static final d ALL_FIAT;
    public static final d NONE;
    public static final d POCKETS;

    static {
        d dVar = new d("ALL_FIAT", 0);
        ALL_FIAT = dVar;
        d dVar2 = new d("ALL", 1);
        ALL = dVar2;
        d dVar3 = new d("NONE", 2);
        NONE = dVar3;
        d dVar4 = new d("ALL_CRYPTO", 3);
        ALL_CRYPTO = dVar4;
        d dVar5 = new d("POCKETS", 4);
        POCKETS = dVar5;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5};
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
