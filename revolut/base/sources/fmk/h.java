package fmk;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f136468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw0.a f136469b;

    public h(List items, lw0.a aVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f136468a = items;
        this.f136469b = aVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f136468a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f136468a, hVar.f136468a) && Intrinsics.f(this.f136469b, hVar.f136469b);
    }

    public final int hashCode() {
        int iHashCode = this.f136468a.hashCode() * 31;
        lw0.a aVar = this.f136469b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
