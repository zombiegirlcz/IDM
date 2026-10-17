package j54;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.q implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Function1 p0 = (Function1) obj2;
        Function2 p17 = (Function2) obj3;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return ((com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c) this.receiver).T2(p17, p0);
    }
}
