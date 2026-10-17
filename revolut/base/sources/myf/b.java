package myf;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ADULT;
    public static final b CHILD;
    public static final b INFANT;
    public static final b SENIOR;
    public static final b VISITOR;
    public static final b YOUTH;

    static {
        b bVar = new b("ADULT", 0);
        ADULT = bVar;
        b bVar2 = new b("CHILD", 1);
        CHILD = bVar2;
        b bVar3 = new b("INFANT", 2);
        INFANT = bVar3;
        b bVar4 = new b("YOUTH", 3);
        YOUTH = bVar4;
        b bVar5 = new b("SENIOR", 4);
        SENIOR = bVar5;
        b bVar6 = new b("VISITOR", 5);
        VISITOR = bVar6;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        $VALUES = bVarArr;
        $ENTRIES = vc.s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
