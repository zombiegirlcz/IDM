package grl;

/* JADX INFO: loaded from: classes13.dex */
public enum od implements com.google.protobuf.a1 {
    ProductUnspecified(0),
    Stocks(1),
    Trade(2),
    Portfolio(3),
    Discover(4),
    Markets(5),
    Watchlists(6),
    Help(7),
    Auth(8),
    Terminal(9),
    Profile(10),
    Analytics(11),
    Environment(12),
    Fincrime(13),
    MobilePlatform(14),
    Onboarding(15),
    Transaction(16),
    RevolutUIKit(17),
    Vision(18),
    SSO(19),
    Activity(20),
    ProductCatalogue(21),
    Restaurants(22),
    UNRECOGNIZED(-1);

    public static final int Activity_VALUE = 20;
    public static final int Analytics_VALUE = 11;
    public static final int Auth_VALUE = 8;
    public static final int Discover_VALUE = 4;
    public static final int Environment_VALUE = 12;
    public static final int Fincrime_VALUE = 13;
    public static final int Help_VALUE = 7;
    public static final int Markets_VALUE = 5;
    public static final int MobilePlatform_VALUE = 14;
    public static final int Onboarding_VALUE = 15;
    public static final int Portfolio_VALUE = 3;
    public static final int ProductCatalogue_VALUE = 21;
    public static final int ProductUnspecified_VALUE = 0;
    public static final int Profile_VALUE = 10;
    public static final int Restaurants_VALUE = 22;
    public static final int RevolutUIKit_VALUE = 17;
    public static final int SSO_VALUE = 19;
    public static final int Stocks_VALUE = 1;
    public static final int Terminal_VALUE = 9;
    public static final int Trade_VALUE = 2;
    public static final int Transaction_VALUE = 16;
    public static final int Vision_VALUE = 18;
    public static final int Watchlists_VALUE = 6;
    private static final com.google.protobuf.b1 internalValueMap = new nd();
    private final int value;

    od(int i) {
        this.value = i;
    }

    public static od a(int i) {
        switch (i) {
            case 0:
                return ProductUnspecified;
            case 1:
                return Stocks;
            case 2:
                return Trade;
            case 3:
                return Portfolio;
            case 4:
                return Discover;
            case 5:
                return Markets;
            case 6:
                return Watchlists;
            case 7:
                return Help;
            case 8:
                return Auth;
            case 9:
                return Terminal;
            case 10:
                return Profile;
            case 11:
                return Analytics;
            case 12:
                return Environment;
            case 13:
                return Fincrime;
            case 14:
                return MobilePlatform;
            case 15:
                return Onboarding;
            case 16:
                return Transaction;
            case 17:
                return RevolutUIKit;
            case 18:
                return Vision;
            case 19:
                return SSO;
            case 20:
                return Activity;
            case 21:
                return ProductCatalogue;
            case 22:
                return Restaurants;
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
