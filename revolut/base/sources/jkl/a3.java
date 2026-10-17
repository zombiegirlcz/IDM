package jkl;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002¨\u0006\u0003"}, d2 = {"Ljkl/a3;", "", "CHAT", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a3[] $VALUES;

    @lg.b("CHAT")
    public static final a3 CHAT;

    static {
        a3 a3Var = new a3("CHAT", 0);
        CHAT = a3Var;
        a3[] a3VarArr = {a3Var};
        $VALUES = a3VarArr;
        $ENTRIES = vc.s.n(a3VarArr);
    }

    public static a3 valueOf(String str) {
        return (a3) Enum.valueOf(a3.class, str);
    }

    public static a3[] values() {
        return (a3[]) $VALUES.clone();
    }
}
