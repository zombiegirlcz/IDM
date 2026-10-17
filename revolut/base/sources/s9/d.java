package s9;

import d9.r0;

/* JADX INFO: loaded from: classes16.dex */
public class d extends a {
    public final String d;

    public d(j jVar, k9.d dVar, String str) {
        super(jVar, dVar, 0);
        this.d = str;
    }

    @Override // s9.l, r9.c
    public final String b() {
        return this.d;
    }

    @Override // s9.a, r9.c
    public r0 c() {
        return r0.PROPERTY;
    }

    @Override // s9.a
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public d g(k9.d dVar) {
        return this.f261085b == dVar ? this : new d(this.f261084a, dVar, this.d);
    }
}
