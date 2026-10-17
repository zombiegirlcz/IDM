package ib5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\b\u0010\u001aR\u001c\u0010 \u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004¨\u0006#"}, d2 = {"Lib5/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "applicationId", "b", "e", "productType", "c", "h", "title", "d", "description", "g", "status", "", "f", "Ljava/lang/Boolean;", "j", "()Ljava/lang/Boolean;", "isDashboardAvailable", "Ljo3/b;", "Ljo3/b;", "()Ljo3/b;", "creditLimit", "Lib5/a$a;", "Lib5/a$a;", "i", "()Lib5/a$a;", "value", "sourceFacilityId", "productMetadataType", "feature_credit_tiles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("applicationId")
    private final String applicationId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("product")
    @NotNull
    private final String productType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @b("state")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @b("isDashboardAvailable")
    private final Boolean isDashboardAvailable;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @b("creditLimit")
    private final jo3.b creditLimit;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @b("value")
    private final C0916a value;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @b("sourceFacilityId")
    private final String sourceFacilityId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @b("productMetadataType")
    private final String productMetadataType;

    /* JADX INFO: renamed from: ib5.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lib5/a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "primary", "b", "secondary", "feature_credit_tiles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C0916a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @b("primary")
        @NotNull
        private final String primary;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @b("secondary")
        private final String secondary;

        public C0916a(String primary, String str) {
            Intrinsics.checkNotNullParameter(primary, "primary");
            this.primary = primary;
            this.secondary = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPrimary() {
            return this.primary;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSecondary() {
            return this.secondary;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C0916a)) {
                return false;
            }
            C0916a c0916a = (C0916a) obj2;
            return Intrinsics.f(this.primary, c0916a.primary) && Intrinsics.f(this.secondary, c0916a.secondary);
        }

        public final int hashCode() {
            int iHashCode = this.primary.hashCode() * 31;
            String str = this.secondary;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }
    }

    public a(String str, String productType, String title, String description, String status, Boolean bool, jo3.b bVar, C0916a c0916a, String str2, String str3) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(status, "status");
        this.applicationId = str;
        this.productType = productType;
        this.title = title;
        this.description = description;
        this.status = status;
        this.isDashboardAvailable = bool;
        this.creditLimit = bVar;
        this.value = c0916a;
        this.sourceFacilityId = str2;
        this.productMetadataType = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.b getCreditLimit() {
        return this.creditLimit;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getProductMetadataType() {
        return this.productMetadataType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.applicationId, aVar.applicationId) && Intrinsics.f(this.productType, aVar.productType) && Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.description, aVar.description) && Intrinsics.f(this.status, aVar.status) && Intrinsics.f(this.isDashboardAvailable, aVar.isDashboardAvailable) && Intrinsics.f(this.creditLimit, aVar.creditLimit) && Intrinsics.f(this.value, aVar.value) && Intrinsics.f(this.sourceFacilityId, aVar.sourceFacilityId) && Intrinsics.f(this.productMetadataType, aVar.productMetadataType);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSourceFacilityId() {
        return this.sourceFacilityId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.applicationId;
        int iC = p.a.c(p.a.c(p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.productType), 31, this.title), 31, this.description), 31, this.status);
        Boolean bool = this.isDashboardAvailable;
        int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        jo3.b bVar = this.creditLimit;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        C0916a c0916a = this.value;
        int iHashCode3 = (iHashCode2 + (c0916a == null ? 0 : c0916a.hashCode())) * 31;
        String str2 = this.sourceFacilityId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productMetadataType;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C0916a getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Boolean getIsDashboardAvailable() {
        return this.isDashboardAvailable;
    }
}
