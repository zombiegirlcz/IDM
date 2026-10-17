package grl;

/* JADX INFO: loaded from: classes12.dex */
public enum h8 implements com.google.protobuf.a1 {
    ProductUnspecified(0),
    AssetsLibrary(1),
    Audiences(2),
    Banners(3),
    Campaigns(4),
    Comms(5),
    Schedule(6),
    Learn(7),
    LegalPages(8),
    NewsAndBlog(9),
    Website(10),
    UNRECOGNIZED(-1);

    public static final int AssetsLibrary_VALUE = 1;
    public static final int Audiences_VALUE = 2;
    public static final int Banners_VALUE = 3;
    public static final int Campaigns_VALUE = 4;
    public static final int Comms_VALUE = 5;
    public static final int Learn_VALUE = 7;
    public static final int LegalPages_VALUE = 8;
    public static final int NewsAndBlog_VALUE = 9;
    public static final int ProductUnspecified_VALUE = 0;
    public static final int Schedule_VALUE = 6;
    public static final int Website_VALUE = 10;
    private static final com.google.protobuf.b1 internalValueMap = new g8();
    private final int value;

    h8(int i) {
        this.value = i;
    }

    public static h8 a(int i) {
        switch (i) {
            case 0:
                return ProductUnspecified;
            case 1:
                return AssetsLibrary;
            case 2:
                return Audiences;
            case 3:
                return Banners;
            case 4:
                return Campaigns;
            case 5:
                return Comms;
            case 6:
                return Schedule;
            case 7:
                return Learn;
            case 8:
                return LegalPages;
            case 9:
                return NewsAndBlog;
            case 10:
                return Website;
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
