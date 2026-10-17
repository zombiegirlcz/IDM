package qc0;

import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class v implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ te0.v f244493b;

    public /* synthetic */ v(te0.v vVar, int i) {
        this.f244492a = i;
        this.f244493b = vVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f244492a) {
            case 0:
                return (BackendFlow) te0.w.L(this.f244493b);
            default:
                return this.f244493b.get();
        }
    }
}
