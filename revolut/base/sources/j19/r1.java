package j19;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class r1 implements k {

    @NotNull
    public static final d1 Companion = new d1();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f170242g = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new j18.j(14)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f170245c;
    public final a d;
    public final i19.g e;
    public final q1 f;

    public /* synthetic */ r1(int i, String str, String str2, String str3, a aVar, i19.g gVar, q1 q1Var) {
        if (1 != (i & 1)) {
            qlm.j1.f(c1.f170176a.getDescriptor(), i, 1);
            throw null;
        }
        this.f170243a = str;
        if ((i & 2) == 0) {
            this.f170244b = null;
        } else {
            this.f170244b = str2;
        }
        if ((i & 4) == 0) {
            this.f170245c = null;
        } else {
            this.f170245c = str3;
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
            this.f = q1Var;
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
        if (!(obj2 instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj2;
        return Intrinsics.f(this.f170243a, r1Var.f170243a) && Intrinsics.f(this.f170244b, r1Var.f170244b) && Intrinsics.f(this.f170245c, r1Var.f170245c) && this.d == r1Var.d && Intrinsics.f(this.e, r1Var.e) && Intrinsics.f(this.f, r1Var.f);
    }

    @Override // j19.k
    public final c getContent() {
        return this.f;
    }

    @Override // j19.k
    public final String getId() {
        return this.f170243a;
    }

    public final int hashCode() {
        int iHashCode = this.f170243a.hashCode() * 31;
        String str = this.f170244b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f170245c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        a aVar = this.d;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        i19.g gVar = this.e;
        int iHashCode5 = (iHashCode4 + (gVar == null ? 0 : gVar.f157597a.hashCode())) * 31;
        q1 q1Var = this.f;
        return iHashCode5 + (q1Var != null ? q1Var.hashCode() : 0);
    }
}
