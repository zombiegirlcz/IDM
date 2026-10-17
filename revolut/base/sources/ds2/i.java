package ds2;

import com.revolut.data.model.Data;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.ContentUser;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.details.BlockedMerchantDetailsScreenContract$InputData;
import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends jki.g implements g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final BlockedMerchantDetailsScreenContract$InputData f117181p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f117182q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f117183r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ur2.c f117184s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final nr2.a f117185t;
    public final oce.h u;
    public a2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f f117186w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p stateMapper, BlockedMerchantDetailsScreenContract$InputData inputData, com.revolut.domain.interactors.transactions.a transactionsInteractor, j60.a bottomExpandableDialogControllerExtension, ur2.c blockedMerchantsInteractor, nr2.a blockedMerchantTransactionFilterProvider, oce.h unblockMerchantDialogProvider) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(blockedMerchantsInteractor, "blockedMerchantsInteractor");
        Intrinsics.checkNotNullParameter(blockedMerchantTransactionFilterProvider, "blockedMerchantTransactionFilterProvider");
        Intrinsics.checkNotNullParameter(unblockMerchantDialogProvider, "unblockMerchantDialogProvider");
        this.f117181p = inputData;
        this.f117182q = transactionsInteractor;
        this.f117183r = bottomExpandableDialogControllerExtension;
        this.f117184s = blockedMerchantsInteractor;
        this.f117185t = blockedMerchantTransactionFilterProvider;
        this.u = unblockMerchantDialogProvider;
        this.f117186w = new f(inputData.f64250b, new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        BlockedMerchantDetailsScreenContract$InputData blockedMerchantDetailsScreenContract$InputData = this.f117181p;
        kr2.e eVar = blockedMerchantDetailsScreenContract$InputData.f64250b;
        ContentUser contentUser = blockedMerchantDetailsScreenContract$InputData.f64249a;
        Continuation continuation = null;
        ContentUser.Junior junior = contentUser instanceof ContentUser.Junior ? (ContentUser.Junior) contentUser : null;
        l.a1(this, rd0.e.b(com.revolut.domain.interactors.transactions.a.d(this.f117182q, ((xr2.a) this.f117185t).a(eVar, junior != null ? junior.f64235b : null), null, 4, null, null, 26)), null, null, new dob.c(this, continuation, 11), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f117186w;
    }
}
