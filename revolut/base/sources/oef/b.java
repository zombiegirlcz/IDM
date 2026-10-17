package oef;

import com.revolut.feature.transaction.recogniser.api.domain.models.RecogniserTransaction;
import com.revolut.feature.transaction.recogniser.api.domain.models.TransactionRecogniserDetails;
import kotlin.jvm.internal.Intrinsics;
import lef.d;
import lef.f;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    public static TransactionRecogniserDetails a(f dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        String strJ = dto.getId();
        String strF = dto.getDescription();
        d dVarB = dto.getAmount();
        long amount = dVarB.getAmount();
        xi0.a aVar = xi0.b.Companion;
        String currency = dVarB.getCurrency();
        aVar.getClass();
        return new TransactionRecogniserDetails(new RecogniserTransaction(strJ, strF, new dj0.d(amount, xi0.a.a(currency)), oi0.d.Y(dto.getCreatedDate()), dto.getIconUrl(), dto.getIcon()), dto.getTransactionMethod(), dto.getDevice(), dto.getCard(), dto.getCategory(), dto.getAddress());
    }
}
