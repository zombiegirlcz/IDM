package qc0;

import com.revolut.retail.core.navigation.NaviCommand;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class b1 implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f244401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NaviCommand f244402c;

    public /* synthetic */ b1(f1 f1Var, NaviCommand naviCommand, int i) {
        this.f244400a = i;
        this.f244401b = f1Var;
        this.f244402c = naviCommand;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f244400a) {
            case 0:
                this.f244401b.k.onNext(this.f244402c);
                break;
            case 1:
                this.f244401b.k.onNext(this.f244402c);
                break;
            default:
                this.f244401b.k.onNext(this.f244402c);
                break;
        }
    }
}
