package mif;

import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f205813b;

    public /* synthetic */ m(o oVar, int i) {
        this.f205812a = i;
        this.f205813b = oVar;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f205812a) {
            case 0:
                this.f205813b.f205817a.onNext(Unit.f186387a);
                break;
            default:
                this.f205813b.f205817a.onNext(Unit.f186387a);
                break;
        }
    }
}
