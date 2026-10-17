package o9c;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.revolutpay.impl.ui.summary_screen.f f223208b;

    public /* synthetic */ l0(com.revolut.feature.revolutpay.impl.ui.summary_screen.f fVar, int i) {
        this.f223207a = i;
        this.f223208b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f223207a) {
            case 0:
                Intrinsics.checkNotNullParameter((y5i.b) obj2, "it");
                ((tdc.r) this.f223208b.z).f269967q.k(tdc.o.f269962a);
                return Unit.f186387a;
            default:
                q6c.h it8 = (q6c.h) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.b(this.f223208b.o.getF84526g());
        }
    }
}
