package ma1;

import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class r implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f203903b;

    public /* synthetic */ r(t tVar, int i) {
        this.f203902a = i;
        this.f203903b = tVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f203902a) {
            case 0:
                t tVar = this.f203903b;
                if (!tVar.c()) {
                    return new ufm.c(new r(tVar, 1), 2);
                }
                sa1.q qVar = (sa1.q) tVar.f203904a;
                qVar.getClass();
                ufm.b bVar = new ufm.b(new sa1.k(qVar), 0);
                Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
                return bVar;
            default:
                ((sa1.q) this.f203903b.f203904a).b().cancelConnection();
                return Unit.f186387a;
        }
    }
}
