package com.revolut.feature.security_hub.impl.ui.transactions_limits;

import ac4.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import com.revolut.feature.security_hub.impl.ui.LimitType;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$LimitFlowType;
import fwc.j;
import fwc.o;
import fwc.r;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import r60.b;
import vkm.j2;
import wli.x;
import wtc.k;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements r {
    public final k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fwc.a f85747p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f85748q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final iwc.b f85749r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.feature.external_accounts.api.navigation.a f85750s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x f85751t;
    public final TransactionsLimitsScreenContract$InputData u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f85752w;

    public a(k outboundTransactionLimitsInteractor, fwc.a transactionsLimitsDialogFactory, b promptViewControllerExtension, iwc.b transactionLimitsFlowProvider, com.revolut.feature.external_accounts.api.navigation.a externalPocketNavigationFactory, x deeplinkHandler, TransactionsLimitsScreenContract$InputData inputData, g stateMapper) {
        Intrinsics.checkNotNullParameter(outboundTransactionLimitsInteractor, "outboundTransactionLimitsInteractor");
        Intrinsics.checkNotNullParameter(transactionsLimitsDialogFactory, "transactionsLimitsDialogFactory");
        Intrinsics.checkNotNullParameter(promptViewControllerExtension, "promptViewControllerExtension");
        Intrinsics.checkNotNullParameter(transactionLimitsFlowProvider, "transactionLimitsFlowProvider");
        Intrinsics.checkNotNullParameter(externalPocketNavigationFactory, "externalPocketNavigationFactory");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = outboundTransactionLimitsInteractor;
        this.f85747p = transactionsLimitsDialogFactory;
        this.f85748q = promptViewControllerExtension;
        this.f85749r = transactionLimitsFlowProvider;
        this.f85750s = externalPocketNavigationFactory;
        this.f85751t = deeplinkHandler;
        this.u = inputData;
        this.v = d.b(this, new j(new Data(null, null, true, 3, null), null), stateMapper, null, false, 12);
        this.f85752w = e.a(this, new fv1.a(this, 5));
    }

    public final void I2(OutboundTransactionLimit outboundTransactionLimit) {
        LimitType limitType;
        TransactionsLimitsScreenContract$LimitFlowType transactionsLimitsScreenContract$LimitFlowType = ((j) ((j2) this.v.f22677a).getValue()).f138607b;
        if (transactionsLimitsScreenContract$LimitFlowType == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (transactionsLimitsScreenContract$LimitFlowType instanceof TransactionsLimitsScreenContract$LimitFlowType.SepaExtended) {
            limitType = LimitType.SepaExtended.f85504a;
        } else {
            if (!(transactionsLimitsScreenContract$LimitFlowType instanceof TransactionsLimitsScreenContract$LimitFlowType.Singapore) && !(transactionsLimitsScreenContract$LimitFlowType instanceof TransactionsLimitsScreenContract$LimitFlowType.WalletLimits)) {
                throw new NoWhenBranchMatchedException();
            }
            limitType = LimitType.Basic.f85502a;
        }
        C2(new o(outboundTransactionLimit, limitType));
    }

    public final void J2(OutboundTransactionLimit outboundTransactionLimit) {
        boolean zK2;
        TransactionsLimitsScreenContract$LimitFlowType transactionsLimitsScreenContract$LimitFlowType = ((j) ((j2) this.v.f22677a).getValue()).f138607b;
        if (transactionsLimitsScreenContract$LimitFlowType == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if ((transactionsLimitsScreenContract$LimitFlowType instanceof TransactionsLimitsScreenContract$LimitFlowType.WalletLimits) || (transactionsLimitsScreenContract$LimitFlowType instanceof TransactionsLimitsScreenContract$LimitFlowType.SepaExtended)) {
            zK2 = false;
        } else {
            if (!transactionsLimitsScreenContract$LimitFlowType.equals(TransactionsLimitsScreenContract$LimitFlowType.Singapore.f85737a)) {
                throw new NoWhenBranchMatchedException();
            }
            zK2 = K2();
        }
        if (zK2) {
            return;
        }
        I2(outboundTransactionLimit);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f85752w;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean K2() {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.security_hub.impl.ui.transactions_limits.a.K2():boolean");
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new ft.d(this, null, 9), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
