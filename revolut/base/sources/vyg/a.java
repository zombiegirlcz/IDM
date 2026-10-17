package vyg;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ASSET;
    public static final a POSITIONS;
    public static final a PRODUCT;
    public static final a SECTOR;

    static {
        a aVar = new a("ASSET", 0);
        ASSET = aVar;
        a aVar2 = new a("POSITIONS", 1);
        POSITIONS = aVar2;
        a aVar3 = new a("SECTOR", 2);
        SECTOR = aVar3;
        a aVar4 = new a("PRODUCT", 3);
        PRODUCT = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
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
