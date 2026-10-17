package wtg;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    @NotNull
    public static final s Companion;
    public static final t HAS_CASH;
    public static final t HAS_JOINT_GIA_ONBOARDED;
    public static final t HAS_MARGIN_LOAN;
    public static final t HAS_NON_TRADEABLE_STOCKS;
    public static final t HAS_OPEN_POSITIONS;
    public static final t HAS_OTHER_ACCOUNT_ONBOARDED;
    public static final t HAS_PENDING_STOCK_TRANSFERS;
    public static final t HAS_ROBO_OR_FLEXIBLE_ACCOUNT_ONBOARDED;
    public static final t HAS_TRANSFER_OUT_REQUESTS;
    public static final t HAS_WARRANTS;
    public static final t OK;

    static {
        t tVar = new t("OK", 0);
        OK = tVar;
        t tVar2 = new t("HAS_NON_TRADEABLE_STOCKS", 1);
        HAS_NON_TRADEABLE_STOCKS = tVar2;
        t tVar3 = new t("HAS_PENDING_STOCK_TRANSFERS", 2);
        HAS_PENDING_STOCK_TRANSFERS = tVar3;
        t tVar4 = new t("HAS_TRANSFER_OUT_REQUESTS", 3);
        HAS_TRANSFER_OUT_REQUESTS = tVar4;
        t tVar5 = new t("HAS_WARRANTS", 4);
        HAS_WARRANTS = tVar5;
        t tVar6 = new t("HAS_OPEN_POSITIONS", 5);
        HAS_OPEN_POSITIONS = tVar6;
        t tVar7 = new t("HAS_CASH", 6);
        HAS_CASH = tVar7;
        t tVar8 = new t("HAS_MARGIN_LOAN", 7);
        HAS_MARGIN_LOAN = tVar8;
        t tVar9 = new t("HAS_ROBO_OR_FLEXIBLE_ACCOUNT_ONBOARDED", 8);
        HAS_ROBO_OR_FLEXIBLE_ACCOUNT_ONBOARDED = tVar9;
        t tVar10 = new t("HAS_OTHER_ACCOUNT_ONBOARDED", 9);
        HAS_OTHER_ACCOUNT_ONBOARDED = tVar10;
        t tVar11 = new t("HAS_JOINT_GIA_ONBOARDED", 10);
        HAS_JOINT_GIA_ONBOARDED = tVar11;
        t[] tVarArr = {tVar, tVar2, tVar3, tVar4, tVar5, tVar6, tVar7, tVar8, tVar9, tVar10, tVar11};
        $VALUES = tVarArr;
        $ENTRIES = vc.s.n(tVarArr);
        Companion = new s();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new wq1.a(13));
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}
