package yv0;

import ch.qos.logback.core.net.SyslogConstants;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j DP_120;
    public static final j DP_180;
    public static final j MATCH_PARENT;

    /* JADX INFO: renamed from: dp, reason: collision with root package name */
    private final int f317078dp;

    static {
        j jVar = new j("DP_120", 0, SyslogConstants.LOG_CLOCK);
        DP_120 = jVar;
        j jVar2 = new j("DP_180", 1, 180);
        DP_180 = jVar2;
        j jVar3 = new j("MATCH_PARENT", 2, 0);
        MATCH_PARENT = jVar3;
        j[] jVarArr = {jVar, jVar2, jVar3};
        $VALUES = jVarArr;
        $ENTRIES = s.n(jVarArr);
    }

    public j(String str, int i, int i2) {
        this.f317078dp = i2;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    public final int a() {
        return this.f317078dp;
    }
}
