package ohj;

import com.revolut.retail.feature.esim.api.model.EsimProfile;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f225374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimProfile f225375b;

    public c(List esimProfiles, EsimProfile esimProfile) {
        Intrinsics.checkNotNullParameter(esimProfiles, "esimProfiles");
        this.f225374a = esimProfiles;
        this.f225375b = esimProfile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f225374a, cVar.f225374a) && Intrinsics.f(this.f225375b, cVar.f225375b);
    }

    public final int hashCode() {
        int iHashCode = this.f225374a.hashCode() * 31;
        EsimProfile esimProfile = this.f225375b;
        return iHashCode + (esimProfile == null ? 0 : esimProfile.hashCode());
    }
}
