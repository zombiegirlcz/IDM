package akd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class r {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f5800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f5801b;

    public /* synthetic */ r(int i, m mVar, j jVar) {
        if (3 != (i & 3)) {
            j1.f(c.f5784a.getDescriptor(), i, 3);
            throw null;
        }
        this.f5800a = mVar;
        this.f5801b = jVar;
    }

    public final m a() {
        return this.f5800a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f5800a, rVar.f5800a) && Intrinsics.f(this.f5801b, rVar.f5801b);
    }

    public final int hashCode() {
        return this.f5801b.hashCode() + (this.f5800a.hashCode() * 31);
    }
}
