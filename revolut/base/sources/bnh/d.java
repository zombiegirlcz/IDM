package bnh;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d NOT_ONBOARDED;
    public static final d ONBOARDED;
    public static final d PENDING;

    static {
        d dVar = new d("NOT_ONBOARDED", 0);
        NOT_ONBOARDED = dVar;
        d dVar2 = new d("PENDING", 1);
        PENDING = dVar2;
        d dVar3 = new d("ONBOARDED", 2);
        ONBOARDED = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
        $VALUES = dVarArr;
        $ENTRIES = vc.s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
