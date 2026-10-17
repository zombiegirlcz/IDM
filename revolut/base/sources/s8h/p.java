package s8h;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;

    @NotNull
    public static final o Companion;
    public static final p MOST_BOUGHT;
    public static final p MOST_SOLD;
    public static final p MOST_TRADED;

    @NotNull
    private final wnh.a destinationSection;

    @NotNull
    private final mzg.b legacySection;

    @NotNull
    private final String value;

    static {
        p pVar = new p("MOST_TRADED", 0, "MOST_TRADED", mzg.b.MOST_TRADED, wnh.a.MOST_TRADED);
        MOST_TRADED = pVar;
        p pVar2 = new p("MOST_BOUGHT", 1, "MOST_BOUGHT", mzg.b.MOST_BOUGHT, wnh.a.MOST_BOUGHT);
        MOST_BOUGHT = pVar2;
        p pVar3 = new p("MOST_SOLD", 2, "MOST_SOLD", mzg.b.MOST_SOLD, wnh.a.MOST_SOLD);
        MOST_SOLD = pVar3;
        p[] pVarArr = {pVar, pVar2, pVar3};
        $VALUES = pVarArr;
        $ENTRIES = vc.s.n(pVarArr);
        Companion = new o();
    }

    public p(String str, int i, String str2, mzg.b bVar, wnh.a aVar) {
        this.value = str2;
        this.legacySection = bVar;
        this.destinationSection = aVar;
    }

    public static EnumEntries b() {
        return $ENTRIES;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }

    public final wnh.a a() {
        return this.destinationSection;
    }

    public final mzg.b c() {
        return this.legacySection;
    }

    public final String d() {
        return this.value;
    }
}
