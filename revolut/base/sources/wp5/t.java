package wp5;

import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1 f299148b;

    public /* synthetic */ t(c1 c1Var, int i) {
        this.f299147a = i;
        this.f299148b = c1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f299147a) {
            case 0:
                ((rpi.b) this.f299148b.o).N(false);
                break;
            default:
                ((rpi.b) this.f299148b.o).N(false);
                break;
        }
        return Unit.f186387a;
    }
}
