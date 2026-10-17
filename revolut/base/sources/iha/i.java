package iha;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f161328b;

    public i(String type, j jVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f161327a = type;
        this.f161328b = jVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f161327a, iVar.f161327a) && Intrinsics.f(this.f161328b, iVar.f161328b);
    }

    public final int hashCode() {
        int iHashCode = this.f161327a.hashCode() * 31;
        j jVar = this.f161328b;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }
}
