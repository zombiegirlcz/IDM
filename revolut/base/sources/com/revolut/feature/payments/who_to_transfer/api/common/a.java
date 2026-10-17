package com.revolut.feature.payments.who_to_transfer.api.common;

import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f80009a;

    static {
        WhoToTransferFilter[] elements = {WhoToTransferFilter.Revolut.f80005a, WhoToTransferFilter.Device.f80002a, WhoToTransferFilter.ApmAani.f79985a, WhoToTransferFilter.ApmBizum.f79986a, WhoToTransferFilter.ApmBlik.f79987a, WhoToTransferFilter.ApmBreb.f79988a, WhoToTransferFilter.ApmIris.f79989a, WhoToTransferFilter.ApmMultibanco.f79990a, WhoToTransferFilter.ApmPayId.f79991a, WhoToTransferFilter.ApmPix.f79992a, WhoToTransferFilter.ApmQvik.f79993a, WhoToTransferFilter.ApmSpin.f79994a, WhoToTransferFilter.ApmUpi.f79995a, WhoToTransferFilter.ApmWero.f79996a, WhoToTransferFilter.Accounts.f79984a, WhoToTransferFilter.Groups.f80003a, WhoToTransferFilter.Cards.f79998a, WhoToTransferFilter.CryptoWallets.f80001a, WhoToTransferFilter.Charities.f79999a, WhoToTransferFilter.Checks.f80000a, WhoToTransferFilter.Billers.f79997a};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f80009a = d.y0(elements);
    }
}
