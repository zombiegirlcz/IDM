package y6g;

import com.revolut.feature.travel.flights.api.R$string;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ONEWORLD;
    public static final a SKY_TEAM;
    public static final a STAR_ALLIANCE;

    @NotNull
    private final Set<String> airlineCodes;
    private final int titleRes;

    static {
        int i = R$string.travel_flights_search_filters_airlines_groups_oneworld;
        String[] elements = {"AS", "AA", "BA", "CX", "FJ", "AY", "IB", "JL", "MH", "WY", "QF", "QR", "AT", "RJ", "UL"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        a aVar = new a("ONEWORLD", 0, i, kotlin.collections.d.y0(elements));
        ONEWORLD = aVar;
        int i2 = R$string.travel_flights_search_filters_airlines_groups_sky_team;
        String[] elements2 = {"AR", "AM", "UX", "AF", "CI", "MU", "DL", "GA", "KQ", "KL", "KE", "ME", "SK", "SV", "RO", "VN", "VS", "MF"};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        a aVar2 = new a("SKY_TEAM", 1, i2, kotlin.collections.d.y0(elements2));
        SKY_TEAM = aVar2;
        int i3 = R$string.travel_flights_search_filters_airlines_groups_star_alliance;
        String[] elements3 = {"A3", "AC", "CA", "AI", "NZ", "NH", "OZ", "OS", "AV", "SN", "CM", "OU", "MS", "ET", "BR", "LO", "LH", "ZH", "SQ", "SA", "LX", "TP", "TG", "TK", "UA"};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        a aVar3 = new a("STAR_ALLIANCE", 2, i3, kotlin.collections.d.y0(elements3));
        STAR_ALLIANCE = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, int i2, Set set) {
        this.titleRes = i2;
        this.airlineCodes = set;
    }

    public static EnumEntries b() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final LinkedHashSet a(ArrayList availableAirlineCodes) {
        Intrinsics.checkNotNullParameter(availableAirlineCodes, "availableAirlineCodes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj2 : availableAirlineCodes) {
            if (this.airlineCodes.contains((String) obj2)) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public final int c() {
        return this.titleRes;
    }
}
