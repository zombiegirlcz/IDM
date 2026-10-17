package evh;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Levh/w;", "Levh/z;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "principalRegisteredIdentityId", "flowType", "Levh/w$a;", "c", "Levh/w$a;", "()Levh/w$a;", "productConfigurationKey", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("principalRegisteredIdentityId")
    private final String principalRegisteredIdentityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("flowType")
    @NotNull
    private final String flowType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("productConfigurationKey")
    @NotNull
    private final a productConfigurationKey;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000e"}, d2 = {"Levh/w$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "country", "d", "product", "c", "division", "companyId", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("country")
        @NotNull
        private final String country;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("product")
        @NotNull
        private final String product;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("division")
        @NotNull
        private final String division;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("companyId")
        @NotNull
        private final String companyId;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCompanyId() {
            return this.companyId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getDivision() {
            return this.division;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getProduct() {
            return this.product;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.country, aVar.country) && Intrinsics.f(this.product, aVar.product) && Intrinsics.f(this.division, aVar.division) && Intrinsics.f(this.companyId, aVar.companyId);
        }

        public final int hashCode() {
            return this.companyId.hashCode() + p.a.c(p.a.c(this.country.hashCode() * 31, 31, this.product), 31, this.division);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFlowType() {
        return this.flowType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPrincipalRegisteredIdentityId() {
        return this.principalRegisteredIdentityId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getProductConfigurationKey() {
        return this.productConfigurationKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.principalRegisteredIdentityId, wVar.principalRegisteredIdentityId) && Intrinsics.f(this.flowType, wVar.flowType) && Intrinsics.f(this.productConfigurationKey, wVar.productConfigurationKey);
    }

    public final int hashCode() {
        String str = this.principalRegisteredIdentityId;
        return this.productConfigurationKey.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.flowType);
    }
}
