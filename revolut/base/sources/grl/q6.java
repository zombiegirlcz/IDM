package grl;

/* JADX INFO: loaded from: classes13.dex */
public enum q6 implements com.google.protobuf.a1 {
    ProductUnspecified(0),
    Analytics(1),
    Cards(2),
    Home(3),
    Profile(4),
    Payments(5),
    Tasks(6),
    Savings(7),
    Onboarding(8),
    Referrals(9),
    Rewards(10),
    Transactions(11),
    MobilePlatform(12),
    SSO(13),
    RevolutUiKit(14),
    Environment(15),
    AppRating(16),
    Accounts(17),
    Contacts(18),
    HelpCenter(19),
    FinCrime(20),
    Vision(21),
    Camera(22),
    Chat(23),
    Forms(24),
    FAQ(25),
    CardReader(26),
    Search(27),
    Graduation(28),
    Tab(29),
    Junior(30),
    CoParents(31),
    CRM(32),
    Consents(33),
    Ticketor(34),
    KYC(35),
    Story(36),
    CardScanner(37),
    OpenSourceLicenses(38),
    Charges(39),
    Trading(40),
    Wallet(41),
    UNRECOGNIZED(-1);

    public static final int Accounts_VALUE = 17;
    public static final int Analytics_VALUE = 1;
    public static final int AppRating_VALUE = 16;
    public static final int CRM_VALUE = 32;
    public static final int Camera_VALUE = 22;
    public static final int CardReader_VALUE = 26;
    public static final int CardScanner_VALUE = 37;
    public static final int Cards_VALUE = 2;
    public static final int Charges_VALUE = 39;
    public static final int Chat_VALUE = 23;
    public static final int CoParents_VALUE = 31;
    public static final int Consents_VALUE = 33;
    public static final int Contacts_VALUE = 18;
    public static final int Environment_VALUE = 15;
    public static final int FAQ_VALUE = 25;
    public static final int FinCrime_VALUE = 20;
    public static final int Forms_VALUE = 24;
    public static final int Graduation_VALUE = 28;
    public static final int HelpCenter_VALUE = 19;
    public static final int Home_VALUE = 3;
    public static final int Junior_VALUE = 30;
    public static final int KYC_VALUE = 35;
    public static final int MobilePlatform_VALUE = 12;
    public static final int Onboarding_VALUE = 8;
    public static final int OpenSourceLicenses_VALUE = 38;
    public static final int Payments_VALUE = 5;
    public static final int ProductUnspecified_VALUE = 0;
    public static final int Profile_VALUE = 4;
    public static final int Referrals_VALUE = 9;
    public static final int RevolutUiKit_VALUE = 14;
    public static final int Rewards_VALUE = 10;
    public static final int SSO_VALUE = 13;
    public static final int Savings_VALUE = 7;
    public static final int Search_VALUE = 27;
    public static final int Story_VALUE = 36;
    public static final int Tab_VALUE = 29;
    public static final int Tasks_VALUE = 6;
    public static final int Ticketor_VALUE = 34;
    public static final int Trading_VALUE = 40;
    public static final int Transactions_VALUE = 11;
    public static final int Vision_VALUE = 21;
    public static final int Wallet_VALUE = 41;
    private static final com.google.protobuf.b1 internalValueMap = new p6();
    private final int value;

    q6(int i) {
        this.value = i;
    }

    public static q6 a(int i) {
        switch (i) {
            case 0:
                return ProductUnspecified;
            case 1:
                return Analytics;
            case 2:
                return Cards;
            case 3:
                return Home;
            case 4:
                return Profile;
            case 5:
                return Payments;
            case 6:
                return Tasks;
            case 7:
                return Savings;
            case 8:
                return Onboarding;
            case 9:
                return Referrals;
            case 10:
                return Rewards;
            case 11:
                return Transactions;
            case 12:
                return MobilePlatform;
            case 13:
                return SSO;
            case 14:
                return RevolutUiKit;
            case 15:
                return Environment;
            case 16:
                return AppRating;
            case 17:
                return Accounts;
            case 18:
                return Contacts;
            case 19:
                return HelpCenter;
            case 20:
                return FinCrime;
            case 21:
                return Vision;
            case 22:
                return Camera;
            case 23:
                return Chat;
            case 24:
                return Forms;
            case 25:
                return FAQ;
            case 26:
                return CardReader;
            case 27:
                return Search;
            case 28:
                return Graduation;
            case 29:
                return Tab;
            case 30:
                return Junior;
            case 31:
                return CoParents;
            case 32:
                return CRM;
            case 33:
                return Consents;
            case 34:
                return Ticketor;
            case 35:
                return KYC;
            case 36:
                return Story;
            case 37:
                return CardScanner;
            case 38:
                return OpenSourceLicenses;
            case 39:
                return Charges;
            case 40:
                return Trading;
            case 41:
                return Wallet;
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
