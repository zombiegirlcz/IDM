package vzc;

import r7d.w;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f293483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f293484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f293485c;

    public d(b bVar, c cVar, int i) {
        switch (i) {
            case 1:
                this.f293483a = cVar;
                int i2 = 1;
                this.f293484b = e4m.b.b(new j(bVar, this, 1, i2));
                this.f293485c = e4m.b.b(new j(bVar, this, 0, i2));
                break;
            case 2:
                this.f293483a = cVar;
                int i3 = 24;
                this.f293484b = e4m.b.b(new w(bVar, cVar, this, 1, i3));
                this.f293485c = e4m.b.b(new w(bVar, cVar, this, 0, i3));
                break;
            default:
                this.f293483a = cVar;
                this.f293484b = e4m.b.b(new w(bVar, cVar, this, 1, 20));
                this.f293485c = e4m.b.b(new w(bVar, cVar, this, 0, 20));
                break;
        }
    }
}
