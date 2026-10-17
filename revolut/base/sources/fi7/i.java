package fi7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f135321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f135322b;

    public i(List disclaimers, hel.b bVar) {
        Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
        this.f135321a = disclaimers;
        this.f135322b = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f135321a, iVar.f135321a) && this.f135322b == iVar.f135322b;
    }

    public final int hashCode() {
        int iHashCode = this.f135321a.hashCode() * 31;
        hel.b bVar = this.f135322b;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
