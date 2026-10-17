package e6d;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l extends kotlin.jvm.internal.q implements Function1 {
    public static final l f = new l();

    public l() {
        super(1, c6d.b.class, "toDomain", "toDomain(Lcom/revolut/feature/shared/autoinvest/impl/models/AutoInvestResponse;)Lcom/revolut/feature_autoinvest_api/model/AutoInvest;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        d6d.b p0 = (d6d.b) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return c6d.b.J(p0);
    }
}
