package t4a;

import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import java.util.ArrayList;
import java.util.List;
import jq9.t;
import jq9.y;
import jul.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d3a.b f267957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t3a.g f267958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f267959c;
    public final vq8.a d;
    public final g3k.a e;
    public final gte.a f;

    public g(d3a.b paymentsSearchInteractor, t3a.g paymentsSuggestedProvider, o virtualSearchInteractor, vq8.a juniorIncludingModeProvider, g3k.a paymentVendorsInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(paymentsSearchInteractor, "paymentsSearchInteractor");
        Intrinsics.checkNotNullParameter(paymentsSuggestedProvider, "paymentsSuggestedProvider");
        Intrinsics.checkNotNullParameter(virtualSearchInteractor, "virtualSearchInteractor");
        Intrinsics.checkNotNullParameter(juniorIncludingModeProvider, "juniorIncludingModeProvider");
        Intrinsics.checkNotNullParameter(paymentVendorsInteractor, "paymentVendorsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f267957a = paymentsSearchInteractor;
        this.f267958b = paymentsSuggestedProvider;
        this.f267959c = virtualSearchInteractor;
        this.d = juniorIncludingModeProvider;
        this.e = paymentVendorsInteractor;
        this.f = featureToggleInteractor;
    }

    public static List a(List list, TransferFlowType transferFlowType) {
        boolean z;
        if (!(transferFlowType instanceof TransferFlowType.JointAccountFlow)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            t tVar = (t) obj2;
            boolean z3 = true;
            if (tVar instanceof y) {
                zm3.a aVar = ((y) tVar).f177526a;
                String str = ((TransferFlowType.JointAccountFlow) transferFlowType).f92259c;
                if (str == null) {
                    z = true;
                } else {
                    zm3.l lVar = aVar instanceof zm3.l ? (zm3.l) aVar : null;
                    z = !Intrinsics.f(lVar != null ? lVar.getCode() : null, str);
                }
                if (!z || !(aVar instanceof zm3.l)) {
                    z3 = false;
                }
            }
            if (z3) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static d3a.a b(WhoToTransferFilter whoToTransferFilter) {
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Revolut.f80005a)) {
            return d3a.a.REVOLUT;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Cards.f79998a)) {
            return d3a.a.CARDS;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Groups.f80003a)) {
            return d3a.a.GROUPS;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Accounts.f79984a)) {
            return d3a.a.ACCOUNTS;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.CryptoWallets.f80001a)) {
            return d3a.a.CRYPTO_WALLET;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Charities.f79999a)) {
            return d3a.a.CHARITIES;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Checks.f80000a)) {
            return d3a.a.CHECKS;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmAani.f79985a)) {
            return d3a.a.APM_AANI;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmBizum.f79986a)) {
            return d3a.a.APM_BIZUM;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmBlik.f79987a)) {
            return d3a.a.APM_BLIK;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmBreb.f79988a)) {
            return d3a.a.APM_BREB;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmIris.f79989a)) {
            return d3a.a.APM_IRIS;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmMultibanco.f79990a)) {
            return d3a.a.APM_MULTIBANCO;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmPayId.f79991a)) {
            return d3a.a.APM_PAYID;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmPix.f79992a)) {
            return d3a.a.APM_PIX;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmQvik.f79993a)) {
            return d3a.a.APM_QVIK;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmSpin.f79994a)) {
            return d3a.a.APM_SPIN;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmUpi.f79995a)) {
            return d3a.a.APM_UPI;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmWero.f79996a)) {
            return d3a.a.APM_WERO;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Billers.f79997a)) {
            return d3a.a.BILLERS;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Device.f80002a)) {
            return d3a.a.DEVICE;
        }
        if (whoToTransferFilter instanceof WhoToTransferFilter.MobileWallet) {
            return d3a.a.MOBILE_WALLET;
        }
        throw new NoWhenBranchMatchedException();
    }
}
