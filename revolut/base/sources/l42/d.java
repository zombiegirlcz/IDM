package l42;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f192039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f192040b;

    public d(List items, c cVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f192039a = items;
        this.f192040b = cVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f192039a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f192039a, dVar.f192039a) && Intrinsics.f(this.f192040b, dVar.f192040b);
    }

    public final int hashCode() {
        int iHashCode = this.f192039a.hashCode() * 31;
        c cVar = this.f192040b;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }
}
