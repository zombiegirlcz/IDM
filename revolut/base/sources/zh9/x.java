package zh9;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f322361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f322362b;

    public x(ArrayList options, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f322361a = currency;
        this.f322362b = options;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return this.f322361a.equals(xVar.f322361a) && this.f322362b.equals(xVar.f322362b);
    }

    public final int hashCode() {
        return this.f322362b.hashCode() + (this.f322361a.hashCode() * 31);
    }
}
