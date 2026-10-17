package y43;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_payment_method.api.declaration.SelectPaymentMethodInputData;
import efm.r;
import h93.f0;
import i93.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ue0.e;
import w43.i;
import xwd.o;
import ybh.c0;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f310771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f310772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y33.a f310773c;

    public a(b mapper, c0 featureStateChecker, y33.a cardPaymentMethodInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(featureStateChecker, "featureStateChecker");
        Intrinsics.checkNotNullParameter(cardPaymentMethodInteractor, "cardPaymentMethodInteractor");
        this.f310771a = mapper;
        this.f310772b = featureStateChecker;
        this.f310773c = cardPaymentMethodInteractor;
    }

    public final r a(f0 card, AccountId accountId) {
        c cVar;
        List list;
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(card, "card");
        r rVarH = (!((y91.b) this.f310772b.f312297a).a("REVOLUT_CARD.link_to_pocket") || (cVar = card.f150113g) == null || (list = cVar.f159552g) == null || !(list.isEmpty() ^ true)) ? w.h(zhm.f0.f322471a) : ((i) this.f310773c).f(new SelectPaymentMethodInputData.UseCase.UpdateExistingCardSettings(card, accountId)).map(new y25.c(new o(this, 5, card, accountId), 8));
        Intrinsics.h(rVarH);
        return e.E(rVarH, zhm.f0.f322471a);
    }
}
