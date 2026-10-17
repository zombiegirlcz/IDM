package yvh;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h CHARITY_POCKET;
    public static final h CURRENT_POCKET;

    @NotNull
    public static final g Companion;

    @yhm.d
    public static final h HOLDING;
    public static final h LOYALTY_PROFILE;

    @yhm.d
    public static final h SAVINGS_POCKET;
    public static final h VAULT;
    public static final h WEALTH_PORTFOLIO;

    @NotNull
    private final String typeName;

    static {
        h hVar = new h("SAVINGS_POCKET", 0, "SAVINGS_POCKET");
        SAVINGS_POCKET = hVar;
        h hVar2 = new h("HOLDING", 1, "HOLDING");
        HOLDING = hVar2;
        h hVar3 = new h("CHARITY_POCKET", 2, "CHARITY_POCKET");
        CHARITY_POCKET = hVar3;
        h hVar4 = new h("CURRENT_POCKET", 3, "CURRENT_POCKET");
        CURRENT_POCKET = hVar4;
        h hVar5 = new h("VAULT", 4, "VAULT");
        VAULT = hVar5;
        h hVar6 = new h("LOYALTY_PROFILE", 5, "LOYALTY_PROFILE");
        LOYALTY_PROFILE = hVar6;
        h hVar7 = new h("WEALTH_PORTFOLIO", 6, "TRADING_PORTFOLIO");
        WEALTH_PORTFOLIO = hVar7;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7};
        $VALUES = hVarArr;
        $ENTRIES = s.n(hVarArr);
        Companion = new g();
    }

    public h(String str, int i, String str2) {
        this.typeName = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final String b() {
        return this.typeName;
    }
}
