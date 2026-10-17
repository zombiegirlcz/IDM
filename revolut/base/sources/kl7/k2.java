package kl7;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class k2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k2[] $VALUES;
    public static final k2 ANNUAL_CERT_ORDER;
    public static final k2 DOCS_IN_REVIEW;
    public static final k2 DOCS_REQUESTED;
    public static final k2 TELEMATICS_DEVICE_ACTIVATE;
    public static final k2 TELEMATICS_DEVICE_UNPLUGGED;
    public static final k2 TEMPORARY_CERT_ORDER;
    public static final k2 UNKNOWN;

    static {
        k2 k2Var = new k2("DOCS_REQUESTED", 0);
        DOCS_REQUESTED = k2Var;
        k2 k2Var2 = new k2("DOCS_IN_REVIEW", 1);
        DOCS_IN_REVIEW = k2Var2;
        k2 k2Var3 = new k2("TEMPORARY_CERT_ORDER", 2);
        TEMPORARY_CERT_ORDER = k2Var3;
        k2 k2Var4 = new k2("ANNUAL_CERT_ORDER", 3);
        ANNUAL_CERT_ORDER = k2Var4;
        k2 k2Var5 = new k2("TELEMATICS_DEVICE_ACTIVATE", 4);
        TELEMATICS_DEVICE_ACTIVATE = k2Var5;
        k2 k2Var6 = new k2("TELEMATICS_DEVICE_UNPLUGGED", 5);
        TELEMATICS_DEVICE_UNPLUGGED = k2Var6;
        k2 k2Var7 = new k2("UNKNOWN", 6);
        UNKNOWN = k2Var7;
        k2[] k2VarArr = {k2Var, k2Var2, k2Var3, k2Var4, k2Var5, k2Var6, k2Var7};
        $VALUES = k2VarArr;
        $ENTRIES = vc.s.n(k2VarArr);
    }

    public static k2 valueOf(String str) {
        return (k2) Enum.valueOf(k2.class, str);
    }

    public static k2[] values() {
        return (k2[]) $VALUES.clone();
    }
}
