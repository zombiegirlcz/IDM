package onk;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f226961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f226962b;

    public i(List items, f fVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f226961a = items;
        this.f226962b = fVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f226961a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f226961a, iVar.f226961a) && Intrinsics.f(this.f226962b, iVar.f226962b);
    }

    public final int hashCode() {
        int iHashCode = this.f226961a.hashCode() * 31;
        f fVar = this.f226962b;
        return iHashCode + (fVar == null ? 0 : fVar.hashCode());
    }
}
