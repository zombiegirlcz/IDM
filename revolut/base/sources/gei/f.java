package gei;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f CANCELLED;
    public static final f CREATED;
    public static final f OPENED;
    public static final f UNKNOWN;
    public static final f VIEWED;

    static {
        f fVar = new f("CREATED", 0);
        CREATED = fVar;
        f fVar2 = new f("VIEWED", 1);
        VIEWED = fVar2;
        f fVar3 = new f("CANCELLED", 2);
        CANCELLED = fVar3;
        f fVar4 = new f("OPENED", 3);
        OPENED = fVar4;
        f fVar5 = new f("UNKNOWN", 4);
        UNKNOWN = fVar5;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5};
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
