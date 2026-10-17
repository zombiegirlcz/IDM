package ukm;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f DROP_LATEST;
    public static final f DROP_OLDEST;
    public static final f SUSPEND;

    static {
        f fVar = new f("SUSPEND", 0);
        SUSPEND = fVar;
        f fVar2 = new f("DROP_OLDEST", 1);
        DROP_OLDEST = fVar2;
        f fVar3 = new f("DROP_LATEST", 2);
        DROP_LATEST = fVar3;
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
