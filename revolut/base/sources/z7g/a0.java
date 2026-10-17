package z7g;

import ip0.v7;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f319963g = {null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new z1i.a(24))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f319964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f319965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f319966c;
    public final jo3.a d;
    public final jo3.a e;
    public final List f;

    public /* synthetic */ a0(int i, String str, String str2, int i2, jo3.a aVar, jo3.a aVar2, List list) {
        if (15 != (i & 15)) {
            j1.f(y.f320004a.getDescriptor(), i, 15);
            throw null;
        }
        this.f319964a = str;
        this.f319965b = str2;
        this.f319966c = i2;
        this.d = aVar;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = aVar2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f319964a, a0Var.f319964a) && Intrinsics.f(this.f319965b, a0Var.f319965b) && this.f319966c == a0Var.f319966c && Intrinsics.f(this.d, a0Var.d) && Intrinsics.f(this.e, a0Var.e) && Intrinsics.f(this.f, a0Var.f);
    }

    public final int hashCode() {
        int iJ = v7.j(this.d, j6.a.b(this.f319966c, p.a.c(this.f319964a.hashCode() * 31, 31, this.f319965b), 31), 31);
        jo3.a aVar = this.e;
        int iHashCode = (iJ + (aVar == null ? 0 : aVar.hashCode())) * 31;
        List list = this.f;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }
}
