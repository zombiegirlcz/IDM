package wy2;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d DAMAGED;
    public static final d FRAUD_OR_THEFT;
    public static final d LOST;
    public static final d NEVER_RECEIVED;

    static {
        d dVar = new d("NEVER_RECEIVED", 0);
        NEVER_RECEIVED = dVar;
        d dVar2 = new d("LOST", 1);
        LOST = dVar2;
        d dVar3 = new d("FRAUD_OR_THEFT", 2);
        FRAUD_OR_THEFT = dVar3;
        d dVar4 = new d("DAMAGED", 3);
        DAMAGED = dVar4;
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
