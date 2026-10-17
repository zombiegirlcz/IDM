package xy9;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Throwable p0 = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        o oVar = (o) this.receiver;
        oVar.L2(((uca.f) oVar.f309673n).b(p0));
        return Boolean.TRUE;
    }
}
