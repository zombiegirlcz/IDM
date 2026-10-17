package au;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yt.a f9115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9117c;
    public final boolean d;
    public final short e;

    public g(yt.a documentType, boolean z, boolean z3, boolean z4, short s2) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        this.f9115a = documentType;
        this.f9116b = z;
        this.f9117c = z3;
        this.d = z4;
        this.e = s2;
    }

    @Override // au.h
    public final boolean J() {
        return this.d;
    }

    @Override // au.h
    public final boolean T() {
        return this.f9117c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f9115a == gVar.f9115a && this.f9116b == gVar.f9116b && this.f9117c == gVar.f9117c && this.d == gVar.d && this.e == gVar.e;
    }

    @Override // au.h
    public final yt.a getDocumentType() {
        return this.f9115a;
    }

    public final int hashCode() {
        return Short.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(this.f9115a.hashCode() * 31, 31, this.f9116b), 31, this.f9117c), 31, this.d);
    }

    @Override // au.h
    public final boolean k0() {
        return this.f9116b;
    }
}
