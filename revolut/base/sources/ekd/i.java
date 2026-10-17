package ekd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class i {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f127004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f127005b;

    public /* synthetic */ i(int i, h hVar, e eVar) {
        if (3 != (i & 3)) {
            j1.f(a.f126986a.getDescriptor(), i, 3);
            throw null;
        }
        this.f127004a = hVar;
        this.f127005b = eVar;
    }

    public final h a() {
        return this.f127004a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f127004a, iVar.f127004a) && Intrinsics.f(this.f127005b, iVar.f127005b);
    }

    public final int hashCode() {
        return this.f127005b.hashCode() + (this.f127004a.hashCode() * 31);
    }
}
