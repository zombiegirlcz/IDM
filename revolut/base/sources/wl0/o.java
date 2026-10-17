package wl0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o FACE_UNLOCK;
    public static final o FINGERPRINT;
    public static final o NONE;

    static {
        o oVar = new o("NONE", 0);
        NONE = oVar;
        o oVar2 = new o("FINGERPRINT", 1);
        FINGERPRINT = oVar2;
        o oVar3 = new o("FACE_UNLOCK", 2);
        FACE_UNLOCK = oVar3;
        o[] oVarArr = {oVar, oVar2, oVar3};
        $VALUES = oVarArr;
        $ENTRIES = vc.s.n(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
