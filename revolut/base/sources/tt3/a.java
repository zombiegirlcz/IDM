package tt3;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import ot3.y;
import ot3.z;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0005\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b#\u0010\u0004R\u001c\u0010'\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\r\u001a\u0004\b&\u0010\u000eR\u001a\u0010*\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\u0004R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\u0004R\u001a\u0010.\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0006\u001a\u0004\b%\u0010\u0004R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b(\u0010\u0004R\u001c\u00101\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\r\u001a\u0004\b!\u0010\u000eR\u001c\u00102\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001c\u00103\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b0\u0010\u0004R\u001c\u00105\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\r\u001a\u0004\b4\u0010\u000eR\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b+\u0010\u0004¨\u00067"}, d2 = {"Ltt3/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "applicationId", "o", "state", "", "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "active", "", "d", "I", "e", "()I", "expiryInMinutes", "Lot3/z;", "Lot3/z;", "f", "()Lot3/z;", "metadata", "", "Lot3/y;", "Ljava/util/List;", "h", "()Ljava/util/List;", "pluginMetadata", "g", "creditId", "p", "workflowId", "i", "q", "workflowStepCompleted", "j", "m", "productType", "k", "l", "productSubtype", "pluginName", "pluginState", "n", "pluginIsMandatory", "cancellable", "sourceFacilityId", "r", "isDashboardAvailable", "productMetadataType", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("applicationId")
    @NotNull
    private final String applicationId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("state")
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("active")
    private final Boolean active;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("expiryInMinutes")
    private final int expiryInMinutes;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @b("metadata")
    private final z metadata;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @b("pluginMetadata")
    private final List<y> pluginMetadata;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @b("creditId")
    private final String creditId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @b("workflowId")
    private final String workflowId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @b("workflowStepCompleted")
    private final Boolean workflowStepCompleted;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @b("productType")
    @NotNull
    private final String productType;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @b("subtype")
    private final String productSubtype;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @b("pluginName")
    @NotNull
    private final String pluginName;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @b("pluginState")
    private final String pluginState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @b("pluginIsMandatory")
    private final Boolean pluginIsMandatory;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @b("cancellable")
    private final Boolean cancellable;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @b("sourceFacilityId")
    private final String sourceFacilityId;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @b("dashboardEnabled")
    private final Boolean isDashboardAvailable;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @b("productMetadataType")
    private final String productMetadataType;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getActive() {
        return this.active;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getCancellable() {
        return this.cancellable;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCreditId() {
        return this.creditId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getExpiryInMinutes() {
        return this.expiryInMinutes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.applicationId, aVar.applicationId) && Intrinsics.f(this.state, aVar.state) && Intrinsics.f(this.active, aVar.active) && this.expiryInMinutes == aVar.expiryInMinutes && Intrinsics.f(this.metadata, aVar.metadata) && Intrinsics.f(this.pluginMetadata, aVar.pluginMetadata) && Intrinsics.f(this.creditId, aVar.creditId) && Intrinsics.f(this.workflowId, aVar.workflowId) && Intrinsics.f(this.workflowStepCompleted, aVar.workflowStepCompleted) && Intrinsics.f(this.productType, aVar.productType) && Intrinsics.f(this.productSubtype, aVar.productSubtype) && Intrinsics.f(this.pluginName, aVar.pluginName) && Intrinsics.f(this.pluginState, aVar.pluginState) && Intrinsics.f(this.pluginIsMandatory, aVar.pluginIsMandatory) && Intrinsics.f(this.cancellable, aVar.cancellable) && Intrinsics.f(this.sourceFacilityId, aVar.sourceFacilityId) && Intrinsics.f(this.isDashboardAvailable, aVar.isDashboardAvailable) && Intrinsics.f(this.productMetadataType, aVar.productMetadataType);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final z getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getPluginIsMandatory() {
        return this.pluginIsMandatory;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final List getPluginMetadata() {
        return this.pluginMetadata;
    }

    public final int hashCode() {
        int iHashCode = this.applicationId.hashCode() * 31;
        String str = this.state;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.active;
        int iB = j6.a.b(this.expiryInMinutes, (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31, 31);
        z zVar = this.metadata;
        int iHashCode3 = (iB + (zVar == null ? 0 : zVar.hashCode())) * 31;
        List<y> list = this.pluginMetadata;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.creditId;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.workflowId;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.workflowStepCompleted;
        int iC = p.a.c((iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.productType);
        String str4 = this.productSubtype;
        int iC2 = p.a.c((iC + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.pluginName);
        String str5 = this.pluginState;
        int iHashCode7 = (iC2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool3 = this.pluginIsMandatory;
        int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.cancellable;
        int iHashCode9 = (iHashCode8 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str6 = this.sourceFacilityId;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool5 = this.isDashboardAvailable;
        int iHashCode11 = (iHashCode10 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str7 = this.productMetadataType;
        return iHashCode11 + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getPluginName() {
        return this.pluginName;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getPluginState() {
        return this.pluginState;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getProductMetadataType() {
        return this.productMetadataType;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getProductSubtype() {
        return this.productSubtype;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getSourceFacilityId() {
        return this.sourceFacilityId;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getWorkflowId() {
        return this.workflowId;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Boolean getWorkflowStepCompleted() {
        return this.workflowStepCompleted;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Boolean getIsDashboardAvailable() {
        return this.isDashboardAvailable;
    }
}
