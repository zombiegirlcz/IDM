package a3i;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f1154b;

    public o(List items, m mVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f1153a = items;
        this.f1154b = mVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f1153a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f1153a, oVar.f1153a) && Intrinsics.f(this.f1154b, oVar.f1154b);
    }

    public final int hashCode() {
        int iHashCode = this.f1153a.hashCode() * 31;
        m mVar = this.f1154b;
        return iHashCode + (mVar == null ? 0 : mVar.hashCode());
    }
}
