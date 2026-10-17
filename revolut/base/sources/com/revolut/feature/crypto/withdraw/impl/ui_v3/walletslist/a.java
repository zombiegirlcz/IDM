package com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist;

import cli.g;
import cli.y;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.CryptoSendWalletsListControllerContract$ModalStep;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import go5.e;
import hr5.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lo5.t;
import mra.d;
import oki.h;
import skm.a2;
import ue8.c;
import ukm.f;
import vkm.q;
import vkm.z1;
import xx9.p;
import zq5.a0;
import zq5.d0;
import zq5.j0;
import zq5.l;
import zq5.m;
import zq5.u;
import zq5.v;
import zq5.z;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements v {
    public final z1 A;
    public final y B;
    public final com.revolut.kompot.navigable.vc.modal.a C;
    public final CryptoSendWalletsListControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p f71341p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k4a.v f71342q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f71343r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ir5.a f71344s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f71345t;
    public final cr5.a u;
    public final er5.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j0 f71346w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final l f71347x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final m f71348y;
    public a2 z;

    public a(d0 mapper, CryptoSendWalletsListControllerContract$InputData inputData, p recentRecipientInteractor, k4a.v newTransferScreenProvider, e cryptoWithdrawDependenciesConfig, ir5.a cryptoAddressWithPaymentRecentRecipientMapper, b beneficiaryWithPaymentRecentRecipientMapper, cr5.a beneficiarySendRecipientControllerModelExtension, er5.e walletSendRecipientControllerModelExtension, j0 sendRecipientsSorter, l cryptoSendSearcher, m cryptoSendWalletsDialogFactory) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(recentRecipientInteractor, "recentRecipientInteractor");
        Intrinsics.checkNotNullParameter(newTransferScreenProvider, "newTransferScreenProvider");
        Intrinsics.checkNotNullParameter(cryptoWithdrawDependenciesConfig, "cryptoWithdrawDependenciesConfig");
        Intrinsics.checkNotNullParameter(cryptoAddressWithPaymentRecentRecipientMapper, "cryptoAddressWithPaymentRecentRecipientMapper");
        Intrinsics.checkNotNullParameter(beneficiaryWithPaymentRecentRecipientMapper, "beneficiaryWithPaymentRecentRecipientMapper");
        Intrinsics.checkNotNullParameter(beneficiarySendRecipientControllerModelExtension, "beneficiarySendRecipientControllerModelExtension");
        Intrinsics.checkNotNullParameter(walletSendRecipientControllerModelExtension, "walletSendRecipientControllerModelExtension");
        Intrinsics.checkNotNullParameter(sendRecipientsSorter, "sendRecipientsSorter");
        Intrinsics.checkNotNullParameter(cryptoSendSearcher, "cryptoSendSearcher");
        Intrinsics.checkNotNullParameter(cryptoSendWalletsDialogFactory, "cryptoSendWalletsDialogFactory");
        this.o = inputData;
        this.f71341p = recentRecipientInteractor;
        this.f71342q = newTransferScreenProvider;
        this.f71343r = cryptoWithdrawDependenciesConfig;
        this.f71344s = cryptoAddressWithPaymentRecentRecipientMapper;
        this.f71345t = beneficiaryWithPaymentRecentRecipientMapper;
        this.u = beneficiarySendRecipientControllerModelExtension;
        this.v = walletSendRecipientControllerModelExtension;
        this.f71346w = sendRecipientsSorter;
        this.f71347x = cryptoSendSearcher;
        this.f71348y = cryptoSendWalletsDialogFactory;
        this.A = q.b(1, 1, f.DROP_OLDEST);
        this.B = d.b(this, new u(0), mapper, null, false, 12);
        this.C = hx7.e.a(this, new zo2.h(this, 5));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, this.u.b3(), null, null, new a0(this, continuation, 0), 3);
        yji.l.a1(this, this.v.c3(), null, null, new a0(this, continuation, 1), 3);
    }

    public final void I2() {
        int i = z.f324407a[this.f71343r.i.ordinal()];
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        CryptoSendWalletsListControllerContract$ModalStep.Transfer transfer = CryptoSendWalletsListControllerContract$ModalStep.Transfer.f71340a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.C;
        if (i == 1) {
            h.v2(aVar, transfer, popup);
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        CryptoSendWalletsListControllerContract$InputData cryptoSendWalletsListControllerContract$InputData = this.o;
        if (cryptoSendWalletsListControllerContract$InputData.f71335b.contains(ko5.p.P2P)) {
            h.v2(aVar, transfer, popup);
            return;
        }
        if (c.L(cryptoSendWalletsListControllerContract$InputData)) {
            h.v2(aVar, CryptoSendWalletsListControllerContract$ModalStep.AddRecipientBottomSheet.f71337a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return;
        }
        if (c.M(cryptoSendWalletsListControllerContract$InputData)) {
            C2(lo5.u.f197413a);
        } else if (c.N(cryptoSendWalletsListControllerContract$InputData)) {
            C2(new t(null));
        } else {
            h.v2(aVar, transfer, popup);
        }
    }

    public final void J2(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        int iHashCode = id10.hashCode();
        if (iHashCode == -934690148) {
            if (id10.equals("CRYPTO_SEND_WALLETS_INCOMPATIBLE_QUERY_ADDRESS_CLICK_ID")) {
                C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("question.which-addresses-can-i-revert-my-deposit-to", 2))));
            }
        } else if (iHashCode == 1918729248) {
            if (id10.equals("ERROR_STATE_ID")) {
                K2();
            }
        } else if (iHashCode == 1971698096 && id10.equals("CRYPTO_SEND_WALLETS_EMPTY_RECIPIENTS_ID")) {
            I2();
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.C;
    }

    public final void K2() {
        a2 a2Var = this.z;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.z = yji.l.b1(this, rd0.e.b(nim.a.w(nim.a.w(kli.a.i(this.v.d3(this.o.f71334a), this.u.Z2(), p.c(this.f71341p, true, null, 2)), new zq5.y(this, 0)), new zg8.d(1, this.f71346w, j0.class, "sort", "sort(Ljava/util/List;)Ljava/util/List;", 0, 12))), null, new a0(this, continuation, 2), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        K2();
        yji.l.b1(this, q.q(new zfd.e(this.A, 7)), null, new zah.f(this, null, 26), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.B;
    }
}
