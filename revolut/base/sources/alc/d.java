package alc;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d DEPOSIT;
    public static final d SETTINGS;
    public static final d STATEMENTS;
    public static final d WITHDRAWAL;

    static {
        d dVar = new d("DEPOSIT", 0);
        DEPOSIT = dVar;
        d dVar2 = new d("WITHDRAWAL", 1);
        WITHDRAWAL = dVar2;
        d dVar3 = new d("STATEMENTS", 2);
        STATEMENTS = dVar3;
        d dVar4 = new d("SETTINGS", 3);
        SETTINGS = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
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
