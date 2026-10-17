package vyg;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e ASSET;
    public static final e POSITIONS;
    public static final e PRODUCT;
    public static final e SECTOR;

    static {
        e eVar = new e("ASSET", 0);
        ASSET = eVar;
        e eVar2 = new e("POSITIONS", 1);
        POSITIONS = eVar2;
        e eVar3 = new e("SECTOR", 2);
        SECTOR = eVar3;
        e eVar4 = new e("PRODUCT", 3);
        PRODUCT = eVar4;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
