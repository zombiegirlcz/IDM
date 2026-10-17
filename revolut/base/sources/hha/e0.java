package hha;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f152300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f152301c;

    public e0(dj0.d dVar, Integer num, String website) {
        Intrinsics.checkNotNullParameter(website, "website");
        this.f152299a = website;
        this.f152300b = num;
        this.f152301c = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f152299a, e0Var.f152299a) && Intrinsics.f(this.f152300b, e0Var.f152300b) && Intrinsics.f(this.f152301c, e0Var.f152301c);
    }

    public final int hashCode() {
        int iHashCode = this.f152299a.hashCode() * 31;
        Integer num = this.f152300b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        dj0.d dVar = this.f152301c;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }
}
