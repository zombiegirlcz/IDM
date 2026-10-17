package gok;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ACKNOWLEDGED;
    public static final b ACTIVE;
    public static final b COMPLETED;
    public static final b ELIGIBLE;
    public static final b INACTIVE;
    public static final b PENDING;

    static {
        b bVar = new b("PENDING", 0);
        PENDING = bVar;
        b bVar2 = new b("ELIGIBLE", 1);
        ELIGIBLE = bVar2;
        b bVar3 = new b("ACKNOWLEDGED", 2);
        ACKNOWLEDGED = bVar3;
        b bVar4 = new b("ACTIVE", 3);
        ACTIVE = bVar4;
        b bVar5 = new b("COMPLETED", 4);
        COMPLETED = bVar5;
        b bVar6 = new b("INACTIVE", 5);
        INACTIVE = bVar6;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
