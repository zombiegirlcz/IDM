package vzc;

import r7d.w;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f293489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f293490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f293491c;

    public f(b bVar, c cVar, int i) {
        switch (i) {
            case 1:
                this.f293489a = cVar;
                int i2 = 3;
                this.f293490b = e4m.b.b(new j(bVar, this, 1, i2));
                this.f293491c = e4m.b.b(new j(bVar, this, 0, i2));
                break;
            default:
                this.f293489a = cVar;
                this.f293490b = e4m.b.b(new w(bVar, cVar, this, 1, 21));
                this.f293491c = e4m.b.b(new w(bVar, cVar, this, 0, 21));
                break;
        }
    }
}
