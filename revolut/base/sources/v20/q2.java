package v20;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lv20/q2;", "", "AVAILABLE", "PENDING", "UNAVAILABLE", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q2[] $VALUES;

    @lg.b("Available")
    public static final q2 AVAILABLE;

    @lg.b("Pending")
    public static final q2 PENDING;

    @lg.b("Unavailable")
    public static final q2 UNAVAILABLE;

    static {
        q2 q2Var = new q2("AVAILABLE", 0);
        AVAILABLE = q2Var;
        q2 q2Var2 = new q2("PENDING", 1);
        PENDING = q2Var2;
        q2 q2Var3 = new q2("UNAVAILABLE", 2);
        UNAVAILABLE = q2Var3;
        q2[] q2VarArr = {q2Var, q2Var2, q2Var3};
        $VALUES = q2VarArr;
        $ENTRIES = vc.s.n(q2VarArr);
    }

    public static q2 valueOf(String str) {
        return (q2) Enum.valueOf(q2.class, str);
    }

    public static q2[] values() {
        return (q2[]) $VALUES.clone();
    }
}
