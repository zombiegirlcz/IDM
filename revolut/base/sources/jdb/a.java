package jdb;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a PERSONAL_DETAILS;
    public static final a POD_NOMINEES;

    @NotNull
    private final String backendName;

    static {
        a aVar = new a("POD_NOMINEES", 0, "account_nominees_view");
        POD_NOMINEES = aVar;
        a aVar2 = new a("PERSONAL_DETAILS", 1, "personal_details_view");
        PERSONAL_DETAILS = aVar2;
        a[] aVarArr = {aVar, aVar2};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, String str2) {
        this.backendName = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String a() {
        return this.backendName;
    }
}
