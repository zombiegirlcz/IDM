package j19;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class u0 implements k {

    @NotNull
    public static final n0 Companion = new n0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f170264g = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new j18.j(10)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f170267c;
    public final a d;
    public final i19.g e;
    public final t0 f;

    public /* synthetic */ u0(int i, String str, String str2, String str3, a aVar, i19.g gVar, t0 t0Var) {
        if (1 != (i & 1)) {
            qlm.j1.f(m0.f170228a.getDescriptor(), i, 1);
            throw null;
        }
        this.f170265a = str;
        if ((i & 2) == 0) {
            this.f170266b = null;
        } else {
            this.f170266b = str2;
        }
        if ((i & 4) == 0) {
            this.f170267c = null;
        } else {
            this.f170267c = str3;
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
            this.f = t0Var;
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
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return Intrinsics.f(this.f170265a, u0Var.f170265a) && Intrinsics.f(this.f170266b, u0Var.f170266b) && Intrinsics.f(this.f170267c, u0Var.f170267c) && this.d == u0Var.d && Intrinsics.f(this.e, u0Var.e) && Intrinsics.f(this.f, u0Var.f);
    }

    @Override // j19.k
    public final c getContent() {
        return this.f;
    }

    @Override // j19.k
    public final String getId() {
        return this.f170265a;
    }

    public final int hashCode() {
        int iHashCode = this.f170265a.hashCode() * 31;
        String str = this.f170266b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f170267c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        a aVar = this.d;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        i19.g gVar = this.e;
        int iHashCode5 = (iHashCode4 + (gVar == null ? 0 : gVar.f157597a.hashCode())) * 31;
        t0 t0Var = this.f;
        return iHashCode5 + (t0Var != null ? t0Var.hashCode() : 0);
    }
}
