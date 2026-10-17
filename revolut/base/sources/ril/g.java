package ril;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g DOCUMENT;
    public static final g DOCUMENT_CAPTURE;
    public static final g GOVERNMENT_AUTH_ID;
    public static final g IDENTITY_SIGNIN;
    public static final g PENNY_TOPUP;
    public static final g QES;
    public static final g REGISTERED_IDENTITY_SIGNIN;
    public static final g VIDEO_CONFERENCE;

    static {
        g gVar = new g("DOCUMENT", 0);
        DOCUMENT = gVar;
        g gVar2 = new g("DOCUMENT_CAPTURE", 1);
        DOCUMENT_CAPTURE = gVar2;
        g gVar3 = new g("PENNY_TOPUP", 2);
        PENNY_TOPUP = gVar3;
        g gVar4 = new g("VIDEO_CONFERENCE", 3);
        VIDEO_CONFERENCE = gVar4;
        g gVar5 = new g("GOVERNMENT_AUTH_ID", 4);
        GOVERNMENT_AUTH_ID = gVar5;
        g gVar6 = new g("QES", 5);
        QES = gVar6;
        g gVar7 = new g("IDENTITY_SIGNIN", 6);
        IDENTITY_SIGNIN = gVar7;
        g gVar8 = new g("REGISTERED_IDENTITY_SIGNIN", 7);
        REGISTERED_IDENTITY_SIGNIN = gVar8;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8};
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
