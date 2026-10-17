package in8;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ACTIVE;
    public static final b BLOCKED;
    public static final b CREATED;
    public static final b INACTIVE;
    public static final b TERMINATED;

    static {
        b bVar = new b("ACTIVE", 0);
        ACTIVE = bVar;
        b bVar2 = new b("CREATED", 1);
        CREATED = bVar2;
        b bVar3 = new b("INACTIVE", 2);
        INACTIVE = bVar3;
        b bVar4 = new b("BLOCKED", 3);
        BLOCKED = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        TERMINATED = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
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
