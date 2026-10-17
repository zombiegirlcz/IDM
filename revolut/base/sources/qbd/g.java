package qbd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f244185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f244186b;

    public /* synthetic */ g(int i, String str, e eVar) {
        if (1 != (i & 1)) {
            j1.f(b.f244173a.getDescriptor(), i, 1);
            throw null;
        }
        this.f244185a = str;
        if ((i & 2) == 0) {
            this.f244186b = null;
        } else {
            this.f244186b = eVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f244185a, gVar.f244185a) && Intrinsics.f(this.f244186b, gVar.f244186b);
    }

    public final int hashCode() {
        int iHashCode = this.f244185a.hashCode() * 31;
        e eVar = this.f244186b;
        return iHashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public g(String productId, e eVar) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.f244185a = productId;
        this.f244186b = eVar;
    }
}
