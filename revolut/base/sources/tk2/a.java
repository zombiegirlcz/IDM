package tk2;

import com.revolut.feature.atm.api.model.Atm;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Atm f271833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f271834b;

    public a(Atm atm, o source) {
        Intrinsics.checkNotNullParameter(atm, "atm");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f271833a = atm;
        this.f271834b = source;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f271833a, aVar.f271833a) && this.f271834b == aVar.f271834b;
    }

    public final int hashCode() {
        return this.f271834b.hashCode() + (this.f271833a.hashCode() * 31);
    }
}
