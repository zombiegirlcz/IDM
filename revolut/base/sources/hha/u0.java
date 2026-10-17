package hha;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class u0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u0[] $VALUES;
    public static final u0 CENTRAL_GOOD_AND_SERVICES;
    public static final u0 INTEGRATED_GOOD_AND_SERVICES;
    public static final u0 STATE_GOOD_AND_SERVICES;
    public static final u0 UNKNOWN;
    public static final u0 VAT;
    private final String containsKey;
    private final String corePricingValue;

    static {
        u0 u0Var = new u0("VAT", 0, "consumption.vat", null);
        VAT = u0Var;
        u0 u0Var2 = new u0("CENTRAL_GOOD_AND_SERVICES", 1, "consumption.cgst", "cgst");
        CENTRAL_GOOD_AND_SERVICES = u0Var2;
        u0 u0Var3 = new u0("INTEGRATED_GOOD_AND_SERVICES", 2, "consumption.igst", "igst");
        INTEGRATED_GOOD_AND_SERVICES = u0Var3;
        u0 u0Var4 = new u0("STATE_GOOD_AND_SERVICES", 3, "consumption.sgst", "sgst");
        STATE_GOOD_AND_SERVICES = u0Var4;
        u0 u0Var5 = new u0("UNKNOWN", 4, null, null);
        UNKNOWN = u0Var5;
        u0[] u0VarArr = {u0Var, u0Var2, u0Var3, u0Var4, u0Var5};
        $VALUES = u0VarArr;
        $ENTRIES = vc.s.n(u0VarArr);
    }

    public u0(String str, int i, String str2, String str3) {
        this.corePricingValue = str2;
        this.containsKey = str3;
    }

    public static EnumEntries b() {
        return $ENTRIES;
    }

    public static u0 valueOf(String str) {
        return (u0) Enum.valueOf(u0.class, str);
    }

    public static u0[] values() {
        return (u0[]) $VALUES.clone();
    }

    public final String a() {
        return this.corePricingValue;
    }

    public final boolean c(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        String str = this.containsKey;
        return str != null ? kotlin.text.d0.J(type, str, true) : Intrinsics.f(this.corePricingValue, type);
    }
}
