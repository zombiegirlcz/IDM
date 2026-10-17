package u10;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o COMPLETED;
    public static final o FAILED;
    public static final o INITIATED;
    public static final o UPLOADING;

    static {
        o oVar = new o("INITIATED", 0);
        INITIATED = oVar;
        o oVar2 = new o("UPLOADING", 1);
        UPLOADING = oVar2;
        o oVar3 = new o("FAILED", 2);
        FAILED = oVar3;
        o oVar4 = new o("COMPLETED", 3);
        COMPLETED = oVar4;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4};
        $VALUES = oVarArr;
        $ENTRIES = s.n(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
