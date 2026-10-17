package u6c;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t AIRPORT_LOUNGES;
    public static final t AIRPORT_SECURITY_FAST_TRACK;
    public static final t AIR_MILES;
    public static final t CREDIT_ONBOARDING;
    public static final t DONATIONS;
    public static final t ESIM;
    public static final t ESIM_MOBILE_PLANS;
    public static final t EXPERIENCES;
    public static final t FLIGHTS;
    public static final t HOTELS_POINTS;
    public static final t MERCHANT_ACQUIRING;
    public static final t RAMP;
    public static final t REVPAY;
    public static final t STAYS;
    public static final t TRAINS_POINTS;
    public static final t TRANSPORT;

    static {
        t tVar = new t("REVPAY", 0);
        REVPAY = tVar;
        t tVar2 = new t("MERCHANT_ACQUIRING", 1);
        MERCHANT_ACQUIRING = tVar2;
        t tVar3 = new t("STAYS", 2);
        STAYS = tVar3;
        t tVar4 = new t("FLIGHTS", 3);
        FLIGHTS = tVar4;
        t tVar5 = new t("ESIM", 4);
        ESIM = tVar5;
        t tVar6 = new t("ESIM_MOBILE_PLANS", 5);
        ESIM_MOBILE_PLANS = tVar6;
        t tVar7 = new t("AIRPORT_SECURITY_FAST_TRACK", 6);
        AIRPORT_SECURITY_FAST_TRACK = tVar7;
        t tVar8 = new t("AIRPORT_LOUNGES", 7);
        AIRPORT_LOUNGES = tVar8;
        t tVar9 = new t("EXPERIENCES", 8);
        EXPERIENCES = tVar9;
        t tVar10 = new t("TRANSPORT", 9);
        TRANSPORT = tVar10;
        t tVar11 = new t("DONATIONS", 10);
        DONATIONS = tVar11;
        t tVar12 = new t("RAMP", 11);
        RAMP = tVar12;
        t tVar13 = new t("CREDIT_ONBOARDING", 12);
        CREDIT_ONBOARDING = tVar13;
        t tVar14 = new t("AIR_MILES", 13);
        AIR_MILES = tVar14;
        t tVar15 = new t("HOTELS_POINTS", 14);
        HOTELS_POINTS = tVar15;
        t tVar16 = new t("TRAINS_POINTS", 15);
        TRAINS_POINTS = tVar16;
        t[] tVarArr = {tVar, tVar2, tVar3, tVar4, tVar5, tVar6, tVar7, tVar8, tVar9, tVar10, tVar11, tVar12, tVar13, tVar14, tVar15, tVar16};
        $VALUES = tVarArr;
        $ENTRIES = vc.s.n(tVarArr);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}
