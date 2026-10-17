package k8h;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a COMMODITY;
    public static final a CRYPTO;
    public static final a SECURITY;

    @NotNull
    private final String value;

    static {
        a aVar = new a("COMMODITY", 0, "COMMODITY");
        COMMODITY = aVar;
        a aVar2 = new a("SECURITY", 1, "SECURITY");
        SECURITY = aVar2;
        a aVar3 = new a("CRYPTO", 2, "CRYPTO");
        CRYPTO = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, String str2) {
        this.value = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
