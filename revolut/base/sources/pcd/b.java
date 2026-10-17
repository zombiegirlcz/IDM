package pcd;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b PERSONAL;
    public static final b PERSONAL_JOINT;
    public static final b PERSONAL_UNDER_18;
    public static final b UNKNOWN;
    public static final b YOUTH;

    static {
        b bVar = new b("PERSONAL", 0);
        PERSONAL = bVar;
        b bVar2 = new b("PERSONAL_JOINT", 1);
        PERSONAL_JOINT = bVar2;
        b bVar3 = new b("YOUTH", 2);
        YOUTH = bVar3;
        b bVar4 = new b("PERSONAL_UNDER_18", 3);
        PERSONAL_UNDER_18 = bVar4;
        b bVar5 = new b("UNKNOWN", 4);
        UNKNOWN = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
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
