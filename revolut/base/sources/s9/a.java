package s9;

import d9.r0;

/* JADX INFO: loaded from: classes16.dex */
public class a extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f261073c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(j jVar, k9.d dVar, int i) {
        super(jVar, dVar);
        this.f261073c = i;
    }

    @Override // r9.c
    public r9.c a(k9.d dVar) {
        switch (this.f261073c) {
            case 0:
                return g(dVar);
            default:
                return this.f261085b == dVar ? this : new a(this.f261084a, dVar, 1);
        }
    }

    @Override // r9.c
    public r0 c() {
        switch (this.f261073c) {
            case 0:
                return r0.WRAPPER_ARRAY;
            default:
                return r0.WRAPPER_OBJECT;
        }
    }

    public a g(k9.d dVar) {
        return this.f261085b == dVar ? this : new a(this.f261084a, dVar, 0);
    }
}
