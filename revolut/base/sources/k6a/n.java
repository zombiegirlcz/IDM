package k6a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f181662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.i f181663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f181664c;

    public n(m header, aw0.e eVar, List items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f181662a = header;
        this.f181663b = eVar;
        this.f181664c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f181664c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f181662a, nVar.f181662a) && Intrinsics.f(this.f181663b, nVar.f181663b) && Intrinsics.f(this.f181664c, nVar.f181664c);
    }

    public final int hashCode() {
        int iHashCode = this.f181662a.f181661a.hashCode() * 31;
        aw0.i iVar = this.f181663b;
        return this.f181664c.hashCode() + ((iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31);
    }
}
