package tof;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class m5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m5[] $VALUES;
    public static final m5 AIRPLUS;
    public static final m5 AMERICAN_EXPRESS;
    public static final m5 AMEX;
    public static final m5 DINER;
    public static final m5 DISCOVER;
    public static final m5 JCB;
    public static final m5 MAESTRO;
    public static final m5 MASTERCARD;
    public static final m5 PRIVATE_LABEL;
    public static final m5 UNKNOWN;
    public static final m5 VISA;

    @NotNull
    private final String readableName;

    static {
        m5 m5Var = new m5("AIRPLUS", 0, "AirPlus");
        AIRPLUS = m5Var;
        m5 m5Var2 = new m5("AMERICAN_EXPRESS", 1, "American Express");
        AMERICAN_EXPRESS = m5Var2;
        m5 m5Var3 = new m5("AMEX", 2, "AMEX");
        AMEX = m5Var3;
        m5 m5Var4 = new m5("DISCOVER", 3, "Discover");
        DISCOVER = m5Var4;
        m5 m5Var5 = new m5("DINER", 4, "Diner");
        DINER = m5Var5;
        m5 m5Var6 = new m5("JCB", 5, "JCB");
        JCB = m5Var6;
        m5 m5Var7 = new m5("MAESTRO", 6, "Maestro");
        MAESTRO = m5Var7;
        m5 m5Var8 = new m5("MASTERCARD", 7, "Mastercard");
        MASTERCARD = m5Var8;
        m5 m5Var9 = new m5("PRIVATE_LABEL", 8, "Private Label");
        PRIVATE_LABEL = m5Var9;
        m5 m5Var10 = new m5("VISA", 9, "VISA");
        VISA = m5Var10;
        m5 m5Var11 = new m5("UNKNOWN", 10, "");
        UNKNOWN = m5Var11;
        m5[] m5VarArr = {m5Var, m5Var2, m5Var3, m5Var4, m5Var5, m5Var6, m5Var7, m5Var8, m5Var9, m5Var10, m5Var11};
        $VALUES = m5VarArr;
        $ENTRIES = vc.s.n(m5VarArr);
    }

    public m5(String str, int i, String str2) {
        this.readableName = str2;
    }

    public static m5 valueOf(String str) {
        return (m5) Enum.valueOf(m5.class, str);
    }

    public static m5[] values() {
        return (m5[]) $VALUES.clone();
    }

    public final String a() {
        return this.readableName;
    }
}
