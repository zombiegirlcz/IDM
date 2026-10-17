package tgm;

import b9.u;
import fgm.p;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes14.dex */
public final class e extends Single {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Single f271210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.g f271211c;

    public /* synthetic */ e(Single single, igm.g gVar, int i) {
        this.f271209a = i;
        this.f271210b = single;
        this.f271211c = gVar;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void j(p pVar) {
        switch (this.f271209a) {
            case 0:
                this.f271210b.c(new su9.c(this, pVar));
                break;
            default:
                this.f271210b.c(new u(pVar, this.f271211c));
                break;
        }
    }
}
