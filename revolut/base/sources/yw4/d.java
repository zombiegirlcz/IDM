package yw4;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d CANCELLATION;
    public static final d NOT_AVAILABLE;
    public static final d WITHDRAWAL;

    static {
        d dVar = new d("WITHDRAWAL", 0);
        WITHDRAWAL = dVar;
        d dVar2 = new d("CANCELLATION", 1);
        CANCELLATION = dVar2;
        d dVar3 = new d("NOT_AVAILABLE", 2);
        NOT_AVAILABLE = dVar3;
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
