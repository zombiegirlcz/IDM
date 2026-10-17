package mx0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class lb extends kotlin.jvm.internal.q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        com.revolut.core.ui_kit.models.b0 p0 = (com.revolut.core.ui_kit.models.b0) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((ihm.f) this.receiver).onNext(p0);
        return Unit.f186387a;
    }
}
