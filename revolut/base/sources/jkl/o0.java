package jkl;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Ljkl/o0;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "DELEGATION_REQUIRED", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o0[] $VALUES;

    @lg.b("2023")
    public static final o0 DELEGATION_REQUIRED;

    @NotNull
    private final String value = "2023";

    static {
        o0 o0Var = new o0();
        DELEGATION_REQUIRED = o0Var;
        o0[] o0VarArr = {o0Var};
        $VALUES = o0VarArr;
        $ENTRIES = vc.s.n(o0VarArr);
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
