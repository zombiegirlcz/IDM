package j19;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class f0 implements k {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f170197g = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new j18.j(7)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f170200c;
    public final a d;
    public final i19.g e;
    public final e0 f;

    public /* synthetic */ f0(int i, String str, String str2, String str3, a aVar, i19.g gVar, e0 e0Var) {
        if (1 != (i & 1)) {
            qlm.j1.f(u.f170263a.getDescriptor(), i, 1);
            throw null;
        }
        this.f170198a = str;
        if ((i & 2) == 0) {
            this.f170199b = null;
        } else {
            this.f170199b = str2;
        }
        if ((i & 4) == 0) {
            this.f170200c = null;
        } else {
            this.f170200c = str3;
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
            this.f = e0Var;
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
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f170198a, f0Var.f170198a) && Intrinsics.f(this.f170199b, f0Var.f170199b) && Intrinsics.f(this.f170200c, f0Var.f170200c) && this.d == f0Var.d && Intrinsics.f(this.e, f0Var.e) && Intrinsics.f(this.f, f0Var.f);
    }

    @Override // j19.k
    public final c getContent() {
        return this.f;
    }

    @Override // j19.k
    public final String getId() {
        return this.f170198a;
    }

    public final int hashCode() {
        int iHashCode = this.f170198a.hashCode() * 31;
        String str = this.f170199b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f170200c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        a aVar = this.d;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        i19.g gVar = this.e;
        int iHashCode5 = (iHashCode4 + (gVar == null ? 0 : gVar.f157597a.hashCode())) * 31;
        e0 e0Var = this.f;
        return iHashCode5 + (e0Var != null ? e0Var.hashCode() : 0);
    }
}
