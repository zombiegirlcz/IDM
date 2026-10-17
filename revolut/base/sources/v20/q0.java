package v20;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lv20/q0;", "", "EXPANDED", "COLLAPSED", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q0[] $VALUES;

    @lg.b("collapsed")
    public static final q0 COLLAPSED;

    @lg.b("expanded")
    public static final q0 EXPANDED;

    static {
        q0 q0Var = new q0("EXPANDED", 0);
        EXPANDED = q0Var;
        q0 q0Var2 = new q0("COLLAPSED", 1);
        COLLAPSED = q0Var2;
        q0[] q0VarArr = {q0Var, q0Var2};
        $VALUES = q0VarArr;
        $ENTRIES = vc.s.n(q0VarArr);
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) $VALUES.clone();
    }
}
