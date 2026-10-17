package x4a;

import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class i {
    public static final boolean a(WhoToTransferFilter whoToTransferFilter) {
        Intrinsics.checkNotNullParameter(whoToTransferFilter, "<this>");
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Revolut.f80005a) || Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Charities.f79999a)) {
            return false;
        }
        if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmAani.f79985a) || Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmBizum.f79986a) || Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmBlik.f79987a) || Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmBreb.f79988a) || Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmIris.f79989a) || Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmMultibanco.f79990a) || Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmPayId.f79991a) || Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmPix.f79992a) || Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmQvik.f79993a) || Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmSpin.f79994a) || Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmUpi.f79995a) || Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmWero.f79996a) || Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Accounts.f79984a) || Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Groups.f80003a) || Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Cards.f79998a) || Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.CryptoWallets.f80001a) || Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Checks.f80000a) || Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Billers.f79997a) || Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Device.f80002a) || (whoToTransferFilter instanceof WhoToTransferFilter.MobileWallet)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }
}
