package nq;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class x {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x[] $VALUES;
    public static final x DEMO;
    public static final x ONBOARDING_KYC;
    public static final x ONBOARDING_SELFIE;
    public static final x SSO;

    @NotNull
    private final String source;

    static {
        x xVar = new x("SSO", 0, "SSO");
        SSO = xVar;
        x xVar2 = new x("ONBOARDING_SELFIE", 1, "ONBOARDING_SELFIE");
        ONBOARDING_SELFIE = xVar2;
        x xVar3 = new x("ONBOARDING_KYC", 2, "ONBOARDING_KYC");
        ONBOARDING_KYC = xVar3;
        x xVar4 = new x("DEMO", 3, "DEMO");
        DEMO = xVar4;
        x[] xVarArr = {xVar, xVar2, xVar3, xVar4};
        $VALUES = xVarArr;
        $ENTRIES = vc.s.n(xVarArr);
    }

    public x(String str, int i, String str2) {
        this.source = str2;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) $VALUES.clone();
    }

    public final String a() {
        return this.source;
    }
}
