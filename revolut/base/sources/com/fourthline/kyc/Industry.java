package com.fourthline.kyc;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import yhm.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lcom/fourthline/kyc/Industry;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "UNKNOWN", "AGRICULTURE_FORESTRY_FISHING", "MINING_QUARRYING", "MANUFACTURING", "ELECTRICITY_GAS_STEAM_AIR_CONDITIONING_SUPPLY", "WATER_SUPPLY", "CONSTRUCTION", "WHOLESALE_RETAIL_TRADE", "TRANSPORTATION_STORAGE", "ACCOMMODATION_FOOD_SERVICE_ACTIVITIES", "INFORMATION_COMMUNICATION", "FINANCIAL_INSURANCE_ACTIVITIES", "REAL_ESTATE_ACTIVITIES", "PROFESSIONAL_SCIENTIFIC_TECHNICAL_ACTIVITIES", "ADMINISTRATIVE_SUPPORT_SERVICE_ACTIVITIES", "PUBLIC_ADMINISTRATION_DEFENCE", "EDUCATION", "HUMAN_HEALTH_SOCIAL_WORK_ACTIVITIES", "ARTS_ENTERTAINMENT_RECREATION", "OTHER_SERVICE_ACTIVITIES", "ACTIVITIES_OF_HOUSEHOLD_AS_EMPLOYERS", "ACTIVITIES_OF_EXTRA_TERRITORIAL_ORGANIZATIONS_AND_BODIES", "fourthline-kyc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class Industry {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ Industry[] f26506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f26507c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String code;
    public static final Industry UNKNOWN = new Industry("UNKNOWN", 0, "");
    public static final Industry AGRICULTURE_FORESTRY_FISHING = new Industry("AGRICULTURE_FORESTRY_FISHING", 1, "A");
    public static final Industry MINING_QUARRYING = new Industry("MINING_QUARRYING", 2, "B");
    public static final Industry MANUFACTURING = new Industry("MANUFACTURING", 3, "C");
    public static final Industry ELECTRICITY_GAS_STEAM_AIR_CONDITIONING_SUPPLY = new Industry("ELECTRICITY_GAS_STEAM_AIR_CONDITIONING_SUPPLY", 4, "D");
    public static final Industry WATER_SUPPLY = new Industry("WATER_SUPPLY", 5, "E");
    public static final Industry CONSTRUCTION = new Industry("CONSTRUCTION", 6, "F");
    public static final Industry WHOLESALE_RETAIL_TRADE = new Industry("WHOLESALE_RETAIL_TRADE", 7, "G");
    public static final Industry TRANSPORTATION_STORAGE = new Industry("TRANSPORTATION_STORAGE", 8, "H");
    public static final Industry ACCOMMODATION_FOOD_SERVICE_ACTIVITIES = new Industry("ACCOMMODATION_FOOD_SERVICE_ACTIVITIES", 9, "I");
    public static final Industry INFORMATION_COMMUNICATION = new Industry("INFORMATION_COMMUNICATION", 10, "J");
    public static final Industry FINANCIAL_INSURANCE_ACTIVITIES = new Industry("FINANCIAL_INSURANCE_ACTIVITIES", 11, "K");
    public static final Industry REAL_ESTATE_ACTIVITIES = new Industry("REAL_ESTATE_ACTIVITIES", 12, "L");
    public static final Industry PROFESSIONAL_SCIENTIFIC_TECHNICAL_ACTIVITIES = new Industry("PROFESSIONAL_SCIENTIFIC_TECHNICAL_ACTIVITIES", 13, "M");
    public static final Industry ADMINISTRATIVE_SUPPORT_SERVICE_ACTIVITIES = new Industry("ADMINISTRATIVE_SUPPORT_SERVICE_ACTIVITIES", 14, "N");
    public static final Industry PUBLIC_ADMINISTRATION_DEFENCE = new Industry("PUBLIC_ADMINISTRATION_DEFENCE", 15, "O");
    public static final Industry EDUCATION = new Industry("EDUCATION", 16, "P");
    public static final Industry HUMAN_HEALTH_SOCIAL_WORK_ACTIVITIES = new Industry("HUMAN_HEALTH_SOCIAL_WORK_ACTIVITIES", 17, "Q");
    public static final Industry ARTS_ENTERTAINMENT_RECREATION = new Industry("ARTS_ENTERTAINMENT_RECREATION", 18, "R");
    public static final Industry OTHER_SERVICE_ACTIVITIES = new Industry("OTHER_SERVICE_ACTIVITIES", 19, "S");
    public static final Industry ACTIVITIES_OF_HOUSEHOLD_AS_EMPLOYERS = new Industry("ACTIVITIES_OF_HOUSEHOLD_AS_EMPLOYERS", 20, "T");
    public static final Industry ACTIVITIES_OF_EXTRA_TERRITORIAL_ORGANIZATIONS_AND_BODIES = new Industry("ACTIVITIES_OF_EXTRA_TERRITORIAL_ORGANIZATIONS_AND_BODIES", 21, "U");

    static {
        Industry[] industryArrA = a();
        f26506b = industryArrA;
        f26507c = s.n(industryArrA);
    }

    private Industry(String str, int i, String str2) {
        this.code = str2;
    }

    private static final /* synthetic */ Industry[] a() {
        return new Industry[]{UNKNOWN, AGRICULTURE_FORESTRY_FISHING, MINING_QUARRYING, MANUFACTURING, ELECTRICITY_GAS_STEAM_AIR_CONDITIONING_SUPPLY, WATER_SUPPLY, CONSTRUCTION, WHOLESALE_RETAIL_TRADE, TRANSPORTATION_STORAGE, ACCOMMODATION_FOOD_SERVICE_ACTIVITIES, INFORMATION_COMMUNICATION, FINANCIAL_INSURANCE_ACTIVITIES, REAL_ESTATE_ACTIVITIES, PROFESSIONAL_SCIENTIFIC_TECHNICAL_ACTIVITIES, ADMINISTRATIVE_SUPPORT_SERVICE_ACTIVITIES, PUBLIC_ADMINISTRATION_DEFENCE, EDUCATION, HUMAN_HEALTH_SOCIAL_WORK_ACTIVITIES, ARTS_ENTERTAINMENT_RECREATION, OTHER_SERVICE_ACTIVITIES, ACTIVITIES_OF_HOUSEHOLD_AS_EMPLOYERS, ACTIVITIES_OF_EXTRA_TERRITORIAL_ORGANIZATIONS_AND_BODIES};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f26507c;
    }

    public static Industry valueOf(String str) {
        return (Industry) Enum.valueOf(Industry.class, str);
    }

    public static Industry[] values() {
        return (Industry[]) f26506b.clone();
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }
}
