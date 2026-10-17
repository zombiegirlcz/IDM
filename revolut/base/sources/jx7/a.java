package jx7;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: jx7.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010&\u001a\u00020!8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Ljx7/a$a;", "Ljx7/a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getRequestId", "requestId", "b", "getName", "name", "c", "getPetType", "petType", "d", "getGender", "gender", "e", "getBreedType", "breedType", "f", "getBreed", "breed", "g", "getDateOfBirth", "dateOfBirth", "", "h", "Z", "getSterilized", "()Z", "sterilized", "Ljo3/a;", "i", "Ljo3/a;", "getPurchasePrice", "()Ljo3/a;", "purchasePrice", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1021a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("requestId")
        @NotNull
        private final String requestId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("petType")
        @NotNull
        private final String petType;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("gender")
        @NotNull
        private final String gender;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("breedType")
        @NotNull
        private final String breedType;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("breed")
        @NotNull
        private final String breed;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("dateOfBirth")
        @NotNull
        private final String dateOfBirth;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("sterilized")
        private final boolean sterilized;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("purchasePrice")
        @NotNull
        private final jo3.a purchasePrice;

        public C1021a(String requestId, String name, String petType, String gender, String breedType, String breed, String dateOfBirth, boolean z, jo3.a purchasePrice) {
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(petType, "petType");
            Intrinsics.checkNotNullParameter(gender, "gender");
            Intrinsics.checkNotNullParameter(breedType, "breedType");
            Intrinsics.checkNotNullParameter(breed, "breed");
            Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
            Intrinsics.checkNotNullParameter(purchasePrice, "purchasePrice");
            this.requestId = requestId;
            this.name = name;
            this.petType = petType;
            this.gender = gender;
            this.breedType = breedType;
            this.breed = breed;
            this.dateOfBirth = dateOfBirth;
            this.sterilized = z;
            this.purchasePrice = purchasePrice;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1021a)) {
                return false;
            }
            C1021a c1021a = (C1021a) obj2;
            return Intrinsics.f(this.requestId, c1021a.requestId) && Intrinsics.f(this.name, c1021a.name) && Intrinsics.f(this.petType, c1021a.petType) && Intrinsics.f(this.gender, c1021a.gender) && Intrinsics.f(this.breedType, c1021a.breedType) && Intrinsics.f(this.breed, c1021a.breed) && Intrinsics.f(this.dateOfBirth, c1021a.dateOfBirth) && this.sterilized == c1021a.sterilized && Intrinsics.f(this.purchasePrice, c1021a.purchasePrice);
        }

        public final int hashCode() {
            return this.purchasePrice.hashCode() + j6.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.requestId.hashCode() * 31, 31, this.name), 31, this.petType), 31, this.gender), 31, this.breedType), 31, this.breed), 31, this.dateOfBirth), 31, this.sterilized);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010#\u001a\u00020\u001e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\u0004R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\u0004¨\u0006*"}, d2 = {"Ljx7/a$b;", "Ljx7/a;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getName", "name", "b", "getPetType", "petType", "c", "getGender", "gender", "d", "getBreedType", "breedType", "e", "getBreed", "breed", "f", "getDateOfBirth", "dateOfBirth", "", "g", "Z", "getSterilized", "()Z", "sterilized", "Ljo3/a;", "h", "Ljo3/a;", "getPurchasePrice", "()Ljo3/a;", "purchasePrice", "i", "getQuoteId", "quoteId", "j", "getQuotesRequestId", "quotesRequestId", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("petType")
        @NotNull
        private final String petType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("gender")
        @NotNull
        private final String gender;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("breedType")
        @NotNull
        private final String breedType;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("breed")
        @NotNull
        private final String breed;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("dateOfBirth")
        @NotNull
        private final String dateOfBirth;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("sterilized")
        private final boolean sterilized;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("purchasePrice")
        @NotNull
        private final jo3.a purchasePrice;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("quoteId")
        private final String quoteId;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("quotesRequestId")
        private final String quotesRequestId;

        public b(String name, String petType, String gender, String breedType, String breed, String dateOfBirth, boolean z, jo3.a purchasePrice, String str, String str2) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(petType, "petType");
            Intrinsics.checkNotNullParameter(gender, "gender");
            Intrinsics.checkNotNullParameter(breedType, "breedType");
            Intrinsics.checkNotNullParameter(breed, "breed");
            Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
            Intrinsics.checkNotNullParameter(purchasePrice, "purchasePrice");
            this.name = name;
            this.petType = petType;
            this.gender = gender;
            this.breedType = breedType;
            this.breed = breed;
            this.dateOfBirth = dateOfBirth;
            this.sterilized = z;
            this.purchasePrice = purchasePrice;
            this.quoteId = str;
            this.quotesRequestId = str2;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.name, bVar.name) && Intrinsics.f(this.petType, bVar.petType) && Intrinsics.f(this.gender, bVar.gender) && Intrinsics.f(this.breedType, bVar.breedType) && Intrinsics.f(this.breed, bVar.breed) && Intrinsics.f(this.dateOfBirth, bVar.dateOfBirth) && this.sterilized == bVar.sterilized && Intrinsics.f(this.purchasePrice, bVar.purchasePrice) && Intrinsics.f(this.quoteId, bVar.quoteId) && Intrinsics.f(this.quotesRequestId, bVar.quotesRequestId);
        }

        public final int hashCode() {
            int iJ = v7.j(this.purchasePrice, j6.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.name.hashCode() * 31, 31, this.petType), 31, this.gender), 31, this.breedType), 31, this.breed), 31, this.dateOfBirth), 31, this.sterilized), 31);
            String str = this.quoteId;
            int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.quotesRequestId;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }
    }

    private a() {
    }
}
