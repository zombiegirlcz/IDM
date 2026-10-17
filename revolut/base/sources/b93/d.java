package b93;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ALL;
    public static final d CREDIT;
    public static final d CRYPTO;
    public static final d FREELANCER;
    public static final d JOINT;
    public static final d RETAIL;
    public static final d YOUTH;

    static {
        d dVar = new d("RETAIL", 0);
        RETAIL = dVar;
        d dVar2 = new d("FREELANCER", 1);
        FREELANCER = dVar2;
        d dVar3 = new d("CREDIT", 2);
        CREDIT = dVar3;
        d dVar4 = new d("JOINT", 3);
        JOINT = dVar4;
        d dVar5 = new d("YOUTH", 4);
        YOUTH = dVar5;
        d dVar6 = new d("CRYPTO", 5);
        CRYPTO = dVar6;
        d dVar7 = new d("ALL", 6);
        ALL = dVar7;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7};
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
