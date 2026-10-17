package oqe;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f CLOSE_ACCOUNT;
    public static final f GET_HELP;
    public static final f PERSONAL_DETAILS;
    public static final f TERMS_AND_CONDITIONS;

    static {
        f fVar = new f("PERSONAL_DETAILS", 0);
        PERSONAL_DETAILS = fVar;
        f fVar2 = new f("GET_HELP", 1);
        GET_HELP = fVar2;
        f fVar3 = new f("TERMS_AND_CONDITIONS", 2);
        TERMS_AND_CONDITIONS = fVar3;
        f fVar4 = new f("CLOSE_ACCOUNT", 3);
        CLOSE_ACCOUNT = fVar4;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4};
        $VALUES = fVarArr;
        $ENTRIES = vc.s.n(fVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
