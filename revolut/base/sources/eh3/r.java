package eh3;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f125724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f125725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f125726c;

    public r(p header, List items, aw0.i iVar) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f125724a = header;
        this.f125725b = items;
        this.f125726c = iVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f125725b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f125724a, rVar.f125724a) && Intrinsics.f(this.f125725b, rVar.f125725b) && Intrinsics.f(this.f125726c, rVar.f125726c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f125724a.hashCode() * 31, 31, this.f125725b);
        aw0.i iVar = this.f125726c;
        return iD + (iVar == null ? 0 : iVar.hashCode());
    }
}
