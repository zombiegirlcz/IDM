package u9d;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b BULGARIAN;
    public static final b CROATIAN;
    public static final b CZECH;

    @NotNull
    public static final a Companion;
    public static final b DANISH;
    public static final b DUTCH;
    public static final b ENGLISH_AU;
    public static final b ENGLISH_UK;
    public static final b ENGLISH_US;
    public static final b FRENCH;
    public static final b GERMAN;
    public static final b GREEK;
    public static final b HUNGARIAN;
    public static final b ITALIAN;
    public static final b LATVIAN;
    public static final b LITHUANIAN;
    public static final b POLISH;
    public static final b PORTUGUESE;
    public static final b ROMANIAN;
    public static final b RUSSIAN;
    public static final b SLOVAK;
    public static final b SPANISH;
    public static final b SWEDISH;

    @NotNull
    private final String code;

    static {
        b bVar = new b("BULGARIAN", 0, "bg_BG");
        BULGARIAN = bVar;
        b bVar2 = new b("CROATIAN", 1, "hr_HR");
        CROATIAN = bVar2;
        b bVar3 = new b("CZECH", 2, "cs_CZ");
        CZECH = bVar3;
        b bVar4 = new b("DANISH", 3, "da_DK");
        DANISH = bVar4;
        b bVar5 = new b("DUTCH", 4, "nl_NL");
        DUTCH = bVar5;
        b bVar6 = new b("ENGLISH_AU", 5, "en_AU");
        ENGLISH_AU = bVar6;
        b bVar7 = new b("ENGLISH_UK", 6, "en_GB");
        ENGLISH_UK = bVar7;
        b bVar8 = new b("ENGLISH_US", 7, "en_US");
        ENGLISH_US = bVar8;
        b bVar9 = new b("FRENCH", 8, "fr_FR");
        FRENCH = bVar9;
        b bVar10 = new b("GERMAN", 9, "de_DE");
        GERMAN = bVar10;
        b bVar11 = new b("GREEK", 10, "el_GR");
        GREEK = bVar11;
        b bVar12 = new b("HUNGARIAN", 11, "hu_HU");
        HUNGARIAN = bVar12;
        b bVar13 = new b("ITALIAN", 12, "it_IT");
        ITALIAN = bVar13;
        b bVar14 = new b("LATVIAN", 13, "lv_LV");
        LATVIAN = bVar14;
        b bVar15 = new b("LITHUANIAN", 14, "lt_LT");
        LITHUANIAN = bVar15;
        b bVar16 = new b("POLISH", 15, "pl_PL");
        POLISH = bVar16;
        b bVar17 = new b("PORTUGUESE", 16, "pt_PT");
        PORTUGUESE = bVar17;
        b bVar18 = new b("ROMANIAN", 17, "ro_RO");
        ROMANIAN = bVar18;
        b bVar19 = new b("RUSSIAN", 18, "ru_RU");
        RUSSIAN = bVar19;
        b bVar20 = new b("SLOVAK", 19, "sk_SK");
        SLOVAK = bVar20;
        b bVar21 = new b("SPANISH", 20, "es_ES");
        SPANISH = bVar21;
        b bVar22 = new b("SWEDISH", 21, "sv_SE");
        SWEDISH = bVar22;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19, bVar20, bVar21, bVar22};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
        Companion = new a();
    }

    public b(String str, int i, String str2) {
        this.code = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final String getCode() {
        return this.code;
    }
}
