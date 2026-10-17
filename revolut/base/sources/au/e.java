package au;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yt.a f9107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9109c;
    public final boolean d;

    public e(yt.a documentType, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        this.f9107a = documentType;
        this.f9108b = z;
        this.f9109c = z3;
        this.d = z4;
    }

    @Override // au.h
    public final boolean J() {
        return this.d;
    }

    @Override // au.h
    public final boolean T() {
        return this.f9109c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f9107a == eVar.f9107a && this.f9108b == eVar.f9108b && this.f9109c == eVar.f9109c && this.d == eVar.d;
    }

    @Override // au.h
    public final yt.a getDocumentType() {
        return this.f9107a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(this.f9107a.hashCode() * 31, 31, this.f9108b), 31, this.f9109c);
    }

    @Override // au.h
    public final boolean k0() {
        return this.f9108b;
    }
}
