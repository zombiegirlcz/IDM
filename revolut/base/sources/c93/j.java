package c93;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements Serializable {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f22287c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f22288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f22289b;

    static {
        k kVar = l.Companion;
        kVar.getClass();
        l lVar = l.e;
        kVar.getClass();
        f22287c = new j(lVar, lVar);
    }

    public j(l price, l originalPrice) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
        this.f22288a = price;
        this.f22289b = originalPrice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f22288a, jVar.f22288a) && Intrinsics.f(this.f22289b, jVar.f22289b);
    }

    public final int hashCode() {
        return this.f22289b.hashCode() + (this.f22288a.hashCode() * 31);
    }
}
