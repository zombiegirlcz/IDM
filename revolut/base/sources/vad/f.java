package vad;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f ACTIVE;
    public static final f CANCELLED;
    public static final f COMPLETED;
    public static final f EXPIRED;
    public static final f SUSPENDED;
    public static final f UNKNOWN;

    static {
        f fVar = new f("ACTIVE", 0);
        ACTIVE = fVar;
        f fVar2 = new f("SUSPENDED", 1);
        SUSPENDED = fVar2;
        f fVar3 = new f("COMPLETED", 2);
        COMPLETED = fVar3;
        f fVar4 = new f("EXPIRED", 3);
        EXPIRED = fVar4;
        f fVar5 = new f("CANCELLED", 4);
        CANCELLED = fVar5;
        f fVar6 = new f("UNKNOWN", 5);
        UNKNOWN = fVar6;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6};
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
