package qc0;

import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class c1 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f244407b;

    public /* synthetic */ c1(f1 f1Var, int i) {
        this.f244406a = i;
        this.f244407b = f1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f244406a) {
            case 0:
                od0.i iVar = (od0.i) te0.w.O(this.f244407b.j().k());
                if (iVar != null) {
                    return (BackendFlow) iVar.f224257a;
                }
                return null;
            default:
                return this.f244407b.h().e0();
        }
    }
}
