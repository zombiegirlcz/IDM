package jv8;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BANK_ID;
    public static final a DAP;
    public static final a DIIA;
    public static final a ID_AUSTRIA;
    public static final a ITSME;
    public static final a MOBYWATEL;
    private final String packageIdDev;

    @NotNull
    private final String packageIdProd;

    static {
        a aVar = new a("BANK_ID", 0, "com.bankid.bus", null);
        BANK_ID = aVar;
        a aVar2 = new a("DAP", 1, "hu.gov.dap.app", "hu.gov.dap.app.uat");
        DAP = aVar2;
        a aVar3 = new a("DIIA", 2, "ua.gov.diia.app", null);
        DIIA = aVar3;
        a aVar4 = new a("ITSME", 3, "be.bmid.itsme", null);
        ITSME = aVar4;
        a aVar5 = new a("ID_AUSTRIA", 4, "at.gv.oe.app", null);
        ID_AUSTRIA = aVar5;
        a aVar6 = new a("MOBYWATEL", 5, "pl.nask.mobywatel", "pl.nask.mobywatel.institution");
        MOBYWATEL = aVar6;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, String str2, String str3) {
        this.packageIdProd = str2;
        this.packageIdDev = str3;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String a() {
        return this.packageIdDev;
    }

    public final String b() {
        return this.packageIdProd;
    }
}
