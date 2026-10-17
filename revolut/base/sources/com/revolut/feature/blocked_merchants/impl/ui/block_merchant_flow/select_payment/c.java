package com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.blocked_merchants.impl.R$string;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.SelectPaymentToBlockScreenContract$ScreenType;
import ieg.z;
import ip0.zj;
import is2.f;
import is2.j;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import whf.n;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f64275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SelectPaymentToBlockScreenContract$InputData f64276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f64277c;
    public final Object d;

    public c(n transactionsListMapper, SelectPaymentToBlockScreenContract$InputData inputData, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(transactionsListMapper, "transactionsListMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f64275a = transactionsListMapper;
        this.f64276b = inputData;
        this.f64277c = featureToggleInteractor;
        this.d = w.y0(new ie7.a(this, 27));
    }

    public static List b(String str) {
        List listC = u.c(str.length() > 0 ? new FullScreenStateDelegate.Model("LIST_ID_EMPTY_ITEM", new TextLocalisedClause(R$string.merchants_transaction_list_no_transactions_for, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D006", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 31716) : new FullScreenStateDelegate.Model("LIST_ID_EMPTY_ITEM", new TextLocalisedClause(R$string.merchants_transaction_list_no_transactions, null, null, 14), null, null, null, null, false, null, null, false, 0, 0, 32764));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }

    @Override // jki.p
    public final m a(i iVar) {
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f168082b, new ip4.m(25), new in1.a(this, domainState), new z(this, domainState, 8));
        SelectPaymentToBlockScreenContract$ScreenType selectPaymentToBlockScreenContract$ScreenType = this.f64276b.f64262b;
        boolean z = false;
        if (!Intrinsics.f(selectPaymentToBlockScreenContract$ScreenType, SelectPaymentToBlockScreenContract$ScreenType.BlockMerchantOld.f64264a)) {
            if (!Intrinsics.f(selectPaymentToBlockScreenContract$ScreenType, SelectPaymentToBlockScreenContract$ScreenType.BlockMerchant.f64263a) && !Intrinsics.f(selectPaymentToBlockScreenContract$ScreenType, SelectPaymentToBlockScreenContract$ScreenType.BlockSubscription.f64265a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (domainState.d != null) {
                z = true;
            }
        }
        return new j(list, z);
    }
}
