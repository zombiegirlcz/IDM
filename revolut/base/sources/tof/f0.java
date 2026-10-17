package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class f0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f0[] $VALUES;
    public static final f0 CROSSPOCKET_CUT_OFF_TIME;
    public static final f0 GAMBLING_RESTRICTED;
    public static final f0 POTENTIAL_FRAUD;
    public static final f0 REVOLUT_CANCELLED;
    public static final f0 TECHNICAL_ERROR;
    public static final f0 TRANSFER_ADDRESS_REJECTED;
    public static final f0 TRANSFER_REJECTED;
    public static final f0 UNKNOWN;
    public static final f0 USER_CANCELLED;

    static {
        f0 f0Var = new f0("CROSSPOCKET_CUT_OFF_TIME", 0);
        CROSSPOCKET_CUT_OFF_TIME = f0Var;
        f0 f0Var2 = new f0("POTENTIAL_FRAUD", 1);
        POTENTIAL_FRAUD = f0Var2;
        f0 f0Var3 = new f0("TRANSFER_ADDRESS_REJECTED", 2);
        TRANSFER_ADDRESS_REJECTED = f0Var3;
        f0 f0Var4 = new f0("TRANSFER_REJECTED", 3);
        TRANSFER_REJECTED = f0Var4;
        f0 f0Var5 = new f0("USER_CANCELLED", 4);
        USER_CANCELLED = f0Var5;
        f0 f0Var6 = new f0("REVOLUT_CANCELLED", 5);
        REVOLUT_CANCELLED = f0Var6;
        f0 f0Var7 = new f0("TECHNICAL_ERROR", 6);
        TECHNICAL_ERROR = f0Var7;
        f0 f0Var8 = new f0("GAMBLING_RESTRICTED", 7);
        GAMBLING_RESTRICTED = f0Var8;
        f0 f0Var9 = new f0("UNKNOWN", 8);
        UNKNOWN = f0Var9;
        f0[] f0VarArr = {f0Var, f0Var2, f0Var3, f0Var4, f0Var5, f0Var6, f0Var7, f0Var8, f0Var9};
        $VALUES = f0VarArr;
        $ENTRIES = vc.s.n(f0VarArr);
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) $VALUES.clone();
    }
}
