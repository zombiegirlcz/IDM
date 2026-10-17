package com.revolut.domain.models.support;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/domain/models/support/TroubleshootingSource;", "", "<init>", "(Ljava/lang/String;I)V", "TROUBLESHOOTING", "DEEP_LINK", "SMART_FAQ", "RULE_BASED", "FEATURED_FAQ", "UNSUPPORTED", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TroubleshootingSource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TroubleshootingSource[] $VALUES;
    public static final TroubleshootingSource TROUBLESHOOTING = new TroubleshootingSource("TROUBLESHOOTING", 0);
    public static final TroubleshootingSource DEEP_LINK = new TroubleshootingSource("DEEP_LINK", 1);
    public static final TroubleshootingSource SMART_FAQ = new TroubleshootingSource("SMART_FAQ", 2);
    public static final TroubleshootingSource RULE_BASED = new TroubleshootingSource("RULE_BASED", 3);
    public static final TroubleshootingSource FEATURED_FAQ = new TroubleshootingSource("FEATURED_FAQ", 4);
    public static final TroubleshootingSource UNSUPPORTED = new TroubleshootingSource("UNSUPPORTED", 5);

    private static final /* synthetic */ TroubleshootingSource[] $values() {
        return new TroubleshootingSource[]{TROUBLESHOOTING, DEEP_LINK, SMART_FAQ, RULE_BASED, FEATURED_FAQ, UNSUPPORTED};
    }

    static {
        TroubleshootingSource[] troubleshootingSourceArr$values = $values();
        $VALUES = troubleshootingSourceArr$values;
        $ENTRIES = s.n(troubleshootingSourceArr$values);
    }

    private TroubleshootingSource(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static TroubleshootingSource valueOf(String str) {
        return (TroubleshootingSource) Enum.valueOf(TroubleshootingSource.class, str);
    }

    public static TroubleshootingSource[] values() {
        return (TroubleshootingSource[]) $VALUES.clone();
    }
}
