package z0h;

import com.revolut.shared.feature.wealth.models.config.Links;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k0 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Links f318520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f318521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nel.z f318522c;
    public final xi0.b d;

    public k0(Links links, hel.b context, nel.z instrumentType, xi0.b bVar) {
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        this.f318520a = links;
        this.f318521b = context;
        this.f318522c = instrumentType;
        this.d = bVar;
        hel.b bVar2 = hel.b.US;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f318520a, k0Var.f318520a) && this.f318521b == k0Var.f318521b && this.f318522c == k0Var.f318522c && Intrinsics.f(this.d, k0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f318522c.hashCode() + ((this.f318521b.hashCode() + (this.f318520a.hashCode() * 31)) * 31)) * 31;
        xi0.b bVar = this.d;
        return iHashCode + (bVar == null ? 0 : bVar.hashCode());
    }
}
