package com.revolut.feature.alipay_plus.mpm.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/model/APMPMPaymentScenario;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "UPM", "MPM", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class APMPMPaymentScenario {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ APMPMPaymentScenario[] $VALUES;

    @NotNull
    private final String rawValue;
    public static final APMPMPaymentScenario UPM = new APMPMPaymentScenario("UPM", 0, "PAYMENT_SCENARIO_UPM");
    public static final APMPMPaymentScenario MPM = new APMPMPaymentScenario("MPM", 1, "PAYMENT_SCENARIO_MPM");

    private static final /* synthetic */ APMPMPaymentScenario[] $values() {
        return new APMPMPaymentScenario[]{UPM, MPM};
    }

    static {
        APMPMPaymentScenario[] aPMPMPaymentScenarioArr$values = $values();
        $VALUES = aPMPMPaymentScenarioArr$values;
        $ENTRIES = s.n(aPMPMPaymentScenarioArr$values);
    }

    private APMPMPaymentScenario(String str, int i, String str2) {
        this.rawValue = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static APMPMPaymentScenario valueOf(String str) {
        return (APMPMPaymentScenario) Enum.valueOf(APMPMPaymentScenario.class, str);
    }

    public static APMPMPaymentScenario[] values() {
        return (APMPMPaymentScenario[]) $VALUES.clone();
    }

    @NotNull
    public final String getRawValue() {
        return this.rawValue;
    }
}
