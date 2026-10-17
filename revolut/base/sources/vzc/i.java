package vzc;

import r7d.w;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f293498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f293499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f293500c;

    public i(b bVar, c cVar, int i) {
        switch (i) {
            case 1:
                this.f293498a = cVar;
                this.f293499b = e4m.b.b(new w(bVar, cVar, this, 1, 23));
                this.f293500c = e4m.b.b(new w(bVar, cVar, this, 0, 23));
                break;
            default:
                this.f293498a = cVar;
                this.f293499b = e4m.b.b(new vn2.l(bVar, this, 1, 29));
                this.f293500c = e4m.b.b(new vn2.l(bVar, this, 0, 29));
                break;
        }
    }
}
