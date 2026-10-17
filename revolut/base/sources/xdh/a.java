package xdh;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a AGGRESSIVE;
    public static final a BALANCED;
    public static final a BOLD;
    public static final a CAUTIOUS;
    public static final a CONSERVATIVE;
    private final int value;

    static {
        a aVar = new a("CONSERVATIVE", 0, 1);
        CONSERVATIVE = aVar;
        a aVar2 = new a("CAUTIOUS", 1, 2);
        CAUTIOUS = aVar2;
        a aVar3 = new a("BALANCED", 2, 3);
        BALANCED = aVar3;
        a aVar4 = new a("BOLD", 3, 4);
        BOLD = aVar4;
        a aVar5 = new a("AGGRESSIVE", 4, 5);
        AGGRESSIVE = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, int i2) {
        this.value = i2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final int a() {
        return this.value;
    }
}
