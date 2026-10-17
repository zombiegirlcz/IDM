package m5l;

import kotlin.enums.EnumEntries;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d AIRPLUS;
    public static final d AMEX;
    public static final d DANKORT;
    public static final d DINERS;
    public static final d DISCOVER;
    public static final d JCB;
    public static final d MAESTRO;
    public static final d MASTERCARD;
    public static final d MULTIBANCO;
    public static final d RU_PAY;
    public static final d UNION_PAY;
    public static final d VISA;

    @NotNull
    private final Regex regex;

    static {
        d dVar = new d("VISA", 0, new Regex("^4[0-9]{5,}$"));
        VISA = dVar;
        d dVar2 = new d("MASTERCARD", 1, new Regex("^(5[1-5]|222[1-9]|22[3-9]|2[3-6]|27[01]|2720)[0-9]{0,}$"));
        MASTERCARD = dVar2;
        d dVar3 = new d("MULTIBANCO", 2, new Regex("^(5[1-5]|222[1-9]|22[3-9]|2[3-6]|27[01]|2720)[0-9]{0,}$"));
        MULTIBANCO = dVar3;
        d dVar4 = new d("MAESTRO", 3, new Regex("^(5[06789]|6)[0-9]{0,}$"));
        MAESTRO = dVar4;
        d dVar5 = new d("AIRPLUS", 4, new Regex("^1[29]20[0-9]{2,}$"));
        AIRPLUS = dVar5;
        d dVar6 = new d("AMEX", 5, new Regex("^3[47][0-9]{4,}$"));
        AMEX = dVar6;
        d dVar7 = new d("DANKORT", 6, new Regex("^5019[0-9]{0,}$"));
        DANKORT = dVar7;
        d dVar8 = new d("DINERS", 7, new Regex("^3(?:0[0-59]{1}|[689])[0-9]{0,}$"));
        DINERS = dVar8;
        d dVar9 = new d("JCB", 8, new Regex("^(?:2131|1800|35)[0-9]{0,}$"));
        JCB = dVar9;
        d dVar10 = new d("DISCOVER", 9, new Regex("^(6011|65|64[4-9]|62212[6-9]|6221[3-9]|622[2-8]|6229[01]|62292[0-5])[0-9]{0,}$"));
        DISCOVER = dVar10;
        d dVar11 = new d("UNION_PAY", 10, new Regex("^62[0-5]\\d{13,16}$"));
        UNION_PAY = dVar11;
        d dVar12 = new d("RU_PAY", 11, new Regex("^(60[0-9]{4}|65[0-9]{4}|81[0-9]{4}|82[0-9]{4}|508[0-9]{3}|353[0-9]{3}|356[0-9]{3})[0-9]{0,}$"));
        RU_PAY = dVar12;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public d(String str, int i, Regex regex) {
        this.regex = regex;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final Regex a() {
        return this.regex;
    }
}
