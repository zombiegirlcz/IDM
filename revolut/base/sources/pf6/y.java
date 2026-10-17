package pf6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class y {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f235501b;

    public /* synthetic */ y(int i, String str, jo3.a aVar) {
        if (3 != (i & 3)) {
            j1.f(w.f235499a.getDescriptor(), i, 3);
            throw null;
        }
        this.f235500a = str;
        this.f235501b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f235500a, yVar.f235500a) && Intrinsics.f(this.f235501b, yVar.f235501b);
    }

    public final int hashCode() {
        int iHashCode = this.f235500a.hashCode() * 31;
        jo3.a aVar = this.f235501b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public y(jo3.a aVar, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f235500a = id10;
        this.f235501b = aVar;
    }
}
