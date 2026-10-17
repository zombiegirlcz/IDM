package ash;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b INITIAL_LOADING;
    public static final b LOADING_FINISHED;
    public static final b PARTIAL_LOADING;

    static {
        b bVar = new b("INITIAL_LOADING", 0);
        INITIAL_LOADING = bVar;
        b bVar2 = new b("PARTIAL_LOADING", 1);
        PARTIAL_LOADING = bVar2;
        b bVar3 = new b("LOADING_FINISHED", 2);
        LOADING_FINISHED = bVar3;
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
