package t9e;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.subscriptions.impl.block_future_payments.screen.BlockFuturePaymentsScreenContract$InputData;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import skm.a2;

/* JADX INFO: loaded from: classes8.dex */
public final class w extends jki.g implements j {

    @NotNull
    public static final n Companion = new n();
    public a2 A;
    public final g B;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final BlockFuturePaymentsScreenContract$InputData f269003p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xua.a f269004q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ur2.c f269005r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f269006s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final mde.e f269007t;
    public final sf0.h u;
    public final whf.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final oce.e f269008w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final qce.d f269009x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final hj8.a f269010y;
    public final wsg.n z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(jki.p stateMapper, BlockFuturePaymentsScreenContract$InputData inputData, xua.a recurringPaymentInteractor, ur2.c blockedMerchantsInteractor, ffk.t pricingPlanInteractor, j60.a bottomExpandableDialogExtension, mde.e sharedHelpDestinationProvider, sf0.h serverErrorParser, whf.b transactionsContentProvider, oce.e blockMerchantDialogProvider, qce.d blockSubscriptionDialogProvider, hj8.a juniorProfileInteractor, wsg.n walletInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(blockedMerchantsInteractor, "blockedMerchantsInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogExtension, "bottomExpandableDialogExtension");
        Intrinsics.checkNotNullParameter(sharedHelpDestinationProvider, "sharedHelpDestinationProvider");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(blockMerchantDialogProvider, "blockMerchantDialogProvider");
        Intrinsics.checkNotNullParameter(blockSubscriptionDialogProvider, "blockSubscriptionDialogProvider");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f269003p = inputData;
        this.f269004q = recurringPaymentInteractor;
        this.f269005r = blockedMerchantsInteractor;
        this.f269006s = bottomExpandableDialogExtension;
        this.f269007t = sharedHelpDestinationProvider;
        this.u = serverErrorParser;
        this.v = transactionsContentProvider;
        this.f269008w = blockMerchantDialogProvider;
        this.f269009x = blockSubscriptionDialogProvider;
        this.f269010y = juniorProfileInteractor;
        this.z = walletInteractor;
        this.B = new g(new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        l2(new t05.m(this, null, 14), new yi5.b(26));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.B;
    }

    public final boolean y2(Throwable th10, m mVar) {
        TextLocalisedClause textLocalisedClause;
        Continuation continuation = null;
        ServerError serverErrorC = th10 instanceof HttpException ? this.u.c((HttpException) th10) : th10 instanceof ServerErrorException ? ((ServerErrorException) th10).f : null;
        if (serverErrorC == null || serverErrorC.f51362a != 11702) {
            return false;
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.block_future_payments_limit_reached_error_title, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.core.strings_provider.R$string.error_api_11702, null, null, 14);
        int i = o.f268992a[mVar.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.block_future_payments_limit_reached_error_button_subscriptions, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.block_future_payments_limit_reached_error_button_merchants, null, null, 14);
        }
        yji.l.a1(this, X1(new y0("LIMIT_REACHED_DIALOG", new z(textLocalisedClause2, textLocalisedClause3, textLocalisedClause, new TextLocalisedClause(R$string.block_future_payments_limit_reached_error_button_cancel, null, null, 14), null, null, false, null, null, null, null, null, null, 32724), false, 4)), null, null, new s(this, continuation, 1), 3);
        return true;
    }
}
