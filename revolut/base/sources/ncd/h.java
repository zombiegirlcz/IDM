package ncd;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h BUSINESS;
    public static final h PERSONAL;
    public static final h PERSONAL_JOINT;
    public static final h PERSONAL_UNDER_18;
    public static final h YOUTH;

    static {
        h hVar = new h("PERSONAL", 0);
        PERSONAL = hVar;
        h hVar2 = new h("YOUTH", 1);
        YOUTH = hVar2;
        h hVar3 = new h("PERSONAL_JOINT", 2);
        PERSONAL_JOINT = hVar3;
        h hVar4 = new h("BUSINESS", 3);
        BUSINESS = hVar4;
        h hVar5 = new h("PERSONAL_UNDER_18", 4);
        PERSONAL_UNDER_18 = hVar5;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5};
        $VALUES = hVarArr;
        $ENTRIES = s.n(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
