package et3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d REJECTED_UNDISCLOSED;
    public static final d SHOW;
    public static final d SKIP;

    static {
        d dVar = new d("SHOW", 0);
        SHOW = dVar;
        d dVar2 = new d("SKIP", 1);
        SKIP = dVar2;
        d dVar3 = new d("REJECTED_UNDISCLOSED", 2);
        REJECTED_UNDISCLOSED = dVar3;
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
