package grl;

/* JADX INFO: loaded from: classes13.dex */
public enum x0 implements com.google.protobuf.a1 {
    ProductUnspecified(0),
    CardReader(1),
    Cards(2),
    Chat(3),
    Contacts(4),
    Crypto(5),
    FAQ(6),
    Invoices(7),
    KYC(8),
    Marketplace(9),
    Onboarding(10),
    OpenBanking(11),
    Payments(12),
    PricingPlans(13),
    Rates(14),
    Referrals(15),
    RevolutUIKit(16),
    Rewards(17),
    Accounts(18),
    Analytics(19),
    AppRating(20),
    Expenses(21),
    Fincrime(22),
    Home(23),
    Insurance(24),
    Merchant(25),
    People(26),
    Transaction(27),
    Cashback(28),
    PeriodicReview(29),
    Business(30),
    HelpCenter(31),
    Statements(32),
    Approvals(33),
    Vision(34),
    Camera(35),
    MobilePlatform(36),
    Forms(37),
    Savings(38),
    SSO(39),
    Eligibility(40),
    Environment(41),
    CustomerPresent(42),
    Sales(43),
    InStore(44),
    ECommerce(45),
    POS(46),
    Exchange(47),
    Favourites(48),
    FxForwards(49),
    Search(50),
    Tab(51),
    Api(52),
    Ticketor(53),
    Integrations(54),
    Treasury(55),
    Loyalty(56),
    RevolutShop(57),
    Settings(58),
    Accounting(59),
    BillPay(60),
    Profile(61),
    Changelogs(62),
    Story(63),
    BusinessESim(64),
    RevPoints(65),
    AirportLounges(66),
    MoveMoneyRules(67),
    OpenSourceLicenses(68),
    PurchaseOrder(69),
    Policies(70),
    FastTrack(71),
    Credit(72),
    RevolutPay(73),
    Filters(74),
    MoveMoney(75),
    Invest(76),
    EarlyPayments(77),
    AgenticCommerce(78),
    UNRECOGNIZED(-1);

    public static final int Accounting_VALUE = 59;
    public static final int Accounts_VALUE = 18;
    public static final int AgenticCommerce_VALUE = 78;
    public static final int AirportLounges_VALUE = 66;
    public static final int Analytics_VALUE = 19;
    public static final int Api_VALUE = 52;
    public static final int AppRating_VALUE = 20;
    public static final int Approvals_VALUE = 33;
    public static final int BillPay_VALUE = 60;
    public static final int BusinessESim_VALUE = 64;
    public static final int Business_VALUE = 30;
    public static final int Camera_VALUE = 35;
    public static final int CardReader_VALUE = 1;
    public static final int Cards_VALUE = 2;
    public static final int Cashback_VALUE = 28;
    public static final int Changelogs_VALUE = 62;
    public static final int Chat_VALUE = 3;
    public static final int Contacts_VALUE = 4;
    public static final int Credit_VALUE = 72;
    public static final int Crypto_VALUE = 5;
    public static final int CustomerPresent_VALUE = 42;
    public static final int ECommerce_VALUE = 45;
    public static final int EarlyPayments_VALUE = 77;
    public static final int Eligibility_VALUE = 40;
    public static final int Environment_VALUE = 41;
    public static final int Exchange_VALUE = 47;
    public static final int Expenses_VALUE = 21;
    public static final int FAQ_VALUE = 6;
    public static final int FastTrack_VALUE = 71;
    public static final int Favourites_VALUE = 48;
    public static final int Filters_VALUE = 74;
    public static final int Fincrime_VALUE = 22;
    public static final int Forms_VALUE = 37;
    public static final int FxForwards_VALUE = 49;
    public static final int HelpCenter_VALUE = 31;
    public static final int Home_VALUE = 23;
    public static final int InStore_VALUE = 44;
    public static final int Insurance_VALUE = 24;
    public static final int Integrations_VALUE = 54;
    public static final int Invest_VALUE = 76;
    public static final int Invoices_VALUE = 7;
    public static final int KYC_VALUE = 8;
    public static final int Loyalty_VALUE = 56;
    public static final int Marketplace_VALUE = 9;
    public static final int Merchant_VALUE = 25;
    public static final int MobilePlatform_VALUE = 36;
    public static final int MoveMoneyRules_VALUE = 67;
    public static final int MoveMoney_VALUE = 75;
    public static final int Onboarding_VALUE = 10;
    public static final int OpenBanking_VALUE = 11;
    public static final int OpenSourceLicenses_VALUE = 68;
    public static final int POS_VALUE = 46;
    public static final int Payments_VALUE = 12;
    public static final int People_VALUE = 26;
    public static final int PeriodicReview_VALUE = 29;
    public static final int Policies_VALUE = 70;
    public static final int PricingPlans_VALUE = 13;
    public static final int ProductUnspecified_VALUE = 0;
    public static final int Profile_VALUE = 61;
    public static final int PurchaseOrder_VALUE = 69;
    public static final int Rates_VALUE = 14;
    public static final int Referrals_VALUE = 15;
    public static final int RevPoints_VALUE = 65;
    public static final int RevolutPay_VALUE = 73;
    public static final int RevolutShop_VALUE = 57;
    public static final int RevolutUIKit_VALUE = 16;
    public static final int Rewards_VALUE = 17;
    public static final int SSO_VALUE = 39;
    public static final int Sales_VALUE = 43;
    public static final int Savings_VALUE = 38;
    public static final int Search_VALUE = 50;
    public static final int Settings_VALUE = 58;
    public static final int Statements_VALUE = 32;
    public static final int Story_VALUE = 63;
    public static final int Tab_VALUE = 51;
    public static final int Ticketor_VALUE = 53;
    public static final int Transaction_VALUE = 27;
    public static final int Treasury_VALUE = 55;
    public static final int Vision_VALUE = 34;
    private static final com.google.protobuf.b1 internalValueMap = new w0();
    private final int value;

