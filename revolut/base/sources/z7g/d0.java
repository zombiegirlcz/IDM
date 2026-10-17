package z7g;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f319974c = {null, yhm.j.c(yhm.k.PUBLICATION, new z1i.a(25))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f319975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f319976b;

    public /* synthetic */ d0(int i, List list, jo3.a aVar) {
        if (3 != (i & 3)) {
            j1.f(b0.f319967a.getDescriptor(), i, 3);
            throw null;
        }
        this.f319975a = aVar;
        this.f319976b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f319975a, d0Var.f319975a) && Intrinsics.f(this.f319976b, d0Var.f319976b);
    }

    public final int hashCode() {
        return this.f319976b.hashCode() + (this.f319975a.hashCode() * 31);
    }
}
