package cv3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class v implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dx4.l f109272b;

    public v(String text, dx4.l lVar) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f109271a = text;
        this.f109272b = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f109271a, vVar.f109271a) && Intrinsics.f(this.f109272b, vVar.f109272b);
    }

    public final int hashCode() {
        int iHashCode = this.f109271a.hashCode() * 31;
        dx4.l lVar = this.f109272b;
        return iHashCode + (lVar == null ? 0 : lVar.hashCode());
    }
}
