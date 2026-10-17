package yt8;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g ADDRESS_MISMATCH;
    public static final g AVS_FAILED;
    public static final g DOB_MISMATCH;
    public static final g EXPIRED_DOCUMENT;
    public static final g FACE_MISMATCH;
    public static final g NAME_MISMATCH;
    public static final g UNCLEAR_IMAGE;
    public static final g UNSUPPORTED_COUNTRY;
    public static final g UNSUPPORTED_DOCUMENT;

    static {
        g gVar = new g("DOB_MISMATCH", 0);
        DOB_MISMATCH = gVar;
        g gVar2 = new g("EXPIRED_DOCUMENT", 1);
        EXPIRED_DOCUMENT = gVar2;
        g gVar3 = new g("FACE_MISMATCH", 2);
        FACE_MISMATCH = gVar3;
        g gVar4 = new g("NAME_MISMATCH", 3);
        NAME_MISMATCH = gVar4;
        g gVar5 = new g("UNCLEAR_IMAGE", 4);
        UNCLEAR_IMAGE = gVar5;
        g gVar6 = new g("UNSUPPORTED_DOCUMENT", 5);
        UNSUPPORTED_DOCUMENT = gVar6;
        g gVar7 = new g("AVS_FAILED", 6);
        AVS_FAILED = gVar7;
        g gVar8 = new g("ADDRESS_MISMATCH", 7);
        ADDRESS_MISMATCH = gVar8;
        g gVar9 = new g("UNSUPPORTED_COUNTRY", 8);
        UNSUPPORTED_COUNTRY = gVar9;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9};
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
