package cuc;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f ACTIVE;
    public static final f DEACTIVATED;
    public static final f PENDING;

    static {
        f fVar = new f("ACTIVE", 0);
        ACTIVE = fVar;
        f fVar2 = new f("PENDING", 1);
        PENDING = fVar2;
        f fVar3 = new f("DEACTIVATED", 2);
        DEACTIVATED = fVar3;
        f[] fVarArr = {fVar, fVar2, fVar3};
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
