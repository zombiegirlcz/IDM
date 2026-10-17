package w1m;

import kotlin.NotImplementedError;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g BasicResidentRegistrationCard;

    @NotNull
    public static final e Companion;
    public static final g DriversLicense;
    public static final g DrivingHistoryCertificate;
    public static final g HealthInsuranceCard;
    public static final g IndividualNumberCard;
    public static final g IndividualNumberNotificationCard;
    public static final g Passport;
    public static final g ResidenceCard;
    public static final g ResidenceCertificate;
    public static final g SpecialPermanentResidentCertificate;

    static {
        g gVar = new g("DriversLicense", 0);
        DriversLicense = gVar;
        g gVar2 = new g("Passport", 1);
        Passport = gVar2;
        g gVar3 = new g("IndividualNumberCard", 2);
        IndividualNumberCard = gVar3;
        g gVar4 = new g("ResidenceCard", 3);
        ResidenceCard = gVar4;
        g gVar5 = new g("SpecialPermanentResidentCertificate", 4);
        SpecialPermanentResidentCertificate = gVar5;
        g gVar6 = new g("BasicResidentRegistrationCard", 5);
        BasicResidentRegistrationCard = gVar6;
        g gVar7 = new g("DrivingHistoryCertificate", 6);
        DrivingHistoryCertificate = gVar7;
        g gVar8 = new g("HealthInsuranceCard", 7);
        HealthInsuranceCard = gVar8;
        g gVar9 = new g("IndividualNumberNotificationCard", 8);
        IndividualNumberNotificationCard = gVar9;
        g gVar10 = new g("ResidenceCertificate", 9);
        ResidenceCertificate = gVar10;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10};
        $VALUES = gVarArr;
        $ENTRIES = s.n(gVarArr);
        Companion = new e();
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public final a3m.g a() {
        int i = f.f293893a[ordinal()];
        if (i == 1) {
            return a3m.g.DRIVERS_LICENSE;
        }
        if (i == 2) {
            return a3m.g.RESIDENCE_CARD;
        }
        if (i == 3) {
            return a3m.g.SPECIAL_PERMANENT_RESIDENT_CERTIFICATE;
        }
        if (i == 4) {
            return a3m.g.INDIVIDUAL_NUMBER_CARD;
        }
        throw new NotImplementedError("未実装: " + this);
    }
}
