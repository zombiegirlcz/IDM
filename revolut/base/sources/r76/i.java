package r76;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f252034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f252035b;

    public /* synthetic */ i(int i, String str, jo3.a aVar) {
        if (3 != (i & 3)) {
            j1.f(g.f252033a.getDescriptor(), i, 3);
            throw null;
        }
        this.f252034a = aVar;
        this.f252035b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f252034a, iVar.f252034a) && Intrinsics.f(this.f252035b, iVar.f252035b);
    }

    public final int hashCode() {
        return this.f252035b.hashCode() + (this.f252034a.hashCode() * 31);
    }
}
