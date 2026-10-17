package r5b;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l BASIC;
    public static final l ESSENTIAL;
    public static final l METAL;
    public static final l PLUS;
    public static final l PREMIUM;
    public static final l PRIVATE;
    public static final l STANDARD;
    public static final l ULTRA;

    static {
        l lVar = new l("ESSENTIAL", 0);
        ESSENTIAL = lVar;
        l lVar2 = new l("BASIC", 1);
        BASIC = lVar2;
        l lVar3 = new l("STANDARD", 2);
        STANDARD = lVar3;
        l lVar4 = new l("PLUS", 3);
        PLUS = lVar4;
        l lVar5 = new l("PREMIUM", 4);
        PREMIUM = lVar5;
        l lVar6 = new l("METAL", 5);
        METAL = lVar6;
        l lVar7 = new l("ULTRA", 6);
        ULTRA = lVar7;
        l lVar8 = new l("PRIVATE", 7);
        PRIVATE = lVar8;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8};
        $VALUES = lVarArr;
        $ENTRIES = s.n(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
