package eif;

import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import tof.q6;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f126610b;

    public /* synthetic */ g(k kVar, int i) {
        this.f126609a = i;
        this.f126610b = kVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f126609a) {
            case 0:
                k kVar = this.f126610b;
                tif.b bVar = kVar.d;
                q6 transactionScope = kVar.h();
                bVar.getClass();
                Intrinsics.checkNotNullParameter(transactionScope, "transactionScope");
                Long lA = ((mif.g) bVar.f271493a).a(bVar.d(transactionScope));
                if (lA == null) {
                }
                break;
            default:
                k kVar2 = this.f126610b;
                tif.b bVar2 = kVar2.d;
                q6 transactionScope2 = kVar2.h();
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(transactionScope2, "transactionScope");
                Long lA2 = ((mif.g) bVar2.f271493a).a(bVar2.c(transactionScope2));
                if (lA2 == null) {
                }
                break;
        }
        return new x71.c(null);
    }
}
