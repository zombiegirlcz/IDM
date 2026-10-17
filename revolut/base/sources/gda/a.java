package gda;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a MCY_ACCOUNT_DETAILS;
    public static final a OPEN_POCKET;

    @NotNull
    private final String template;

    static {
        a aVar = new a("OPEN_POCKET", 0, "accounts/add/currency");
        OPEN_POCKET = aVar;
        a aVar2 = new a("MCY_ACCOUNT_DETAILS", 1, "account/international-details/mcy");
        MCY_ACCOUNT_DETAILS = aVar2;
        a[] aVarArr = {aVar, aVar2};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, String str2) {
        this.template = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String a() {
        return this.template;
    }
}
