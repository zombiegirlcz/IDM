package m5l;

import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b AIRPLUS;
    public static final b AMEX;

    @NotNull
    public static final a Companion;
    public static final b DANKORT;
    public static final b DINERS;
    public static final b DISCOVER;
    public static final b JCB;
    public static final b MAESTRO;
    public static final b MASTERCARD;
    public static final b MULTIBANCO;
    public static final b RU_PAY;
    public static final b UNION_PAY;
    public static final b VISA;

    @NotNull
    private final List<Integer> cardNumberFormattedValidLengths;

    @NotNull
    private final List<Integer> cardNumberValidLengths;

    @NotNull
    private final String displayName;

    @NotNull
    private final Regex regex;

    @NotNull
    private final String value;

    static {
        b bVar = new b("VISA", 0, "VISA", v.k(13, 16, 19), v.k(16, 19, 23), "visa", d.VISA.a());
        VISA = bVar;
        b bVar2 = new b("MASTERCARD", 1, "MASTERCARD", u.c(16), u.c(19), "mastercard", d.MASTERCARD.a());
        MASTERCARD = bVar2;
        b bVar3 = new b("MAESTRO", 2, "MAESTRO", v.k(12, 13, 14, 15, 16, 17, 18, 19), v.k(14, 16, 17, 18, 19, 21, 22, 23), "maestro", d.MAESTRO.a());
        MAESTRO = bVar3;
        b bVar4 = new b("MULTIBANCO", 3, "MULTIBANCO", u.c(16), u.c(19), "multibanco", d.MULTIBANCO.a());
        MULTIBANCO = bVar4;
        b bVar5 = new b("AIRPLUS", 4, "AIRPLUS", u.c(16), u.c(19), "airplus", d.AIRPLUS.a());
        AIRPLUS = bVar5;
        b bVar6 = new b("AMEX", 5, "AMEX", u.c(15), u.c(18), "amex", d.AMEX.a());
        AMEX = bVar6;
        b bVar7 = new b("DANKORT", 6, "DANKORT", u.c(16), u.c(19), "dankort", d.DANKORT.a());
        DANKORT = bVar7;
        b bVar8 = new b("DINERS", 7, "DINERS", v.k(14, 15, 16, 17, 18, 19), v.k(17, 18, 19, 21, 22, 23), "diners", d.DINERS.a());
        DINERS = bVar8;
        b bVar9 = new b("DISCOVER", 8, "DISCOVER", v.k(16, 17, 18, 19), v.k(19, 21, 22, 23), "discover", d.DISCOVER.a());
        DISCOVER = bVar9;
        b bVar10 = new b("JCB", 9, "JCB", v.k(16, 17, 18, 19), v.k(19, 21, 22, 23), "jcb", d.JCB.a());
        JCB = bVar10;
        b bVar11 = new b("UNION_PAY", 10, "UNION_PAY", v.k(16, 17, 18, 19), v.k(19, 21, 22, 23), "union pay", d.UNION_PAY.a());
        UNION_PAY = bVar11;
        b bVar12 = new b("RU_PAY", 11, "RUPAY", u.c(16), u.c(19), "rupay", d.RU_PAY.a());
        RU_PAY = bVar12;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
        Companion = new a();
    }

    public b(String str, int i, String str2, List list, List list2, String str3, Regex regex) {
        this.value = str2;
        this.cardNumberValidLengths = list;
        this.cardNumberFormattedValidLengths = list2;
        this.displayName = str3;
        this.regex = regex;
    }

    public static EnumEntries c() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final List a() {
        return this.cardNumberValidLengths;
    }

    public final String b() {
        return this.displayName;
    }

    public final Regex d() {
        return this.regex;
    }

    public final String e() {
        return this.value;
    }
}
