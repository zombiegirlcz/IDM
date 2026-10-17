package au;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yt.a f9104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9106c;
    public final boolean d;

    public d(yt.a documentType, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        this.f9104a = documentType;
        this.f9105b = z;
        this.f9106c = z3;
        this.d = z4;
    }

    @Override // au.h
    public final boolean J() {
        return this.d;
    }

    @Override // au.h
    public final boolean T() {
        return this.f9106c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f9104a == dVar.f9104a && this.f9105b == dVar.f9105b && this.f9106c == dVar.f9106c && this.d == dVar.d;
    }

    @Override // au.h
    public final yt.a getDocumentType() {
        return this.f9104a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(this.f9104a.hashCode() * 31, 31, this.f9105b), 31, this.f9106c);
    }

    @Override // au.h
    public final boolean k0() {
        return this.f9105b;
    }
}