    x0(int i) {
        this.value = i;
    }

    public static x0 a(int i) {
        switch (i) {
            case 0:
                return ProductUnspecified;
            case 1:
                return CardReader;
            case 2:
                return Cards;
            case 3:
                return Chat;
            case 4:
                return Contacts;
            case 5:
                return Crypto;
            case 6:
                return FAQ;
            case 7:
                return Invoices;
            case 8:
                return KYC;
            case 9:
                return Marketplace;
            case 10:
                return Onboarding;
            case 11:
                return OpenBanking;
            case 12:
                return Payments;
            case 13:
                return PricingPlans;
            case 14:
                return Rates;
            case 15:
                return Referrals;
            case 16:
                return RevolutUIKit;
            case 17:
                return Rewards;
            case 18:
                return Accounts;
            case 19:
                return Analytics;
            case 20:
                return AppRating;
            case 21:
                return Expenses;
            case 22:
                return Fincrime;
            case 23:
                return Home;
            case 24:
                return Insurance;
            case 25:
                return Merchant;
            case 26:
                return People;
            case 27:
                return Transaction;
            case 28:
                return Cashback;
            case 29:
                return PeriodicReview;
            case 30:
                return Business;
            case 31:
                return HelpCenter;
            case 32:
                return Statements;
            case 33:
                return Approvals;
            case 34:
                return Vision;
            case 35:
                return Camera;
            case 36:
                return MobilePlatform;
            case 37:
                return Forms;
            case 38:
                return Savings;
            case 39:
                return SSO;
            case 40:
                return Eligibility;
            case 41:
                return Environment;
            case 42:
                return CustomerPresent;
            case 43:
                return Sales;
            case 44:
                return InStore;
            case 45:
                return ECommerce;
            case 46:
                return POS;
            case 47:
                return Exchange;
            case 48:
                return Favourites;
            case 49:
                return FxForwards;
            case 50:
                return Search;
            case 51:
                return Tab;
            case 52:
                return Api;
            case 53:
                return Ticketor;
            case 54:
                return Integrations;
            case 55:
                return Treasury;
            case 56:
                return Loyalty;
            case 57:
                return RevolutShop;
            case 58:
                return Settings;
            case 59:
                return Accounting;
            case 60:
                return BillPay;
            case 61:
                return Profile;
            case 62:
                return Changelogs;
            case 63:
                return Story;
            case 64:
                return BusinessESim;
            case 65:
                return RevPoints;
            case 66:
                return AirportLounges;
            case 67:
                return MoveMoneyRules;
            case 68:
                return OpenSourceLicenses;
            case 69:
                return PurchaseOrder;
            case 70:
                return Policies;
            case 71:
                return FastTrack;
            case 72:
                return Credit;
            case 73:
                return RevolutPay;
            case 74:
                return Filters;
            case 75:
                return MoveMoney;
            case 76:
                return Invest;
            case 77:
                return EarlyPayments;
            case 78:
                return AgenticCommerce;
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
