package wz5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f301367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f301368b;

    public a(boolean z, List rates) {
        Intrinsics.checkNotNullParameter(rates, "rates");
        this.f301367a = z;
        this.f301368b = rates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f301367a == aVar.f301367a && Intrinsics.f(this.f301368b, aVar.f301368b);
    }

    public final int hashCode() {
        return this.f301368b.hashCode() + (Boolean.hashCode(this.f301367a) * 31);
    }
}
