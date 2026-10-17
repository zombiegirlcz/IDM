package pd5;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f235110b;

    public i(String type, Map map) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f235109a = type;
        this.f235110b = map;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f235109a, iVar.f235109a) && Intrinsics.f(this.f235110b, iVar.f235110b);
    }

    public final int hashCode() {
        int iHashCode = this.f235109a.hashCode() * 31;
        Map map = this.f235110b;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }
}
