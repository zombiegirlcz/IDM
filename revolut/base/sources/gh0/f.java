package gh0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f AVAILABLE;
    public static final f NOT_AVAILABLE;
    public static final f NOT_REQUIRED;

    static {
        f fVar = new f("AVAILABLE", 0);
        AVAILABLE = fVar;
        f fVar2 = new f("NOT_AVAILABLE", 1);
        NOT_AVAILABLE = fVar2;
        f fVar3 = new f("NOT_REQUIRED", 2);
        NOT_REQUIRED = fVar3;
        f[] fVarArr = {fVar, fVar2, fVar3};
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
