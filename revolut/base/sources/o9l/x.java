package o9l;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lo9l/x;", "", "", "serverName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "STANDARD", "PERSONAL_ACC", "feature_shared_recurring_payments_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x[] $VALUES;

    @lg.b("PERSONAL_ACC")
    @yhm.d
    public static final x PERSONAL_ACC;

    @lg.b("STANDARD")
    public static final x STANDARD;

    @NotNull
    private final String serverName;

    static {
        x xVar = new x("STANDARD", 0, "STANDARD");
        STANDARD = xVar;
        x xVar2 = new x("PERSONAL_ACC", 1, "PERSONAL_ACC");
        PERSONAL_ACC = xVar2;
        x[] xVarArr = {xVar, xVar2};
        $VALUES = xVarArr;
        $ENTRIES = vc.s.n(xVarArr);
    }

    public x(String str, int i, String str2) {
        this.serverName = str2;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getServerName() {
        return this.serverName;
    }
}
