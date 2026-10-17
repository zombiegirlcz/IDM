package e6d;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.q implements Function1 {
    public static final k f = new k();

    public k() {
        super(1, x5d.b.class, "toEntity", "toEntity(Lcom/revolut/feature_autoinvest_api/model/AutoInvest;)Lcom/revolut/feature/shared/autoinvest/impl/database/entity/AutoInvestEntity;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        yvh.b p0 = (yvh.b) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return x5d.b.C(p0);
    }
}
