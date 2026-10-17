package khj;

import com.revolut.feature.devicemanagement.api.model.UserDevice;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserDevice f184150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f184151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f184152c;

    public g(UserDevice userDevice, boolean z) {
        Intrinsics.checkNotNullParameter(userDevice, "userDevice");
        this.f184150a = userDevice;
        this.f184151b = z;
        this.f184152c = userDevice.f71914a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f184150a, gVar.f184150a) && this.f184151b == gVar.f184151b;
    }

    @Override // khj.i
    public final String getId() {
        return this.f184152c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f184151b) + (this.f184150a.hashCode() * 31);
    }
}
