package e93;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f123880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f123881b;

    public m(String light, String str) {
        Intrinsics.checkNotNullParameter(light, "light");
        this.f123880a = light;
        this.f123881b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f123880a, mVar.f123880a) && Intrinsics.f(this.f123881b, mVar.f123881b);
    }

    public final int hashCode() {
        int iHashCode = this.f123880a.hashCode() * 31;
        String str = this.f123881b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
