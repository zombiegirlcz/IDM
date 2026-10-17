package qtc;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d MERCHANT;
    public static final d UNKNOWN;
    public static final d WALLET;

    static {
        d dVar = new d("MERCHANT", 0);
        MERCHANT = dVar;
        d dVar2 = new d("WALLET", 1);
        WALLET = dVar2;
        d dVar3 = new d("UNKNOWN", 2);
        UNKNOWN = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
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
