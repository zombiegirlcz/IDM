package sr6;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j DRAFT;
    public static final j NON_DRAFT;

    static {
        j jVar = new j("DRAFT", 0);
        DRAFT = jVar;
        j jVar2 = new j("NON_DRAFT", 1);
        NON_DRAFT = jVar2;
        j[] jVarArr = {jVar, jVar2};
        $VALUES = jVarArr;
        $ENTRIES = s.n(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
