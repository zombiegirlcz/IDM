package xt;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d MRZ;
    public static final d MRZ_BACKUP;
    public static final d MRZ_MY_NUMBER_CARD;
    public static final d NO_MRZ;

    static {
        d dVar = new d("MRZ", 0);
        MRZ = dVar;
        d dVar2 = new d("MRZ_BACKUP", 1);
        MRZ_BACKUP = dVar2;
        d dVar3 = new d("MRZ_MY_NUMBER_CARD", 2);
        MRZ_MY_NUMBER_CARD = dVar3;
        d dVar4 = new d("NO_MRZ", 3);
        NO_MRZ = dVar4;
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
