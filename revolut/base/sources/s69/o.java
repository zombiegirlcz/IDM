package s69;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o BACKOFFICE;

    @NotNull
    public static final n Companion;
    public static final o NEWS_BANNER;
    public static final o REFERRALS;
    public static final o VAULT;

    @NotNull
    private static final o[] values;

    @NotNull
    private final String value;

    static {
        o oVar = new o("REFERRALS", 0, "referrals");
        REFERRALS = oVar;
        o oVar2 = new o("VAULT", 1, "vault");
        VAULT = oVar2;
        o oVar3 = new o("BACKOFFICE", 2, "news");
        BACKOFFICE = oVar3;
        o oVar4 = new o("NEWS_BANNER", 3, "banner");
        NEWS_BANNER = oVar4;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4};
        $VALUES = oVarArr;
        $ENTRIES = vc.s.n(oVarArr);
        Companion = new n();
        values = values();
    }

    public o(String str, int i, String str2) {
        this.value = str2;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
