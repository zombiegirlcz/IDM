package j6a;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f171707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.i f171708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f171709c;

    public k(j header, aw0.e eVar, List items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f171707a = header;
        this.f171708b = eVar;
        this.f171709c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f171709c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f171707a, kVar.f171707a) && Intrinsics.f(this.f171708b, kVar.f171708b) && Intrinsics.f(this.f171709c, kVar.f171709c);
    }

    public final int hashCode() {
        int iHashCode = this.f171707a.hashCode() * 31;
        aw0.i iVar = this.f171708b;
        return this.f171709c.hashCode() + ((iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31);
    }
}
