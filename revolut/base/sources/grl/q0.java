package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum q0 implements com.google.protobuf.a1 {
    ProductUnspecified(0),
    Risks(1),
    Fortuna(2),
    PeopleOps(3),
    Docs(4),
    Thalia(5),
    LicenseAndEntityRegister(6),
    Metis(7),
    Products(8),
    ServiceDelivery(9),
    Vendors(10),
    TestExplorer(11),
    CXLabs(12),
    Marketing(13),
    Business(14),
    FinancialRisk(15),
    AiDesigner(16),
    StrategyLab(17),
    TradingBackoffice(18),
    UNRECOGNIZED(-1);

    public static final int AiDesigner_VALUE = 16;
    public static final int Business_VALUE = 14;
    public static final int CXLabs_VALUE = 12;
    public static final int Docs_VALUE = 4;
    public static final int FinancialRisk_VALUE = 15;
    public static final int Fortuna_VALUE = 2;
    public static final int LicenseAndEntityRegister_VALUE = 6;
    public static final int Marketing_VALUE = 13;
    public static final int Metis_VALUE = 7;
    public static final int PeopleOps_VALUE = 3;
    public static final int ProductUnspecified_VALUE = 0;
    public static final int Products_VALUE = 8;
    public static final int Risks_VALUE = 1;
    public static final int ServiceDelivery_VALUE = 9;
    public static final int StrategyLab_VALUE = 17;
    public static final int TestExplorer_VALUE = 11;
    public static final int Thalia_VALUE = 5;
    public static final int TradingBackoffice_VALUE = 18;
    public static final int Vendors_VALUE = 10;
    private static final com.google.protobuf.b1 internalValueMap = new p0();
    private final int value;

    q0(int i) {
        this.value = i;
    }

    public static q0 a(int i) {
        switch (i) {
            case 0:
                return ProductUnspecified;
            case 1:
                return Risks;
            case 2:
                return Fortuna;
            case 3:
                return PeopleOps;
            case 4:
                return Docs;
            case 5:
                return Thalia;
            case 6:
                return LicenseAndEntityRegister;
            case 7:
                return Metis;
            case 8:
                return Products;
            case 9:
                return ServiceDelivery;
            case 10:
                return Vendors;
            case 11:
                return TestExplorer;
            case 12:
                return CXLabs;
            case 13:
                return Marketing;
            case 14:
                return Business;
            case 15:
                return FinancialRisk;
            case 16:
                return AiDesigner;
            case 17:
                return StrategyLab;
            case 18:
                return TradingBackoffice;
            default:
                return null;
        }
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
