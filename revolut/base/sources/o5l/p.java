package o5l;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class p implements Serializable {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f222475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f222476b;

    static {
        q qVar = r.Companion;
        qVar.getClass();
        r rVar = r.e;
        qVar.getClass();
        new p(rVar, rVar);
    }

    public p(r price, r originalPrice) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
        this.f222475a = price;
        this.f222476b = originalPrice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f222475a, pVar.f222475a) && Intrinsics.f(this.f222476b, pVar.f222476b);
    }

    public final int hashCode() {
        return this.f222476b.hashCode() + (this.f222475a.hashCode() * 31);
    }
}
