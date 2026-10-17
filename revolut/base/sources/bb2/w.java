package bb2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.payid.impl.screen.settings.a f14155b;

    public /* synthetic */ w(com.revolut.feature.apm.payid.impl.screen.settings.a aVar, int i) {
        this.f14154a = i;
        this.f14155b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Throwable it8 = (Throwable) obj2;
        switch (this.f14154a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.feature.apm.payid.impl.screen.settings.a aVar = this.f14155b;
                aVar.H2(aVar.v, new ab4.q(it8, 3));
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.feature.apm.payid.impl.screen.settings.a aVar2 = this.f14155b;
                aVar2.H2(aVar2.v, new ab4.q(it8, 4));
                break;
        }
        return Boolean.TRUE;
    }
}
