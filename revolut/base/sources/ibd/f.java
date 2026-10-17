package ibd;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f ACTIVE;
    public static final f BLOCKED;
    public static final f CANCELLED;
    public static final f CONFIRMED;
    public static final f DEACTIVATED;
    public static final f DISCONFIRMED;
    public static final f INACTIVE;
    public static final f PENDING;
    public static final f RAISED;
    public static final f SUSPENDED;
    public static final f UNKNOWN;

    static {
        f fVar = new f("ACTIVE", 0);
        ACTIVE = fVar;
        f fVar2 = new f("INACTIVE", 1);
        INACTIVE = fVar2;
        f fVar3 = new f("BLOCKED", 2);
        BLOCKED = fVar3;
        f fVar4 = new f("UNKNOWN", 3);
        UNKNOWN = fVar4;
        f fVar5 = new f("PENDING", 4);
        PENDING = fVar5;
        f fVar6 = new f("CONFIRMED", 5);
        CONFIRMED = fVar6;
        f fVar7 = new f("DISCONFIRMED", 6);
        DISCONFIRMED = fVar7;
        f fVar8 = new f("CANCELLED", 7);
        CANCELLED = fVar8;
        f fVar9 = new f("SUSPENDED", 8);
        SUSPENDED = fVar9;
        f fVar10 = new f("DEACTIVATED", 9);
        DEACTIVATED = fVar10;
        f fVar11 = new f("RAISED", 10);
        RAISED = fVar11;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
