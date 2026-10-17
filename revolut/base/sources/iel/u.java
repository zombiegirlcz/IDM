package iel;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Liel/u;", "", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "ADD", "REMOVE", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;

    @lg.b("ADD")
    public static final u ADD;

    @lg.b("REMOVE")
    public static final u REMOVE;

    @NotNull
    private final String id;

    static {
        u uVar = new u("ADD", 0, "ADD");
        ADD = uVar;
        u uVar2 = new u("REMOVE", 1, "REMOVE");
        REMOVE = uVar2;
        u[] uVarArr = {uVar, uVar2};
        $VALUES = uVarArr;
        $ENTRIES = vc.s.n(uVarArr);
    }

    public u(String str, int i, String str2) {
        this.id = str2;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }
}
