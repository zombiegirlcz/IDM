package uyd;

import com.revolut.feature.statements.api.models.StatementContent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g0 extends kotlin.jvm.internal.q implements Function1 {
    public static final g0 f = new g0();

    public g0() {
        super(1, pyd.c.class, "toDomain", "toDomain(Lcom/revolut/feature/statements/impl/dto/StatementContentDto;)Lcom/revolut/feature/statements/api/models/StatementContent;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        oyd.p p0 = (oyd.p) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        return new StatementContent(p0.getPhone(), p0.getCompanyInfo(), p0.getCryptoInfo(), p0.getLegalInfo(), p0.getCustomersNumber());
    }
}
