package bh6;

import com.revolut.feature.external_accounts.impl.R$string;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g BOTTOM_SHEET;
    public static final g CREATE_SCREEN;
    public static final g DETAILS_SCREEN;
    public static final g UPDATE_SCREEN;
    private final int stringRes;

    static {
        int i = R$string.open_banking_create_mandate_terms_and_conditions;
        g gVar = new g("CREATE_SCREEN", 0, i);
        CREATE_SCREEN = gVar;
        g gVar2 = new g("DETAILS_SCREEN", 1, R$string.open_banking_mandate_details_terms_and_conditions);
        DETAILS_SCREEN = gVar2;
        g gVar3 = new g("UPDATE_SCREEN", 2, R$string.open_banking_mandate_limits_terms_and_conditions);
        UPDATE_SCREEN = gVar3;
        g gVar4 = new g("BOTTOM_SHEET", 3, i);
        BOTTOM_SHEET = gVar4;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4};
        $VALUES = gVarArr;
        $ENTRIES = s.n(gVarArr);
    }

    public g(String str, int i, int i2) {
        this.stringRes = i2;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public final int a() {
        return this.stringRes;
    }
}
