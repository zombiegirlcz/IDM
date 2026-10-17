package c93;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f DISPOSABLE;
    public static final f FREELANCER;
    public static final f FREELANCER_DISPOSABLE;
    public static final f FREELANCER_VIRTUAL;
    public static final f JUNIOR;
    public static final f JUNIOR_VIRTUAL;
    public static final f PHYSICAL;
    public static final f VIRTUAL;

    static {
        f fVar = new f("JUNIOR", 0);
        JUNIOR = fVar;
        f fVar2 = new f("PHYSICAL", 1);
        PHYSICAL = fVar2;
        f fVar3 = new f("VIRTUAL", 2);
        VIRTUAL = fVar3;
        f fVar4 = new f("FREELANCER", 3);
        FREELANCER = fVar4;
        f fVar5 = new f("FREELANCER_VIRTUAL", 4);
        FREELANCER_VIRTUAL = fVar5;
        f fVar6 = new f("JUNIOR_VIRTUAL", 5);
        JUNIOR_VIRTUAL = fVar6;
        f fVar7 = new f("DISPOSABLE", 6);
        DISPOSABLE = fVar7;
        f fVar8 = new f("FREELANCER_DISPOSABLE", 7);
        FREELANCER_DISPOSABLE = fVar8;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8};
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
