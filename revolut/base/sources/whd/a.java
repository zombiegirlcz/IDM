package whd;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a Deeplink;
    public static final a GlobalSearch;
    public static final a Map;
    public static final a Search;

    @NotNull
    private final String source;

    static {
        a aVar = new a("Search", 0, "Search");
        Search = aVar;
        a aVar2 = new a("GlobalSearch", 1, "GlobalSearch");
        GlobalSearch = aVar2;
        a aVar3 = new a("Deeplink", 2, "Deeplink");
        Deeplink = aVar3;
        a aVar4 = new a("Map", 3, "Map");
        Map = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, String str2) {
        this.source = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String a() {
        return this.source;
    }
}
