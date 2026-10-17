package fo3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d FAMILY_CREDIT_CARD;
    public static final d PERSONAL;
    public static final d PERSONAL_JOINT;
    public static final d TEEN;
    public static final d UNKNOWN;
    public static final d YOUTH;

    static {
        d dVar = new d("PERSONAL", 0);
        PERSONAL = dVar;
        d dVar2 = new d("PERSONAL_JOINT", 1);
        PERSONAL_JOINT = dVar2;
        d dVar3 = new d("TEEN", 2);
        TEEN = dVar3;
        d dVar4 = new d("FAMILY_CREDIT_CARD", 3);
        FAMILY_CREDIT_CARD = dVar4;
        d dVar5 = new d("YOUTH", 4);
        YOUTH = dVar5;
        d dVar6 = new d("UNKNOWN", 5);
        UNKNOWN = dVar6;
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
