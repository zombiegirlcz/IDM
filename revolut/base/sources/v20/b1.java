package v20;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lv20/b1;", "", "COMPLETE", "IN_PROGRESS", "FAILURE", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b1[] $VALUES;

    @lg.b("complete")
    public static final b1 COMPLETE;

    @lg.b("failure")
    public static final b1 FAILURE;

    @lg.b("inProgress")
    public static final b1 IN_PROGRESS;

    static {
        b1 b1Var = new b1("COMPLETE", 0);
        COMPLETE = b1Var;
        b1 b1Var2 = new b1("IN_PROGRESS", 1);
        IN_PROGRESS = b1Var2;
        b1 b1Var3 = new b1("FAILURE", 2);
        FAILURE = b1Var3;
        b1[] b1VarArr = {b1Var, b1Var2, b1Var3};
        $VALUES = b1VarArr;
        $ENTRIES = vc.s.n(b1VarArr);
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) $VALUES.clone();
    }
}
