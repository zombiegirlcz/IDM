package vzc;

import r7d.w;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f293486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f293487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f293488c;

    public e(b bVar, c cVar, int i) {
        switch (i) {
            case 1:
                this.f293486a = cVar;
                int i2 = 2;
                this.f293487b = e4m.b.b(new j(bVar, this, 1, i2));
                this.f293488c = e4m.b.b(new j(bVar, this, 0, i2));
                break;
            case 2:
                this.f293486a = cVar;
                this.f293487b = e4m.b.b(new w(bVar, cVar, this, 1, 25));
                this.f293488c = e4m.b.b(new w(bVar, cVar, this, 0, 25));
                break;
            default:
                this.f293486a = cVar;
                this.f293487b = e4m.b.b(new vn2.l(bVar, this, 1, 28));
                this.f293488c = e4m.b.b(new vn2.l(bVar, this, 0, 28));
                break;
        }
    }
}
