package hcl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0007\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\f\u0010\t¨\u0006\u000e"}, d2 = {"Lhcl/s;", "", "", "toString", "()Ljava/lang/String;", "", "Lhcl/s$a;", "a", "Ljava/util/List;", "()Ljava/util/List;", "investments", "Lhcl/s$b;", "b", "upcomingInvestments", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("investments")
    private final List<a> investments;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("upcomingInvestments")
    private final List<b> upcomingInvestments;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\u0013"}, d2 = {"Lhcl/s$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "name", "Ljava/math/BigDecimal;", "b", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "allocation", "c", "e", "url", "description", "currency", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("allocation")
        @NotNull
        private final BigDecimal allocation;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("url")
        private final String url;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("description")
        private final String description;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("currency")
        private final String currency;

        public a(String name, String str, String str2, String str3, BigDecimal allocation) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(allocation, "allocation");
            this.name = name;
            this.allocation = allocation;
            this.url = str;
            this.description = str2;
            this.currency = str3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BigDecimal getAllocation() {
            return this.allocation;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.name, aVar.name) && Intrinsics.f(this.allocation, aVar.allocation) && Intrinsics.f(this.url, aVar.url) && Intrinsics.f(this.description, aVar.description) && Intrinsics.f(this.currency, aVar.currency);
        }

        public final int hashCode() {
            int iD = t61.a.d(this.allocation, this.name.hashCode() * 31, 31);
            String str = this.url;
            int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.description;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.currency;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u0017"}, d2 = {"Lhcl/s$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "name", "b", "description", "Ljava/time/LocalDate;", "c", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "fundJoiningDate", "f", "region", "e", "g", "sector", "foundedYear", "ref", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("description")
        private final String description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("fundJoiningDate")
        private final LocalDate fundJoiningDate;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("region")
        private final String region;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("sector")
        private final String sector;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("foundedYear")
        private final String foundedYear;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("ref")
        private final String ref;

        public b(String name, String str, String str2, String str3, String str4, String str5, LocalDate localDate) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.description = str;
            this.fundJoiningDate = localDate;
            this.region = str2;
            this.sector = str3;
            this.foundedYear = str4;
            this.ref = str5;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFoundedYear() {
            return this.foundedYear;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final LocalDate getFundJoiningDate() {
            return this.fundJoiningDate;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getRef() {
            return this.ref;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.name, bVar.name) && Intrinsics.f(this.description, bVar.description) && Intrinsics.f(this.fundJoiningDate, bVar.fundJoiningDate) && Intrinsics.f(this.region, bVar.region) && Intrinsics.f(this.sector, bVar.sector) && Intrinsics.f(this.foundedYear, bVar.foundedYear) && Intrinsics.f(this.ref, bVar.ref);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getRegion() {
            return this.region;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getSector() {
            return this.sector;
        }

        public final int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.description;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            LocalDate localDate = this.fundJoiningDate;
            int iHashCode3 = (iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
            String str2 = this.region;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.sector;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.foundedYear;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.ref;
            return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
        }
    }

    public s(ArrayList arrayList, ArrayList arrayList2) {
        this.investments = arrayList;
        this.upcomingInvestments = arrayList2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getInvestments() {
        return this.investments;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getUpcomingInvestments() {
        return this.upcomingInvestments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.investments, sVar.investments) && Intrinsics.f(this.upcomingInvestments, sVar.upcomingInvestments);
    }

    public final int hashCode() {
        List<a> list = this.investments;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<b> list2 = this.upcomingInvestments;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }
}
