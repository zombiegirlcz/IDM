package rod;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h COUNTRY_LIST;
    public static final h TRIPS_LIST;
    public static final h TRIP_DETAILS;

    @NotNull
    private final String headerId;

    @NotNull
    private final String headerItemPrefix;

    static {
        h hVar = new h("TRIPS_LIST", 0, "TRIPS_LIST_HEADER", "TRIPS_LIST_HEADER");
        TRIPS_LIST = hVar;
        h hVar2 = new h("COUNTRY_LIST", 1, "COUNTRY_LIST_HEADER", "COUNTRY_LIST_HEADER");
        COUNTRY_LIST = hVar2;
        h hVar3 = new h("TRIP_DETAILS", 2, "TRIPS_DETAILS_HEADER", "TRIPS_DETAILS_HEADER");
        TRIP_DETAILS = hVar3;
        h[] hVarArr = {hVar, hVar2, hVar3};
        $VALUES = hVarArr;
        $ENTRIES = s.n(hVarArr);
    }

    public h(String str, int i, String str2, String str3) {
        this.headerId = str2;
        this.headerItemPrefix = str3;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final String a() {
        return this.headerId;
    }

    public final String b() {
        return this.headerItemPrefix;
    }
}
