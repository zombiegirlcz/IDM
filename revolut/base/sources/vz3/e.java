package vz3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u0016"}, d2 = {"Lvz3/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "applicationId", "", "I", "c", "()I", "expiryInMinutes", "", "Z", "()Z", "active", "d", "e", "productType", "pluginName", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("applicationId")
    @NotNull
    private final String applicationId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("expiryInMinutes")
    private final int expiryInMinutes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("active")
    private final boolean active;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("productType")
    @NotNull
    private final String productType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("pluginName")
    @NotNull
    private final String pluginName;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getActive() {
        return this.active;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getExpiryInMinutes() {
        return this.expiryInMinutes;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPluginName() {
        return this.pluginName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.applicationId, eVar.applicationId) && this.expiryInMinutes == eVar.expiryInMinutes && this.active == eVar.active && Intrinsics.f(this.productType, eVar.productType) && Intrinsics.f(this.pluginName, eVar.pluginName);
    }

    public final int hashCode() {
        return this.pluginName.hashCode() + p.a.c(j6.a.c(j6.a.b(this.expiryInMinutes, this.applicationId.hashCode() * 31, 31), 31, this.active), 31, this.productType);
    }
}
