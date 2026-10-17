package uy3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g CLOSE;
    public static final g DOCUMENTS_UPLOAD;
    public static final g TRY_AGAIN;

    static {
        g gVar = new g("CLOSE", 0);
        CLOSE = gVar;
        g gVar2 = new g("DOCUMENTS_UPLOAD", 1);
        DOCUMENTS_UPLOAD = gVar2;
        g gVar3 = new g("TRY_AGAIN", 2);
        TRY_AGAIN = gVar3;
        g[] gVarArr = {gVar, gVar2, gVar3};
        $VALUES = gVarArr;
        $ENTRIES = s.n(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
