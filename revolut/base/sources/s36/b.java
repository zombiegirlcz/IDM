package s36;

import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f259422a = new b();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return Boolean.valueOf(obj2 instanceof BalanceWrapper.PocketBalanceWrapper);
    }
}
