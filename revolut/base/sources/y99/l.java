package y99;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f311784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f311785b;

    public /* synthetic */ l(o oVar, int i) {
        this.f311784a = i;
        this.f311785b = oVar;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f311784a) {
            case 0:
                this.f311785b.f311793j.onNext(zi0.c.P(Unit.f186387a, false, null, 3));
                break;
            default:
                this.f311785b.f311793j.onNext(zi0.c.P(Unit.f186387a, false, null, 3));
                break;
        }
    }
}
