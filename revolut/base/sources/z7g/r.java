package z7g;

import ip0.v7;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f319991h = {null, null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new z1i.a(22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f319992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f319993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.a f319994c;
    public final jo3.a d;
    public final jo3.a e;
    public final jo3.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f319995g;

    public /* synthetic */ r(int i, String str, int i2, jo3.a aVar, jo3.a aVar2, jo3.a aVar3, jo3.a aVar4, List list) {
        if (31 != (i & 31)) {
            j1.f(p.f319990a.getDescriptor(), i, 31);
            throw null;
        }
        this.f319992a = str;
        this.f319993b = i2;
        this.f319994c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = aVar4;
        }
        if ((i & 64) == 0) {
            this.f319995g = null;
        } else {
            this.f319995g = list;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f319992a, rVar.f319992a) && this.f319993b == rVar.f319993b && Intrinsics.f(this.f319994c, rVar.f319994c) && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e) && Intrinsics.f(this.f, rVar.f) && Intrinsics.f(this.f319995g, rVar.f319995g);
    }

    public final int hashCode() {
        int iJ = v7.j(this.e, v7.j(this.d, v7.j(this.f319994c, j6.a.b(this.f319993b, this.f319992a.hashCode() * 31, 31), 31), 31), 31);
        jo3.a aVar = this.f;
        int iHashCode = (iJ + (aVar == null ? 0 : aVar.hashCode())) * 31;
        List list = this.f319995g;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }
}
