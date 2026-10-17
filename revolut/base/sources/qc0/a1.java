package qc0;

import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.IntentCommand;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a1 implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f244392b;

    public /* synthetic */ a1(f1 f1Var, int i) {
        this.f244391a = i;
        this.f244392b = f1Var;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f244391a) {
            case 0:
                this.f244392b.v("STEP_RESULT");
                break;
            case 1:
                this.f244392b.k.onNext(new FinishCommand(null, null, null, 7));
                break;
            case 2:
                f1 f1Var = this.f244392b;
                f1Var.k.onNext(new IntentCommand(((s70.b) f1Var.i).b(), null));
                break;
            default:
                this.f244392b.k.onNext(new FinishCommand(null, null, null, 7));
                break;
        }
    }
}
