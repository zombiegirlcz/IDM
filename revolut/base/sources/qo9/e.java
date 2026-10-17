package qo9;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Throwable p0 = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        com.revolut.feature.payments.air.widget.impl.ui.flow.a.I2((com.revolut.feature.payments.air.widget.impl.ui.flow.a) this.receiver, p0);
        return Boolean.TRUE;
    }
}
