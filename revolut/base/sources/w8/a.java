package w8;

import sgm.p4;

/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f295556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f295557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p4 f295558c;

    public a(int i, boolean z) {
        this.f295556a = i;
        this.f295557b = z;
    }

    @Override // w8.e
    public final d a(c8.a aVar) {
        if (aVar == c8.a.MEMORY_CACHE) {
            return c.f295559a;
        }
        if (this.f295558c == null) {
            this.f295558c = new p4(this.f295556a, this.f295557b);
        }
        return this.f295558c;
    }
}
