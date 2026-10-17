package gh3;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f143840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f143841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f143842c;

    public i(g header, List items, f fVar) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f143840a = header;
        this.f143841b = items;
        this.f143842c = fVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f143841b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f143840a, iVar.f143840a) && Intrinsics.f(this.f143841b, iVar.f143841b) && Intrinsics.f(this.f143842c, iVar.f143842c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f143840a.f143839a.hashCode() * 31, 31, this.f143841b);
        f fVar = this.f143842c;
        return iD + (fVar == null ? 0 : fVar.f143838a.hashCode());
    }
}
