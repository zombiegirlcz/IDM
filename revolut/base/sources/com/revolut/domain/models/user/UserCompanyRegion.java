package com.revolut.domain.models.user;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b%\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%¨\u0006&"}, d2 = {"Lcom/revolut/domain/models/user/UserCompanyRegion;", "", "<init>", "(Ljava/lang/String;I)V", "LT", "FR", "US", "CA", "EEA", "JP", "AU", "CH", "IE", "NZ", "SG", "ES", "NL", "IN", "DE", "BE", "MX", "GB", "BR", "PT", "IT", "PL", "AT", "GR", "HU", "RO", "CO", "SE", "FI", "NO", "DK", "IL", "AE", "OTHER", "feature_user_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UserCompanyRegion {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UserCompanyRegion[] $VALUES;
    public static final UserCompanyRegion LT = new UserCompanyRegion("LT", 0);
    public static final UserCompanyRegion FR = new UserCompanyRegion("FR", 1);
    public static final UserCompanyRegion US = new UserCompanyRegion("US", 2);
    public static final UserCompanyRegion CA = new UserCompanyRegion("CA", 3);
    public static final UserCompanyRegion EEA = new UserCompanyRegion("EEA", 4);
    public static final UserCompanyRegion JP = new UserCompanyRegion("JP", 5);
    public static final UserCompanyRegion AU = new UserCompanyRegion("AU", 6);
    public static final UserCompanyRegion CH = new UserCompanyRegion("CH", 7);
    public static final UserCompanyRegion IE = new UserCompanyRegion("IE", 8);
    public static final UserCompanyRegion NZ = new UserCompanyRegion("NZ", 9);
    public static final UserCompanyRegion SG = new UserCompanyRegion("SG", 10);
    public static final UserCompanyRegion ES = new UserCompanyRegion("ES", 11);
    public static final UserCompanyRegion NL = new UserCompanyRegion("NL", 12);
    public static final UserCompanyRegion IN = new UserCompanyRegion("IN", 13);
    public static final UserCompanyRegion DE = new UserCompanyRegion("DE", 14);
    public static final UserCompanyRegion BE = new UserCompanyRegion("BE", 15);
    public static final UserCompanyRegion MX = new UserCompanyRegion("MX", 16);
    public static final UserCompanyRegion GB = new UserCompanyRegion("GB", 17);
    public static final UserCompanyRegion BR = new UserCompanyRegion("BR", 18);
    public static final UserCompanyRegion PT = new UserCompanyRegion("PT", 19);
    public static final UserCompanyRegion IT = new UserCompanyRegion("IT", 20);
    public static final UserCompanyRegion PL = new UserCompanyRegion("PL", 21);
    public static final UserCompanyRegion AT = new UserCompanyRegion("AT", 22);
    public static final UserCompanyRegion GR = new UserCompanyRegion("GR", 23);
    public static final UserCompanyRegion HU = new UserCompanyRegion("HU", 24);
    public static final UserCompanyRegion RO = new UserCompanyRegion("RO", 25);
    public static final UserCompanyRegion CO = new UserCompanyRegion("CO", 26);
    public static final UserCompanyRegion SE = new UserCompanyRegion("SE", 27);
    public static final UserCompanyRegion FI = new UserCompanyRegion("FI", 28);
    public static final UserCompanyRegion NO = new UserCompanyRegion("NO", 29);
    public static final UserCompanyRegion DK = new UserCompanyRegion("DK", 30);
    public static final UserCompanyRegion IL = new UserCompanyRegion("IL", 31);
    public static final UserCompanyRegion AE = new UserCompanyRegion("AE", 32);
    public static final UserCompanyRegion OTHER = new UserCompanyRegion("OTHER", 33);

    private static final /* synthetic */ UserCompanyRegion[] $values() {
        return new UserCompanyRegion[]{LT, FR, US, CA, EEA, JP, AU, CH, IE, NZ, SG, ES, NL, IN, DE, BE, MX, GB, BR, PT, IT, PL, AT, GR, HU, RO, CO, SE, FI, NO, DK, IL, AE, OTHER};
    }

    static {
        UserCompanyRegion[] userCompanyRegionArr$values = $values();
        $VALUES = userCompanyRegionArr$values;
        $ENTRIES = s.n(userCompanyRegionArr$values);
    }

    private UserCompanyRegion(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static UserCompanyRegion valueOf(String str) {
        return (UserCompanyRegion) Enum.valueOf(UserCompanyRegion.class, str);
    }

    public static UserCompanyRegion[] values() {
        return (UserCompanyRegion[]) $VALUES.clone();
    }
}
