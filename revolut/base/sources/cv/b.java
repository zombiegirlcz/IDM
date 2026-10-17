package cv;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b FHD;
    public static final b HD;
    public static final b HIGHEST;
    public static final b SD;

    static {
        b bVar = new b("SD", 0);
        SD = bVar;
        b bVar2 = new b("HD", 1);
        HD = bVar2;
        b bVar3 = new b("FHD", 2);
        FHD = bVar3;
        b bVar4 = new b("HIGHEST", 3);
        HIGHEST = bVar4;
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
