package e69;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f122948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.i f122949b;

    public n(List items, aw0.h hVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f122948a = items;
        this.f122949b = hVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f122948a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f122948a, nVar.f122948a) && Intrinsics.f(this.f122949b, nVar.f122949b);
    }

    public final int hashCode() {
        int iHashCode = this.f122948a.hashCode() * 31;
        aw0.i iVar = this.f122949b;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }
}
