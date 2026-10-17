package ncd;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f214177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f214178b;

    public j(i primary, i iVar) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        this.f214177a = primary;
        this.f214178b = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f214177a, jVar.f214177a) && Intrinsics.f(this.f214178b, jVar.f214178b);
    }

    public final int hashCode() {
        int iHashCode = this.f214177a.hashCode() * 31;
        i iVar = this.f214178b;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }
}
