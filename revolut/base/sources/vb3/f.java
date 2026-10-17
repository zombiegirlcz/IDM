package vb3;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f DEPOSIT_CASH;
    public static final f SELECT_LOCATION;
    public static final f SHOW_BARCODE;

    static {
        f fVar = new f("DEPOSIT_CASH", 0);
        DEPOSIT_CASH = fVar;
        f fVar2 = new f("SHOW_BARCODE", 1);
        SHOW_BARCODE = fVar2;
        f fVar3 = new f("SELECT_LOCATION", 2);
        SELECT_LOCATION = fVar3;
        f[] fVarArr = {fVar, fVar2, fVar3};
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
