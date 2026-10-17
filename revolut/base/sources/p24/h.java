package p24;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class h extends kotlin.jvm.internal.q implements Function1 {
    public static final h f = new h();

    public h() {
        super(1, n14.a.class, "toDomain", "toDomain(Lcom/revolut/feature/credit/application/plugins/impl/network/models/calculator/CalculatorContentDto;)Lcom/revolut/feature/credit/application/plugins/api/models/calculator/CalculatorContent;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        c04.a p0 = (c04.a) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return n14.a.b(p0);
    }
}
