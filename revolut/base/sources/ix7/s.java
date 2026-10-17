package ix7;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0005\u0014\u000b\r\b\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0015"}, d2 = {"Lix7/s;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "petId", "b", "renewalDate", "", "c", "Z", "d", "()Z", "isOptedIn", "Lix7/s$e;", "Lix7/s$e;", "()Lix7/s$e;", "renewalQuote", "e", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("petId")
    @NotNull
    private final String petId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("renewalDate")
    @NotNull
    private final String renewalDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("isOptedIn")
    private final boolean isOptedIn;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("renewalQuote")
    @NotNull
    private final e renewalQuote;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lix7/s$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "sterilized", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("sterilized")
        private final Boolean sterilized;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Boolean getSterilized() {
            return this.sterilized;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.sterilized, ((a) obj2).sterilized);
        }

        public final int hashCode() {
            Boolean bool = this.sterilized;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"Lix7/s$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "name", "d", "value", "c", "newValue", "Lix7/f;", "Lix7/f;", "()Lix7/f;", "details", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        @NotNull
        private final String value;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("newValue")
        private final String newValue;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("details")
        private final f details;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final f getDetails() {
            return this.details;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getNewValue() {
            return this.newValue;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.name, bVar.name) && Intrinsics.f(this.value, bVar.value) && Intrinsics.f(this.newValue, bVar.newValue) && Intrinsics.f(this.details, bVar.details);
        }

        public final int hashCode() {
            int iC = p.a.c(this.name.hashCode() * 31, 31, this.value);
            String str = this.newValue;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.details;
            return iHashCode + (fVar != null ? fVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lix7/s$c;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "b", "()Ljo3/a;", "renewalQuoteMonthlyPayment", "currentPolicyMonthlyPayment", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("renewalQuoteMonthlyPayment")
        @NotNull
        private final jo3.a renewalQuoteMonthlyPayment;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("currentPolicyMonthlyPayment")
        @NotNull
        private final jo3.a currentPolicyMonthlyPayment;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getCurrentPolicyMonthlyPayment() {
            return this.currentPolicyMonthlyPayment;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final jo3.a getRenewalQuoteMonthlyPayment() {
            return this.renewalQuoteMonthlyPayment;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.renewalQuoteMonthlyPayment, cVar.renewalQuoteMonthlyPayment) && Intrinsics.f(this.currentPolicyMonthlyPayment, cVar.currentPolicyMonthlyPayment);
        }

        public final int hashCode() {
            return this.currentPolicyMonthlyPayment.hashCode() + (this.renewalQuoteMonthlyPayment.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lix7/s$d;", "", "", "toString", "()Ljava/lang/String;", "Lix7/b0;", "a", "Lix7/b0;", "()Lix7/b0;", "promotionalBanner", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("promotionalBanner")
        @NotNull
        private final b0 promotionalBanner;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getPromotionalBanner() {
            return this.promotionalBanner;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof d) && Intrinsics.f(this.promotionalBanner, ((d) obj2).promotionalBanner);
        }

        public final int hashCode() {
            return this.promotionalBanner.hashCode();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\t\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u0005\u0010\u001d¨\u0006\u001f"}, d2 = {"Lix7/s$e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "quoteRequestId", "b", "e", "quoteOptionId", "Lix7/s$c;", "c", "Lix7/s$c;", "()Lix7/s$c;", "priceChange", "Lix7/s$d;", "d", "Lix7/s$d;", "()Lix7/s$d;", "promotion", "", "Lix7/s$b;", "Ljava/util/List;", "()Ljava/util/List;", "planDetails", "Lix7/s$a;", "Lix7/s$a;", "()Lix7/s$a;", "petUpdates", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("quoteRequestId")
        @NotNull
        private final String quoteRequestId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("quoteOptionId")
        @NotNull
        private final String quoteOptionId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("priceChange")
        @NotNull
        private final c priceChange;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("promotion")
        private final d promotion;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("planDetails")
        @NotNull
        private final List<b> planDetails;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("petUpdates")
        @NotNull
        private final a petUpdates;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getPetUpdates() {
            return this.petUpdates;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final List getPlanDetails() {
            return this.planDetails;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final c getPriceChange() {
            return this.priceChange;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final d getPromotion() {
            return this.promotion;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getQuoteOptionId() {
            return this.quoteOptionId;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return Intrinsics.f(this.quoteRequestId, eVar.quoteRequestId) && Intrinsics.f(this.quoteOptionId, eVar.quoteOptionId) && Intrinsics.f(this.priceChange, eVar.priceChange) && Intrinsics.f(this.promotion, eVar.promotion) && Intrinsics.f(this.planDetails, eVar.planDetails) && Intrinsics.f(this.petUpdates, eVar.petUpdates);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getQuoteRequestId() {
            return this.quoteRequestId;
        }

        public final int hashCode() {
            int iHashCode = (this.priceChange.hashCode() + p.a.c(this.quoteRequestId.hashCode() * 31, 31, this.quoteOptionId)) * 31;
            d dVar = this.promotion;
            return this.petUpdates.hashCode() + p.a.d((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.planDetails);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPetId() {
        return this.petId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getRenewalDate() {
        return this.renewalDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e getRenewalQuote() {
        return this.renewalQuote;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsOptedIn() {
        return this.isOptedIn;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.petId, sVar.petId) && Intrinsics.f(this.renewalDate, sVar.renewalDate) && this.isOptedIn == sVar.isOptedIn && Intrinsics.f(this.renewalQuote, sVar.renewalQuote);
    }

    public final int hashCode() {
        return this.renewalQuote.hashCode() + j6.a.c(p.a.c(this.petId.hashCode() * 31, 31, this.renewalDate), 31, this.isOptedIn);
    }
}
