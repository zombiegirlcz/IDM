package com.revolut.retail.feature.esim.impl.ui.flows.share_qr_code;

import com.revolut.retail.feature.esim.impl.ui.flows.share_qr_code.EsimShareQrCodeFlowContract$Step;
import com.revolut.retail.feature.esim.impl.ui.screens.share_qr_code.EsimShareQrCodeScreenContract$InputData;
import dfj.z2;
import kotlin.jvm.internal.Intrinsics;
import r6f.i;
import sfj.d;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends d implements rgj.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final EsimShareQrCodeScreenContract$InputData f100879r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f100880s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EsimShareQrCodeScreenContract$InputData inputData, z2 esimRestrictionsInteractor) {
        super(esimRestrictionsInteractor, a.f);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(esimRestrictionsInteractor, "esimRestrictionsInteractor");
        this.f100879r = inputData;
        i iVar = new i(this, 21);
        this.f100880s = cp5.d.a(this, EsimShareQrCodeFlowContract$Step.Content.f100877a, f0.f322471a, iVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f100880s;
    }
}
