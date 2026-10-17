package pwa;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ACTIVE;
    public static final d CREATED;
    public static final d REDEEMED;
    public static final d REJECTED;
    public static final d REQUIREMENTS_MET;
    public static final d SKIPPED;

    static {
        d dVar = new d("CREATED", 0);
        CREATED = dVar;
        d dVar2 = new d("ACTIVE", 1);
        ACTIVE = dVar2;
        d dVar3 = new d("REDEEMED", 2);
        REDEEMED = dVar3;
        d dVar4 = new d("REQUIREMENTS_MET", 3);
        REQUIREMENTS_MET = dVar4;
        d dVar5 = new d("SKIPPED", 4);
        SKIPPED = dVar5;
        d dVar6 = new d("REJECTED", 5);
        REJECTED = dVar6;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
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
