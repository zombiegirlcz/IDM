package ghc;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b BOTTOM_SHEET;
    public static final b CANCEL;
    public static final b COPY_AND_OPEN_URL;
    public static final b OPEN_URL;
    public static final b SUBSCRIBE;

    static {
        b bVar = new b("OPEN_URL", 0);
        OPEN_URL = bVar;
        b bVar2 = new b("COPY_AND_OPEN_URL", 1);
        COPY_AND_OPEN_URL = bVar2;
        b bVar3 = new b("SUBSCRIBE", 2);
        SUBSCRIBE = bVar3;
        b bVar4 = new b("CANCEL", 3);
        CANCEL = bVar4;
        b bVar5 = new b("BOTTOM_SHEET", 4);
        BOTTOM_SHEET = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
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
