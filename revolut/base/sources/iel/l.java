package iel;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Liel/l;", "", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "MARTIN_LUTHER_KING_JR_DAY", "WASHINGTONS_BIRTHDAY", "GOOD_FRIDAY", "MEMORIAL_DAY", "INDEPENDENCE_DAY", "LABOR_DAY", "THANKSGIVING", "CHRISTMAS", "JUNETEENTH", "UNKNOWN", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;

    @lg.b("CHRISTMAS")
    public static final l CHRISTMAS;

    @lg.b("GOOD_FRIDAY")
    public static final l GOOD_FRIDAY;

    @lg.b("INDEPENDENCE_DAY")
    public static final l INDEPENDENCE_DAY;

    @lg.b("JUNETEENTH")
    public static final l JUNETEENTH;

    @lg.b("LABOR_DAY")
    public static final l LABOR_DAY;

    @lg.b("MARTIN_LUTHER_KING_JR_DAY")
    public static final l MARTIN_LUTHER_KING_JR_DAY;

    @lg.b("MEMORIAL_DAY")
    public static final l MEMORIAL_DAY;

    @lg.b("THANKSGIVING")
    public static final l THANKSGIVING;

    @he0.b
    public static final l UNKNOWN;

    @lg.b("WASHINGTONS_BIRTHDAY")
    public static final l WASHINGTONS_BIRTHDAY;

    @NotNull
    private final String id;

    static {
        l lVar = new l("MARTIN_LUTHER_KING_JR_DAY", 0, "MARTIN_LUTHER_KING_JR_DAY");
        MARTIN_LUTHER_KING_JR_DAY = lVar;
        l lVar2 = new l("WASHINGTONS_BIRTHDAY", 1, "WASHINGTONS_BIRTHDAY");
        WASHINGTONS_BIRTHDAY = lVar2;
        l lVar3 = new l("GOOD_FRIDAY", 2, "GOOD_FRIDAY");
        GOOD_FRIDAY = lVar3;
        l lVar4 = new l("MEMORIAL_DAY", 3, "MEMORIAL_DAY");
        MEMORIAL_DAY = lVar4;
        l lVar5 = new l("INDEPENDENCE_DAY", 4, "INDEPENDENCE_DAY");
        INDEPENDENCE_DAY = lVar5;
        l lVar6 = new l("LABOR_DAY", 5, "LABOR_DAY");
        LABOR_DAY = lVar6;
        l lVar7 = new l("THANKSGIVING", 6, "THANKSGIVING");
        THANKSGIVING = lVar7;
        l lVar8 = new l("CHRISTMAS", 7, "CHRISTMAS");
        CHRISTMAS = lVar8;
        l lVar9 = new l("JUNETEENTH", 8, "JUNETEENTH");
        JUNETEENTH = lVar9;
        l lVar10 = new l("UNKNOWN", 9, "UNKNOWN");
        UNKNOWN = lVar10;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10};
        $VALUES = lVarArr;
        $ENTRIES = vc.s.n(lVarArr);
    }

    public l(String str, int i, String str2) {
        this.id = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }
}
