package cs6;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f ACTIVE;
    public static final f CANCELLED;
    public static final f COMPLETED;
    public static final f DRAFT;
    public static final f EXPIRED;
    public static final f OVERDUE;
    public static final f PENDING;
    public static final f SUSPENDED;

    static {
        f fVar = new f("DRAFT", 0);
        DRAFT = fVar;
        f fVar2 = new f("ACTIVE", 1);
        ACTIVE = fVar2;
        f fVar3 = new f("PENDING", 2);
        PENDING = fVar3;
        f fVar4 = new f("SUSPENDED", 3);
        SUSPENDED = fVar4;
        f fVar5 = new f("COMPLETED", 4);
        COMPLETED = fVar5;
        f fVar6 = new f("OVERDUE", 5);
        OVERDUE = fVar6;
        f fVar7 = new f("EXPIRED", 6);
        EXPIRED = fVar7;
        f fVar8 = new f("CANCELLED", 7);
        CANCELLED = fVar8;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8};
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
