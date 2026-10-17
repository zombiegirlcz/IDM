package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class fi {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ fi[] $VALUES;
    public static final fi PORTRAIT;
    public static final fi SQUARE;

    static {
        fi fiVar = new fi("PORTRAIT", 0);
        PORTRAIT = fiVar;
        fi fiVar2 = new fi("SQUARE", 1);
        SQUARE = fiVar2;
        fi[] fiVarArr = {fiVar, fiVar2};
        $VALUES = fiVarArr;
        $ENTRIES = vc.s.n(fiVarArr);
    }

    public static fi valueOf(String str) {
        return (fi) Enum.valueOf(fi.class, str);
    }

    public static fi[] values() {
        return (fi[]) $VALUES.clone();
    }
}
