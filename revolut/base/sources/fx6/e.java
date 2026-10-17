package fx6;

import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.FreelancerInboundVolume;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f138748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FreelancerInboundVolume f138749b;

    public e(Data inboundVolumesData, FreelancerInboundVolume freelancerInboundVolume) {
        Intrinsics.checkNotNullParameter(inboundVolumesData, "inboundVolumesData");
        this.f138748a = inboundVolumesData;
        this.f138749b = freelancerInboundVolume;
    }

    public static e a(e eVar, Data inboundVolumesData, FreelancerInboundVolume freelancerInboundVolume, int i) {
        if ((i & 1) != 0) {
            inboundVolumesData = eVar.f138748a;
        }
        if ((i & 2) != 0) {
            freelancerInboundVolume = eVar.f138749b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(inboundVolumesData, "inboundVolumesData");
        return new e(inboundVolumesData, freelancerInboundVolume);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f138748a, eVar.f138748a) && Intrinsics.f(this.f138749b, eVar.f138749b);
    }

    public final int hashCode() {
        int iHashCode = this.f138748a.hashCode() * 31;
        FreelancerInboundVolume freelancerInboundVolume = this.f138749b;
        return iHashCode + (freelancerInboundVolume == null ? 0 : freelancerInboundVolume.hashCode());
    }
}
