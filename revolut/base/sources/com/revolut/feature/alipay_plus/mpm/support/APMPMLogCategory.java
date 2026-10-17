package com.revolut.feature.alipay_plus.mpm.support;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/support/APMPMLogCategory;", "", "<init>", "(Ljava/lang/String;I)V", "LAUNCH", "DECODE", "PROXY", "JSAPI", "NAVIGATION", "WEBVIEW", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class APMPMLogCategory {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ APMPMLogCategory[] $VALUES;
    public static final APMPMLogCategory LAUNCH = new APMPMLogCategory("LAUNCH", 0);
    public static final APMPMLogCategory DECODE = new APMPMLogCategory("DECODE", 1);
    public static final APMPMLogCategory PROXY = new APMPMLogCategory("PROXY", 2);
    public static final APMPMLogCategory JSAPI = new APMPMLogCategory("JSAPI", 3);
    public static final APMPMLogCategory NAVIGATION = new APMPMLogCategory("NAVIGATION", 4);
    public static final APMPMLogCategory WEBVIEW = new APMPMLogCategory("WEBVIEW", 5);

    private static final /* synthetic */ APMPMLogCategory[] $values() {
        return new APMPMLogCategory[]{LAUNCH, DECODE, PROXY, JSAPI, NAVIGATION, WEBVIEW};
    }

    static {
        APMPMLogCategory[] aPMPMLogCategoryArr$values = $values();
        $VALUES = aPMPMLogCategoryArr$values;
        $ENTRIES = s.n(aPMPMLogCategoryArr$values);
    }

    private APMPMLogCategory(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static APMPMLogCategory valueOf(String str) {
        return (APMPMLogCategory) Enum.valueOf(APMPMLogCategory.class, str);
    }

    public static APMPMLogCategory[] values() {
        return (APMPMLogCategory[]) $VALUES.clone();
    }
}
