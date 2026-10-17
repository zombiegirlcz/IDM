package pgm;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: classes14.dex */
public final class v extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f236160c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Flowable flowable, int i) {
        super(flowable);
        this.f236160c = i;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void k(dom.a aVar) {
        switch (this.f236160c) {
            case 0:
                this.f236000b.j(new u(aVar));
                break;
            case 1:
                this.f236000b.j(new z0(aVar));
                break;
            default:
                this.f236000b.j(new a1(aVar));
                break;
        }
    }
}
