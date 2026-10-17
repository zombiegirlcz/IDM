package hp5;

import dp5.b1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n extends q implements Function1 {
    public static final n f = new n();

    public n() {
        super(1, cp5.d.class, "toDomain", "toDomain(Lcom/revolut/feature/crypto/withdraw/impl/models/dto/CryptoWithdrawQuoteResponseDto;)Lcom/revolut/feature/crypto/withdraw/api/models/CryptoWithdrawQuoteResponse;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        b1 p0 = (b1) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return cp5.d.U(p0);
    }
}
