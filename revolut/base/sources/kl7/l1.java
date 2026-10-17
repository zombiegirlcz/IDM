package kl7;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class l1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l1[] $VALUES;
    public static final l1 INSUFFICIENT_BALANCE;
    public static final l1 NONE;
    public static final l1 POLICY_DOCUMENTS_NOT_PROVIDED;
    public static final l1 POLICY_DOCUMENTS_REJECTED;
    public static final l1 TELEMATICS_DEVICE_NOT_INSTALLED;
    public static final l1 TELEMATICS_DEVICE_UNPLUGGED;

    static {
        l1 l1Var = new l1("INSUFFICIENT_BALANCE", 0);
        INSUFFICIENT_BALANCE = l1Var;
        l1 l1Var2 = new l1("POLICY_DOCUMENTS_REJECTED", 1);
        POLICY_DOCUMENTS_REJECTED = l1Var2;
        l1 l1Var3 = new l1("POLICY_DOCUMENTS_NOT_PROVIDED", 2);
        POLICY_DOCUMENTS_NOT_PROVIDED = l1Var3;
        l1 l1Var4 = new l1("TELEMATICS_DEVICE_NOT_INSTALLED", 3);
        TELEMATICS_DEVICE_NOT_INSTALLED = l1Var4;
        l1 l1Var5 = new l1("TELEMATICS_DEVICE_UNPLUGGED", 4);
        TELEMATICS_DEVICE_UNPLUGGED = l1Var5;
        l1 l1Var6 = new l1("NONE", 5);
        NONE = l1Var6;
        l1[] l1VarArr = {l1Var, l1Var2, l1Var3, l1Var4, l1Var5, l1Var6};
        $VALUES = l1VarArr;
        $ENTRIES = vc.s.n(l1VarArr);
    }

    public static l1 valueOf(String str) {
        return (l1) Enum.valueOf(l1.class, str);
    }

    public static l1[] values() {
        return (l1[]) $VALUES.clone();
    }
}
