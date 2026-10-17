package ur;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f FAILED;
    public static final f PASSED;
    public static final f PROCESSING;
    public static final f REJECTED;
    public static final f UNKNOWN;

    static {
        f fVar = new f("PASSED", 0);
        PASSED = fVar;
        f fVar2 = new f("REJECTED", 1);
        REJECTED = fVar2;
        f fVar3 = new f("FAILED", 2);
        FAILED = fVar3;
        f fVar4 = new f("PROCESSING", 3);
        PROCESSING = fVar4;
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
