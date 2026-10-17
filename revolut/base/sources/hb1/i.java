package hb1;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.acquiring.card_reader.order.api.model.PaymentMethod;
import com.revolut.feature.revpro.card_reader.order.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fb1.d f150556a;

    public i(wa1.a strings, fb1.d paymentMethodMapper) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(paymentMethodMapper, "paymentMethodMapper");
        this.f150556a = paymentMethodMapper;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ArrayList<PaymentMethod.Wallet> arrayList = domainState.f150549a;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (PaymentMethod.Wallet wallet : arrayList) {
            boolean zF = Intrinsics.f(wallet, domainState.f150550b);
            String str = wallet.f60579a;
            dj0.d dVar = wallet.f60581c;
            arrayList2.add(new RowDelegate.Model(str, new CurrencyImage(dVar.f115083b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, ((fb1.g) this.f150556a).a(wallet), new TextClause(dVar.f115083b.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(wallet.f60581c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126), false, zF, null, null, null, null, null, wallet, null, 0, 0, 0, 0, 1056954220));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return new g(new TextLocalisedClause(R$string.rev_pro_card_reader_order_account_selection_title, null, null, 14), arrayList2);
    }
}
