package dkk;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g0 extends kotlin.jvm.internal.q implements Function1 {
    public static final g0 f = new g0();

    public g0() {
        super(1, opg.a.class, "getHighestProduct", "getHighestProduct(Ljava/util/List;)Lcom/revolut/feature/shared/savings/models/product/SavingsProductData;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List p0 = (List) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return opg.a.a(p0);
    }
}
