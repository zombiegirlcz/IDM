package gr2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f145842b;

    public /* synthetic */ j(int i, String str, d dVar) {
        if (3 != (i & 3)) {
            j1.f(h.f145837a.getDescriptor(), i, 3);
            throw null;
        }
        this.f145841a = str;
        this.f145842b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f145841a, jVar.f145841a) && Intrinsics.f(this.f145842b, jVar.f145842b);
    }

    public final int hashCode() {
        return this.f145842b.hashCode() + (this.f145841a.hashCode() * 31);
    }
}
