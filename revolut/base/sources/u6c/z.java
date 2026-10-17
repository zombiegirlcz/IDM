package u6c;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class z {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ z[] $VALUES;
    public static final z HIGH_GAMBLING_RISK_ACCEPTANCE;
    public static final z LOW_GAMBLING_RISK_ACCEPTANCE;

    @NotNull
    private final String paymentInitiationParameter;

    static {
        z zVar = new z("HIGH_GAMBLING_RISK_ACCEPTANCE", 0, "HIGH_GAMBLING_RISK");
        HIGH_GAMBLING_RISK_ACCEPTANCE = zVar;
        z zVar2 = new z("LOW_GAMBLING_RISK_ACCEPTANCE", 1, "LOW_GAMBLING_RISK");
        LOW_GAMBLING_RISK_ACCEPTANCE = zVar2;
        z[] zVarArr = {zVar, zVar2};
        $VALUES = zVarArr;
        $ENTRIES = vc.s.n(zVarArr);
    }

    public z(String str, int i, String str2) {
        this.paymentInitiationParameter = str2;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }

    public final String a() {
        return this.paymentInitiationParameter;
    }
}
