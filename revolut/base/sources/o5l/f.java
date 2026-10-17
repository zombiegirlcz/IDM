package o5l;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f DELIVERED;
    public static final f IN_REVIEW;
    public static final f NONE;
    public static final f ORDERED;
    public static final f POSTED;

    static {
        f fVar = new f("NONE", 0);
        NONE = fVar;
        f fVar2 = new f("ORDERED", 1);
        ORDERED = fVar2;
        f fVar3 = new f("IN_REVIEW", 2);
        IN_REVIEW = fVar3;
        f fVar4 = new f("POSTED", 3);
        POSTED = fVar4;
        f fVar5 = new f("DELIVERED", 4);
        DELIVERED = fVar5;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5};
        $VALUES = fVarArr;
        $ENTRIES = vc.s.n(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
