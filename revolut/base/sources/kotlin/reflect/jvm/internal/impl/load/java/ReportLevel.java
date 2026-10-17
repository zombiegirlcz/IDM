package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class ReportLevel {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ReportLevel[] $VALUES;

    @NotNull
    public static final Companion Companion;
    public static final ReportLevel IGNORE;
    public static final ReportLevel STRICT;
    public static final ReportLevel WARN;

    @NotNull
    private final String description;

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.reflect.jvm.internal.impl.load.java.ReportLevel$Companion] */
    static {
        ReportLevel reportLevel = new ReportLevel("IGNORE", 0, "ignore");
        IGNORE = reportLevel;
        ReportLevel reportLevel2 = new ReportLevel("WARN", 1, "warn");
        WARN = reportLevel2;
        ReportLevel reportLevel3 = new ReportLevel("STRICT", 2, "strict");
        STRICT = reportLevel3;
        ReportLevel[] reportLevelArr = {reportLevel, reportLevel2, reportLevel3};
        $VALUES = reportLevelArr;
        $ENTRIES = s.n(reportLevelArr);
        Companion = new Object(null) { // from class: kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.Companion
        };
    }

    public ReportLevel(String str, int i, String str2) {
        this.description = str2;
    }

    public static ReportLevel valueOf(String str) {
        return (ReportLevel) Enum.valueOf(ReportLevel.class, str);
    }

    public static ReportLevel[] values() {
        return (ReportLevel[]) $VALUES.clone();
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final boolean isIgnore() {
        return this == IGNORE;
    }

    public final boolean isWarning() {
        return this == WARN;
    }
}
