package z7g;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f319980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f319981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.a f319982c;
    public final String d;
    public final f e;

    public /* synthetic */ i(int i, String str, f fVar, jo3.a aVar, String str2, f fVar2) {
        if (31 != (i & 31)) {
            j1.f(g.f319979a.getDescriptor(), i, 31);
            throw null;
        }
        this.f319980a = str;
        this.f319981b = fVar;
        this.f319982c = aVar;
        this.d = str2;
        this.e = fVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f319980a, iVar.f319980a) && Intrinsics.f(this.f319981b, iVar.f319981b) && Intrinsics.f(this.f319982c, iVar.f319982c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(v7.j(this.f319982c, (this.f319981b.hashCode() + (this.f319980a.hashCode() * 31)) * 31, 31), 31, this.d);
    }
}
