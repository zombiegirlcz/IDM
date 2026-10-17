package s9;

import d9.r0;

/* JADX INFO: loaded from: classes16.dex */
public final class c extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f261074c;

    public c(j jVar, k9.d dVar, String str) {
        super(jVar, dVar);
        this.f261074c = str;
    }

    @Override // r9.c
    public final r9.c a(k9.d dVar) {
        return this.f261085b == dVar ? this : new c(this.f261084a, dVar, this.f261074c);
    }

    @Override // s9.l, r9.c
    public final String b() {
        return this.f261074c;
    }

    @Override // r9.c
    public final r0 c() {
        return r0.EXTERNAL_PROPERTY;
    }
}
