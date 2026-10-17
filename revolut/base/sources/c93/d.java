package c93;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements Serializable {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f22271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f22272b;

    static {
        dj0.c cVar = dj0.d.Companion;
        cVar.getClass();
        dj0.d dVar = dj0.d.d;
        cVar.getClass();
        new d(dVar, dVar);
    }

    public d(dj0.d price, dj0.d originalPrice) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
        this.f22271a = price;
        this.f22272b = originalPrice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f22271a, dVar.f22271a) && Intrinsics.f(this.f22272b, dVar.f22272b);
    }

    public final int hashCode() {
        return this.f22272b.hashCode() + (this.f22271a.hashCode() * 31);
    }
}
