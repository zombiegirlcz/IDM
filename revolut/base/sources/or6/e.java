package or6;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e AMERICAN_EXPRESS;
    public static final e DISCOVER;
    public static final e JCB;
    public static final e MASTERCARD;
    public static final e PRIVATE_LABEL;
    public static final e VISA;

    static {
        e eVar = new e("AMERICAN_EXPRESS", 0);
        AMERICAN_EXPRESS = eVar;
        e eVar2 = new e("DISCOVER", 1);
        DISCOVER = eVar2;
        e eVar3 = new e("JCB", 2);
        JCB = eVar3;
        e eVar4 = new e("MASTERCARD", 3);
        MASTERCARD = eVar4;
        e eVar5 = new e("PRIVATE_LABEL", 4);
        PRIVATE_LABEL = eVar5;
        e eVar6 = new e("VISA", 5);
        VISA = eVar6;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6};
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
