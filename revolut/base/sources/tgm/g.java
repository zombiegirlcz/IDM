package tgm;

import fgm.p;
import igm.o;
import io.reactivex.rxjava3.core.Single;
import tb4.t;

/* JADX INFO: loaded from: classes14.dex */
public final class g extends Single {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Single f271216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f271217c;

    public /* synthetic */ g(Single single, o oVar, int i) {
        this.f271215a = i;
        this.f271217c = oVar;
        this.f271216b = single;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void j(p pVar) {
        switch (this.f271215a) {
            case 0:
                this.f271216b.c(new f(0, pVar, this.f271217c));
                break;
            case 1:
                this.f271216b.c(new k7i.i(pVar, this.f271217c, 29));
                break;
            case 2:
                this.f271216b.c(new t(this, pVar));
                break;
            default:
                this.f271216b.c(new f(1, pVar, this.f271217c));
                break;
        }
    }
}
