package bg;

import dg.d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fe.b f15041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f15042c;

    public /* synthetic */ b(fe.b bVar, d dVar, int i) {
        this.f15040a = i;
        this.f15041b = bVar;
        this.f15042c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15040a) {
            case 0:
                this.f15041b.a(this.f15042c);
                break;
            default:
                this.f15041b.a(this.f15042c);
                break;
        }
    }
}
