package y80;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d DENIED;
    public static final d DENIED_PERMANENTLY;
    public static final d GRANTED;

    static {
        d dVar = new d("GRANTED", 0);
        GRANTED = dVar;
        d dVar2 = new d("DENIED", 1);
        DENIED = dVar2;
        d dVar3 = new d("DENIED_PERMANENTLY", 2);
        DENIED_PERMANENTLY = dVar3;
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
