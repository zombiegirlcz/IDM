package ci7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class p implements t {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f24415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f24416b;

    public /* synthetic */ p(int i, dj0.d dVar, float f) {
        if (3 != (i & 3)) {
            j1.f(n.f24414a.getDescriptor(), i, 3);
            throw null;
        }
        this.f24415a = dVar;
        this.f24416b = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f24415a, pVar.f24415a) && Float.compare(this.f24416b, pVar.f24416b) == 0;
    }

    public final int hashCode() {
        dj0.d dVar = this.f24415a;
        return Float.hashCode(this.f24416b) + ((dVar == null ? 0 : dVar.hashCode()) * 31);
    }

    public p(dj0.d dVar, float f) {
        this.f24415a = dVar;
        this.f24416b = f;
    }
}
