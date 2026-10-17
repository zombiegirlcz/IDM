package dp8;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d DAILY;
    public static final d MONTHLY;
    public static final d ONE_OFF;
    public static final d WEEKLY;

    static {
        d dVar = new d("ONE_OFF", 0);
        ONE_OFF = dVar;
        d dVar2 = new d("DAILY", 1);
        DAILY = dVar2;
        d dVar3 = new d("WEEKLY", 2);
        WEEKLY = dVar3;
        d dVar4 = new d("MONTHLY", 3);
        MONTHLY = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
