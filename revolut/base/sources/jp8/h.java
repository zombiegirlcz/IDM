package jp8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f177224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f177225b;

    public /* synthetic */ h(int i, jo3.a aVar, n nVar) {
        if (3 != (i & 3)) {
            j1.f(f.f177223a.getDescriptor(), i, 3);
            throw null;
        }
        this.f177224a = aVar;
        this.f177225b = nVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f177224a, hVar.f177224a) && Intrinsics.f(this.f177225b, hVar.f177225b);
    }

    public final int hashCode() {
        int iHashCode = this.f177224a.hashCode() * 31;
        n nVar = this.f177225b;
        return iHashCode + (nVar == null ? 0 : nVar.hashCode());
    }
}
