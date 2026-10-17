package j19;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class x1 implements k {

    @NotNull
    public static final t1 Companion = new t1();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f170278g = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new j18.j(17)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f170281c;
    public final a d;
    public final i19.g e;
    public final w1 f;

    public /* synthetic */ x1(int i, String str, String str2, String str3, a aVar, i19.g gVar, w1 w1Var) {
        if (1 != (i & 1)) {
            qlm.j1.f(s1.f170255a.getDescriptor(), i, 1);
            throw null;
        }
        this.f170279a = str;
        if ((i & 2) == 0) {
            this.f170280b = null;
        } else {
            this.f170280b = str2;
        }
        if ((i & 4) == 0) {
            this.f170281c = null;
        } else {
            this.f170281c = str3;
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
            this.f = w1Var;
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
        if (!(obj2 instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj2;
        return Intrinsics.f(this.f170279a, x1Var.f170279a) && Intrinsics.f(this.f170280b, x1Var.f170280b) && Intrinsics.f(this.f170281c, x1Var.f170281c) && this.d == x1Var.d && Intrinsics.f(this.e, x1Var.e) && Intrinsics.f(this.f, x1Var.f);
    }

    @Override // j19.k
    public final c getContent() {
        return this.f;
    }

    @Override // j19.k
    public final String getId() {
        return this.f170279a;
    }

    public final int hashCode() {
        int iHashCode = this.f170279a.hashCode() * 31;
        String str = this.f170280b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f170281c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        a aVar = this.d;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        i19.g gVar = this.e;
        int iHashCode5 = (iHashCode4 + (gVar == null ? 0 : gVar.f157597a.hashCode())) * 31;
        w1 w1Var = this.f;
        return iHashCode5 + (w1Var != null ? w1Var.hashCode() : 0);
    }
}
