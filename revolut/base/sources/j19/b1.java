package j19;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class b1 implements k {

    @NotNull
    public static final w0 Companion = new w0();
    public static final Lazy[] e = {null, null, yhm.j.c(yhm.k.PUBLICATION, new j18.j(12)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i19.g f170174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f170175c;
    public final a1 d;

    public /* synthetic */ b1(int i, String str, i19.g gVar, a aVar, a1 a1Var) {
        if (1 != (i & 1)) {
            qlm.j1.f(v0.f170269a.getDescriptor(), i, 1);
            throw null;
        }
        this.f170173a = str;
        if ((i & 2) == 0) {
            this.f170174b = null;
        } else {
            this.f170174b = gVar;
        }
        if ((i & 4) == 0) {
            this.f170175c = null;
        } else {
            this.f170175c = aVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = a1Var;
        }
    }

    @Override // j19.k
    public final a a() {
        return this.f170175c;
    }

    @Override // j19.k
    public final i19.g b() {
        return this.f170174b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj2;
        return Intrinsics.f(this.f170173a, b1Var.f170173a) && Intrinsics.f(this.f170174b, b1Var.f170174b) && this.f170175c == b1Var.f170175c && Intrinsics.f(this.d, b1Var.d);
    }

    @Override // j19.k
    public final c getContent() {
        return this.d;
    }

    @Override // j19.k
    public final String getId() {
        return this.f170173a;
    }

    public final int hashCode() {
        int iHashCode = this.f170173a.hashCode() * 31;
        i19.g gVar = this.f170174b;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.f157597a.hashCode())) * 31;
        a aVar = this.f170175c;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a1 a1Var = this.d;
        return iHashCode3 + (a1Var != null ? a1Var.hashCode() : 0);
    }
}
