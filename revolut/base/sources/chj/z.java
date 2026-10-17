package chj;

import com.revolut.retail.feature.esim.api.model.EsimProfile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class z implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimProfile f24318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24319b;

    public z(EsimProfile esimProfile, boolean z) {
        this.f24318a = esimProfile;
        this.f24319b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f24318a, zVar.f24318a) && this.f24319b == zVar.f24319b;
    }

    public final int hashCode() {
        EsimProfile esimProfile = this.f24318a;
        return Boolean.hashCode(this.f24319b) + ((esimProfile == null ? 0 : esimProfile.hashCode()) * 31);
    }
}
