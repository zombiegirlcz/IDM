package bq5;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c0[] $VALUES;
    public static final c0 ADDRESS;
    public static final c0 BUSINESS_REGISTRATION_NUMBER;
    public static final c0 COMPANY_NAME;
    public static final c0 DESTINATION_TAG;
    public static final c0 HOSTING_DROPDOWN;
    public static final c0 LABEL;
    public static final c0 NAME;
    public static final c0 RECIPIENT_DETAILS_DROPDOWN;
    public static final c0 SURNAME;

    static {
        c0 c0Var = new c0("ADDRESS", 0);
        ADDRESS = c0Var;
        c0 c0Var2 = new c0("LABEL", 1);
        LABEL = c0Var2;
        c0 c0Var3 = new c0("DESTINATION_TAG", 2);
        DESTINATION_TAG = c0Var3;
        c0 c0Var4 = new c0("NAME", 3);
        NAME = c0Var4;
        c0 c0Var5 = new c0("SURNAME", 4);
        SURNAME = c0Var5;
        c0 c0Var6 = new c0("COMPANY_NAME", 5);
        COMPANY_NAME = c0Var6;
        c0 c0Var7 = new c0("BUSINESS_REGISTRATION_NUMBER", 6);
        BUSINESS_REGISTRATION_NUMBER = c0Var7;
        c0 c0Var8 = new c0("RECIPIENT_DETAILS_DROPDOWN", 7);
        RECIPIENT_DETAILS_DROPDOWN = c0Var8;
        c0 c0Var9 = new c0("HOSTING_DROPDOWN", 8);
        HOSTING_DROPDOWN = c0Var9;
        c0[] c0VarArr = {c0Var, c0Var2, c0Var3, c0Var4, c0Var5, c0Var6, c0Var7, c0Var8, c0Var9};
        $VALUES = c0VarArr;
        $ENTRIES = vc.s.n(c0VarArr);
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) $VALUES.clone();
    }
}
