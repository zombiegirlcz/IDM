package uoj;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a AUTUMN;
    public static final a SPRING;
    public static final a SUMMER;
    public static final a WINTER;

    static {
        a aVar = new a("SPRING", 0);
        SPRING = aVar;
        a aVar2 = new a("SUMMER", 1);
        SUMMER = aVar2;
        a aVar3 = new a("AUTUMN", 2);
        AUTUMN = aVar3;
        a aVar4 = new a("WINTER", 3);
        WINTER = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
