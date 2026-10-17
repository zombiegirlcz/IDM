package lu3;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a EDIT_ACTIVE_FACILITY_PREFERENCE;
    public static final a EDIT_APPLICATION_PREFERENCE;

    @NotNull
    private final String value;

    static {
        a aVar = new a("EDIT_ACTIVE_FACILITY_PREFERENCE", 0, "editActiveFacilityPreference");
        EDIT_ACTIVE_FACILITY_PREFERENCE = aVar;
        a aVar2 = new a("EDIT_APPLICATION_PREFERENCE", 1, "editApplicationPreference");
        EDIT_APPLICATION_PREFERENCE = aVar2;
        a[] aVarArr = {aVar, aVar2};
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

    public final String a() {
        return this.value;
    }
}
