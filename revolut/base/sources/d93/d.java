package d93;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements Serializable {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f112340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f112341b;

    static {
        f0 f0Var = f0.f322471a;
        new d(f0Var, f0Var);
    }

    public d(List methods, List upgradableDeliveryMethods) {
        Intrinsics.checkNotNullParameter(methods, "methods");
        Intrinsics.checkNotNullParameter(upgradableDeliveryMethods, "upgradableDeliveryMethods");
        this.f112340a = methods;
        this.f112341b = upgradableDeliveryMethods;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f112340a, dVar.f112340a) && Intrinsics.f(this.f112341b, dVar.f112341b);
    }

    public final int hashCode() {
        return this.f112341b.hashCode() + (this.f112340a.hashCode() * 31);
    }
}
