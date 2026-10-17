package fdl;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0006\f\r\t\u0015\u001b\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010)\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010-\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b\u001b\u0010,R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b.\u0010\u0004¨\u00060"}, d2 = {"Lfdl/m;", "Lfdl/g;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "n", "instrument", "b", "i", "ref", "c", "d", "stockExchangeCode", "Lfdl/m$c;", "Lfdl/m$c;", "h", "()Lfdl/m$c;", "issue", "Lfdl/m$d;", "e", "Lfdl/m$d;", "j", "()Lfdl/m$d;", "issuer", "Lfdl/m$b;", "f", "Lfdl/m$b;", "g", "()Lfdl/m$b;", "coupon", "Lfdl/m$e;", "Lfdl/m$e;", "k", "()Lfdl/m$e;", "primaryStats", "Lfdl/m$f;", "Lfdl/m$f;", "l", "()Lfdl/m$f;", "ratings", "Lfdl/m$a;", "Lfdl/m$a;", "()Lfdl/m$a;", "callability", "getDescription", "description", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("instrument")
    @NotNull
    private final String instrument;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("ref")
    @NotNull
    private final String ref;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("exchange")
    @NotNull
    private final String stockExchangeCode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("issue")
    @NotNull
    private final c issue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("issuer")
    @NotNull
    private final d issuer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("coupon")
    @NotNull
    private final b coupon;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("primaryStats")
    @NotNull
    private final e primaryStats;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("ratings")
    private final f ratings;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("callability")
    private final a callability;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\n\u0010\u0004¨\u0006\u0014"}, d2 = {"Lfdl/m$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "()Z", "callable", "b", "Ljava/lang/String;", "c", "nextCallDate", "Ljo3/a;", "Ljo3/a;", "d", "()Ljo3/a;", "nextCallPrice", "confirmedCallDate", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("callable")
        private final boolean callable;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("nextCallDate")
        private final String nextCallDate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("nextCallPrice")
        private final jo3.a nextCallPrice;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("confirmedCallDate")
        private final String confirmedCallDate;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getCallable() {
            return this.callable;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getConfirmedCallDate() {
            return this.confirmedCallDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getNextCallDate() {
            return this.nextCallDate;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final jo3.a getNextCallPrice() {
            return this.nextCallPrice;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return this.callable == aVar.callable && Intrinsics.f(this.nextCallDate, aVar.nextCallDate) && Intrinsics.f(this.nextCallPrice, aVar.nextCallPrice) && Intrinsics.f(this.confirmedCallDate, aVar.confirmedCallDate);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.callable) * 31;
            String str = this.nextCallDate;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            jo3.a aVar = this.nextCallPrice;
            int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str2 = this.confirmedCallDate;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0011"}, d2 = {"Lfdl/m$b;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "c", "()Ljava/math/BigDecimal;", "rate", "b", "Ljava/lang/String;", "d", "type", "nextDate", "frequency", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("rate")
        private final BigDecimal rate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        private final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("nextDate")
        private final String nextDate;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("frequency")
        private final String frequency;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFrequency() {
            return this.frequency;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getNextDate() {
            return this.nextDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final BigDecimal getRate() {
            return this.rate;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.rate, bVar.rate) && Intrinsics.f(this.type, bVar.type) && Intrinsics.f(this.nextDate, bVar.nextDate) && Intrinsics.f(this.frequency, bVar.frequency);
        }

        public final int hashCode() {
            BigDecimal bigDecimal = this.rate;
            int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
            String str = this.type;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.nextDate;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.frequency;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u0005\u0010\fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0013"}, d2 = {"Lfdl/m$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "issueDate", "Ljo3/a;", "Ljo3/a;", "c", "()Ljo3/a;", "issuePrice", "d", "maturityDate", "faceValue", "e", "outstandingVolume", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("issueDate")
        private final String issueDate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("issuePrice")
        private final jo3.a issuePrice;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("maturityDate")
        private final String maturityDate;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("faceValue")
        private final jo3.a faceValue;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("outstandingVolume")
        private final jo3.a outstandingVolume;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getFaceValue() {
            return this.faceValue;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getIssueDate() {
            return this.issueDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final jo3.a getIssuePrice() {
            return this.issuePrice;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getMaturityDate() {
            return this.maturityDate;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final jo3.a getOutstandingVolume() {
            return this.outstandingVolume;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.issueDate, cVar.issueDate) && Intrinsics.f(this.issuePrice, cVar.issuePrice) && Intrinsics.f(this.maturityDate, cVar.maturityDate) && Intrinsics.f(this.faceValue, cVar.faceValue) && Intrinsics.f(this.outstandingVolume, cVar.outstandingVolume);
        }

        public final int hashCode() {
            String str = this.issueDate;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            jo3.a aVar = this.issuePrice;
            int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str2 = this.maturityDate;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            jo3.a aVar2 = this.faceValue;
            int iHashCode4 = (iHashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            jo3.a aVar3 = this.outstandingVolume;
            return iHashCode4 + (aVar3 != null ? aVar3.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\f"}, d2 = {"Lfdl/m$d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "country", "b", "c", "industry", "fullName", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("country")
        private final String country;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("industry")
        private final String industry;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("fullName")
        private final String fullName;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFullName() {
            return this.fullName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getIndustry() {
            return this.industry;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.country, dVar.country) && Intrinsics.f(this.industry, dVar.industry) && Intrinsics.f(this.fullName, dVar.fullName);
        }

        public final int hashCode() {
            String str = this.country;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.industry;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.fullName;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\r\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"Lfdl/m$e;", "", "", "toString", "()Ljava/lang/String;", "Lko3/a;", "a", "Lko3/a;", "b", "()Lko3/a;", "cleanPrice", "d", "dirtyPrice", "c", "accruedInterest", "Ljava/math/BigDecimal;", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "currentYield", "e", "yieldToMaturity", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("cleanPrice")
        private final ko3.a cleanPrice;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("dirtyPrice")
        private final ko3.a dirtyPrice;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("accruedInterest")
        private final ko3.a accruedInterest;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("currentYield")
        private final BigDecimal currentYield;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("yieldToMaturity")
        private final BigDecimal yieldToMaturity;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ko3.a getAccruedInterest() {
            return this.accruedInterest;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ko3.a getCleanPrice() {
            return this.cleanPrice;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final BigDecimal getCurrentYield() {
            return this.currentYield;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ko3.a getDirtyPrice() {
            return this.dirtyPrice;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final BigDecimal getYieldToMaturity() {
            return this.yieldToMaturity;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return Intrinsics.f(this.cleanPrice, eVar.cleanPrice) && Intrinsics.f(this.dirtyPrice, eVar.dirtyPrice) && Intrinsics.f(this.accruedInterest, eVar.accruedInterest) && Intrinsics.f(this.currentYield, eVar.currentYield) && Intrinsics.f(this.yieldToMaturity, eVar.yieldToMaturity);
        }

        public final int hashCode() {
            ko3.a aVar = this.cleanPrice;
            int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            ko3.a aVar2 = this.dirtyPrice;
            int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            ko3.a aVar3 = this.accruedInterest;
            int iHashCode3 = (iHashCode2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
            BigDecimal bigDecimal = this.currentYield;
            int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.yieldToMaturity;
            return iHashCode4 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Lfdl/m$f;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "b", "()I", "version", "Lodl/a;", "Lodl/a;", "()Lodl/a;", "fitch", "", "c", "Z", "()Z", "isHighYield", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("version")
        private final int version;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("fitch")
        private final odl.a fitch;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("isHighYield")
        private final boolean isHighYield;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final odl.a getFitch() {
            return this.fitch;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getVersion() {
            return this.version;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsHighYield() {
            return this.isHighYield;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof f)) {
                return false;
            }
            f fVar = (f) obj2;
            return this.version == fVar.version && Intrinsics.f(this.fitch, fVar.fitch) && this.isHighYield == fVar.isHighYield;
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.version) * 31;
            odl.a aVar = this.fitch;
            return Boolean.hashCode(this.isHighYield) + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31);
        }
    }

    @Override // fdl.g
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getStockExchangeCode() {
        return this.stockExchangeCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.instrument, mVar.instrument) && Intrinsics.f(this.ref, mVar.ref) && Intrinsics.f(this.stockExchangeCode, mVar.stockExchangeCode) && Intrinsics.f(this.issue, mVar.issue) && Intrinsics.f(this.issuer, mVar.issuer) && Intrinsics.f(this.coupon, mVar.coupon) && Intrinsics.f(this.primaryStats, mVar.primaryStats) && Intrinsics.f(this.ratings, mVar.ratings) && Intrinsics.f(this.callability, mVar.callability) && Intrinsics.f(this.description, mVar.description);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final a getCallability() {
        return this.callability;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final b getCoupon() {
        return this.coupon;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final c getIssue() {
        return this.issue;
    }

    public final int hashCode() {
        int iHashCode = (this.primaryStats.hashCode() + ((this.coupon.hashCode() + ((this.issuer.hashCode() + ((this.issue.hashCode() + p.a.c(p.a.c(this.instrument.hashCode() * 31, 31, this.ref), 31, this.stockExchangeCode)) * 31)) * 31)) * 31)) * 31;
        f fVar = this.ratings;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        a aVar = this.callability;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.description;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @Override // fdl.g
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getRef() {
        return this.ref;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final d getIssuer() {
        return this.issuer;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final e getPrimaryStats() {
        return this.primaryStats;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final f getRatings() {
        return this.ratings;
    }

    @Override // fdl.g
    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getInstrument() {
        return this.instrument;
    }
}
