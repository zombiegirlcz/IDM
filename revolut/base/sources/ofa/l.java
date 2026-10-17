package ofa;

import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f224775c = {yhm.j.c(yhm.k.PUBLICATION, new ob1.e(28)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f224776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f224777b;

    public /* synthetic */ l(int i, j jVar, boolean z) {
        if (3 != (i & 3)) {
            j1.f(h.f224771a.getDescriptor(), i, 3);
            throw null;
        }
        this.f224776a = jVar;
        this.f224777b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f224776a == lVar.f224776a && this.f224777b == lVar.f224777b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f224777b) + (this.f224776a.hashCode() * 31);
    }
}
