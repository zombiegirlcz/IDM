package o9l;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lo9l/v;", "", "ACTIVE", "INACTIVE", "BLOCKED", "PENDING", "CONFIRMED", "DISCONFIRMED", "ENABLED", "DISABLED", "CANCELLED", "SUSPENDED", "DEACTIVATED", "RAISED", "UNKNOWN", "feature_shared_recurring_payments_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;

    @lg.b("ACTIVE")
    public static final v ACTIVE;

    @lg.b("BLOCKED")
    public static final v BLOCKED;

    @lg.b("CANCELLED")
    public static final v CANCELLED;

    @lg.b("CONFIRMED")
    public static final v CONFIRMED;

    @lg.b("DEACTIVATED")
    public static final v DEACTIVATED;

    @lg.b("DISABLED")
    public static final v DISABLED;

    @lg.b("DISCONFIRMED")
    public static final v DISCONFIRMED;

    @lg.b("ENABLED")
    public static final v ENABLED;

    @lg.b("INACTIVE")
    public static final v INACTIVE;

    @lg.b("PENDING")
    public static final v PENDING;

    @lg.b("RAISED")
    public static final v RAISED;

    @lg.b("SUSPENDED")
    public static final v SUSPENDED;
    public static final v UNKNOWN;

    static {
        v vVar = new v("ACTIVE", 0);
        ACTIVE = vVar;
        v vVar2 = new v("INACTIVE", 1);
        INACTIVE = vVar2;
        v vVar3 = new v("BLOCKED", 2);
        BLOCKED = vVar3;
        v vVar4 = new v("PENDING", 3);
        PENDING = vVar4;
        v vVar5 = new v("CONFIRMED", 4);
        CONFIRMED = vVar5;
        v vVar6 = new v("DISCONFIRMED", 5);
        DISCONFIRMED = vVar6;
        v vVar7 = new v("ENABLED", 6);
        ENABLED = vVar7;
        v vVar8 = new v("DISABLED", 7);
        DISABLED = vVar8;
        v vVar9 = new v("CANCELLED", 8);
        CANCELLED = vVar9;
        v vVar10 = new v("SUSPENDED", 9);
        SUSPENDED = vVar10;
        v vVar11 = new v("DEACTIVATED", 10);
        DEACTIVATED = vVar11;
        v vVar12 = new v("RAISED", 11);
        RAISED = vVar12;
        v vVar13 = new v("UNKNOWN", 12);
        UNKNOWN = vVar13;
        v[] vVarArr = {vVar, vVar2, vVar3, vVar4, vVar5, vVar6, vVar7, vVar8, vVar9, vVar10, vVar11, vVar12, vVar13};
        $VALUES = vVarArr;
        $ENTRIES = vc.s.n(vVarArr);
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }
}
