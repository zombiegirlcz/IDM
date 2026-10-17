package q75;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f242752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f242753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f242754c;

    public m(List items, i header, aw0.e eVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f242752a = items;
        this.f242753b = header;
        this.f242754c = eVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f242752a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f242752a, mVar.f242752a) && Intrinsics.f(this.f242753b, mVar.f242753b) && Intrinsics.f(this.f242754c, mVar.f242754c);
    }

    public final int hashCode() {
        int iHashCode = (this.f242753b.hashCode() + (this.f242752a.hashCode() * 31)) * 31;
        aw0.i iVar = this.f242754c;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }
}
