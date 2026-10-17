package akd;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f5789g = {null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new aj0.o(19)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5792c;
    public final q d;
    public final List e;
    public final f f;

    public j(int i, String str, String str2, boolean z, q qVar, List list, f fVar) {
        if (15 != (i & 15)) {
            j1.f(h.f5788a.getDescriptor(), i, 15);
            throw null;
        }
        this.f5790a = str;
        this.f5791b = str2;
        this.f5792c = z;
        this.d = qVar;
        if ((i & 16) == 0) {
            this.e = f0.f322471a;
        } else {
            this.e = list;
        }
        if ((i & 32) != 0) {
            this.f = fVar;
            return;
        }
        f fVar2 = (f) d0.d0(this.e);
        if (fVar2 == null) {
            throw new IllegalArgumentException("Promo banner must have at least one button");
        }
        this.f = fVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f5790a, jVar.f5790a) && Intrinsics.f(this.f5791b, jVar.f5791b) && this.f5792c == jVar.f5792c && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.f5799a.hashCode() + j6.a.c(p.a.c(this.f5790a.hashCode() * 31, 31, this.f5791b), 31, this.f5792c)) * 31);
    }
}
