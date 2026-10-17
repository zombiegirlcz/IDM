package zr6;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e CUSTOMER_NOT_PRESENT;
    public static final e CUSTOMER_PRESENT;
    public static final e OPEN_BANKING;
    public static final e REVOLUT_PAY_IN_PERSON;
    public static final e REVOLUT_PAY_IN_PERSON_COMMERCIAL;
    public static final e REVOLUT_PAY_ONLINE;
    public static final e REVOLUT_PAY_ONLINE_COMMERCIAL;
    public static final e TAP_TO_PAY;

    static {
        e eVar = new e("CUSTOMER_NOT_PRESENT", 0);
        CUSTOMER_NOT_PRESENT = eVar;
        e eVar2 = new e("CUSTOMER_PRESENT", 1);
        CUSTOMER_PRESENT = eVar2;
        e eVar3 = new e("TAP_TO_PAY", 2);
        TAP_TO_PAY = eVar3;
        e eVar4 = new e("REVOLUT_PAY_ONLINE", 3);
        REVOLUT_PAY_ONLINE = eVar4;
        e eVar5 = new e("REVOLUT_PAY_ONLINE_COMMERCIAL", 4);
        REVOLUT_PAY_ONLINE_COMMERCIAL = eVar5;
        e eVar6 = new e("REVOLUT_PAY_IN_PERSON", 5);
        REVOLUT_PAY_IN_PERSON = eVar6;
        e eVar7 = new e("REVOLUT_PAY_IN_PERSON_COMMERCIAL", 6);
        REVOLUT_PAY_IN_PERSON_COMMERCIAL = eVar7;
        e eVar8 = new e("OPEN_BANKING", 7);
        OPEN_BANKING = eVar8;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
