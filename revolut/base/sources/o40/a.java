package o40;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a DOWNLOAD_TRANSCRIPT;
    public static final a MAKE_CALL;
    public static final a SEARCH;
    public static final a START_FEEDBACK_FLOW;

    static {
        a aVar = new a("START_FEEDBACK_FLOW", 0);
        START_FEEDBACK_FLOW = aVar;
        a aVar2 = new a("MAKE_CALL", 1);
        MAKE_CALL = aVar2;
        a aVar3 = new a("SEARCH", 2);
        SEARCH = aVar3;
        a aVar4 = new a("DOWNLOAD_TRANSCRIPT", 3);
        DOWNLOAD_TRANSCRIPT = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
