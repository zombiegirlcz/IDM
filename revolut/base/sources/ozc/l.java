package ozc;

import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f231291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f231292b;

    public /* synthetic */ l(t tVar, int i) {
        this.f231291a = i;
        this.f231292b = tVar;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f231291a) {
            case 0:
                this.f231292b.f231335m.onNext(Unit.f186387a);
                break;
            case 1:
                this.f231292b.f231334l.onNext(Unit.f186387a);
                break;
            case 2:
                this.f231292b.f231335m.onNext(Unit.f186387a);
                break;
            default:
                this.f231292b.f231336n.onNext(zi0.c.P(Unit.f186387a, false, null, 3));
                break;
        }
    }
}
