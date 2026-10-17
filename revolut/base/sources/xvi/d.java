package xvi;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d AUTOMATIC;
    public static final d MANUAL;
    public static final d UNKNOWN;

    @NotNull
    private final String analyticsValue;

    static {
        d dVar = new d("MANUAL", 0, "manual");
        MANUAL = dVar;
        d dVar2 = new d("AUTOMATIC", 1, "automatic");
        AUTOMATIC = dVar2;
        d dVar3 = new d("UNKNOWN", 2, "unknown");
        UNKNOWN = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public d(String str, int i, String str2) {
        this.analyticsValue = str2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final String a() {
        return this.analyticsValue;
    }
}
