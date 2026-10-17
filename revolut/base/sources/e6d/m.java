package e6d;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m extends kotlin.jvm.internal.q implements Function1 {
    public static final m f = new m();

    public m() {
        super(1, x5d.b.class, "toDomain", "toDomain(Lcom/revolut/feature/shared/autoinvest/impl/database/entity/AutoInvestEntity;)Lcom/revolut/feature_autoinvest_api/model/AutoInvest;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        w5d.a p0 = (w5d.a) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return x5d.b.y(p0);
    }
}
