package od0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @yhm.d
    public static final b BETA;
    public static final b DEVELOPMENT;
    public static final b PRODUCTION;
    public static final b UNDEFINED;

    static {
        b bVar = new b("UNDEFINED", 0);
        UNDEFINED = bVar;
        b bVar2 = new b("DEVELOPMENT", 1);
        DEVELOPMENT = bVar2;
        b bVar3 = new b("BETA", 2);
        BETA = bVar3;
        b bVar4 = new b("PRODUCTION", 3);
        PRODUCTION = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
