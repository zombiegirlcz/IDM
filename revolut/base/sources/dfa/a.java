package dfa;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a DASHBOARD;
    public static final a DEEPLINK;
    public static final a POCKET_SWITCHER;
    public static final a PRICING_PLAN_DASHBOARD;
    public static final a USER_PROFILE;

    @NotNull
    private final String value;

    static {
        a aVar = new a("POCKET_SWITCHER", 0, "AccountSwitcher");
        POCKET_SWITCHER = aVar;
        a aVar2 = new a("DASHBOARD", 1, "Dashboard");
        DASHBOARD = aVar2;
        a aVar3 = new a("DEEPLINK", 2, "Deeplink");
        DEEPLINK = aVar3;
        a aVar4 = new a("PRICING_PLAN_DASHBOARD", 3, "PricingPlanDashboard");
        PRICING_PLAN_DASHBOARD = aVar4;
        a aVar5 = new a("USER_PROFILE", 4, "UserProfile");
        USER_PROFILE = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, String str2) {
        this.value = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
