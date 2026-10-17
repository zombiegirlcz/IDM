package h87;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f APAC_CURRENCIES;
    public static final f APAC_INDEXES;
    public static final f EUROPE_CURRENCIES;
    public static final f EUROPE_INDEXES;
    public static final f GLOBAL_COMMODITIES;
    public static final f GLOBAL_CURRENCIES;
    public static final f GLOBAL_INDEXES;
    public static final f US_CURRENCIES;
    public static final f US_INDEXES;

    @NotNull
    private final String collectionKey;

    static {
        f fVar = new f("GLOBAL_INDEXES", 0, "global-indexes");
        GLOBAL_INDEXES = fVar;
        f fVar2 = new f("GLOBAL_COMMODITIES", 1, "global-commodities");
        GLOBAL_COMMODITIES = fVar2;
        f fVar3 = new f("GLOBAL_CURRENCIES", 2, "global-currencies");
        GLOBAL_CURRENCIES = fVar3;
        f fVar4 = new f("EUROPE_INDEXES", 3, "europe-indexes");
        EUROPE_INDEXES = fVar4;
        f fVar5 = new f("EUROPE_CURRENCIES", 4, "europe-currencies");
        EUROPE_CURRENCIES = fVar5;
        f fVar6 = new f("US_INDEXES", 5, "us-indexes");
        US_INDEXES = fVar6;
        f fVar7 = new f("US_CURRENCIES", 6, "us-currencies");
        US_CURRENCIES = fVar7;
        f fVar8 = new f("APAC_INDEXES", 7, "apac-indexes");
        APAC_INDEXES = fVar8;
        f fVar9 = new f("APAC_CURRENCIES", 8, "apac-currencies");
        APAC_CURRENCIES = fVar9;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9};
        $VALUES = fVarArr;
        $ENTRIES = vc.s.n(fVarArr);
    }

    public f(String str, int i, String str2) {
        this.collectionKey = str2;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final String a() {
        return this.collectionKey;
    }
}
