package j2c;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f170815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f170816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f170817c;

    public m(List items, j header, aw0.i iVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f170815a = items;
        this.f170816b = header;
        this.f170817c = iVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f170815a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f170815a, mVar.f170815a) && Intrinsics.f(this.f170816b, mVar.f170816b) && Intrinsics.f(this.f170817c, mVar.f170817c);
    }

    public final int hashCode() {
        int iHashCode = (this.f170816b.hashCode() + (this.f170815a.hashCode() * 31)) * 31;
        aw0.i iVar = this.f170817c;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }
}
