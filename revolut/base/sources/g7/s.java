package g7;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f141053b;

    public /* synthetic */ s(Object obj2, int i) {
        this.f141052a = i;
        this.f141053b = obj2;
    }

    @Override // g7.a
    public final void d() {
        switch (this.f141052a) {
            case 0:
                ((t) this.f141053b).k = true;
                break;
            case 1:
                ((t) this.f141053b).k = true;
                break;
            case 2:
                ((t) this.f141053b).k = true;
                break;
            default:
                n7.b bVar = (n7.b) this.f141053b;
                boolean z = bVar.f212941r.m() == 1.0f;
                if (z != bVar.f212945x) {
                    bVar.f212945x = z;
                    bVar.o.invalidateSelf();
                }
                break;
        }
    }
}
