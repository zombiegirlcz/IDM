package ise;

import com.revolut.feature.checkout.add_money_methods.api.model.AddMoneyMethod;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f168188a = new a0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List it8 = (List) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return (AddMoneyMethod) zhm.d0.d0(it8);
    }
}
