package hkk;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f152945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.i f152946b;

    public i(List items, aw0.e eVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f152945a = items;
        this.f152946b = eVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f152945a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f152945a, iVar.f152945a) && Intrinsics.f(this.f152946b, iVar.f152946b);
    }

    public final int hashCode() {
        int iHashCode = this.f152945a.hashCode() * 31;
        aw0.i iVar = this.f152946b;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }
}
