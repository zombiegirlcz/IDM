package hp5;

import dp5.j0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m extends q implements Function1 {
    public static final m f = new m();

    public m() {
        super(1, cp5.c.class, "toDomain", "toDomain(Lcom/revolut/feature/crypto/withdraw/impl/models/dto/CryptoWithdrawOrderDto;)Lcom/revolut/feature/crypto/withdraw/api/models/CryptoWithdrawOrder;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        j0 p0 = (j0) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return cp5.c.F(p0);
    }
}
