package th6;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v extends kotlin.jvm.internal.q implements Function1 {
    public static final v f = new v();

    public v() {
        super(1, xh6.a.class, "toDomain", "toDomain(Lcom/revolut/feature/external_accounts/impl/repository/dto/MandateDto;)Lcom/revolut/feature/external_accounts/api/model/Mandate;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        uh6.j p0 = (uh6.j) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return xh6.a.a(p0);
    }
}
