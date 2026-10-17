package iqj;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Liqj/c;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "FORCE_EXCLUDED", "DEFAULT", "FORCE_INCLUDED", "feature_analytics_cycle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @lg.b("DEFAULT")
    public static final c DEFAULT;

    @lg.b("FORCE_EXCLUDED")
    public static final c FORCE_EXCLUDED;

    @lg.b("FORCE_INCLUDED")
    public static final c FORCE_INCLUDED;

    @NotNull
    private final String value;

    static {
        c cVar = new c("FORCE_EXCLUDED", 0, "FORCE_EXCLUDED");
        FORCE_EXCLUDED = cVar;
        c cVar2 = new c("DEFAULT", 1, "DEFAULT");
        DEFAULT = cVar2;
        c cVar3 = new c("FORCE_INCLUDED", 2, "FORCE_INCLUDED");
        FORCE_INCLUDED = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public c(String str, int i, String str2) {
        this.value = str2;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
