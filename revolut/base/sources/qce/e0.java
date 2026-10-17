package qce;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e0 extends kotlin.jvm.internal.q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SingleChoiceDelegate.Model p0 = (SingleChoiceDelegate.Model) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        o0 o0Var = (o0) this.receiver;
        o0Var.getClass();
        Object obj3 = p0.f;
        fva.e frequency = obj3 instanceof fva.e ? (fva.e) obj3 : null;
        if (frequency == null) {
            pfm.n nVarN = efm.b.n(new IllegalStateException("frequency not provided in parcel"));
            Intrinsics.checkNotNullExpressionValue(nVarN, "error(...)");
            return nVarN;
        }
        pfm.h hVar = new pfm.h(new phc.d(o0Var, frequency, 16), 2);
        sce.f fVar = (sce.f) o0Var.f244743h;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        pfm.h hVar2 = new pfm.h(new rzc.b(fVar, frequency, 8), 2);
        Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
        pfm.a aVarE = hVar.e(hVar2);
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }
}
