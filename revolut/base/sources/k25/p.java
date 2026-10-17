package k25;

import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f180344a = new p();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        yhm.r rVar = (yhm.r) obj2;
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        ProductAccount.ValueItem.Discover[] elements = {((od0.i) rVar.f314201a).f224257a, ((od0.i) rVar.f314202b).f224257a, ((od0.i) rVar.f314203c).f224257a};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }
}
