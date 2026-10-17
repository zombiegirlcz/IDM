package ggh;

import kel.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f143684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f143685b;

    public c(n holding, b displayType) {
        Intrinsics.checkNotNullParameter(holding, "holding");
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        this.f143684a = holding;
        this.f143685b = displayType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f143684a, cVar.f143684a) && this.f143685b == cVar.f143685b;
    }

    public final int hashCode() {
        return this.f143685b.hashCode() + (this.f143684a.hashCode() * 31);
    }
}
