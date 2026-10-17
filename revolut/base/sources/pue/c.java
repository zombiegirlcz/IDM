package pue;

import com.revolut.data.network.models.externalcards.ExpiryMonthYearDto;
import com.revolut.data.network.models.topup.ContextDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0003\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001a\u0010\u0019\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006R\u001c\u0010(\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006¨\u0006/"}, d2 = {"Lpue/c;", "", "", "a", "Ljava/lang/String;", "getExternalCardId", "()Ljava/lang/String;", "externalCardId", "", "b", "J", "getAmount", "()J", "amount", "c", "getCurrency", "currency", "d", "getPocketType", "pocketType", "Lpue/c$b;", "e", "Lpue/c$b;", "getEnvironment", "()Lpue/c$b;", "environment", "Lcom/revolut/data/network/models/topup/ContextDto;", "f", "Lcom/revolut/data/network/models/topup/ContextDto;", "getContext", "()Lcom/revolut/data/network/models/topup/ContextDto;", "context", "g", "getWalletId", "walletId", "Lpue/c$a;", "h", "Lpue/c$a;", "getCardDetails", "()Lpue/c$a;", "cardDetails", "i", "getCvv", "cvv", "j", "getPostcode", "postcode", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("externalCardId")
    @NotNull
    private final String externalCardId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final long amount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("pocketType")
    @NotNull
    private final String pocketType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("environment")
    @NotNull
    private final b environment;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("context")
    private final ContextDto context;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("walletId")
    private final String walletId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardDetails")
    private final a cardDetails;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("cvv")
    private final String cvv;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("postcode")
    private final String postcode;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lpue/c$a;", "", "Lcom/revolut/data/network/models/externalcards/ExpiryMonthYearDto;", "a", "Lcom/revolut/data/network/models/externalcards/ExpiryMonthYearDto;", "getExpiry", "()Lcom/revolut/data/network/models/externalcards/ExpiryMonthYearDto;", "expiry", "", "b", "Ljava/lang/String;", "getCardNumber", "()Ljava/lang/String;", "cardNumber", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("expiry")
        @NotNull
        private final ExpiryMonthYearDto expiry;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("cardNumber")
        @NotNull
        private final String cardNumber;

        public a(ExpiryMonthYearDto expiry, String cardNumber) {
            Intrinsics.checkNotNullParameter(expiry, "expiry");
            Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
            this.expiry = expiry;
            this.cardNumber = cardNumber;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.expiry, aVar.expiry) && Intrinsics.f(this.cardNumber, aVar.cardNumber);
        }

        public final int hashCode() {
            return this.cardNumber.hashCode() + (this.expiry.hashCode() * 31);
        }

        public final String toString() {
            return "CardDetailsDto(cardNumber=****, expiry=**)";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0011\u0010\tR\u001a\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001a\u0010\u0017\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u000b\u0010\u0016¨\u0006\u0018"}, d2 = {"Lpue/c$b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "d", "()I", "screenWidth", "b", "c", "screenHeight", "Ljava/lang/String;", "f", "type", "e", "timeZoneUtcOffset", "colorDepth", "", "Z", "()Z", "javaEnabled", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("screenWidth")
        private final int screenWidth;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("screenHeight")
        private final int screenHeight;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("timeZoneUtcOffset")
        private final int timeZoneUtcOffset;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("colorDepth")
        private final int colorDepth;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("javaEnabled")
        private final boolean javaEnabled;

        public b(int i, int i2) {
            Intrinsics.checkNotNullParameter("browser", "type");
            this.screenWidth = i;
            this.screenHeight = i2;
            this.type = "browser";
            this.timeZoneUtcOffset = -180;
            this.colorDepth = 24;
            this.javaEnabled = false;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getColorDepth() {
            return this.colorDepth;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getJavaEnabled() {
            return this.javaEnabled;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getScreenHeight() {
            return this.screenHeight;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getScreenWidth() {
            return this.screenWidth;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getTimeZoneUtcOffset() {
            return this.timeZoneUtcOffset;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return this.screenWidth == bVar.screenWidth && this.screenHeight == bVar.screenHeight && Intrinsics.f(this.type, bVar.type) && this.timeZoneUtcOffset == bVar.timeZoneUtcOffset && this.colorDepth == bVar.colorDepth && this.javaEnabled == bVar.javaEnabled;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.javaEnabled) + j6.a.b(this.colorDepth, j6.a.b(this.timeZoneUtcOffset, p.a.c(j6.a.b(this.screenHeight, Integer.hashCode(this.screenWidth) * 31, 31), 31, this.type), 31), 31);
        }
    }

    public c(String externalCardId, long j2, String currency, String pocketType, b environment, ContextDto contextDto, String str, a aVar, String str2, String str3) {
        Intrinsics.checkNotNullParameter(externalCardId, "externalCardId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        Intrinsics.checkNotNullParameter(environment, "environment");
        this.externalCardId = externalCardId;
        this.amount = j2;
        this.currency = currency;
        this.pocketType = pocketType;
        this.environment = environment;
        this.context = contextDto;
        this.walletId = str;
        this.cardDetails = aVar;
        this.cvv = str2;
        this.postcode = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.externalCardId, cVar.externalCardId) && this.amount == cVar.amount && Intrinsics.f(this.currency, cVar.currency) && Intrinsics.f(this.pocketType, cVar.pocketType) && Intrinsics.f(this.environment, cVar.environment) && Intrinsics.f(this.context, cVar.context) && Intrinsics.f(this.walletId, cVar.walletId) && Intrinsics.f(this.cardDetails, cVar.cardDetails) && Intrinsics.f(this.cvv, cVar.cvv) && Intrinsics.f(this.postcode, cVar.postcode);
    }

    public final int hashCode() {
        int iHashCode = (this.environment.hashCode() + p.a.c(p.a.c(a0.d.c(this.externalCardId.hashCode() * 31, 31, this.amount), 31, this.currency), 31, this.pocketType)) * 31;
        ContextDto contextDto = this.context;
        int iHashCode2 = (iHashCode + (contextDto == null ? 0 : contextDto.hashCode())) * 31;
        String str = this.walletId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        a aVar = this.cardDetails;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.cvv;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.postcode;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pue.c.toString():java.lang.String");
    }
}
