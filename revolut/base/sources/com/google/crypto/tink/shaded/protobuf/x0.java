package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes17.dex */
public final class x0 implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f49432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f49433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f49434c;

    public x0(i1 i1Var, r rVar, a aVar) {
        this.f49433b = i1Var;
        rVar.getClass();
        this.f49434c = rVar;
        this.f49432a = aVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public final void a(Object obj2, byte[] bArr, int i, int i2, d dVar) {
        b0 b0Var = (b0) obj2;
        if (b0Var.unknownFields == j1.f) {
            b0Var.unknownFields = j1.c();
        }
        throw a10.b.m(obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public final void b(Object obj2, m mVar, q qVar) {
        this.f49433b.a(obj2);
        this.f49434c.getClass();
        obj2.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public final boolean c(b0 b0Var, b0 b0Var2) {
        k1 k1Var = (k1) this.f49433b;
        k1Var.getClass();
        j1 j1Var = b0Var.unknownFields;
        k1Var.getClass();
        return j1Var.equals(b0Var2.unknownFields);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public final int d(b0 b0Var) {
        ((k1) this.f49433b).getClass();
        return b0Var.unknownFields.hashCode();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public final int e(b0 b0Var) {
        ((k1) this.f49433b).getClass();
        j1 j1Var = b0Var.unknownFields;
        int i = j1Var.d;
        if (i != -1) {
            return i;
        }
        int iM = 0;
        for (int i2 = 0; i2 < j1Var.f49373a; i2++) {
            int i3 = j1Var.f49374b[i2] >>> 3;
            iM += n.M(3, (j) j1Var.f49375c[i2]) + n.U(i3) + n.T(2) + (n.T(1) * 2);
        }
        j1Var.d = iM;
        return iM;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public final void f(Object obj2, p0 p0Var) {
        this.f49434c.getClass();
        a0.d.B(obj2);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public final boolean isInitialized(Object obj2) {
        this.f49434c.getClass();
        a0.d.B(obj2);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public final void makeImmutable(Object obj2) {
        ((k1) this.f49433b).getClass();
        ((b0) obj2).unknownFields.e = false;
        this.f49434c.getClass();
        a0.d.B(obj2);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public final void mergeFrom(Object obj2, Object obj3) {
        h1.w(this.f49433b, obj2, obj3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public final Object newInstance() {
        a aVar = this.f49432a;
        return aVar instanceof b0 ? ((b0) aVar).p() : aVar.c().b();
    }
}
