package dt3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b CONTINUE;
    public static final b SKIP;
    public static final b START_APPLICATION;

    static {
        b bVar = new b("SKIP", 0);
        SKIP = bVar;
        b bVar2 = new b("CONTINUE", 1);
        CONTINUE = bVar2;
        b bVar3 = new b("START_APPLICATION", 2);
        START_APPLICATION = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
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
