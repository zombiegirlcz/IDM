package ku0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d SCROLLED_TO_BOTTOM;
    public static final d SCROLLED_TO_OFFSET;
    public static final d SCROLLED_TO_TOP;

    static {
        d dVar = new d("SCROLLED_TO_TOP", 0);
        SCROLLED_TO_TOP = dVar;
        d dVar2 = new d("SCROLLED_TO_BOTTOM", 1);
        SCROLLED_TO_BOTTOM = dVar2;
        d dVar3 = new d("SCROLLED_TO_OFFSET", 2);
        SCROLLED_TO_OFFSET = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
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
