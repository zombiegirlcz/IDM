package gae;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import whf.p;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f142145b;

    public /* synthetic */ b(p pVar, int i) {
        this.f142144a = i;
        this.f142145b = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        dj0.d total = (dj0.d) obj2;
        switch (this.f142144a) {
            case 0:
                Intrinsics.checkNotNullParameter(total, "total");
                p pVar = this.f142145b;
                return new h(pVar.f297646a, pVar.f297647b, total);
            default:
                Intrinsics.checkNotNullParameter(total, "total");
                p pVar2 = this.f142145b;
                return new hae.g(pVar2.f297646a, pVar2.f297647b, total);
        }
    }
}
