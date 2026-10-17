package ze6;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0007\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\f\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0016R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010)\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010-\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010+\u001a\u0004\b\u0018\u0010,¨\u0006."}, d2 = {"Lze6/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "f", "name", "Lro3/a;", "c", "Lro3/a;", "e", "()Lro3/a;", "logo", "d", "institutionType", "countryCode", "", "Z", "()Z", "infoProvider", "g", "i", "paymentInitiation", "Lze6/a$b;", "h", "Lze6/a$b;", "()Lze6/a$b;", "paymentInfo", "", "Ljava/util/List;", "j", "()Ljava/util/List;", "tags", "Lze6/c;", "Lze6/c;", "k", "()Lze6/c;", "userRegionCountryDepartmentDto", "Lze6/a$a;", "Lze6/a$a;", "()Lze6/a$a;", "outage", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("logo")
    @NotNull
    private final ro3.a logo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("institutionType")
    @NotNull
    private final String institutionType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("countryCode")
    private final String countryCode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("infoProvider")
    private final boolean infoProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentInitiation")
    private final boolean paymentInitiation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentInfo")
    private final b paymentInfo;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("tags")
    @NotNull
    private final List<String> tags;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("userCountryInstitution")
    private final c userRegionCountryDepartmentDto;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("outage")
    private final C1781a outage;

    /* JADX INFO: renamed from: ze6.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"Lze6/a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "title", "b", "message", "summary", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1781a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("message")
        @NotNull
        private final String message;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("summary")
        @NotNull
        private final String summary;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSummary() {
            return this.summary;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1781a)) {
                return false;
            }
            C1781a c1781a = (C1781a) obj2;
            return Intrinsics.f(this.title, c1781a.title) && Intrinsics.f(this.message, c1781a.message) && Intrinsics.f(this.summary, c1781a.summary);
        }

        public final int hashCode() {
            return this.summary.hashCode() + p.a.c(this.title.hashCode() * 31, 31, this.message);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0013"}, d2 = {"Lze6/a$b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "mandateInitiation", "b", "Ljava/lang/String;", "e", "topUpSystem", "ibanRequired", "d", "hasActiveMandate", "supportedCurrency", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("mandateInitiation")
        private final Boolean mandateInitiation;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("topUpSystem")
        private final String topUpSystem;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("ibanRequired")
        private final Boolean ibanRequired;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("hasActiveMandate")
        private final Boolean hasActiveMandate;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("supportedCurrency")
        private final String supportedCurrency;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Boolean getHasActiveMandate() {
            return this.hasActiveMandate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Boolean getIbanRequired() {
            return this.ibanRequired;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Boolean getMandateInitiation() {
            return this.mandateInitiation;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSupportedCurrency() {
            return this.supportedCurrency;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTopUpSystem() {
            return this.topUpSystem;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.mandateInitiation, bVar.mandateInitiation) && Intrinsics.f(this.topUpSystem, bVar.topUpSystem) && Intrinsics.f(this.ibanRequired, bVar.ibanRequired) && Intrinsics.f(this.hasActiveMandate, bVar.hasActiveMandate) && Intrinsics.f(this.supportedCurrency, bVar.supportedCurrency);
        }

        public final int hashCode() {
            Boolean bool = this.mandateInitiation;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.topUpSystem;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool2 = this.ibanRequired;
            int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.hasActiveMandate;
            int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str2 = this.supportedCurrency;
            return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getInfoProvider() {
        return this.infoProvider;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getInstitutionType() {
        return this.institutionType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ro3.a getLogo() {
        return this.logo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.name, aVar.name) && Intrinsics.f(this.logo, aVar.logo) && Intrinsics.f(this.institutionType, aVar.institutionType) && Intrinsics.f(this.countryCode, aVar.countryCode) && this.infoProvider == aVar.infoProvider && this.paymentInitiation == aVar.paymentInitiation && Intrinsics.f(this.paymentInfo, aVar.paymentInfo) && Intrinsics.f(this.tags, aVar.tags) && Intrinsics.f(this.userRegionCountryDepartmentDto, aVar.userRegionCountryDepartmentDto) && Intrinsics.f(this.outage, aVar.outage);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C1781a getOutage() {
        return this.outage;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final b getPaymentInfo() {
        return this.paymentInfo;
    }

    public final int hashCode() {
        int iC = p.a.c((this.logo.hashCode() + p.a.c(this.id.hashCode() * 31, 31, this.name)) * 31, 31, this.institutionType);
        String str = this.countryCode;
        int iC2 = j6.a.c(j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.infoProvider), 31, this.paymentInitiation);
        b bVar = this.paymentInfo;
        int iD = p.a.d((iC2 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.tags);
        c cVar = this.userRegionCountryDepartmentDto;
        int iHashCode = (iD + (cVar == null ? 0 : cVar.hashCode())) * 31;
        C1781a c1781a = this.outage;
        return iHashCode + (c1781a != null ? c1781a.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getPaymentInitiation() {
        return this.paymentInitiation;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final List getTags() {
        return this.tags;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final c getUserRegionCountryDepartmentDto() {
        return this.userRegionCountryDepartmentDto;
    }
}
