package j19;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class l0 implements k {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f170221g = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new j18.j(9)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f170224c;
    public final a d;
    public final i19.g e;
    public final k0 f;

    public /* synthetic */ l0(int i, String str, String str2, String str3, a aVar, i19.g gVar, k0 k0Var) {
        if (1 != (i & 1)) {
            qlm.j1.f(g0.f170202a.getDescriptor(), i, 1);
            throw null;
        }
        this.f170222a = str;
        if ((i & 2) == 0) {
            this.f170223b = null;
        } else {
            this.f170223b = str2;
        }
        if ((i & 4) == 0) {
            this.f170224c = null;
        } else {
            this.f170224c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = aVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = gVar;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = k0Var;
        }
    }

    @Override // j19.k
    public final a a() {
        return this.d;
    }

    @Override // j19.k
    public final i19.g b() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f170222a, l0Var.f170222a) && Intrinsics.f(this.f170223b, l0Var.f170223b) && Intrinsics.f(this.f170224c, l0Var.f170224c) && this.d == l0Var.d && Intrinsics.f(this.e, l0Var.e) && Intrinsics.f(this.f, l0Var.f);
    }

    @Override // j19.k
    public final c getContent() {
        return this.f;
    }

    @Override // j19.k
    public final String getId() {
        return this.f170222a;
    }

    public final int hashCode() {
        int iHashCode = this.f170222a.hashCode() * 31;
        String str = this.f170223b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f170224c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        a aVar = this.d;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        i19.g gVar = this.e;
        int iHashCode5 = (iHashCode4 + (gVar == null ? 0 : gVar.f157597a.hashCode())) * 31;
        k0 k0Var = this.f;
        return iHashCode5 + (k0Var != null ? k0Var.hashCode() : 0);
    }
}
