package jwf;

import com.revolut.data.model.Data;
import com.revolut.feature.transport.impl.common.TransportHubLocation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransportHubLocation f178977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f178978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f178979c;

    public e(TransportHubLocation hubLocation, boolean z, Data data) {
        Intrinsics.checkNotNullParameter(hubLocation, "hubLocation");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f178977a = hubLocation;
        this.f178978b = z;
        this.f178979c = data;
    }

    public static e a(e eVar, TransportHubLocation hubLocation, boolean z, Data data, int i) {
        if ((i & 1) != 0) {
            hubLocation = eVar.f178977a;
        }
        if ((i & 2) != 0) {
            z = eVar.f178978b;
        }
        if ((i & 4) != 0) {
            data = eVar.f178979c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(hubLocation, "hubLocation");
        Intrinsics.checkNotNullParameter(data, "data");
        return new e(hubLocation, z, data);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f178977a, eVar.f178977a) && this.f178978b == eVar.f178978b && Intrinsics.f(this.f178979c, eVar.f178979c);
    }

    public final int hashCode() {
        return this.f178979c.hashCode() + j6.a.c(this.f178977a.hashCode() * 31, 31, this.f178978b);
    }
}
