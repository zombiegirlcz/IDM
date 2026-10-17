package p26;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ofm.q;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f232078a = new b();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List rates = (List) obj2;
        Intrinsics.checkNotNullParameter(rates, "rates");
        qta.c cVar = (qta.c) d0.d0(rates);
        if (cVar != null) {
            return q.f0(cVar);
        }
        return null;
    }
}
