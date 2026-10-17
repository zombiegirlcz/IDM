package r7c;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ACTIVE;
    public static final b BLOCKED;
    public static final b CONFIRMED;
    public static final b DISCONFIRMED;
    public static final b INACTIVE;
    public static final b PENDING;
    public static final b UNKNOWN;

    static {
        b bVar = new b("ACTIVE", 0);
        ACTIVE = bVar;
        b bVar2 = new b("INACTIVE", 1);
        INACTIVE = bVar2;
        b bVar3 = new b("BLOCKED", 2);
        BLOCKED = bVar3;
        b bVar4 = new b("UNKNOWN", 3);
        UNKNOWN = bVar4;
        b bVar5 = new b("PENDING", 4);
        PENDING = bVar5;
        b bVar6 = new b("CONFIRMED", 5);
        CONFIRMED = bVar6;
        b bVar7 = new b("DISCONFIRMED", 6);
        DISCONFIRMED = bVar7;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7};
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
