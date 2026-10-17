package zl9;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ChangePasscode;
    public static final d CreatePasscode;
    public static final d SetPasscode;

    static {
        d dVar = new d("CreatePasscode", 0);
        CreatePasscode = dVar;
        d dVar2 = new d("ChangePasscode", 1);
        ChangePasscode = dVar2;
        d dVar3 = new d("SetPasscode", 2);
        SetPasscode = dVar3;
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
