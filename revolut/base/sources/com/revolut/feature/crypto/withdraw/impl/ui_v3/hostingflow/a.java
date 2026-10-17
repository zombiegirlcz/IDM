package com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingflow;

import com.revolut.feature.crypto.config.api.models.CryptoAddressHostingProviderType;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressHostingFlowInput;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingflow.CryptoAddressHostingFlowContract$Step;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import rl8.d;
import rq5.b;
import rq5.c;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final CryptoAddressHostingFlowInput o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f71311p;

    public a(CryptoAddressHostingFlowInput inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        d dVar = new d(this, 11);
        this.f71311p = cp5.d.a(this, CryptoAddressHostingFlowContract$Step.AddressHostingPicker.f71310a, f0.f322471a, dVar);
    }

    public final void I2(String str, CryptoAddressHostingProviderType cryptoAddressHostingProviderType) {
        if (this.o.f71076a != null) {
            C1(new BridgeDestination(new FinishCommand(-1, r0.k(new Pair("ARG_HOSTING_NAME", str), new Pair("ARG_HOSTING_TYPE", cryptoAddressHostingProviderType)), null, 4)));
        } else {
            C2(new c(str, cryptoAddressHostingProviderType));
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f71311p;
    }
}
