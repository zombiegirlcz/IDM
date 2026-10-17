package v30;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lv30/s0;", "", "OPEN", "ASSIGNED", "AWAITING_RESPONSE", "RESOLVED", "CLOSED", "CLOSED_AND_RATED", "CANCELED", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s0[] $VALUES;

    @lg.b("Assigned")
    public static final s0 ASSIGNED;

    @lg.b("AwaitingResponse")
    public static final s0 AWAITING_RESPONSE;

    @lg.b("Canceled")
    public static final s0 CANCELED;

    @lg.b("Closed")
    public static final s0 CLOSED;

    @lg.b("ClosedAndRated")
    public static final s0 CLOSED_AND_RATED;

    @lg.b("Open")
    public static final s0 OPEN;

    @lg.b("Resolved")
    public static final s0 RESOLVED;

    static {
        s0 s0Var = new s0("OPEN", 0);
        OPEN = s0Var;
        s0 s0Var2 = new s0("ASSIGNED", 1);
        ASSIGNED = s0Var2;
        s0 s0Var3 = new s0("AWAITING_RESPONSE", 2);
        AWAITING_RESPONSE = s0Var3;
        s0 s0Var4 = new s0("RESOLVED", 3);
        RESOLVED = s0Var4;
        s0 s0Var5 = new s0("CLOSED", 4);
        CLOSED = s0Var5;
        s0 s0Var6 = new s0("CLOSED_AND_RATED", 5);
        CLOSED_AND_RATED = s0Var6;
        s0 s0Var7 = new s0("CANCELED", 6);
        CANCELED = s0Var7;
        s0[] s0VarArr = {s0Var, s0Var2, s0Var3, s0Var4, s0Var5, s0Var6, s0Var7};
        $VALUES = s0VarArr;
        $ENTRIES = vc.s.n(s0VarArr);
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) $VALUES.clone();
    }

    public final boolean a() {
        switch (r0.f285816a[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return true;
            case 5:
            case 6:
            case 7:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
