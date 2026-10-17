package z1m;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;

    @NotNull
    public static final c Companion;
    public static final d MISSING_CHECK_CODE_OR_PUBLIC_CERT;
    public static final d NORMAL_OR_FAILED;
    public static final d UNDER_16_YEARS_OLD;
    private final int code;

    static {
        d dVar = new d("NORMAL_OR_FAILED", 0, 0);
        NORMAL_OR_FAILED = dVar;
        d dVar2 = new d("UNDER_16_YEARS_OLD", 1, 1);
        UNDER_16_YEARS_OLD = dVar2;
        d dVar3 = new d("MISSING_CHECK_CODE_OR_PUBLIC_CERT", 2, 2);
        MISSING_CHECK_CODE_OR_PUBLIC_CERT = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
        Companion = new c();
    }

    public d(String str, int i, int i2) {
        this.code = i2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
