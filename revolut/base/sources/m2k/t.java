package m2k;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lm2k/t;", "", "", "serverName", "Ljava/lang/String;", "getServerName", "()Ljava/lang/String;", "STANDARD", "PERSONAL_ACC", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;

    @lg.b("PERSONAL_ACC")
    @yhm.d
    public static final t PERSONAL_ACC;

    @lg.b("STANDARD")
    public static final t STANDARD;

    @NotNull
    private final String serverName;

    static {
        t tVar = new t("STANDARD", 0, "STANDARD");
        STANDARD = tVar;
        t tVar2 = new t("PERSONAL_ACC", 1, "PERSONAL_ACC");
        PERSONAL_ACC = tVar2;
        t[] tVarArr = {tVar, tVar2};
        $VALUES = tVarArr;
        $ENTRIES = vc.s.n(tVarArr);
    }

    public t(String str, int i, String str2) {
        this.serverName = str2;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}
