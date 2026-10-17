package oue;

import com.revolut.data.network.models.externalcards.ExpiryMonthYearDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Loue/c;", "", "", "toString", "()Ljava/lang/String;", "Loue/c$a;", "a", "Loue/c$a;", "getCardDetails", "()Loue/c$a;", "cardDetails", "b", "Ljava/lang/String;", "getCvv", "cvv", "c", "getPostcode", "postcode", "", "d", "Ljava/lang/Boolean;", "getSaveCardForSubsequent", "()Ljava/lang/Boolean;", "saveCardForSubsequent", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardDetails")
    @NotNull
    private final a cardDetails;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("cvv")
    @NotNull
    private final String cvv;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("postcode")
    private final String postcode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("saveCardForSubsequent")
    private final Boolean saveCardForSubsequent;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Loue/c$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getEntryMode", "entryMode", "Lcom/revolut/data/network/models/externalcards/ExpiryMonthYearDto;", "b", "Lcom/revolut/data/network/models/externalcards/ExpiryMonthYearDto;", "getExpiry", "()Lcom/revolut/data/network/models/externalcards/ExpiryMonthYearDto;", "expiry", "c", "getCardNumber", "cardNumber", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("entryMode")
        @NotNull
        private final String entryMode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("expiry")
        @NotNull
        private final ExpiryMonthYearDto expiry;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("cardNumber")
        @NotNull
        private final String cardNumber;

        public a(String entryMode, ExpiryMonthYearDto expiry, String cardNumber) {
            Intrinsics.checkNotNullParameter(entryMode, "entryMode");
            Intrinsics.checkNotNullParameter(expiry, "expiry");
            Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
            this.entryMode = entryMode;
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
            return Intrinsics.f(this.entryMode, aVar.entryMode) && Intrinsics.f(this.expiry, aVar.expiry) && Intrinsics.f(this.cardNumber, aVar.cardNumber);
        }

        public final int hashCode() {
            return this.cardNumber.hashCode() + ((this.expiry.hashCode() + (this.entryMode.hashCode() * 31)) * 31);
        }
    }

    public c(a cardDetails, String cvv, String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(cardDetails, "cardDetails");
        Intrinsics.checkNotNullParameter(cvv, "cvv");
        this.cardDetails = cardDetails;
        this.cvv = cvv;
        this.postcode = str;
        this.saveCardForSubsequent = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.cardDetails, cVar.cardDetails) && Intrinsics.f(this.cvv, cVar.cvv) && Intrinsics.f(this.postcode, cVar.postcode) && Intrinsics.f(this.saveCardForSubsequent, cVar.saveCardForSubsequent);
    }

    public final int hashCode() {
        int iC = p.a.c(this.cardDetails.hashCode() * 31, 31, this.cvv);
        String str = this.postcode;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.saveCardForSubsequent;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
