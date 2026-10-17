package oz0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b CENTER_CROP;
    public static final b FILL;
    public static final b FIT;
    public static final b FIXED_WIDTH;

    static {
        b bVar = new b("CENTER_CROP", 0);
        CENTER_CROP = bVar;
        b bVar2 = new b("FIT", 1);
        FIT = bVar2;
        b bVar3 = new b("FILL", 2);
        FILL = bVar3;
        b bVar4 = new b("FIXED_WIDTH", 3);
        FIXED_WIDTH = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
