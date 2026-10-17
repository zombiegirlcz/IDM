package com.revolut.feature.alipay_plus.mpm.support;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/support/APMPMLogLevel;", "", "<init>", "(Ljava/lang/String;I)V", "DEBUG", "INFO", "WARNING", "ERROR", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class APMPMLogLevel {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ APMPMLogLevel[] $VALUES;
    public static final APMPMLogLevel DEBUG = new APMPMLogLevel("DEBUG", 0);
    public static final APMPMLogLevel INFO = new APMPMLogLevel("INFO", 1);
    public static final APMPMLogLevel WARNING = new APMPMLogLevel("WARNING", 2);
    public static final APMPMLogLevel ERROR = new APMPMLogLevel("ERROR", 3);

    private static final /* synthetic */ APMPMLogLevel[] $values() {
        return new APMPMLogLevel[]{DEBUG, INFO, WARNING, ERROR};
    }

    static {
        APMPMLogLevel[] aPMPMLogLevelArr$values = $values();
        $VALUES = aPMPMLogLevelArr$values;
        $ENTRIES = s.n(aPMPMLogLevelArr$values);
    }

    private APMPMLogLevel(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static APMPMLogLevel valueOf(String str) {
        return (APMPMLogLevel) Enum.valueOf(APMPMLogLevel.class, str);
    }

    public static APMPMLogLevel[] values() {
        return (APMPMLogLevel[]) $VALUES.clone();
    }
}
