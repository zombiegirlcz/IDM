package ox6;

import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f230642a = new t();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Pair pair = (Pair) obj2;
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        return j.a((j) pair.f186385a, null, null, (InvoiceTemplate) ((od0.i) pair.f186386b).f224257a, 15);
    }
}
