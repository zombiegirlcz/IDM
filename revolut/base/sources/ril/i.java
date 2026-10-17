package ril;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i BANKID;
    public static final i CMD;
    public static final i DAP;
    public static final i DIIA;
    public static final i EGOV_KYC;
    public static final i FOURTHLINE;
    public static final i HYPERVERGE;
    public static final i IDNOW;
    public static final i IDURA;
    public static final i ID_AUSTRIA;
    public static final i INCODE;
    public static final i ITSME;
    public static final i MOBYWATEL;
    public static final i MY_INFO;
    public static final i ONFIDO;
    public static final i ONFIDO_STUDIO;
    public static final i TRUSTDOCK;
    public static final i UAE_PASS;
    public static final i VISION;
    public static final i WEBID;

    static {
        i iVar = new i("MOBYWATEL", 0);
        MOBYWATEL = iVar;
        i iVar2 = new i("BANKID", 1);
        BANKID = iVar2;
        i iVar3 = new i("CMD", 2);
        CMD = iVar3;
        i iVar4 = new i("DAP", 3);
        DAP = iVar4;
        i iVar5 = new i("DIIA", 4);
        DIIA = iVar5;
        i iVar6 = new i("EGOV_KYC", 5);
        EGOV_KYC = iVar6;
        i iVar7 = new i("FOURTHLINE", 6);
        FOURTHLINE = iVar7;
        i iVar8 = new i("HYPERVERGE", 7);
        HYPERVERGE = iVar8;
        i iVar9 = new i("ID_AUSTRIA", 8);
        ID_AUSTRIA = iVar9;
        i iVar10 = new i("IDNOW", 9);
        IDNOW = iVar10;
        i iVar11 = new i("IDURA", 10);
        IDURA = iVar11;
        i iVar12 = new i("INCODE", 11);
        INCODE = iVar12;
        i iVar13 = new i("ITSME", 12);
        ITSME = iVar13;
        i iVar14 = new i("MY_INFO", 13);
        MY_INFO = iVar14;
        i iVar15 = new i("ONFIDO", 14);
        ONFIDO = iVar15;
        i iVar16 = new i("ONFIDO_STUDIO", 15);
        ONFIDO_STUDIO = iVar16;
        i iVar17 = new i("TRUSTDOCK", 16);
        TRUSTDOCK = iVar17;
        i iVar18 = new i("UAE_PASS", 17);
        UAE_PASS = iVar18;
        i iVar19 = new i("VISION", 18);
        VISION = iVar19;
        i iVar20 = new i("WEBID", 19);
        WEBID = iVar20;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14, iVar15, iVar16, iVar17, iVar18, iVar19, iVar20};
        $VALUES = iVarArr;
        $ENTRIES = s.n(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
