package m54;

import com.revolut.feature.credit.autopay.model.CreditCardAutoPayDataRequest;
import com.revolut.feature.credit.autopay.models.repayment.AutoPayRepaymentDataRequest;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import m11.h;
import n3i.b;
import te0.w;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements ck4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f202797a;

    public a(b externalCardsMapper) {
        Intrinsics.checkNotNullParameter(externalCardsMapper, "externalCardsMapper");
        this.f202797a = externalCardsMapper;
    }

    @Override // ck4.a
    public final r a(AutoPayRepaymentDataRequest autoPayRepaymentDataRequest) {
        r map = w.i(autoPayRepaymentDataRequest).cast(CreditCardAutoPayDataRequest.class).map(new m30.b(21, new h(this, 15)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
