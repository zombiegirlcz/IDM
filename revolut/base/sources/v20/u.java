package v20;

import kotlin.Unit;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class u implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f285575b;

    public /* synthetic */ u(f0 f0Var, int i) {
        this.f285574a = i;
        this.f285575b = f0Var;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f285574a) {
            case 0:
                this.f285575b.v.onNext(Unit.f186387a);
                break;
            default:
                this.f285575b.v.onNext(Unit.f186387a);
                break;
        }
    }
}
