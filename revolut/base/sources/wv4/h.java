package wv4;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f300292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.i f300293b;

    public h(List items, aw0.i iVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f300292a = items;
        this.f300293b = iVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f300292a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f300292a, hVar.f300292a) && Intrinsics.f(this.f300293b, hVar.f300293b);
    }

    public final int hashCode() {
        int iHashCode = this.f300292a.hashCode() * 31;
        aw0.i iVar = this.f300293b;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }
}
