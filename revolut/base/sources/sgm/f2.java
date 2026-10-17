package sgm;

import io.reactivex.rxjava3.core.ObservableSource;

/* JADX INFO: loaded from: classes14.dex */
public final class f2 extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.o f262825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f262826c;
    public final int d;
    public final int e;

    public f2(ObservableSource observableSource, igm.o oVar, boolean z, int i, int i2) {
        super(observableSource);
        this.f262825b = oVar;
        this.f262826c = z;
        this.d = i;
        this.e = i2;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        igm.o oVar = this.f262825b;
        ObservableSource observableSource = this.f262688a;
        if (cp5.c.S(lVar, oVar, observableSource)) {
            return;
        }
        observableSource.subscribe(new e2(this.d, this.e, lVar, oVar, this.f262826c));
    }
}
