package ofa;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final b CARD_CHECKOUT;
    public static final b COBRANDS_ONBOARDING;
    public static final b CREDIT_ONBOARDING;

    @NotNull
    public static final a Companion;
    public static final b PLAN_AND_CARD_CHECKOUT;
    public static final b PLAN_AND_CARD_CREDIT_CHECKOUT;
    public static final b PRO_ONBOARDING;
    public static final b RETAIL_CREDIT_ONBOARDING;
    public static final b RETAIL_CREDIT_ONBOARDING_WAITING;
    public static final b VIRTUAL_CARD_AND_TOPUP;
    public static final b VIRTUAL_CARD_AND_TOPUP_NRA;

    static {
        b bVar = new b("CARD_CHECKOUT", 0);
        CARD_CHECKOUT = bVar;
        b bVar2 = new b("PLAN_AND_CARD_CHECKOUT", 1);
        PLAN_AND_CARD_CHECKOUT = bVar2;
        b bVar3 = new b("PLAN_AND_CARD_CREDIT_CHECKOUT", 2);
        PLAN_AND_CARD_CREDIT_CHECKOUT = bVar3;
        b bVar4 = new b("VIRTUAL_CARD_AND_TOPUP", 3);
        VIRTUAL_CARD_AND_TOPUP = bVar4;
        b bVar5 = new b("VIRTUAL_CARD_AND_TOPUP_NRA", 4);
        VIRTUAL_CARD_AND_TOPUP_NRA = bVar5;
        b bVar6 = new b("CREDIT_ONBOARDING", 5);
        CREDIT_ONBOARDING = bVar6;
        b bVar7 = new b("RETAIL_CREDIT_ONBOARDING", 6);
        RETAIL_CREDIT_ONBOARDING = bVar7;
        b bVar8 = new b("RETAIL_CREDIT_ONBOARDING_WAITING", 7);
        RETAIL_CREDIT_ONBOARDING_WAITING = bVar8;
        b bVar9 = new b("PRO_ONBOARDING", 8);
        PRO_ONBOARDING = bVar9;
        b bVar10 = new b("COBRANDS_ONBOARDING", 9);
        COBRANDS_ONBOARDING = bVar10;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10};
        $VALUES = bVarArr;
        $ENTRIES = vc.s.n(bVarArr);
        Companion = new a();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new ob1.e(26));
    }

    public static EnumEntries b() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
