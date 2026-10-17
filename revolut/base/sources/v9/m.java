package v9;

import d9.r0;

/* JADX INFO: loaded from: classes16.dex */
public final class m extends r9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r9.c f286919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f286920b;

    public m(r9.c cVar, Object obj2) {
        this.f286919a = cVar;
        this.f286920b = obj2;
    }

    @Override // r9.c
    /* JADX INFO: renamed from: a */
    public final r9.c g(k9.d dVar) {
        throw new UnsupportedOperationException();
    }

    @Override // r9.c
    public final String b() {
        return this.f286919a.b();
    }

    @Override // r9.c
    public final r0 c() {
        return this.f286919a.c();
    }

    @Override // r9.c
    public final f9.d e(com.fasterxml.jackson.core.h hVar, f9.d dVar) {
        dVar.f132795a = this.f286920b;
        return this.f286919a.e(hVar, dVar);
    }

    @Override // r9.c
    public final f9.d f(com.fasterxml.jackson.core.h hVar, f9.d dVar) {
        return this.f286919a.f(hVar, dVar);
    }
}
