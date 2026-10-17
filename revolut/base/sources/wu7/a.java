package wu7;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CarHire;
    public static final a PersonalLiability;
    public static final a PurchaseProtection;
    public static final a RefundProtection;
    public static final a TicketCancellation;
    public static final a TravelInsurance;
    public static final a WinterSport;

    @NotNull
    private final String fileName;

    static {
        a aVar = new a("CarHire", 0, "car_hire");
        CarHire = aVar;
        a aVar2 = new a("PersonalLiability", 1, "personal_liability");
        PersonalLiability = aVar2;
        a aVar3 = new a("PurchaseProtection", 2, "purchase_protection");
        PurchaseProtection = aVar3;
        a aVar4 = new a("RefundProtection", 3, "refund_protection");
        RefundProtection = aVar4;
        a aVar5 = new a("TicketCancellation", 4, "ticket_cancellation");
        TicketCancellation = aVar5;
        a aVar6 = new a("TravelInsurance", 5, "travel_insurance");
        TravelInsurance = aVar6;
        a aVar7 = new a("WinterSport", 6, "winter_sports");
        WinterSport = aVar7;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, String str2) {
        this.fileName = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String a() {
        return this.fileName;
    }
}
