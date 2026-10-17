package gb5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u000b\u0010\u0015R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0005\u0010\u001aR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u001e"}, d2 = {"Lgb5/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "applicationId", "f", "productType", "c", "i", "title", "d", "description", "e", "h", "status", "Lgb5/a$b;", "Lgb5/a$b;", "()Lgb5/a$b;", "attributes", "Lgb5/a$a;", "g", "Lgb5/a$a;", "()Lgb5/a$a;", "accessory", "sourceFacilityId", "productMetadataType", "feature_credit_tiles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("applicationId")
    private final String applicationId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("productType")
    @NotNull
    private final String productType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("attributes")
    private final b attributes;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("accessory")
    private final C0825a accessory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("sourceFacilityId")
    private final String sourceFacilityId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("productMetadataType")
    private final String productMetadataType;

    /* JADX INFO: renamed from: gb5.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lgb5/a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "title", "description", "feature_credit_tiles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C0825a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("description")
        private final String description;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C0825a)) {
                return false;
            }
            C0825a c0825a = (C0825a) obj2;
            return Intrinsics.f(this.title, c0825a.title) && Intrinsics.f(this.description, c0825a.description);
        }

        public final int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.description;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lgb5/a$b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "dashboardEnabled", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "creditLimit", "feature_credit_tiles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("dashboardEnabled")
        private final Boolean dashboardEnabled;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("creditLimit")
        private final jo3.a creditLimit;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getCreditLimit() {
            return this.creditLimit;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Boolean getDashboardEnabled() {
            return this.dashboardEnabled;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.dashboardEnabled, bVar.dashboardEnabled) && Intrinsics.f(this.creditLimit, bVar.creditLimit);
        }

        public final int hashCode() {
            Boolean bool = this.dashboardEnabled;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            jo3.a aVar = this.creditLimit;
            return iHashCode + (aVar != null ? aVar.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C0825a getAccessory() {
        return this.accessory;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getAttributes() {
        return this.attributes;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getProductMetadataType() {
        return this.productMetadataType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.applicationId, aVar.applicationId) && Intrinsics.f(this.productType, aVar.productType) && Intrinsics.f(this.title, aVar.title) && Intrinsics.f(this.description, aVar.description) && Intrinsics.f(this.status, aVar.status) && Intrinsics.f(this.attributes, aVar.attributes) && Intrinsics.f(this.accessory, aVar.accessory) && Intrinsics.f(this.sourceFacilityId, aVar.sourceFacilityId) && Intrinsics.f(this.productMetadataType, aVar.productMetadataType);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSourceFacilityId() {
        return this.sourceFacilityId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final int hashCode() {
        String str = this.applicationId;
        int iC = p.a.c(p.a.c(p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.productType), 31, this.title), 31, this.description), 31, this.status);
        b bVar = this.attributes;
        int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
        C0825a c0825a = this.accessory;
        int iHashCode2 = (iHashCode + (c0825a == null ? 0 : c0825a.hashCode())) * 31;
        String str2 = this.sourceFacilityId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productMetadataType;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
