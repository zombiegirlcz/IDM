package bb2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f14145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f14146b;

    public j(Data registeredAliases, Data otherAliases) {
        Intrinsics.checkNotNullParameter(registeredAliases, "registeredAliases");
        Intrinsics.checkNotNullParameter(otherAliases, "otherAliases");
        this.f14145a = registeredAliases;
        this.f14146b = otherAliases;
    }

    public static j a(j jVar, Data registeredAliases, Data otherAliases, int i) {
        if ((i & 1) != 0) {
            registeredAliases = jVar.f14145a;
        }
        if ((i & 2) != 0) {
            otherAliases = jVar.f14146b;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(registeredAliases, "registeredAliases");
        Intrinsics.checkNotNullParameter(otherAliases, "otherAliases");
        return new j(registeredAliases, otherAliases);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f14145a, jVar.f14145a) && Intrinsics.f(this.f14146b, jVar.f14146b);
    }

    public final int hashCode() {
        return this.f14146b.hashCode() + (this.f14145a.hashCode() * 31);
    }
}
