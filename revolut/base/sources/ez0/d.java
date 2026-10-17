package ez0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d Minutes;
    public static final d MinutesLeadingZero;
    public static final d Seconds;

    static {
        d dVar = new d("MinutesLeadingZero", 0);
        MinutesLeadingZero = dVar;
        d dVar2 = new d("Minutes", 1);
        Minutes = dVar2;
        d dVar3 = new d("Seconds", 2);
        Seconds = dVar3;
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
